package naturalbiomes2;

import naturalbiomes2.Biomes.BiomeHandler;
import cpw.mods.fml.common.Loader;
import forestry.api.core.EnumTemperature;
import forestry.api.core.EnumHumidity;

public class ForestryAPIManager {

	public static void init(){
		if(Loader.isModLoaded("Forestry") == true)
		{
			addBiomeTemperatures();
			System.out.println("[NaturalBiomes2] Forestry Integration Initialized Successfully!");
		}
	}
	
	private static void addBiomeTemperatures(){
		EnumTemperature.hotBiomeIds.add(BiomeHandler.dunes.biomeID);
		
		EnumTemperature.coldBiomeIds.add(BiomeHandler.snowyForest.biomeID);
		EnumTemperature.coldBiomeIds.add(BiomeHandler.snowyShrublands.biomeID);
		EnumTemperature.coldBiomeIds.add(BiomeHandler.snowyOakMountains.biomeID);
		
		EnumTemperature.normalBiomeIds.add(BiomeHandler.oakWoods.biomeID);
		EnumTemperature.normalBiomeIds.add(BiomeHandler.oakMountains.biomeID);
		EnumTemperature.normalBiomeIds.add(BiomeHandler.thickWoods.biomeID);
		EnumTemperature.normalBiomeIds.add(BiomeHandler.lushPlains.biomeID);
		EnumTemperature.normalBiomeIds.add(BiomeHandler.lushMountains.biomeID);
		EnumTemperature.normalBiomeIds.add(BiomeHandler.pineForest.biomeID);
		EnumTemperature.normalBiomeIds.add(BiomeHandler.meadows.biomeID);
		EnumTemperature.normalBiomeIds.add(BiomeHandler.shrublands.biomeID);
		EnumTemperature.normalBiomeIds.add(BiomeHandler.marsh.biomeID);
		EnumTemperature.normalBiomeIds.add(BiomeHandler.birchWoods.biomeID);
		EnumTemperature.normalBiomeIds.add(BiomeHandler.thickOakMountains.biomeID);
		EnumTemperature.normalBiomeIds.add(BiomeHandler.birchMountains.biomeID);
		EnumTemperature.normalBiomeIds.add(BiomeHandler.thickSwamp.biomeID);
		EnumTemperature.normalBiomeIds.add(BiomeHandler.lushForest.biomeID);
		EnumTemperature.normalBiomeIds.add(BiomeHandler.lushSwamp.biomeID);
		
		EnumTemperature.warmBiomeIds.add(BiomeHandler.savannah.biomeID);
		EnumTemperature.warmBiomeIds.add(BiomeHandler.sparseWoods.biomeID);
		EnumTemperature.warmBiomeIds.add(BiomeHandler.sparseOakMountains.biomeID);
		EnumTemperature.warmBiomeIds.add(BiomeHandler.rainForest.biomeID);
		EnumTemperature.warmBiomeIds.add(BiomeHandler.birchJungle.biomeID);
	}
	
	private static void addBiomeHumidity(){
		EnumHumidity.aridBiomeIds.add(BiomeHandler.dunes.biomeID);
		EnumHumidity.aridBiomeIds.add(BiomeHandler.sparseWoods.biomeID);
		EnumHumidity.aridBiomeIds.add(BiomeHandler.sparseOakMountains.biomeID);
		EnumHumidity.aridBiomeIds.add(BiomeHandler.shrublands.biomeID);
		EnumHumidity.aridBiomeIds.add(BiomeHandler.savannah.biomeID);
		
		EnumHumidity.dampBiomeIds.add(BiomeHandler.rainForest.biomeID);
		EnumHumidity.dampBiomeIds.add(BiomeHandler.lushForest.biomeID);
		EnumHumidity.dampBiomeIds.add(BiomeHandler.lushMountains.biomeID);
		EnumHumidity.dampBiomeIds.add(BiomeHandler.lushPlains.biomeID);
		EnumHumidity.dampBiomeIds.add(BiomeHandler.lushSwamp.biomeID);
		EnumHumidity.dampBiomeIds.add(BiomeHandler.marsh.biomeID);
		EnumHumidity.dampBiomeIds.add(BiomeHandler.thickSwamp.biomeID);
		EnumHumidity.dampBiomeIds.add(BiomeHandler.birchJungle.biomeID);
		
		EnumHumidity.normalBiomeIds.add(BiomeHandler.oakWoods.biomeID);
		EnumHumidity.normalBiomeIds.add(BiomeHandler.thickWoods.biomeID);
		EnumHumidity.normalBiomeIds.add(BiomeHandler.snowyForest.biomeID);
		EnumHumidity.normalBiomeIds.add(BiomeHandler.pineForest.biomeID);
		EnumHumidity.normalBiomeIds.add(BiomeHandler.meadows.biomeID);
		EnumHumidity.normalBiomeIds.add(BiomeHandler.snowyShrublands.biomeID);
		EnumHumidity.normalBiomeIds.add(BiomeHandler.birchWoods.biomeID);
		EnumHumidity.normalBiomeIds.add(BiomeHandler.oakMountains.biomeID);
		EnumHumidity.normalBiomeIds.add(BiomeHandler.thickOakMountains.biomeID);
		EnumHumidity.normalBiomeIds.add(BiomeHandler.snowyOakMountains.biomeID);
		EnumHumidity.normalBiomeIds.add(BiomeHandler.birchMountains.biomeID);
	}
	
}
