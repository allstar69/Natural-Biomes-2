package NaturalBiomes2.Biomes;

import NaturalBiomes2.Lib.BiomeAllow;
import NaturalBiomes2.Lib.BiomeIds;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenDesert;
import net.minecraft.world.biome.BiomeGenHills;
import net.minecraft.world.biome.BiomeGenSnow;
import net.minecraft.world.biome.BiomeGenTaiga;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

public class BiomeHandler {
	
	public static BiomeGenBase birchForest;
	public static BiomeGenBase birchJungle;
	public static BiomeGenBase birchMountains;
	public static BiomeGenBase birchWoods;
	public static BiomeGenBase blackMarsh;
	public static BiomeGenBase dunes;
	public static BiomeGenBase desertMountains;
	public static BiomeGenBase forestMountains;
	public static BiomeGenBase emptyPlains;
	public static BiomeGenBase extremeBirchWoods;
	public static BiomeGenBase extremeDesertHills;
	public static BiomeGenBase extremeDunes;
	public static BiomeGenBase extremeForestedHills;
	public static BiomeGenBase extremeGrassHills;
	public static BiomeGenBase extremeMeadowHills;
	public static BiomeGenBase extremeWoods;
	public static BiomeGenBase extremePineHills;
	public static BiomeGenBase extremeSnowHills;
	public static BiomeGenBase extremeSparseWoods;
	public static BiomeGenBase forest;
	public static BiomeGenBase oakMountains;
	public static BiomeGenBase oakWoods;
	public static BiomeGenBase lushForest;
	public static BiomeGenBase lushMountains;
	public static BiomeGenBase lushPlains; 
	public static BiomeGenBase lushSwamp;
	public static BiomeGenBase massiveHills;
	public static BiomeGenBase marsh;
	public static BiomeGenBase meadows;
	public static BiomeGenBase miniJungle;
	public static BiomeGenBase pineForest;
	public static BiomeGenBase rainForest;
	public static BiomeGenBase savannah;
	public static BiomeGenBase shrublands;
	public static BiomeGenBase snowyForest;
	public static BiomeGenBase snowyMountains;
	public static BiomeGenBase snowyOakMountains; 
	public static BiomeGenBase snowyShrublands;  
	public static BiomeGenBase snowyWoods; 
	public static BiomeGenBase sparseOakMountains; 
	public static BiomeGenBase sparseWoods; 
	public static BiomeGenBase swampyHills;
	public static BiomeGenBase taigaMountains;
	public static BiomeGenBase thickOakMountains; 
	public static BiomeGenBase thickSwamp;
	public static BiomeGenBase thickWoods;
	
	public static void init()
	{
        	initBiomes();
        
        	addToBiomeDictionary();

        	addSpawnBiomes();
        
        	addVillageBiomes();
        
        	addStrongholdBiomes();

        	registerBiomes();
	}
	
