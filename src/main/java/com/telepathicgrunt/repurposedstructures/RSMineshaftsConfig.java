package com.telepathicgrunt.repurposedstructures;

import com.telepathicgrunt.repurposedstructures.utils.ConfigHelper;
import com.telepathicgrunt.repurposedstructures.utils.ConfigHelper.ConfigValueListener;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber
public class RSMineshaftsConfig
{

	public static class RSMineshaftsConfigValues
	{
		public ConfigValueListener<Boolean> lootChestsMS;
		public ConfigValueListener<Boolean> addMineshaftsToModdedBiomes;
		public ConfigValueListener<Integer> birchMineshaftSpawnrate;
		public ConfigValueListener<Integer> jungleMineshaftSpawnrate;
		public ConfigValueListener<Integer> desertMineshaftSpawnrate;
		public ConfigValueListener<Integer> stoneMineshaftSpawnrate;
		public ConfigValueListener<Integer> savannaMineshaftSpawnrate;
		public ConfigValueListener<Integer> icyMineshaftSpawnrate;
		public ConfigValueListener<Integer> oceanMineshaftSpawnrate;
		public ConfigValueListener<Integer> taigaMineshaftSpawnrate;;
		public ConfigValueListener<Integer> swampAndDarkForestMineshaftSpawnrate;
		public ConfigValueListener<Integer> endMineshaftSpawnrate;
		public ConfigValueListener<Integer> netherMineshaftSpawnrate;

		public ConfigValueListener<Integer> birchMineshaftMinHeight;
		public ConfigValueListener<Integer> jungleMineshaftMinHeight;
		public ConfigValueListener<Integer> desertMineshaftMinHeight;
		public ConfigValueListener<Integer> stoneMineshaftMinHeight;
		public ConfigValueListener<Integer> savannaMineshaftMinHeight;
		public ConfigValueListener<Integer> icyMineshaftMinHeight;
		public ConfigValueListener<Integer> oceanMineshaftMinHeight;
		public ConfigValueListener<Integer> taigaMineshaftMinHeight;;
		public ConfigValueListener<Integer> swampAndDarkForestMineshaftMinHeight;
		public ConfigValueListener<Integer> endMineshaftMinHeight;
		public ConfigValueListener<Integer> netherMineshaftMinHeight;
		
		public ConfigValueListener<Integer> birchMineshaftMaxHeight;
		public ConfigValueListener<Integer> jungleMineshaftMaxHeight;
		public ConfigValueListener<Integer> desertMineshaftMaxHeight;
		public ConfigValueListener<Integer> stoneMineshaftMaxHeight;
		public ConfigValueListener<Integer> savannaMineshaftMaxHeight;
		public ConfigValueListener<Integer> icyMineshaftMaxHeight;
		public ConfigValueListener<Integer> oceanMineshaftMaxHeight;
		public ConfigValueListener<Integer> taigaMineshaftMaxHeight;;
		public ConfigValueListener<Integer> swampAndDarkForestMineshaftMaxHeight;
		public ConfigValueListener<Integer> endMineshaftMaxHeight;
		public ConfigValueListener<Integer> netherMineshaftMaxHeight;

