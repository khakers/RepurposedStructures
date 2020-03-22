package com.telepathicgrunt.repurposedstructures;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.DoubleValue;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber
public class RSConfig
{
	/*
	 * Config to control all sorts of settings used for world generation with this mod. This ranges from ore rarity, what
	 * biomes spawn, structure spawning, and more.
	 */

	//Putting this at start of option will put it at top of all options: '\0'+
	// '\u00a7'+ is used to replace § since § will be turned to gibberish when this mod is ran on Minecraft outside a development environment.

	public static final ServerConfig SERVER;
	public static final ForgeConfigSpec SERVER_SPEC;
	static
	{
		final Pair<ServerConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ServerConfig::new);
		SERVER_SPEC = specPair.getRight();
		SERVER = specPair.getLeft();
	}

	public static boolean addDungeonsToModdedBiomes = false;
	public static int dungeonSpawnrate = 8;
	public static boolean badlandsDungeons = true;
	public static boolean darkForestDungeons = true;
	public static boolean desertDungeons = true;
	public static boolean jungleDungeons = true;
	public static boolean mushroomDungeons = true;
	public static boolean snowDungeons = true;
	public static boolean swampDungeons = true;
	public static boolean endDungeons = true;
	public static boolean netherDungeons = true;

	public static boolean addWellsToModdedBiomes = false;
	public static int wellSpawnrate = 800;
	public static boolean badlandsWells = true;
	public static boolean netherWells = true;
	public static boolean snowWells = true;
	public static boolean mossyStoneWells = true;
	public static boolean forestWells = true;

	public static boolean addMiscToModdedBiomes = false;
	public static boolean boulderTiny = true;
	public static boolean boulderGiant = true;
	public static boolean hornedSwampTree = true;

	public static boolean lootChestsMS = true;
	public static int mineshaftSpawnrate = 40;
	public static boolean addMineshaftsToModdedBiomes = false;
	public static boolean birchMineshafts = true;
	public static boolean jungleMineshafts = true;
	public static boolean desertMineshafts = true;
	public static boolean stoneMineshafts = true;
	public static boolean savannaMineshafts = true;
	public static boolean icyMineshafts = true;
	public static boolean oceanMineshafts = true;
	public static boolean taigaMineshafts = true;
	public static boolean swampAndDarkForestMineshafts = true;
	public static boolean endMineshafts = true;
	public static boolean netherMineshafts = true;

	public static boolean useVanillaStronghold = false;
	public static boolean allowStonebrickStronghold = true;
	public static boolean allowNetherStronghold = true;
	public static int strongholdSpawnrate = 85;
	public static double silverfishSpawnrateSH = 0.8D;
	public static boolean allowExtraSpawnersSH = true;
	public static double strongholdSizeSH = 100D;
	public static boolean lootChestsSH = true;
	
	public static int jungleFortressSpawnrate = 32;
	public static double silverfishSpawnrateJF = 0.5D;
	public static boolean allowSilverfishSpawnerJF = true;
	public static boolean lootChestsJF = true;
	public static boolean addJungleFortressToModdedBiomes = false;

	public static int netherTempleSpawnrate = 32;
	public static boolean lootChestsNT = true;
	public static boolean addNetherTempleToModdedBiomes = false;
	
	public static class ServerConfig
	{
		public final BooleanValue addDungeonsToModdedBiomes;
		public final IntValue dungeonSpawnrate;
		public final BooleanValue badlandsDungeons;
		public final BooleanValue darkForestDungeons;
		public final BooleanValue desertDungeons;
		public final BooleanValue jungleDungeons;
		public final BooleanValue mushroomDungeons;
		public final BooleanValue snowDungeons;
		public final BooleanValue swampDungeons;
		public final BooleanValue endDungeons;
		public final BooleanValue netherDungeons;

		public final BooleanValue addWellsToModdedBiomes;
		public final IntValue wellSpawnrate;
		public final BooleanValue badlandsWells;
		public final BooleanValue netherWells;
		public final BooleanValue snowWells;
		public final BooleanValue mossyStoneWells;
		public final BooleanValue forestWells;

		public final BooleanValue addMiscToModdedBiomes;
		public final BooleanValue boulderTiny;
		public final BooleanValue boulderGiant;
		public final BooleanValue hornedSwampTree;
		
		public final BooleanValue lootChestsMS;
		public final IntValue mineshaftSpawnrate;
		public final BooleanValue addMineshaftsToModdedBiomes;
		public final BooleanValue birchMineshafts;
		public final BooleanValue jungleMineshafts;
		public final BooleanValue desertMineshafts;
		public final BooleanValue stoneMineshafts;
		public final BooleanValue savannaMineshafts;
		public final BooleanValue icyMineshafts;
		public final BooleanValue oceanMineshafts;
		public final BooleanValue taigaMineshafts;
		public final BooleanValue swampAndDarkForestMineshafts;
		public final BooleanValue endMineshafts;
		public final BooleanValue netherMineshafts;

		public final BooleanValue useVanillaStronghold;
		public final BooleanValue allowStonebrickStronghold;
		public final BooleanValue allowNetherStronghold;
		public final IntValue strongholdSpawnrate;
		public final DoubleValue silverfishSpawnrateSH;
		public final BooleanValue allowExtraSpawnersSH;
		public final DoubleValue strongholdSizeSH;
		public final BooleanValue lootChestsSH;
		
		public final IntValue jungleFortressSpawnrate;
		public final DoubleValue silverfishSpawnrateJF;
		public final BooleanValue allowSilverfishSpawnerJF;
		public final BooleanValue lootChestsJF;
		public final BooleanValue addJungleFortressToModdedBiomes;
		
		public final IntValue netherTempleSpawnrate;
		public final BooleanValue lootChestsNT;
		public final BooleanValue addNetherTempleToModdedBiomes;


		ServerConfig(ForgeConfigSpec.Builder builder)
		{
			builder.push("Feature Options");

				builder.push("Dungeons");
				
					addDungeonsToModdedBiomes = builder
							.comment("\r\n Add the custom dungeons to modded biomes of the same categories/type.")
						.translation("repurposedstructures.config.feature.dungeons.adddungeonstomoddedbiomes")
						.define("addDungeonsToModdedBiomes", false);
					
					dungeonSpawnrate = builder
							.comment( "\r\n How often dungeons will attempt to spawn per chunk.\r\n " 
									+ "1 for extremely rare Dungeons and 1000 for max Dungeon spawnrate.")
							.translation("repurposedstructures.config.structure.dungeons.dungeonspawnrate")
							.defineInRange("dungeonSpawnrate", 8, 1, 1000);
				
					badlandsDungeons = builder
							.comment("\r\n Replace vanilla dungeon in Badlands biomes with Badlands themed dungeon.")
						.translation("repurposedstructures.config.feature.dungeons.badlandsdungeons")
						.define("badlandsDungeons", true);
				
					darkForestDungeons = builder
							.comment("\r\n Replace vanilla dungeon in Dark Forest biomes with Dark Forest themed dungeon.")
						.translation("repurposedstructures.config.feature.dungeons.darkforestdungeons")
						.define("darkForestDungeons", true);
				
					desertDungeons = builder
							.comment("\r\n Replace vanilla dungeon in Desert biomes with Desert themed dungeon.")
						.translation("repurposedstructures.config.feature.dungeons.desertdungeons")
						.define("desertDungeons", true);
				
					jungleDungeons = builder
							.comment("\r\n Replace vanilla dungeon in Jungle biomes with Jungle themed dungeon.")
						.translation("repurposedstructures.config.feature.dungeons.jungledungeons")
						.define("jungleDungeons", true);
				
					mushroomDungeons = builder
							.comment("\r\n Replace vanilla dungeon in Mushroom biomes with Mushroom themed dungeon.")
						.translation("repurposedstructures.config.feature.dungeons.mushroomdungeons")
						.define("mushroomDungeons", true);
				
					snowDungeons = builder
							.comment("\r\n Replace vanilla dungeon in icy/snow biomes with icy/snow themed dungeon.")
						.translation("repurposedstructures.config.feature.dungeons.snowdungeons")
						.define("snowDungeons", true);
				
					swampDungeons = builder
							.comment("\r\n Replace vanilla dungeon in Swamp biomes with Swamp themed dungeon.")
						.translation("repurposedstructures.config.feature.dungeons.swampdungeons")
						.define("swampDungeons", true);
				
					endDungeons = builder
							.comment("\r\n Add End themed dungeon to End biomes outside the Enderdragon island.")
						.translation("repurposedstructures.config.feature.dungeons.enddungeons")
						.define("endDungeons", true);

					netherDungeons = builder
							.comment("\r\n Add Nether themed dungeon to Nether biomes.")
						.translation("repurposedstructures.config.feature.dungeons.netherdungeons")
						.define("netherDungeons", true);
					
				builder.pop();

				builder.push("Small Wells");
				
					addWellsToModdedBiomes = builder
							.comment("\r\n Add the custom wells to modded biomes of the same categories/type.")
						.translation("repurposedstructures.config.feature.small_wells.addwellstomoddedbiomes")
						.define("addWellsToModdedBiomes", false);

					wellSpawnrate = builder
							.comment( "\r\n How often wells will attempt to spawn per chunk." 
									+ "\r\n The chance of a well generating at a chunk is 1/spawnrate."
									+ "\r\n 1 for wells spawning in every chunk and 10000 for extremely rare wells.")
							.translation("repurposedstructures.config.structure.dungeons.dungeonspawnrate")
							.defineInRange("dungeonSpawnrate", 800, 1, 10000);
					
					badlandsWells = builder
							.comment("\r\n Add Badlands themed wells to Badlands biomes.")
						.translation("repurposedstructures.config.feature.small_wells.badlandswells")
						.define("badlandsWells", true);
					
					netherWells = builder
							.comment("\r\n Add Nether themed wells to Nether biomes.")
						.translation("repurposedstructures.config.feature.small_wells.netherwells")
						.define("netherWells", true);
					
					snowWells = builder
							.comment("\r\n Add Snow themed wells to snowy and icy biomes.")
						.translation("repurposedstructures.config.feature.small_wells.snowwells")
						.define("snowWells", true);
					
					mossyStoneWells = builder
							.comment("\r\n Add mossy stone themed wells to Jungles, Dark Oak, and Swamp biomes.")
						.translation("repurposedstructures.config.feature.small_wells.mossystonewells")
						.define("mossyStoneWells", true);

					forestWells = builder
							.comment("\r\n Add a wood themed wells to Forest and Birch Forest biomes.")
						.translation("repurposedstructures.config.feature.small_wells.forestwells")
						.define("forestWells", true);
					
				builder.pop();
				
				builder.push("Misc");
				
					addMiscToModdedBiomes = builder
							.comment("\r\n Add the custom features to modded biomes of the same categories/type.")
						.translation("repurposedstructures.config.feature.dungeons.addmisctomoddedbiomes")
						.define("addMiscToModdedBiomes", false);

					boulderTiny = builder
							.comment("\r\n Adds tiny boulders to Taiga Mountains and Snowy Taiga Mountains biomes "
									+"\r\n that can contain small amounts of Coal and Iron ores.")
						.translation("repurposedstructures.config.feature.misc.bouldertiny")
						.define("boulderTiny", true);
					
					boulderGiant = builder
							.comment("\r\n Replaces boulders in Giant Tree Taiga Hills and Giant Spruce Taiga Hills"
									+"\r\n biomes with a larger boulder that can contain Coal, Iron, and extremely"
									+"\r\n rarely, can also have Diamond Ores.")
						.translation("repurposedstructures.config.feature.misc.netherdungeons")
						.define("boulderGiant", true);
					
					hornedSwampTree = builder
							.comment("\r\n Adds a large tree somewhat uncommonly to Swamp biome and replaces"
									+"\r\n all vanilla trees in Swamp Hills biome with the larger tree.")
						.translation("repurposedstructures.config.feature.misc.hornedSwampTree")
						.define("hornedSwampTree", true);
					
				builder.pop();
				
			builder.pop();

			builder.push("Structure Options");

				builder.push("Mineshaft");
				
					mineshaftSpawnrate = builder
							.comment( "\r\n How often Mineshafts will spawn.\r\n " 
									+ "0 for no Mineshafts and 1000 for max spawnrate.")
							.translation("repurposedstructures.config.structure.mineshaft.mineshaftspawnrate")
							.defineInRange("mineshaftSpawnrate", 40, 0, 1000);

					lootChestsMS = builder
							.comment("\r\n Controls whether loot chests spawn or not in modded Mineshafts.")
						.translation("repurposedstructures.config.structure.mineshaft.lootchestsms")
						.define("lootChestsMS", true);

					addMineshaftsToModdedBiomes = builder
							.comment("\r\n Add the custom Mineshafts to modded biomes of the same categories/type.")
						.translation("repurposedstructures.config.feature.dungeons.addmineshaftstomoddedbiomes")
						.define("addMineshaftsToModdedBiomes", false);
					
					birchMineshafts = builder
							.comment("\r\n Replace Mineshafts in Birch biomes with a Birch themed Mineshaft.")
						.translation("repurposedstructures.config.feature.mineshaft.birchmineshafts")
						.define("birchMineshafts", true);

					jungleMineshafts = builder
							.comment("\r\n Replace Mineshafts in Jungle biomes with a Jungle themed Mineshaft.")
						.translation("repurposedstructures.config.feature.mineshaft.junglemineshafts")
						.define("jungleMineshafts", true);

					desertMineshafts = builder
							.comment("\r\n Replace Mineshafts in Desert biomes with a Desert themed Mineshaft.")
						.translation("repurposedstructures.config.feature.mineshaft.desertmineshafts")
						.define("desertMineshafts", true);

					stoneMineshafts = builder
							.comment("\r\n Replace Mineshafts in Mountain (Extreme Hills) biomes with a Stone themed Mineshaft.")
						.translation("repurposedstructures.config.feature.mineshaft.stonemineshafts")
						.define("stoneMineshafts", true);

					savannaMineshafts = builder
							.comment("\r\n Replace Mineshafts in Savanna biomes with a Savanna themed Mineshaft.")
						.translation("repurposedstructures.config.feature.mineshaft.savannamineshafts")
						.define("savannaMineshafts", true);

					icyMineshafts = builder
							.comment("\r\n Replace Mineshafts in Snowy/Icy biomes with an Ice themed Mineshaft."
									+"\r\n Note: Snowy Taiga Biomes will get Ice Mineshaft instead of Taiga theme.")
						.translation("repurposedstructures.config.feature.mineshaft.icymineshafts")
						.define("icyMineshafts", true);

					oceanMineshafts = builder
							.comment("\r\n Replace Mineshafts in Ocean biomes with an Ocean themed Mineshaft.")
						.translation("repurposedstructures.config.feature.mineshaft.oceanmineshafts")
						.define("oceanMineshafts", true);

					taigaMineshafts = builder
							.comment("\r\n Replace Mineshafts in Taiga biomes with a Taiga themed Mineshaft.")
						.translation("repurposedstructures.config.feature.mineshaft.taigamineshafts")
						.define("taigaMineshafts", true);
					
					swampAndDarkForestMineshafts = builder
							.comment("\r\n Replace Mineshafts in Swamps and Dark Forests with a"
									+"\r\n swampy/dark oak themed Mineshaft.")
						.translation("repurposedstructures.config.feature.mineshaft.swampanddarkforestmineshafts")
						.define("swampAndDarkForestMineshafts", true);
					
					endMineshafts = builder
							.comment("\r\n Add End themed Mineshafts to End biomes outside the Enderdragon island.")
						.translation("repurposedstructures.config.feature.mineshaft.endmineshafts")
						.define("endMineshafts", true);
					
					netherMineshafts = builder
							.comment("\r\n Add Nether themed Mineshafts to Nether biomes.")
						.translation("repurposedstructures.config.feature.mineshaft.nethermineshafts")
						.define("netherMineshafts", true);
					
				builder.pop();

				builder.push("Stronghold");

					useVanillaStronghold = builder
						.comment("\r\n Use vanilla Stronghold instead of using this mod's modded version.\r\n"
								+" Note: The other Stronghold configs below will have no effect on vanilla Strongholds.")
						.translation("repurposedstructures.config.structure.stronghold.usevanillastronghold")
						.define("useVanillaStronghold", true);

					allowStonebrickStronghold = builder
						.comment("\r\n Allow Stonebrick styled Stronghold to generate in non-Nether biomes.\r\n")
						.translation("repurposedstructures.config.structure.stronghold.allowstonebrickstronghold")
						.define("allowStonebrickStronghold", true);

					allowNetherStronghold = builder
						.comment("\r\n Allow Nether-styled Strongholds to spawn in Nether category biomes.\r\n")
						.translation("repurposedstructures.config.structure.stronghold.allownetherstronghold")
						.define("allowNetherStronghold", true);
				
					strongholdSpawnrate = builder
							.comment("\r\n How rare are Strongholds." 
									+ "\n " 
									+ "1 for spawning in most chunks and 1001 for no spawn.")
							.translation("repurposedstructures.config.structure.stronghold.strongholdspawnrate")
							.defineInRange("strongholdSpawnrate", 85, 1, 1001);
		
					silverfishSpawnrateSH = builder
							.comment("\r\n How often Silverfish Blocks will generate in Strongholds as a percentage." 
									+ "\r\n Note: Mossy Stone Bricks block cannot be infected by Silverfish"
									+ "\n "
									+ "0 for no Silverfish Blocks and 100 for max spawnrate.")
							.translation("repurposedstructures.config.structure.stronghold.silverfishspawnratesh")
							.defineInRange("silverfishSpawnrateSH", 0.8D, 0, 100);
		
					allowExtraSpawnersSH = builder
							.comment("\r\n Make Mob Spawners generate in rooms other than the Portal Room in Strongholds.\r\n"
									+" Note: Spawners in Portal Room will always remain.")
							.translation("repurposedstructures.config.structure.stronghold.allowextraspawnerssh")
							.define("allowExtraSpawnersSH", true);
		
					strongholdSizeSH = builder
							.comment("\r\n How large the Stronghold is on average as a percentage." 
									+ "\r\n Note: The Stonghold is much larger by default. To get something "
									+ "\r\n closer to vanilla stronghold size, use the value of 60."
									+ "\n "
									+ "10 for supertiny Strongholds and 2000 for supermassive Strongholds.")
							.translation("repurposedstructures.config.structure.stronghold.strongholdsizesh")
							.defineInRange("strongholdSizeSH", 100D, 10, 2000);
					
					lootChestsSH = builder
							.comment("\r\n Controls whether loot chests spawn or not in the Stronghold.")
						.translation("repurposedstructures.config.structure.stronghold.lootchestssh")
						.define("lootChestsSH", true);
	
				builder.pop();
	
				builder.push("Jungle Fortress");
	
					jungleFortressSpawnrate = builder
							.comment("\r\n How rare are Jungle Fortresses." 
									+ "\n "
									+ "1 for spawning in most chunks and 1001 for no spawn.")
							.translation("repurposedstructures.config.structure.junglefortress.junglefortressspawnrate")
							.defineInRange("jungleFortressSpawnrate", 32, 1, 1001);

					silverfishSpawnrateJF = builder
							.comment("\r\n How often Silverfish Blocks will generate in Jungle Fortress as a percentage."
									+ "\r\n Note: Mossy Stone Bricks block cannot be infected by Silverfish"
									+ "\n "
									+ "0 for no Silverfish Blocks and 100 for max spawnrate.")
							.translation("repurposedstructures.config.structure.junglefortress.silverfishspawnratejf")
							.defineInRange("silverfishSpawnrateJF", 0.5D, 0, 100);
					
					allowSilverfishSpawnerJF = builder
							.comment("\r\n Silverfish Mob Spawners generate in Stone Fortresses."
									+"\r\n If turned off, the spawners will become Skeleton spawners.")
							.translation("repurposedstructures.config.structure.junglefortress.allowsilverfishspawnerjf")
							.define("allowSilverfishSpawnerJF", true);

					lootChestsJF = builder
							.comment("\r\n Controls whether loot chests spawn or not in Jungle Fortresses.")
						.translation("repurposedstructures.config.structure.junglefortress.lootchestsjf")
						.define("lootChestsJF", true);

					addJungleFortressToModdedBiomes = builder
							.comment("\r\n Add Jungle Fortress to modded jungle biomes.")
						.translation("repurposedstructures.config.structure.junglefortress.addjunglefortresstomoddedbiomes")
						.define("addJungleFortressToModdedBiomes", false);
					
				builder.pop();
				
				builder.push("Nether Temple");
	
					netherTempleSpawnrate = builder
							.comment("\r\n How rare are Nether Temples in Nether." 
									+ "\n "
									+ "1 for spawning in most chunks and 1001 for no spawn.")
							.translation("repurposedstructures.config.structure.nethertemple.nethertemplespawnrate")
							.defineInRange("netherTempleSpawnrate", 20, 1, 1001);

					lootChestsNT = builder
							.comment("\r\n Controls whether loot chests spawn or not in Nether Temples.")
						.translation("repurposedstructures.config.structure.nethertemple.lootchestsnt")
						.define("lootChestsNT", true);

					addNetherTempleToModdedBiomes = builder
							.comment("\r\n Add Jungle Fortress to modded jungle biomes.")
						.translation("repurposedstructures.config.structure.nethertemple.addnethertempletomoddedbiomes")
						.define("addNetherTempleToModdedBiomes", false);
					
				builder.pop();
			builder.pop();
		}
	}


	public static void refreshServer()
	{
		addDungeonsToModdedBiomes = SERVER.addDungeonsToModdedBiomes.get();
		dungeonSpawnrate = SERVER.dungeonSpawnrate.get();
		badlandsDungeons = SERVER.badlandsDungeons.get();
		darkForestDungeons = SERVER.darkForestDungeons.get();
		desertDungeons = SERVER.desertDungeons.get();
		jungleDungeons = SERVER.jungleDungeons.get();
		mushroomDungeons = SERVER.mushroomDungeons.get();
		snowDungeons = SERVER.snowDungeons.get();
		swampDungeons = SERVER.swampDungeons.get();
		endDungeons = SERVER.endDungeons.get();
		netherDungeons = SERVER.netherDungeons.get();

		addWellsToModdedBiomes = SERVER.addWellsToModdedBiomes.get();
		wellSpawnrate = SERVER.wellSpawnrate.get();
		badlandsWells = SERVER.badlandsWells.get();
		netherWells = SERVER.netherWells.get();
		snowWells = SERVER.snowWells.get();
		mossyStoneWells = SERVER.mossyStoneWells.get();
		forestWells = SERVER.forestWells.get();
		
		addMiscToModdedBiomes = SERVER.addMiscToModdedBiomes.get();
		boulderTiny = SERVER.boulderTiny.get();
		boulderGiant = SERVER.boulderGiant.get();
		hornedSwampTree = SERVER.hornedSwampTree.get();
		
		lootChestsMS = SERVER.lootChestsMS.get();
		mineshaftSpawnrate = SERVER.mineshaftSpawnrate.get();
		addMineshaftsToModdedBiomes = SERVER.addMineshaftsToModdedBiomes.get();
		birchMineshafts = SERVER.birchMineshafts.get();
		jungleMineshafts = SERVER.jungleMineshafts.get();
		desertMineshafts = SERVER.desertMineshafts.get();
		stoneMineshafts = SERVER.stoneMineshafts.get();
		savannaMineshafts = SERVER.savannaMineshafts.get();
		icyMineshafts = SERVER.icyMineshafts.get();
		oceanMineshafts = SERVER.oceanMineshafts.get();
		taigaMineshafts = SERVER.taigaMineshafts.get();
		swampAndDarkForestMineshafts = SERVER.swampAndDarkForestMineshafts.get();
		endMineshafts = SERVER.endMineshafts.get();
		netherMineshafts = SERVER.netherMineshafts.get();

		useVanillaStronghold = SERVER.useVanillaStronghold.get();
		allowStonebrickStronghold = SERVER.allowStonebrickStronghold.get();
		allowNetherStronghold = SERVER.allowNetherStronghold.get();
		strongholdSpawnrate = SERVER.strongholdSpawnrate.get();
		silverfishSpawnrateSH = SERVER.silverfishSpawnrateSH.get();
		allowExtraSpawnersSH = SERVER.allowExtraSpawnersSH.get();
		strongholdSizeSH = SERVER.strongholdSizeSH.get();
		lootChestsSH = SERVER.lootChestsSH.get();
		
		jungleFortressSpawnrate = SERVER.jungleFortressSpawnrate.get();
		silverfishSpawnrateJF = SERVER.silverfishSpawnrateJF.get();
		allowSilverfishSpawnerJF = SERVER.allowSilverfishSpawnerJF.get();
		lootChestsJF = SERVER.lootChestsJF.get();
		addJungleFortressToModdedBiomes = SERVER.addJungleFortressToModdedBiomes.get();
		
		netherTempleSpawnrate = SERVER.netherTempleSpawnrate.get();
		lootChestsNT = SERVER.lootChestsNT.get();
		addNetherTempleToModdedBiomes = SERVER.addNetherTempleToModdedBiomes.get();
	}
}