	public static void initBiomes()
	{
		birchForest = new BiomeGenBirchForest(BiomeIds.BIRCH_FOREST).setColor(353825).setBiomeName("Birch Forest (NB2)").setTemperatureRainfall(0.4F, 0.9F).setMinMaxHeight(0.2F, 0.3F);
		birchJungle = new BiomeGenBirchJungle(BiomeIds.BIRCH_JUNGLE).setColor(353825).setBiomeName("Birch Jungle (NB2)").setTemperatureRainfall(0.4F, 0.9F).setMinMaxHeight(0.4F, 0.7F);
        birchMountains = new BiomeGenBirchWoods(BiomeIds.BIRCH_MOUNTAINS, 3, 3).setColor(353825).setBiomeName("Birch Mountains (NB2)").setTemperatureRainfall(0.4F, 0.9F).setMinMaxHeight(0.5F, 0.9F);
        birchWoods = new BiomeGenBirchWoods(BiomeIds.BIRCH_WOODS, 3, 3).setColor(353825).setBiomeName("Birch Woods (NB2)").setTemperatureRainfall(0.4F, 0.9F).setMinMaxHeight(0.2F, 0.3F);
        blackMarsh = new BiomeGenBlackMarsh(BiomeIds.BLACK_MARSH).setColor(522674).setBiomeName("Black Marsh (NB2)").setTemperatureRainfall(0.8F, 0.9F).setMinMaxHeight(0.1F, 0.2F);
        dunes = new BiomeGenDunes(BiomeIds.DUNES).setDisableRain().setColor(16421912).setBiomeName("Dunes (NB2)").setDisableRain().setTemperatureRainfall(2.0F, 0.0F).setMinMaxHeight(0.5F, 0.9F);	
        desertMountains = new BiomeGenDesert(BiomeIds.DESERT_MOUNTAINS).setDisableRain().setColor(16421912).setBiomeName("Desert Mountains (NB2)").setDisableRain().setTemperatureRainfall(2.0F, 0.0F).setMinMaxHeight(0.5F, 0.9F);
        emptyPlains = new BiomeGenPlain(BiomeIds.EMPTY_PLAINS).setColor(6316128).setBiomeName("Empty Plains (NB2)").setTemperatureRainfall(0.2F, 0.3F).setMinMaxHeight(0.1F, 0.2F);
        extremeBirchWoods = new BiomeGenBirchWoods(BiomeIds.EXTREME_BIRCH_WOODS, 3, 3).setColor(6316128).setBiomeName("Extreme Birch Woods (NB2)").setTemperatureRainfall(0.4F, 0.9F).setMinMaxHeight(0.3F, 1.5F);
    	extremeDesertHills = new BiomeGenDesert(BiomeIds.EXTREME_DESERT_HILLS).setDisableRain().setColor(6316128).setBiomeName("Extreme Desert (NB2)").setTemperatureRainfall(2.0F, 0.0F).setMinMaxHeight(0.3F, 1.5F);
    	extremeDunes = new BiomeGenDunes(BiomeIds.EXTREME_DUNES).setDisableRain().setColor(6316128).setBiomeName("Extreme Dunes (NB2)").setTemperatureRainfall(2.0F, 0.0F).setMinMaxHeight(0.3F, 1.5F);
    	extremeForestedHills = new BiomeGenForest(BiomeIds.EXTREME_FORESTED_HILLS, 3).setColor(6316128).setBiomeName("Extreme Forested Hills (NB2)").setTemperatureRainfall(0.7F, 0.8F).setMinMaxHeight(0.3F, 1.5F);
    	extremeGrassHills = new BiomeGenGrass(BiomeIds.EXTREME_GRASS_HILLS).setColor(6316128).setBiomeName("Extreme Grass Hills (NB2)").setTemperatureRainfall(1.2F, 1.0F).setMinMaxHeight(0.3F, 1.5F);
    	extremeMeadowHills = new BiomeGenMeadows(BiomeIds.EXTREME_MEADOW_HILLS).setColor(6316128).setBiomeName("Extreme Meadow Hills (NB2)").setTemperatureRainfall(1.2F, 1.0F).setMinMaxHeight(0.3F, 1.5F);
    	extremeWoods = new BiomeGenWoods(BiomeIds.EXTREME_WOODS, 3, 3).setColor(6316128).setBiomeName("Extreme Woods (NB2)").setTemperatureRainfall(0.6F, 0.4F).setMinMaxHeight(0.3F, 1.5F);
    	extremePineHills = new BiomeGenPineForest(BiomeIds.EXTREME_PINE_HILLS).setColor(6316128).setBiomeName("Extreme Pines (NB2)").setTemperatureRainfall(0.3F, 0.6F).setMinMaxHeight(0.3F, 1.5F);
    	extremeSnowHills = new BiomeGenSnow(BiomeIds.EXTREME_SNOW_HILLS).setColor(6316128).setBiomeName("Extreme Snow Hills (NB2)").setTemperatureRainfall(0.0F, 0.05F).setMinMaxHeight(0.3F, 1.5F);
    	extremeSparseWoods = new BiomeGenWoods(BiomeIds.EXTREME_SPARSE_WOODS, 1, 3).setColor(6316128).setBiomeName("Extreme Sparse Woods (NB2)").setTemperatureRainfall(1.5F, 0.15F).setMinMaxHeight(0.3F, 1.5F);
    	forest = new BiomeGenForest(BiomeIds.FOREST, 5).setColor(353825).setBiomeName("Forest (NB2)").setTemperatureRainfall(0.7F, 0.8F).setMinMaxHeight(0.2F, 0.3F);
    	forestMountains = new BiomeGenForest(BiomeIds.FOREST_MOUNTAINS, 5).setColor(353825).setBiomeName("Forest Mountains (NB2)").setTemperatureRainfall(0.7F, 0.8F).setMinMaxHeight(0.5F, 0.9F);
    	oakMountains = new BiomeGenWoods(BiomeIds.OAK_MOUNTAINS, 3, 3).setColor(353825).setBiomeName("Oak Mountains (NB2)").setTemperatureRainfall(0.6F, 0.4F).setMinMaxHeight(0.5F, 0.9F);
		oakWoods = new BiomeGenWoods(BiomeIds.OAK_WOODS, 3, 3).setColor(353825).setBiomeName("Woods (NB2)").setTemperatureRainfall(0.6F, 0.4F).setMinMaxHeight(0.2F, 0.3F);
		lushForest = new BiomeGenForest(BiomeIds.LUSH_FOREST, 30).setColor(9286496).setBiomeName("Lush Forest (NB2)").setTemperatureRainfall(1.2F, 1.0F).setMinMaxHeight(0.2F, 0.3F);
        lushMountains = new BiomeGenGrass(BiomeIds.LUSH_MOUNTAINS).setColor(9286496).setBiomeName("Lush Mountains (NB2)").setTemperatureRainfall(1.2F, 1.0F).setMinMaxHeight(0.5F, 0.9F);
        lushPlains = new BiomeGenGrass(BiomeIds.LUSH_PLAINS).setColor(9286496).setBiomeName("Lush Plains (NB2)").setTemperatureRainfall(1.2F, 1.0F).setMinMaxHeight(0.1F, 0.2F);
        lushSwamp = new BiomeGenLushSwamp(BiomeIds.LUSH_SWAMP, 2).setColor(9286496).setBiomeName("Lush Swamps (NB2)").setTemperatureRainfall(1.2F, 1.0F).setMinMaxHeight(-0.2F, 0.1F);
        massiveHills = new BiomeGenMassiveHills(BiomeIds.MASSIVE_HILLS).setColor(9286496).setBiomeName("Massive Hills (NB2)").setMinMaxHeight(1.5F, 2.0F).setTemperatureRainfall(0.2F, 0.3F);
        marsh = new BiomeGenMarsh(BiomeIds.MARSH).setColor(353825).setBiomeName("Marsh (NB2)").setTemperatureRainfall(0.7F, 0.8F).setMinMaxHeight(0.1F, 0.2F);
        meadows = new BiomeGenMeadows(BiomeIds.MEADOWS).setColor(9286496).setBiomeName("Meadows (NB2)").setTemperatureRainfall(1.2F, 1.0F).setMinMaxHeight(0.1F, 0.2F);
        miniJungle = new BiomeGenMiniJungle(BiomeIds.MINI_JUNGLE).setColor(5470985).setBiomeName("Mini Jungle (NB2)").func_76733_a(5470985).setTemperatureRainfall(1.2F, 0.9F).setMinMaxHeight(0.1F, 0.2F);
        pineForest = new BiomeGenPineForest(BiomeIds.PINE_FOREST).setColor(747097).setBiomeName("Pine Forest (NB2)").setTemperatureRainfall(0.3F, 0.6F).setMinMaxHeight(0.1F, 0.3F);
        rainForest = new BiomeGenRainForest(BiomeIds.RAIN_FOREST).setColor(5470985).setBiomeName("Rainforest (NB2)").setTemperatureRainfall(1.2F, 0.9F).setMinMaxHeight(0.4F, 0.8f);
        savannah = new BiomeGenGrass(BiomeIds.SAVANNAH).setColor(353825).setBiomeName("Savannah (NB2)").setTemperatureRainfall(1.9F, 0.15F).setDisableRain().setMinMaxHeight(0.1F, 0.2F);
        shrublands = new BiomeGenShrublands(BiomeIds.SHRUBLANDS).setColor(353825).setBiomeName("Shrublands (NB2)").setTemperatureRainfall(1.5F, 0.15F).setMinMaxHeight(0.1F, 0.5F);       
        snowyForest = new BiomeGenForest(BiomeIds.SNOWY_FOREST, 3).setColor(747097).setBiomeName("Snowy Forest (NB2)").setTemperatureRainfall(0.05F, 0.6F).setEnableSnow().setMinMaxHeight(0.1F, 0.3F);
        snowyMountains = new BiomeGenSnow(BiomeIds.SNOWY_MOUNTAINS).setColor(747097).setBiomeName("Snowy Mountains (NB2)").setTemperatureRainfall(0.05F, 0.6F).setEnableSnow().setMinMaxHeight(0.5F, 0.9F);
        snowyOakMountains = new BiomeGenWoods(BiomeIds.SNOWY_OAK_MOUNTAINS, 3, 3).setColor(747097).setBiomeName("Snowy Oak Mountains (NB2)").setTemperatureRainfall(0.05F, 0.6F).setMinMaxHeight(0.5F, 0.9F);
        snowyShrublands = new BiomeGenShrublands(BiomeIds.SNOWY_SHRUBLANDS).setColor(9286496).setBiomeName("Snowy Shrublands (NB2)").setTemperatureRainfall(0.05F, 0.6F).setEnableSnow().setMinMaxHeight(0.1F, 0.5F);            
        snowyWoods = new BiomeGenWoods(BiomeIds.SNOWY_WOODS, 3, 3).setColor(747097).setBiomeName("Snowy Woods (NB2)").setTemperatureRainfall(0.05F, 0.6F).setEnableSnow().setMinMaxHeight(0.1F, 0.3F);
        sparseOakMountains = new BiomeGenWoods(BiomeIds.SPARSE_OAK_MOUNTAINS, 1, 3).setColor(353825).setBiomeName("Sparse Oak Mountains (NB2)").setTemperatureRainfall(1.5F, 0.15F).setMinMaxHeight(0.5F, 0.9F);
        sparseWoods = new BiomeGenWoods(BiomeIds.SPARSE_WOODS, 1, 3).setColor(353825).setBiomeName("Sparse Woods (NB2)").setTemperatureRainfall(1.5F, 0.15F).setMinMaxHeight(0.1F, 0.3F);
        swampyHills = new BiomeGenSwamp(BiomeIds.SWAMPY_HILLS, 5).setColor(522674).setBiomeName("Swampy Hills (NB2)").func_76733_a(9154376).setMinMaxHeight(0.5F, 0.9F).setTemperatureRainfall(0.8F, 0.9F); 
        taigaMountains = new BiomeGenTaiga(BiomeIds.TAIGA_MOUNTAINS).setColor(747097).setBiomeName("Taiga Mountains (NB2)").setTemperatureRainfall(0.05F, 0.6F).setMinMaxHeight(0.5F, 0.9F);
        thickOakMountains = new BiomeGenWoods(BiomeIds.THICK_OAK_MOUNTAINS, 12, 3).setColor(353825).setBiomeName("Thick Oak Mountains (NB2)").setTemperatureRainfall(0.6F, 0.4F).setMinMaxHeight(0.5F, 0.9F);
        thickSwamp = new BiomeGenSwamp(BiomeIds.THICK_SWAMP, 15).setColor(522674).setBiomeName("Thick Swampland (NB2)").func_76733_a(9154376).setMinMaxHeight(-0.2F, 0.1F).setTemperatureRainfall(0.8F, 0.9F);    
        thickWoods = new BiomeGenWoods(BiomeIds.THICK_WOODS, 12, 5).setColor(353825).setBiomeName("Thick Woods (NB2)").setTemperatureRainfall(0.8F, 0.9F).setMinMaxHeight(0.1F, 0.3F);
	}
	
