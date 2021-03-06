/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.abilities.effects.common;

import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.Mode;
import mage.abilities.costs.Cost;
import mage.abilities.costs.mana.GenericManaCost;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.effects.ContinuousEffect;
import mage.abilities.effects.Effect;
import mage.abilities.effects.Effects;
import mage.abilities.effects.OneShotEffect;
import mage.constants.Outcome;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.util.CardUtil;

/**
 *
 * @author MarcoMarin & L_J
 */
public class DoUnlessTargetPlayerOrTargetsControllerPaysEffect extends OneShotEffect {

    protected Effects executingEffects = new Effects();
    private Effect otherwiseEffect;
    private Cost cost;
    private DynamicValue genericMana;
    private String chooseUseText;

    public DoUnlessTargetPlayerOrTargetsControllerPaysEffect(Effect effect, Cost cost) {
        this(effect, cost, null);
    }

    public DoUnlessTargetPlayerOrTargetsControllerPaysEffect(Effect effect, Cost cost, String chooseUseText) {
        this(effect, null, cost, chooseUseText);
    }

    public DoUnlessTargetPlayerOrTargetsControllerPaysEffect(Effect effect, Effect otherwiseEffect, Cost cost, String chooseUseText) {
        super(Outcome.Detriment);
        this.executingEffects.add(effect);
        this.otherwiseEffect = otherwiseEffect;
        this.cost = cost;
        this.chooseUseText = chooseUseText;
    }

    public DoUnlessTargetPlayerOrTargetsControllerPaysEffect(Effect effect, DynamicValue genericMana) {
        super(Outcome.Detriment);
        this.executingEffects.add(effect);
        this.genericMana = genericMana;
    }

    public DoUnlessTargetPlayerOrTargetsControllerPaysEffect(final DoUnlessTargetPlayerOrTargetsControllerPaysEffect effect) {
        super(effect);
        this.executingEffects = effect.executingEffects.copy();
        this.otherwiseEffect = effect.otherwiseEffect;
        if (effect.cost != null) {
            this.cost = effect.cost.copy();
        }
        if (effect.genericMana != null) {
            this.genericMana = effect.genericMana.copy();
        }
        this.chooseUseText = effect.chooseUseText;
    }

    public void addEffect(Effect effect) {
        executingEffects.add(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player targetController = game.getPlayer(this.getTargetPointer().getFirst(game, source));
        Permanent targetPermanent = game.getPermanentOrLKIBattlefield(this.getTargetPointer().getFirst(game, source));
        if (targetPermanent != null) {
            targetController = game.getPlayer(targetPermanent.getControllerId());
        }
        if (targetController != null) {
            MageObject sourceObject = game.getObject(source.getSourceId());
            if (targetController != null && sourceObject != null) {
                Cost costToPay;
                if (cost != null) {
                    costToPay = cost.copy();
                } else {
                    costToPay = new GenericManaCost(genericMana.calculate(game, source, this));
                }
                String message;
                if (chooseUseText == null) {
                    String effectText = executingEffects.getText(source.getModes().getMode());
                    message = "Pay " + costToPay.getText() + " to prevent (" + effectText.substring(0, effectText.length() - 1) + ")?";
                } else {
                    message = chooseUseText;
                }
                message = CardUtil.replaceSourceName(message, sourceObject.getName());
                boolean result = true;
                boolean doEffect = true;
                
                // check if targetController is willing to pay
                if (costToPay.canPay(source, source.getSourceId(), targetController.getId(), game) && targetController.chooseUse(Outcome.Detriment, message, source, game)) {
                    costToPay.clearPaid();
                    if (costToPay.pay(source, game, source.getSourceId(), targetController.getId(), false, null)) {
                        if (!game.isSimulation()) {
                            game.informPlayers(targetController.getLogName() + " pays the cost to prevent the effect");
                        }
                        doEffect = false;                    
                    }
                }
    
                // do the effects if not paid
                if (doEffect) {
                    for (Effect effect : executingEffects) {
                        effect.setTargetPointer(this.targetPointer);
                        if (effect instanceof OneShotEffect) {
                            result &= effect.apply(game, source);
                        } else {
                            game.addEffect((ContinuousEffect) effect, source);
                        }
                    }
                } else if (otherwiseEffect != null) {
                    otherwiseEffect.setTargetPointer(this.targetPointer);
                    if (otherwiseEffect instanceof OneShotEffect) {
                        result &= otherwiseEffect.apply(game, source);
                    } else {
                        game.addEffect((ContinuousEffect) otherwiseEffect, source);
                    }
                }
                return result;
            }
        }
        return false;
    }

    @Override
    public String getText(Mode mode) {
        if (!staticText.isEmpty()) {
            return staticText;
        }
        String effectsText = executingEffects.getText(mode);
        return effectsText.substring(0, effectsText.length() - 1) + " unless its controller pays " + (cost != null ? cost.getText() : "{X}");
    }

    @Override
    public DoUnlessTargetPlayerOrTargetsControllerPaysEffect copy() {
        return new DoUnlessTargetPlayerOrTargetsControllerPaysEffect(this);
    }
}