	    	RSMineshaftsConfigValues(ForgeConfigSpec.Builder builder, ConfigHelper.Subscriber subscriber)
		{

			builder.push("Mineshaft");

				lootChestsMS = subscriber.subscribe(builder
						.comment("\r\n Controls whether loot chests spawn or not in modded Mineshafts.")
					.translation("repurposedstructures.config.structure.mineshaft.lootchestsms")
					.define("lootChestsMS", true));

				addMineshaftsToModdedBiomes = subscriber.subscribe(builder
						.comment("\r\n Add the custom Mineshafts to modded biomes of the same categories/type.")
					.translation("repurposedstructures.config.feature.dungeons.addmineshaftstomoddedbiomes")
					.define("addMineshaftsToModdedBiomes", false));

				builder.push("Spawnrate");
					
					birchMineshaftSpawnrate = subscriber.subscribe(builder
							.comment("\r\n Replace Mineshafts in Birch biomes with a Birch themed Mineshaft."
								+"\r\n How often Mineshafts will spawn.\r\n " 
								+ "0 for no Mineshafts and 1000 for max spawnrate."
								+"\r\n Note: Vanilla Mineshafts will spawn again when this is set to 0 and game is restarted.")
						.translation("repurposedstructures.config.feature.mineshaft.birchmineshaftspawnrate")
						.defineInRange("birchMineshaftSpawnrate", 40, 0, 1000));

					jungleMineshaftSpawnrate = subscriber.subscribe(builder
							.comment("\r\n Replace Mineshafts in Jungle biomes with a Jungle themed Mineshaft."
								+"\r\n How often Mineshafts will spawn.\r\n " 
								+ "0 for no Mineshafts and 1000 for max spawnrate."
								+"\r\n Note: Vanilla Mineshafts will spawn again when this is set to 0 and game is restarted.")
						.translation("repurposedstructures.config.feature.mineshaft.junglemineshaftspawnrate")
						.defineInRange("jungleMineshaftSpawnrate", 40, 0, 1000));

					desertMineshaftSpawnrate = subscriber.subscribe(builder
							.comment("\r\n Replace Mineshafts in Desert biomes with a Desert themed Mineshaft."
								+"\r\n How often Mineshafts will spawn.\r\n " 
								+ "0 for no Mineshafts and 1000 for max spawnrate."
								+"\r\n Note: Vanilla Mineshafts will spawn again when this is set to 0 and game is restarted.")
						.translation("repurposedstructures.config.feature.mineshaft.desertmineshaftspawnrate")
						.defineInRange("desertMineshaftSpawnrate", 40, 0, 1000));

					stoneMineshaftSpawnrate = subscriber.subscribe(builder
							.comment("\r\n Replace Mineshafts in Mountain (Extreme Hills) biomes with a Stone themed Mineshaft."
								+"\r\n How often Mineshafts will spawn.\r\n " 
								+ "0 for no Mineshafts and 1000 for max spawnrate."
								+"\r\n Note: Vanilla Mineshafts will spawn again when this is set to 0 and game is restarted.")
						.translation("repurposedstructures.config.feature.mineshaft.stonemineshaftspawnrate")
						.defineInRange("stoneMineshaftSpawnrate", 40, 0, 1000));

					savannaMineshaftSpawnrate = subscriber.subscribe(builder
							.comment("\r\n Replace Mineshafts in Savanna biomes with a Savanna themed Mineshaft."
								+"\r\n How often Mineshafts will spawn.\r\n " 
								+ "0 for no Mineshafts and 1000 for max spawnrate."
								+"\r\n Note: Vanilla Mineshafts will spawn again when this is set to 0 and game is restarted.")
						.translation("repurposedstructures.config.feature.mineshaft.savannamineshaftspawnrate")
						.defineInRange("savannaMineshaftSpawnrate", 40, 0, 1000));

					icyMineshaftSpawnrate = subscriber.subscribe(builder
							.comment("\r\n Replace Mineshafts in Snowy/Icy biomes with an Ice themed Mineshaft."
									+"\r\n Note: Snowy Taiga Biomes will get Ice Mineshaft instead of Taiga theme."
									+"\r\n How often Mineshafts will spawn.\r\n " 
									+ "0 for no Mineshafts and 1000 for max spawnrate."
									+"\r\n Note: Vanilla Mineshafts will spawn again when this is set to 0 and game is restarted.")
						.translation("repurposedstructures.config.feature.mineshaft.icymineshaftspawnrate")
						.defineInRange("icyMineshaftSpawnrate", 40, 0, 1000));

					oceanMineshaftSpawnrate = subscriber.subscribe(builder
							.comment("\r\n Replace Mineshafts in Ocean biomes with an Ocean themed Mineshaft."
								+"\r\n How often Mineshafts will spawn.\r\n " 
								+ "0 for no Mineshafts and 1000 for max spawnrate."
								+"\r\n Note: Vanilla Mineshafts will spawn again when this is set to 0 and game is restarted.")
						.translation("repurposedstructures.config.feature.mineshaft.oceanmineshaftspawnrate")
						.defineInRange("oceanMineshaftSpawnrate", 40, 0, 1000));

					taigaMineshaftSpawnrate = subscriber.subscribe(builder
							.comment("\r\n Replace Mineshafts in Taiga biomes with a Taiga themed Mineshaft."
								+"\r\n How often Mineshafts will spawn.\r\n " 
								+ "0 for no Mineshafts and 1000 for max spawnrate."
								+" Note: Vanilla Mineshafts will spawn again when this is set to 0 and game is restarted.")
						.translation("repurposedstructures.config.feature.mineshaft.taigamineshaftspawnrate")
						.defineInRange("taigaMineshaftSpawnrate", 40, 0, 1000));
					
					swampAndDarkForestMineshaftSpawnrate = subscriber.subscribe(builder
							.comment("\r\n Replace Mineshafts in Swamps and Dark Forests with a"
								+"\r\n swampy/dark oak themed Mineshaft."
								+"\r\n Note: Vanilla Mineshafts will spawn again when this is set to 0 and game is restarted.")
						.translation("repurposedstructures.config.feature.mineshaft.swampanddarkforestmineshaftspawnrate"
							+"\r\n How often Mineshafts will spawn.\r\n " 
							+ "0 for no Mineshafts and 1000 for max spawnrate.")
						.defineInRange("swampAndDarkForestMineshaftSpawnrate", 40, 0, 1000));
					
					endMineshaftSpawnrate = subscriber.subscribe(builder
							.comment("\r\n Add End themed Mineshafts to End biomes outside the Enderdragon island."
								+"\r\n How often Mineshafts will spawn.\r\n " 
								+ "0 for no Mineshafts and 1000 for max spawnrate.")
						.translation("repurposedstructures.config.feature.mineshaft.endmineshaftspawnrate")
						.defineInRange("endMineshaftSpawnrate", 40, 0, 1000));
					
					netherMineshaftSpawnrate = subscriber.subscribe(builder
							.comment("\r\n Add Nether themed Mineshafts to Nether biomes."
								+"\r\n How often Mineshafts will spawn.\r\n " 
								+ "0 for no Mineshafts and 1000 for max spawnrate.")
						.translation("repurposedstructures.config.feature.mineshaft.nethermineshaftspawnrate")
						.defineInRange("netherMineshaftSpawnrate", 40, 0, 1000));

				builder.pop();

				builder.push("Min height");
				
					birchMineshaftMinHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 0.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n"
							+" Setting this to below min height config will make mineshaft spawn only at min height.")
						.translation("repurposedstructures.config.feature.mineshaft.birchmineshaftminheight")
						.defineInRange("birchMineshaftMinHeight", 5, 5, 255));

					
					jungleMineshaftMinHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 5.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n")
						.translation("repurposedstructures.config.feature.mineshaft.junglemineshaftminheight")
						.defineInRange("jungleMineshaftMinHeight", 5, 5, 255));

					
					desertMineshaftMinHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 5.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n")
						.translation("repurposedstructures.config.feature.mineshaft.desertmineshaftminheight")
						.defineInRange("desertMineshaftMinHeight", 5, 5, 255));

					
					stoneMineshaftMinHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 5.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n")
						.translation("repurposedstructures.config.feature.mineshaft.stonemineshaftminheight")
						.defineInRange("stoneMineshaftMinHeight", 5, 5, 255));

					
					savannaMineshaftMinHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 5.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n")
						.translation("repurposedstructures.config.feature.mineshaft.savannamineshaftminheight")
						.defineInRange("savannaMineshaftMinHeight", 5, 5, 255));

					
					icyMineshaftMinHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 5.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n")
						.translation("repurposedstructures.config.feature.mineshaft.icymineshaftminheight")
						.defineInRange("icyMineshaftMinHeight", 5, 5, 255));

					
					oceanMineshaftMinHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 5.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n")
						.translation("repurposedstructures.config.feature.mineshaft.oceanmineshaftminheight")
						.defineInRange("oceanMineshaftMinHeight", 5, 5, 255));

					
					taigaMineshaftMinHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 5.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n")
						.translation("repurposedstructures.config.feature.mineshaft.taigamineshaftminheight")
						.defineInRange("taigaMineshaftMinHeight", 5, 5, 255));

					
					swampAndDarkForestMineshaftMinHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 5.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n")
						.translation("repurposedstructures.config.feature.mineshaft.swampanddarkforestmineshaftminheight")
						.defineInRange("swampAndDarkForestMineshaftMinHeight", 5, 5, 255));

					endMineshaftMinHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 30.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n")
						.translation("repurposedstructures.config.feature.mineshaft.endmineshaftminheight")
						.defineInRange("endMineshaftMinHeight", 30, 5, 255));

					netherMineshaftMinHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 5.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n")
						.translation("repurposedstructures.config.feature.mineshaft.nethermineshaftminheight")
						.defineInRange("netherMineshaftMinHeight", 5, 5, 255));

				builder.pop();

				builder.push("Max height");
				
					birchMineshaftMaxHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 50.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n"
							+" Setting this to below min height config will make mineshaft spawn only at min height.")
						.translation("repurposedstructures.config.feature.mineshaft.birchmineshaftmaxheight")
						.defineInRange("birchMineshaftMaxHeight", 50, 5, 255));

					
					jungleMineshaftMaxHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 50.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n"
							+" Setting this to below min height config will make mineshaft spawn only at min height.")
						.translation("repurposedstructures.config.feature.mineshaft.junglemineshaftmaxheight")
						.defineInRange("jungleMineshaftMaxHeight", 50, 5, 255));

					
					desertMineshaftMaxHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 50.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n"
							+" Setting this to below min height config will make mineshaft spawn only at min height.")
						.translation("repurposedstructures.config.feature.mineshaft.desertmineshaftmaxheight")
						.defineInRange("desertMineshaftMaxHeight", 50, 5, 255));

					
					stoneMineshaftMaxHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 50.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n"
							+" Setting this to below min height config will make mineshaft spawn only at min height.")
						.translation("repurposedstructures.config.feature.mineshaft.stonemineshaftmaxheight")
						.defineInRange("stoneMineshaftMaxHeight", 50, 5, 255));

					
					savannaMineshaftMaxHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 50.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n"
							+" Setting this to below min height config will make mineshaft spawn only at min height.")
						.translation("repurposedstructures.config.feature.mineshaft.savannamineshaftmaxheight")
						.defineInRange("savannaMineshaftMaxHeight", 50, 5, 255));

					
					icyMineshaftMaxHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 50.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n"
							+" Setting this to below min height config will make mineshaft spawn only at min height.")
						.translation("repurposedstructures.config.feature.mineshaft.icymineshaftmaxheight")
						.defineInRange("icyMineshaftMaxHeight", 50, 5, 255));

					
					oceanMineshaftMaxHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 25.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n"
							+" Setting this to below min height config will make mineshaft spawn only at min height.")
						.translation("repurposedstructures.config.feature.mineshaft.oceanmineshaftmaxheight")
						.defineInRange("oceanMineshaftMaxHeight", 25, 5, 255));

					
					taigaMineshaftMaxHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 50.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n"
							+" Setting this to below min height config will make mineshaft spawn only at min height.")
						.translation("repurposedstructures.config.feature.mineshaft.taigamineshaftmaxheight")
						.defineInRange("taigaMineshaftMaxHeight", 50, 5, 255));

					
					swampAndDarkForestMineshaftMaxHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 50.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n"
							+" Setting this to below min height config will make mineshaft spawn only at min height.")
						.translation("repurposedstructures.config.feature.mineshaft.swampanddarkforestmineshaftmaxheight")
						.defineInRange("swampAndDarkForestMineshaftMaxHeight", 50, 5, 255));

					endMineshaftMaxHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 50.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n"
							+" Setting this to below min height config will make mineshaft spawn only at min height.")
						.translation("repurposedstructures.config.feature.mineshaft.endmineshaftmaxheight")
						.defineInRange("endMineshaftMaxHeight", 40, 5, 255));

					netherMineshaftMaxHeight = subscriber.subscribe(builder
						.comment("\r\n Minimum Y height that this mineshaft can spawn at. Default is 22.\r\n"
							+" Note: The mineshaft will spawn between min and max y height set in config.\r\n"
							+" Setting this to below min height config will make mineshaft spawn only at min height.")
						.translation("repurposedstructures.config.feature.mineshaft.nethermineshaftmaxheight")
						.defineInRange("netherMineshaftMaxHeight", 22, 5, 255));

				builder.pop();
			builder.pop();
		}
	}
}