	public static void addToBiomeDictionary()
	{
		BiomeDictionary.registerBiomeType(birchForest, new BiomeDictionary.Type[] {BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(birchJungle, new BiomeDictionary.Type[] {BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.HILLS});
		BiomeDictionary.registerBiomeType(birchMountains, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(birchWoods, new BiomeDictionary.Type[] {BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(blackMarsh, new BiomeDictionary.Type[] {BiomeDictionary.Type.SWAMP});
		BiomeDictionary.registerBiomeType(dunes, new BiomeDictionary.Type[] {BiomeDictionary.Type.DESERT, BiomeDictionary.Type.MOUNTAIN});
		BiomeDictionary.registerBiomeType(desertMountains, new BiomeDictionary.Type[] {BiomeDictionary.Type.DESERT, BiomeDictionary.Type.MOUNTAIN});
		BiomeDictionary.registerBiomeType(forest, new BiomeDictionary.Type[] {BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(forestMountains, new BiomeDictionary.Type[] {BiomeDictionary.Type.FOREST, BiomeDictionary.Type.MOUNTAIN});
		BiomeDictionary.registerBiomeType(emptyPlains, new BiomeDictionary.Type[] {BiomeDictionary.Type.PLAINS});
		BiomeDictionary.registerBiomeType(extremeBirchWoods, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN,BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(extremeDesertHills, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.DESERT});
		BiomeDictionary.registerBiomeType(extremeDunes, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.DESERT});
		BiomeDictionary.registerBiomeType(extremeForestedHills, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(extremeGrassHills, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN});
		BiomeDictionary.registerBiomeType(extremeMeadowHills, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN});
		BiomeDictionary.registerBiomeType(extremePineHills, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(extremeSnowHills, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.FROZEN});
		BiomeDictionary.registerBiomeType(extremeSparseWoods, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(extremeWoods, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(lushForest, new BiomeDictionary.Type[] {BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(lushMountains, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN});
		BiomeDictionary.registerBiomeType(lushPlains, new BiomeDictionary.Type[] {BiomeDictionary.Type.PLAINS});
		BiomeDictionary.registerBiomeType(lushSwamp, new BiomeDictionary.Type[] {BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(massiveHills, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN});
		BiomeDictionary.registerBiomeType(marsh, new BiomeDictionary.Type[] {BiomeDictionary.Type.SWAMP});
		BiomeDictionary.registerBiomeType(meadows, new BiomeDictionary.Type[] {BiomeDictionary.Type.PLAINS});
		BiomeDictionary.registerBiomeType(miniJungle, new BiomeDictionary.Type[] {BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(oakMountains, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(oakWoods, new BiomeDictionary.Type[] {BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(pineForest, new BiomeDictionary.Type[] {BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(rainForest, new BiomeDictionary.Type[] {BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.HILLS});
		BiomeDictionary.registerBiomeType(savannah, new BiomeDictionary.Type[] {BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.DESERT});
		BiomeDictionary.registerBiomeType(shrublands, new BiomeDictionary.Type[] {BiomeDictionary.Type.PLAINS});
		BiomeDictionary.registerBiomeType(snowyForest, new BiomeDictionary.Type[] {BiomeDictionary.Type.FOREST, BiomeDictionary.Type.FROZEN});
		BiomeDictionary.registerBiomeType(snowyMountains, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.FROZEN});
		BiomeDictionary.registerBiomeType(snowyShrublands, new BiomeDictionary.Type[] {BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.FROZEN});
		BiomeDictionary.registerBiomeType(snowyWoods, new BiomeDictionary.Type[] {BiomeDictionary.Type.FOREST, BiomeDictionary.Type.FROZEN});
		BiomeDictionary.registerBiomeType(sparseOakMountains, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(sparseWoods, new BiomeDictionary.Type[] {BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(swampyHills, new BiomeDictionary.Type[] {BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.HILLS});
		BiomeDictionary.registerBiomeType(taigaMountains, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.FROZEN});
		BiomeDictionary.registerBiomeType(thickOakMountains, new BiomeDictionary.Type[] {BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(thickSwamp, new BiomeDictionary.Type[] {BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.FOREST});
		BiomeDictionary.registerBiomeType(thickWoods, new BiomeDictionary.Type[] {BiomeDictionary.Type.FOREST});
	}
	
	public static void addSpawnBiomes()
	{
		BiomeManager.addSpawnBiome(birchForest);
		BiomeManager.addSpawnBiome(birchJungle);
		BiomeManager.addSpawnBiome(birchMountains);
		BiomeManager.addSpawnBiome(birchWoods);
		BiomeManager.addSpawnBiome(blackMarsh);
		BiomeManager.addSpawnBiome(dunes);
		BiomeManager.addSpawnBiome(desertMountains);
		BiomeManager.addSpawnBiome(forest);
		BiomeManager.addSpawnBiome(forestMountains);
		BiomeManager.addSpawnBiome(emptyPlains);
		BiomeManager.addSpawnBiome(extremeBirchWoods);
		BiomeManager.addSpawnBiome(extremeDesertHills);
		BiomeManager.addSpawnBiome(extremeDunes);
		BiomeManager.addSpawnBiome(extremeForestedHills);
		BiomeManager.addSpawnBiome(extremeGrassHills);
		BiomeManager.addSpawnBiome(extremeMeadowHills);
		BiomeManager.addSpawnBiome(extremeWoods);
		BiomeManager.addSpawnBiome(extremePineHills);
		BiomeManager.addSpawnBiome(extremeSnowHills);
		BiomeManager.addSpawnBiome(extremeSparseWoods);
		BiomeManager.addSpawnBiome(lushForest);
		BiomeManager.addSpawnBiome(lushMountains);
		BiomeManager.addSpawnBiome(lushPlains);
		BiomeManager.addSpawnBiome(lushSwamp);
		BiomeManager.addSpawnBiome(massiveHills);
		BiomeManager.addSpawnBiome(marsh);
		BiomeManager.addSpawnBiome(meadows);
		BiomeManager.addSpawnBiome(miniJungle);
		BiomeManager.addSpawnBiome(oakMountains);
		BiomeManager.addSpawnBiome(oakWoods);
		BiomeManager.addSpawnBiome(pineForest);
		BiomeManager.addSpawnBiome(rainForest);
		BiomeManager.addSpawnBiome(savannah);
		BiomeManager.addSpawnBiome(shrublands);
		BiomeManager.addSpawnBiome(snowyForest);
		BiomeManager.addSpawnBiome(snowyMountains);
		BiomeManager.addSpawnBiome(snowyOakMountains);
		BiomeManager.addSpawnBiome(snowyShrublands);
		BiomeManager.addSpawnBiome(snowyWoods);
		BiomeManager.addSpawnBiome(sparseOakMountains);
		BiomeManager.addSpawnBiome(sparseWoods);
		BiomeManager.addSpawnBiome(swampyHills);
		BiomeManager.addSpawnBiome(taigaMountains);
		BiomeManager.addSpawnBiome(thickOakMountains);
		BiomeManager.addSpawnBiome(thickSwamp);
		BiomeManager.addSpawnBiome(thickWoods);
	}
	
	public static void addVillageBiomes()
	{
		BiomeManager.addVillageBiome(birchForest, true);
		BiomeManager.addVillageBiome(birchWoods, true);
		BiomeManager.addVillageBiome(forest, true);
		BiomeManager.addVillageBiome(emptyPlains, true);
		BiomeManager.addVillageBiome(lushForest, true);
		BiomeManager.addVillageBiome(lushPlains, true);
		BiomeManager.addVillageBiome(meadows, true);
		BiomeManager.addVillageBiome(miniJungle, true);
		BiomeManager.addVillageBiome(oakWoods, true);
		BiomeManager.addVillageBiome(pineForest, true);
		BiomeManager.addVillageBiome(savannah, true);
		BiomeManager.addVillageBiome(shrublands, true);
		BiomeManager.addVillageBiome(snowyForest, true);
		BiomeManager.addVillageBiome(snowyShrublands, true);
		BiomeManager.addVillageBiome(snowyWoods, true);
		BiomeManager.addVillageBiome(sparseWoods, true);
		BiomeManager.addVillageBiome(thickWoods, true);
	}
	
	public static void addStrongholdBiomes(){
		BiomeManager.addStrongholdBiome(birchForest);
		BiomeManager.addStrongholdBiome(birchJungle);
		BiomeManager.addStrongholdBiome(birchMountains);
		BiomeManager.addStrongholdBiome(birchWoods);
		BiomeManager.addStrongholdBiome(blackMarsh);
		BiomeManager.addStrongholdBiome(dunes);
		BiomeManager.addStrongholdBiome(desertMountains);
		BiomeManager.addStrongholdBiome(forest);
		BiomeManager.addStrongholdBiome(forestMountains);
		BiomeManager.addStrongholdBiome(emptyPlains);
		BiomeManager.addStrongholdBiome(extremeBirchWoods);
		BiomeManager.addStrongholdBiome(extremeDesertHills);
		BiomeManager.addStrongholdBiome(extremeDunes);
		BiomeManager.addStrongholdBiome(extremeForestedHills);
		BiomeManager.addStrongholdBiome(extremeGrassHills);
		BiomeManager.addStrongholdBiome(extremeMeadowHills);
		BiomeManager.addStrongholdBiome(extremeWoods);
		BiomeManager.addStrongholdBiome(extremePineHills);
		BiomeManager.addStrongholdBiome(extremeSnowHills);
		BiomeManager.addStrongholdBiome(extremeSparseWoods);
		BiomeManager.addStrongholdBiome(lushForest);
		BiomeManager.addStrongholdBiome(lushMountains);
		BiomeManager.addStrongholdBiome(lushPlains);
		BiomeManager.addStrongholdBiome(lushSwamp);
		BiomeManager.addStrongholdBiome(massiveHills);
		BiomeManager.addStrongholdBiome(marsh);
		BiomeManager.addStrongholdBiome(meadows);
		BiomeManager.addStrongholdBiome(miniJungle);
		BiomeManager.addStrongholdBiome(oakMountains);
		BiomeManager.addStrongholdBiome(oakWoods);
		BiomeManager.addStrongholdBiome(pineForest);
		BiomeManager.addStrongholdBiome(rainForest);
		BiomeManager.addStrongholdBiome(savannah);
		BiomeManager.addStrongholdBiome(shrublands);
		BiomeManager.addStrongholdBiome(snowyForest);
		BiomeManager.addStrongholdBiome(snowyMountains);
		BiomeManager.addStrongholdBiome(snowyOakMountains);
		BiomeManager.addStrongholdBiome(snowyShrublands);
		BiomeManager.addStrongholdBiome(snowyWoods);
		BiomeManager.addStrongholdBiome(sparseOakMountains);
		BiomeManager.addStrongholdBiome(sparseWoods);
		BiomeManager.addStrongholdBiome(swampyHills);
		BiomeManager.addStrongholdBiome(taigaMountains);
		BiomeManager.addStrongholdBiome(thickOakMountains);
		BiomeManager.addStrongholdBiome(thickSwamp);
		BiomeManager.addStrongholdBiome(thickWoods);
	}
	
	public static void registerBiomes()
	{
		if (BiomeAllow.BIRCH_FOREST)
			GameRegistry.addBiome(birchForest);
		
		if (BiomeAllow.BIRCH_JUNGLE)
			GameRegistry.addBiome(birchJungle);
		
		if (BiomeAllow.BIRCH_MOUNTAINS)
			GameRegistry.addBiome(birchMountains);
			
		if (BiomeAllow.BIRCH_WOODS)
			GameRegistry.addBiome(birchWoods);
			
		if (BiomeAllow.BLACK_MARSH)
			GameRegistry.addBiome(blackMarsh);
		
		if (BiomeAllow.DUNES)
			GameRegistry.addBiome(dunes);
		
		if (BiomeAllow.DESERT_MOUNTAINS)
			GameRegistry.addBiome(desertMountains);
		
		if (BiomeAllow.FOREST)
			GameRegistry.addBiome(forest);
		
		if (BiomeAllow.FOREST_MOUNTAINS)
			GameRegistry.addBiome(forestMountains);
		
		if (BiomeAllow.EMPTY_PLAINS)
			GameRegistry.addBiome(emptyPlains);
		
		if (BiomeAllow.EXTREME_BIRCH_WOODS)
			GameRegistry.addBiome(extremeBirchWoods);
		
		if (BiomeAllow.EXTREME_DESERT_HILLS)
			GameRegistry.addBiome(extremeDesertHills);
		
		if (BiomeAllow.EXTREME_DUNES)
			GameRegistry.addBiome(extremeDunes);
		
		if (BiomeAllow.EXTREME_FORESTED_HILLS)
			GameRegistry.addBiome(extremeForestedHills);
		
		if (BiomeAllow.EXTREME_GRASS_HILLS)
			GameRegistry.addBiome(extremeGrassHills);
		
		if (BiomeAllow.EXTREME_MEADOW_HILLS)
			GameRegistry.addBiome(extremeMeadowHills);
		
		if (BiomeAllow.EXTREME_WOODS)
			GameRegistry.addBiome(extremeWoods);
		
		if (BiomeAllow.EXTREME_PINE_HILLS)
			GameRegistry.addBiome(extremePineHills);
		
		if (BiomeAllow.EXTREME_SNOW_HILLS)
			GameRegistry.addBiome(extremeSnowHills);
		
		if (BiomeAllow.EXTREME_SPARSE_WOODS)
			GameRegistry.addBiome(extremeSparseWoods);
			
		if (BiomeAllow.LUSH_FOREST)
			GameRegistry.addBiome(lushForest);
		
		if (BiomeAllow.LUSH_MOUNTAINS)
			GameRegistry.addBiome(lushMountains);
			
		if (BiomeAllow.LUSH_PLAINS)
			GameRegistry.addBiome(lushPlains);
			
		if (BiomeAllow.LUSH_SWAMP)
			GameRegistry.addBiome(lushSwamp);
			
		if (BiomeAllow.MASSIVE_HILLS)
			GameRegistry.addBiome(massiveHills);
		
		if (BiomeAllow.MARSH)
			GameRegistry.addBiome(marsh);
			
		if (BiomeAllow.MEADOWS)
			GameRegistry.addBiome(meadows);
			
		if (BiomeAllow.MINI_JUNGLE)
			GameRegistry.addBiome(miniJungle);
		
		if (BiomeAllow.OAK_MOUNTAINS)
			GameRegistry.addBiome(oakMountains);
			
		if (BiomeAllow.OAK_WOODS)
			GameRegistry.addBiome(oakWoods);
			
		if (BiomeAllow.PINE_FOREST)
			GameRegistry.addBiome(pineForest);
			
		if (BiomeAllow.RAIN_FOREST)
			GameRegistry.addBiome(rainForest);
			
		if (BiomeAllow.SAVANNAH)
			GameRegistry.addBiome(savannah);
			
		if (BiomeAllow.SHRUBLANDS)
			GameRegistry.addBiome(shrublands);
			
		if (BiomeAllow.SNOWY_FOREST)
			GameRegistry.addBiome(snowyForest);
		
		if (BiomeAllow.SNOWY_MOUNTAINS)
			GameRegistry.addBiome(snowyMountains);
		
		if (BiomeAllow.SNOWY_OAK_MOUNTAINS)
			GameRegistry.addBiome(snowyOakMountains);
			
		if (BiomeAllow.SNOWY_SHRUBLANDS)
			GameRegistry.addBiome(snowyShrublands);
			
		if (BiomeAllow.SNOWY_WOODS)
			GameRegistry.addBiome(snowyWoods);
			
		if (BiomeAllow.SPARSE_OAK_MOUNTAINS)
			GameRegistry.addBiome(sparseOakMountains);
			
		if (BiomeAllow.SPARSE_WOODS)
			GameRegistry.addBiome(sparseWoods);
			
		if (BiomeAllow.SWAMPY_HILLS)
			GameRegistry.addBiome(swampyHills);
		
		if (BiomeAllow.TAIGA_MOUNTAINS)
			GameRegistry.addBiome(taigaMountains);
		
		if (BiomeAllow.THICK_OAK_MOUNTAINS)
			GameRegistry.addBiome(thickOakMountains);
			
		if (BiomeAllow.THICK_SWAMP)
			GameRegistry.addBiome(thickSwamp);
			
		if (BiomeAllow.THICK_WOODS)
			GameRegistry.addBiome(thickWoods);
	}
	
}
