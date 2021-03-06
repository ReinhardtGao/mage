package mage.sets;

import mage.cards.ExpansionSet;
import mage.cards.a.AesthirGlider;
import mage.cards.a.AgentOfStromgald;
import mage.cards.b.BalduvianWarMakers;
import mage.cards.c.CarrierPigeons;
import mage.cards.e.EnslavedScout;
import mage.cards.f.FeveredStrength;
import mage.cards.g.GorillaBerserkers;
import mage.cards.g.GorillaShaman;
import mage.cards.i.InsidiousBookworms;
import mage.cards.l.LimDulsHighGuard;
import mage.cards.p.PhyrexianWarBeast;
import mage.cards.r.RoyalHerbalist;
import mage.cards.s.SoldeviAdnate;
import mage.cards.s.SoldeviSage;
import mage.cards.s.StormShaman;
import mage.cards.s.SwampMosquito;
import mage.cards.w.WhipVine;
import mage.constants.Rarity;
import mage.constants.SetType;

public class Alliances extends ExpansionSet {

    private static final Alliances instance = new Alliances();

    public static Alliances getInstance() {
        return instance;
    }

    private Alliances() {
        super("Alliances", "ALL", ExpansionSet.buildDate(1996, 6, 10), SetType.EXPANSION);
        this.blockName = "Ice Age";
        this.parentSet = IceAge.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 8;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;
        cards.add(new SetCardInfo("Aesthir Glider", "116a", Rarity.COMMON, mage.cards.a.AesthirGlider.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Aesthir Glider", "116b", Rarity.COMMON, mage.cards.a.AesthirGlider.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Agent of Stromgald", "64a", Rarity.COMMON, mage.cards.a.AgentOfStromgald.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Agent of Stromgald", "64b", Rarity.COMMON, mage.cards.a.AgentOfStromgald.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Arcane Denial", "22a", Rarity.COMMON, mage.cards.a.ArcaneDenial.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Arcane Denial", "22b", Rarity.COMMON, mage.cards.a.ArcaneDenial.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ashnod's Cylix", 117, Rarity.RARE, mage.cards.a.AshnodsCylix.class));
        cards.add(new SetCardInfo("Astrolabe", "118a", Rarity.COMMON, mage.cards.a.Astrolabe.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Astrolabe", "118b", Rarity.COMMON, mage.cards.a.Astrolabe.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Balduvian Dead", 43, Rarity.UNCOMMON, mage.cards.b.BalduvianDead.class));
        cards.add(new SetCardInfo("Balduvian Horde", 65, Rarity.RARE, mage.cards.b.BalduvianHorde.class));
        cards.add(new SetCardInfo("Balduvian Trading Post", 137, Rarity.RARE, mage.cards.b.BalduvianTradingPost.class));
        cards.add(new SetCardInfo("Balduvian War-Makers", "66a", Rarity.COMMON, mage.cards.b.BalduvianWarMakers.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Balduvian War-Makers", "66b", Rarity.COMMON, mage.cards.b.BalduvianWarMakers.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bounty of the Hunt", 85, Rarity.UNCOMMON, mage.cards.b.BountyOfTheHunt.class));
        cards.add(new SetCardInfo("Browse", 25, Rarity.UNCOMMON, mage.cards.b.Browse.class));
        cards.add(new SetCardInfo("Burnout", 68, Rarity.UNCOMMON, mage.cards.b.Burnout.class));
        cards.add(new SetCardInfo("Carrier Pigeons", "1a", Rarity.COMMON, mage.cards.c.CarrierPigeons.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Carrier Pigeons", "1b", Rarity.COMMON, mage.cards.c.CarrierPigeons.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Casting of Bones", "44a", Rarity.COMMON, mage.cards.c.CastingOfBones.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Casting of Bones", "44b", Rarity.COMMON, mage.cards.c.CastingOfBones.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Chaos Harlequin", 69, Rarity.RARE, mage.cards.c.ChaosHarlequin.class));
        cards.add(new SetCardInfo("Contagion", 45, Rarity.UNCOMMON, mage.cards.c.Contagion.class));
        cards.add(new SetCardInfo("Deadly Insect", "86a", Rarity.COMMON, mage.cards.d.DeadlyInsect.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Deadly Insect", "86b", Rarity.COMMON, mage.cards.d.DeadlyInsect.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Death Spark", 70, Rarity.UNCOMMON, mage.cards.d.DeathSpark.class));
        cards.add(new SetCardInfo("Diminishing Returns", 26, Rarity.RARE, mage.cards.d.DiminishingReturns.class));
        cards.add(new SetCardInfo("Dystopia", 47, Rarity.RARE, mage.cards.d.Dystopia.class));
        cards.add(new SetCardInfo("Elvish Bard", 87, Rarity.UNCOMMON, mage.cards.e.ElvishBard.class));
        cards.add(new SetCardInfo("Elvish Ranger", "88a", Rarity.COMMON, mage.cards.e.ElvishRanger.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elvish Ranger", "88b", Rarity.COMMON, mage.cards.e.ElvishRanger.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Elvish Spirit Guide", 89, Rarity.UNCOMMON, mage.cards.e.ElvishSpiritGuide.class));
        cards.add(new SetCardInfo("Energy Arc", 106, Rarity.UNCOMMON, mage.cards.e.EnergyArc.class));
        cards.add(new SetCardInfo("Enslaved Scout", "71a", Rarity.COMMON, mage.cards.e.EnslavedScout.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Enslaved Scout", "71b", Rarity.COMMON, mage.cards.e.EnslavedScout.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Errand of Duty", "2a", Rarity.COMMON, mage.cards.e.ErrandOfDuty.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Errand of Duty", "2b", Rarity.COMMON, mage.cards.e.ErrandOfDuty.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Exile", 3, Rarity.RARE, mage.cards.e.Exile.class));
        cards.add(new SetCardInfo("False Demise", "27a", Rarity.COMMON, mage.cards.f.FalseDemise.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("False Demise", "27b", Rarity.COMMON, mage.cards.f.FalseDemise.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Feast or Famine", "49a", Rarity.COMMON, mage.cards.f.FeastOrFamine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Feast or Famine", "49b", Rarity.COMMON, mage.cards.f.FeastOrFamine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Fevered Strength", "50a", Rarity.COMMON, mage.cards.f.FeveredStrength.class));
        cards.add(new SetCardInfo("Fevered Strength", "50b", Rarity.COMMON, mage.cards.f.FeveredStrength.class));
        cards.add(new SetCardInfo("Floodwater Dam", 119, Rarity.RARE, mage.cards.f.FloodwaterDam.class));
        cards.add(new SetCardInfo("Force of Will", 28, Rarity.UNCOMMON, mage.cards.f.ForceOfWill.class));
        cards.add(new SetCardInfo("Foresight", "29a", Rarity.COMMON, mage.cards.f.Foresight.class));
        cards.add(new SetCardInfo("Foresight", "29b", Rarity.COMMON, mage.cards.f.Foresight.class));
        cards.add(new SetCardInfo("Gorilla Berserkers", "93a", Rarity.COMMON, mage.cards.g.GorillaBerserkers.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gorilla Berserkers", "93b", Rarity.COMMON, mage.cards.g.GorillaBerserkers.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gorilla Chieftain", "94a", Rarity.COMMON, mage.cards.g.GorillaChieftain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gorilla Chieftain", "94b", Rarity.COMMON, mage.cards.g.GorillaChieftain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gorilla Shaman", "72a", Rarity.COMMON, mage.cards.g.GorillaShaman.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gorilla Shaman", "72b", Rarity.COMMON, mage.cards.g.GorillaShaman.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gorilla War Cry", "73a", Rarity.COMMON, mage.cards.g.GorillaWarCry.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gorilla War Cry", "73b", Rarity.COMMON, mage.cards.g.GorillaWarCry.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Guerrilla Tactics", "74a", Rarity.COMMON, mage.cards.g.GuerrillaTactics.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Guerrilla Tactics", "74b", Rarity.COMMON, mage.cards.g.GuerrillaTactics.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hail Storm", 95, Rarity.UNCOMMON, mage.cards.h.HailStorm.class));
        cards.add(new SetCardInfo("Heart of Yavimaya", 138, Rarity.RARE, mage.cards.h.HeartOfYavimaya.class));
        cards.add(new SetCardInfo("Helm of Obedience", 121, Rarity.RARE, mage.cards.h.HelmOfObedience.class));
        cards.add(new SetCardInfo("Inheritance", 4, Rarity.UNCOMMON, mage.cards.i.Inheritance.class));
        cards.add(new SetCardInfo("Insidious Bookworms", "51a", Rarity.COMMON, mage.cards.i.InsidiousBookworms.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Insidious Bookworms", "51b", Rarity.COMMON, mage.cards.i.InsidiousBookworms.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Juniper Order Advocate", 6, Rarity.UNCOMMON, mage.cards.j.JuniperOrderAdvocate.class));
        cards.add(new SetCardInfo("Kaysa", 96, Rarity.RARE, mage.cards.k.Kaysa.class));
        cards.add(new SetCardInfo("Keeper of Tresserhorn", 52, Rarity.RARE, mage.cards.k.KeeperOfTresserhorn.class));
        cards.add(new SetCardInfo("Kjeldoran Escort", "7a", Rarity.COMMON, mage.cards.k.KjeldoranEscort.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kjeldoran Escort", "7b", Rarity.COMMON, mage.cards.k.KjeldoranEscort.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kjeldoran Home Guard", 8, Rarity.UNCOMMON, mage.cards.k.KjeldoranHomeGuard.class));
        cards.add(new SetCardInfo("Kjeldoran Outpost", 139, Rarity.RARE, mage.cards.k.KjeldoranOutpost.class));
        cards.add(new SetCardInfo("Krovikan Horror", 53, Rarity.RARE, mage.cards.k.KrovikanHorror.class));
        cards.add(new SetCardInfo("Krovikan Plague", 54, Rarity.UNCOMMON, mage.cards.k.KrovikanPlague.class));
        cards.add(new SetCardInfo("Lake of the Dead", 140, Rarity.RARE, mage.cards.l.LakeOfTheDead.class));
        cards.add(new SetCardInfo("Library of Lat-Nam", 31, Rarity.RARE, mage.cards.l.LibraryOfLatNam.class));
        cards.add(new SetCardInfo("Lim-Dul's High Guard", "55a", Rarity.COMMON, mage.cards.l.LimDulsHighGuard.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lim-Dul's High Guard", "55b", Rarity.COMMON, mage.cards.l.LimDulsHighGuard.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lim-Dul's Paladin", 108, Rarity.UNCOMMON, mage.cards.l.LimDulsPaladin.class));
        cards.add(new SetCardInfo("Lim-Dul's Vault", 107, Rarity.UNCOMMON, mage.cards.l.LimDulsVault.class));
        cards.add(new SetCardInfo("Lodestone Bauble", 122, Rarity.RARE, mage.cards.l.LodestoneBauble.class));
        cards.add(new SetCardInfo("Lord of Tresserhorn", 112, Rarity.RARE, mage.cards.l.LordOfTresserhorn.class));
        cards.add(new SetCardInfo("Martyrdom", "10a", Rarity.COMMON, mage.cards.m.Martyrdom.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Martyrdom", "10b", Rarity.COMMON, mage.cards.m.Martyrdom.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mishra's Groundbreaker", 123, Rarity.UNCOMMON, mage.cards.m.MishrasGroundbreaker.class));
        cards.add(new SetCardInfo("Misinformation", 56, Rarity.UNCOMMON, mage.cards.m.Misinformation.class));
        cards.add(new SetCardInfo("Mystic Compass", 124, Rarity.UNCOMMON, mage.cards.m.MysticCompass.class));
        cards.add(new SetCardInfo("Nature's Blessing", 110, Rarity.UNCOMMON, mage.cards.n.NaturesBlessing.class));
        cards.add(new SetCardInfo("Nature's Chosen", 97, Rarity.UNCOMMON, mage.cards.n.NaturesChosen.class));
        cards.add(new SetCardInfo("Nature's Wrath", 98, Rarity.RARE, mage.cards.n.NaturesWrath.class));
        cards.add(new SetCardInfo("Noble Steeds", "11a", Rarity.COMMON, mage.cards.n.NobleSteeds.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Noble Steeds", "11b", Rarity.COMMON, mage.cards.n.NobleSteeds.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Omen of Fire", 75, Rarity.RARE, mage.cards.o.OmenOfFire.class));
        cards.add(new SetCardInfo("Phantasmal Fiend", "57a", Rarity.COMMON, mage.cards.p.PhantasmalFiend.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phantasmal Fiend", "57b", Rarity.COMMON, mage.cards.p.PhantasmalFiend.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phelddagrif", 115, Rarity.RARE, mage.cards.p.Phelddagrif.class));
        cards.add(new SetCardInfo("Phyrexian Boon", "58a", Rarity.COMMON, mage.cards.p.PhyrexianBoon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phyrexian Boon", "58b", Rarity.COMMON, mage.cards.p.PhyrexianBoon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phyrexian Devourer", 125, Rarity.RARE, mage.cards.p.PhyrexianDevourer.class));
        cards.add(new SetCardInfo("Phyrexian War Beast", "127a", Rarity.COMMON, mage.cards.p.PhyrexianWarBeast.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Phyrexian War Beast", "127b", Rarity.COMMON, mage.cards.p.PhyrexianWarBeast.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Pillage", 76, Rarity.UNCOMMON, mage.cards.p.Pillage.class));
        cards.add(new SetCardInfo("Pyrokinesis", 78, Rarity.UNCOMMON, mage.cards.p.Pyrokinesis.class));
        cards.add(new SetCardInfo("Reinforcements", "12a", Rarity.COMMON, mage.cards.r.Reinforcements.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Reinforcements", "12b", Rarity.COMMON, mage.cards.r.Reinforcements.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Reprisal", "13a", Rarity.COMMON, mage.cards.r.Reprisal.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Reprisal", "13b", Rarity.COMMON, mage.cards.r.Reprisal.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ritual of the Machine", 59, Rarity.RARE, mage.cards.r.RitualOfTheMachine.class));
        cards.add(new SetCardInfo("Royal Decree", 14, Rarity.RARE, mage.cards.r.RoyalDecree.class));
        cards.add(new SetCardInfo("Royal Herbalist", "15a", Rarity.COMMON, mage.cards.r.RoyalHerbalist.class));
        cards.add(new SetCardInfo("Royal Herbalist", "15b", Rarity.COMMON, mage.cards.r.RoyalHerbalist.class));
        cards.add(new SetCardInfo("School of the Unseen", 141, Rarity.UNCOMMON, mage.cards.s.SchoolOfTheUnseen.class));
        cards.add(new SetCardInfo("Seasoned Tactician", 17, Rarity.UNCOMMON, mage.cards.s.SeasonedTactician.class));
        cards.add(new SetCardInfo("Sheltered Valley", 142, Rarity.RARE, mage.cards.s.ShelteredValley.class));
        cards.add(new SetCardInfo("Shield Sphere", 129, Rarity.UNCOMMON, mage.cards.s.ShieldSphere.class));
        cards.add(new SetCardInfo("Sol Grail", 130, Rarity.UNCOMMON, mage.cards.s.SolGrail.class));
        cards.add(new SetCardInfo("Soldevi Adnate", "60a", Rarity.COMMON, mage.cards.s.SoldeviAdnate.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Soldevi Adnate", "60b", Rarity.COMMON, mage.cards.s.SoldeviAdnate.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Soldevi Digger", 131, Rarity.RARE, mage.cards.s.SoldeviDigger.class));
        cards.add(new SetCardInfo("Soldevi Excavations", 143, Rarity.RARE, mage.cards.s.SoldeviExcavations.class));
        cards.add(new SetCardInfo("Soldevi Heretic", "33a", Rarity.COMMON, mage.cards.s.SoldeviHeretic.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Soldevi Heretic", "33b", Rarity.COMMON, mage.cards.s.SoldeviHeretic.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Soldevi Sage", "34a", Rarity.COMMON, mage.cards.s.SoldeviSage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Soldevi Sage", "34b", Rarity.COMMON, mage.cards.s.SoldeviSage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Soldevi Steam Beast", "133a", Rarity.COMMON, mage.cards.s.SoldeviSteamBeast.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Soldevi Steam Beast", "133b", Rarity.COMMON, mage.cards.s.SoldeviSteamBeast.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Soldier of Fortune", 80, Rarity.UNCOMMON, mage.cards.s.SoldierOfFortune.class));
        cards.add(new SetCardInfo("Stench of Decay", "61a", Rarity.COMMON, mage.cards.s.StenchOfDecay.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Stench of Decay", "61b", Rarity.COMMON, mage.cards.s.StenchOfDecay.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Storm Cauldron", 134, Rarity.RARE, mage.cards.s.StormCauldron.class));
        cards.add(new SetCardInfo("Storm Crow", "36a", Rarity.COMMON, mage.cards.s.StormCrow.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Storm Crow", "36b", Rarity.COMMON, mage.cards.s.StormCrow.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Storm Shaman", "81a", Rarity.COMMON, mage.cards.s.StormShaman.class));
        cards.add(new SetCardInfo("Storm Shaman", "81b", Rarity.COMMON, mage.cards.s.StormShaman.class));
        cards.add(new SetCardInfo("Stromgald Spy", 62, Rarity.UNCOMMON, mage.cards.s.StromgaldSpy.class));
        cards.add(new SetCardInfo("Surge of Strength", 109, Rarity.UNCOMMON, mage.cards.s.SurgeOfStrength.class));
        cards.add(new SetCardInfo("Sustaining Spirit", 18, Rarity.RARE, mage.cards.s.SustainingSpirit.class));
        cards.add(new SetCardInfo("Swamp Mosquito", "63a", Rarity.COMMON, mage.cards.s.SwampMosquito.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp Mosquito", "63b", Rarity.COMMON, mage.cards.s.SwampMosquito.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thawing Glaciers", 144, Rarity.RARE, mage.cards.t.ThawingGlaciers.class));
        cards.add(new SetCardInfo("Thought Lash", 39, Rarity.RARE, mage.cards.t.ThoughtLash.class));
        cards.add(new SetCardInfo("Tidal Control", 40, Rarity.RARE, mage.cards.t.TidalControl.class));
        cards.add(new SetCardInfo("Tornado", 101, Rarity.RARE, mage.cards.t.Tornado.class));
        cards.add(new SetCardInfo("Unlikely Alliance", 20, Rarity.UNCOMMON, mage.cards.u.UnlikelyAlliance.class));
        cards.add(new SetCardInfo("Urza's Engine", 135, Rarity.UNCOMMON, mage.cards.u.UrzasEngine.class));
        cards.add(new SetCardInfo("Varchild's Crusader", "82a", Rarity.COMMON, mage.cards.v.VarchildsCrusader.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Varchild's Crusader", "82b", Rarity.COMMON, mage.cards.v.VarchildsCrusader.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Varchild's War-Riders", 83, Rarity.RARE, mage.cards.v.VarchildsWarRiders.class));
        cards.add(new SetCardInfo("Veteran's Voice", "84a", Rarity.COMMON, mage.cards.v.VeteransVoice.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Veteran's Voice", "84b", Rarity.COMMON, mage.cards.v.VeteransVoice.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Viscerid Armor", "41a", Rarity.COMMON, mage.cards.v.VisceridArmor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Viscerid Armor", "41b", Rarity.COMMON, mage.cards.v.VisceridArmor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Viscerid Drone", 42, Rarity.UNCOMMON, mage.cards.v.VisceridDrone.class));
        cards.add(new SetCardInfo("Wandering Mage", 111, Rarity.RARE, mage.cards.w.WanderingMage.class));
        cards.add(new SetCardInfo("Whip Vine", "103a", Rarity.COMMON, mage.cards.w.WhipVine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Whip Vine", "103b", Rarity.COMMON, mage.cards.w.WhipVine.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Whirling Catapult", 136, Rarity.UNCOMMON, mage.cards.w.WhirlingCatapult.class));
        cards.add(new SetCardInfo("Wild Aesthir", "21a", Rarity.COMMON, mage.cards.w.WildAesthir.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Wild Aesthir", "21b", Rarity.COMMON, mage.cards.w.WildAesthir.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Winter's Night", 114, Rarity.RARE, mage.cards.w.WintersNight.class));
        cards.add(new SetCardInfo("Yavimaya Ancients", "104a", Rarity.COMMON, mage.cards.y.YavimayaAncients.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Yavimaya Ancients", "104b", Rarity.COMMON, mage.cards.y.YavimayaAncients.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Yavimaya Ants", 105, Rarity.UNCOMMON, mage.cards.y.YavimayaAnts.class));
    }
}
