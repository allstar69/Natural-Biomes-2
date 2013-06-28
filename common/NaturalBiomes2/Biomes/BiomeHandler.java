package NaturalBiomes2.Biomes;

import NaturalBiomes2.Lib.BiomeAllow;
import NaturalBiomes2.Lib.BiomeIds;
import NaturalBiomes2.Lib.VillageAllow;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

public class BiomeHandler {

    public static BiomeGenBase rainForest;
    public static BiomeGenBase birchJungle;
    public static BiomeGenBase oakWoods;
    public static BiomeGenBase thickWoods;
    public static BiomeGenBase sparseWoods;
    public static BiomeGenBase snowyWoods;
    public static BiomeGenBase lushPlains;
    public static BiomeGenBase lushMountains;
    public static BiomeGenBase pineForest;
    public static BiomeGenBase meadows;
    public static BiomeGenBase shrublands;
    public static BiomeGenBase snowyShrublands;
    public static BiomeGenBase marsh;
    public static BiomeGenBase savannah;
    public static BiomeGenBase birchWoods;
    public static BiomeGenBase oakMountains;
    public static BiomeGenBase thickOakMountains;
    public static BiomeGenBase sparseOakMountains;
    public static BiomeGenBase snowyOakMountains;
    public static BiomeGenBase birchMountains;
    public static BiomeGenBase dunes;
    public static BiomeGenBase thickSwamp;
    
    //new biomes
    public static BiomeGenBase lushForest;
    public static BiomeGenBase lushSwamp;
    
    public static BiomeGenBase snowyForest;
    public static BiomeGenBase birchForest;
    public static BiomeGenBase blackMarsh;
    public static BiomeGenBase desertMountains;
    public static BiomeGenBase forestMountains;
    public static BiomeGenBase plains; //no tall grass (uses extreme hill stuff)
    public static BiomeGenBase taigaMountains;
    public static BiomeGenBase swampyHills; //same as mountains; spawn lakes as some trees
    public static BiomeGenBase snowyMountains; //uses ice plains
	
	public static void init()
	{
        initBiomes();
        
        addToBiomeDictionary();

        addSpawnBiomes();
        
        addStructureBiomes();

        registerBiomes();
	}
	
	public static void initBiomes()
	{
		rainForest = new BiomeGenRainForest(BiomeIds.RAIN_FOREST).setColor(5470985).setBiomeName("Rainforest").setTemperatureRainfall(1.2F, 0.9F).setMinMaxHeight(0.4F, 0.8f);
        birchJungle = new BiomeGenBirchJungle(BiomeIds.BIRCH_JUNGLE).setColor(353825).setBiomeName("Birch Jungle").setTemperatureRainfall(0.4F, 0.9F).setMinMaxHeight(0.4F, 0.7F);
        oakWoods = new BiomeGenWoods(BiomeIds.OAK_WOODS, 3, 3).setColor(353825).setBiomeName("Oak Woods").setTemperatureRainfall(0.6F, 0.4F).setMinMaxHeight(0.2F, 0.3F);
        thickWoods = new BiomeGenWoods(BiomeIds.THICK_WOODS, 12, 5).setColor(353825).setBiomeName("Thick Woods").setTemperatureRainfall(0.8F, 0.9F).setMinMaxHeight(0.1F, 0.3F);
        sparseWoods = new BiomeGenWoods(BiomeIds.SPARSE_WOODS, 1, 3).setColor(353825).setBiomeName("Sparse Woods").setTemperatureRainfall(1.5F, 0.15F).setMinMaxHeight(0.1F, 0.3F);
        snowyWoods = new BiomeGenWoods(BiomeIds.SNOWY_WOODS, 3, 3).setColor(747097).setBiomeName("Snowy Woods").setTemperatureRainfall(0.05F, 0.6F).setEnableSnow().setMinMaxHeight(0.1F, 0.3F);
        lushPlains = new BiomeGenGrass(BiomeIds.LUSH_PLAINS).setColor(9286496).setBiomeName("Lush Plains").setTemperatureRainfall(1.2F, 1.0F).setMinMaxHeight(0.1F, 0.2F);
        lushMountains = new BiomeGenGrass(BiomeIds.LUSH_MOUNTAINS).setColor(9286496).setBiomeName("Lush Mountains").setTemperatureRainfall(1.2F, 1.0F).setMinMaxHeight(0.5F, 0.9F);
        pineForest = new BiomeGenPineForest(BiomeIds.PINE_FOREST).setColor(747097).setBiomeName("Pine Forest").setTemperatureRainfall(0.3F, 0.6F).setMinMaxHeight(0.1F, 0.3F);
        meadows = new BiomeGenMeadows(BiomeIds.MEADOWS, 100).setColor(9286496).setBiomeName("Meadows").setTemperatureRainfall(1.2F, 1.0F).setMinMaxHeight(0.1F, 0.2F);
        shrublands = new BiomeGenShrublands(BiomeIds.SHRUBLANDS).setColor(353825).setBiomeName("Shrublands").setTemperatureRainfall(1.5F, 0.15F).setMinMaxHeight(0.1F, 0.5F);       
        snowyShrublands = new BiomeGenShrublands(BiomeIds.SNOWY_SHRUBLANDS).setColor(9286496).setBiomeName("Snowy Shrublands").setTemperatureRainfall(0.05F, 0.6F).setEnableSnow().setMinMaxHeight(0.1F, 0.5F);             
        marsh = new BiomeGenMarsh(BiomeIds.MARSH).setColor(353825).setBiomeName("Marsh").setTemperatureRainfall(0.7F, 0.8F).setMinMaxHeight(0.1F, 0.2F);
        savannah = new BiomeGenGrass(BiomeIds.SAVANNAH).setColor(353825).setBiomeName("Savannah").setTemperatureRainfall(1.9F, 0.15F).setDisableRain().setMinMaxHeight(0.1F, 0.2F);
        birchWoods = new BiomeGenBirchWoods(BiomeIds.BIRCH_WOODS, 3, 3).setColor(353825).setBiomeName("Birch Woods").setTemperatureRainfall(0.4F, 0.9F).setMinMaxHeight(0.2F, 0.3F);
        oakMountains = new BiomeGenWoods(BiomeIds.OAK_MOUNTAINS, 3, 3).setColor(353825).setBiomeName("Oak Mountains").setTemperatureRainfall(0.6F, 0.4F).setMinMaxHeight(0.5F, 0.9F);
        thickOakMountains = new BiomeGenWoods(BiomeIds.THICK_OAK_MOUNTAINS, 12, 3).setColor(353825).setBiomeName("Thick Oak Mountains").setTemperatureRainfall(0.6F, 0.4F).setMinMaxHeight(0.5F, 0.9F);
        sparseOakMountains = new BiomeGenWoods(BiomeIds.SPARSE_OAK_MOUNTAINS, 1, 3).setColor(353825).setBiomeName("Sparse Oak Mountains").setTemperatureRainfall(1.5F, 0.15F).setMinMaxHeight(0.5F, 0.9F);
        snowyOakMountains = new BiomeGenWoods(BiomeIds.SNOWY_OAK_MOUNTAINS, 3, 3).setColor(747097).setBiomeName("Snowy Oak Mountains").setTemperatureRainfall(0.05F, 0.6F).setMinMaxHeight(0.5F, 0.9F);
        birchMountains = new BiomeGenBirchWoods(BiomeIds.BIRCH_MOUNTAINS, 3, 3).setColor(353825).setBiomeName("Birch Mountains").setTemperatureRainfall(0.4F, 0.9F).setMinMaxHeight(0.5F, 0.9F);
        dunes = new BiomeGenDunes(BiomeIds.DUNES).setColor(16421912).setBiomeName("Dunes").setDisableRain().setTemperatureRainfall(2.0F, 0.0F).setMinMaxHeight(0.5F, 0.9F);	
        thickSwamp = new BiomeGenThickSwamp(BiomeIds.THICK_SWAMP).setColor(522674).setBiomeName("Thick Swampland").func_76733_a(9154376).setMinMaxHeight(-0.2F, 0.1F).setTemperatureRainfall(0.8F, 0.9F);    
        
        lushForest = new BiomeGenLushForest(BiomeIds.LUSH_FOREST).setColor(9286496).setBiomeName("Lush Forest").setTemperatureRainfall(1.2F, 1.0F).setMinMaxHeight(0.2F, 0.3F);
        lushSwamp = new BiomeGenLushSwamp(BiomeIds.LUSH_SWAMP).setColor(9286496).setBiomeName("Lush Swamps").setTemperatureRainfall(1.2F, 1.0F).setMinMaxHeight(-0.2F, 0.1F);
	}
	
	public static void addToBiomeDictionary()
	{
	}
	
	public static void addSpawnBiomes()
	{
		BiomeManager.addSpawnBiome(rainForest);
		BiomeManager.addSpawnBiome(birchJungle);
		BiomeManager.addSpawnBiome(oakWoods);
		BiomeManager.addSpawnBiome(thickWoods);
		BiomeManager.addSpawnBiome(snowyWoods);
		BiomeManager.addSpawnBiome(lushPlains);
		BiomeManager.addSpawnBiome(lushMountains);
		BiomeManager.addSpawnBiome(pineForest);
		BiomeManager.addSpawnBiome(meadows);
		BiomeManager.addSpawnBiome(shrublands);
		BiomeManager.addSpawnBiome(snowyShrublands);
		BiomeManager.addSpawnBiome(marsh);
		BiomeManager.addSpawnBiome(savannah);
		BiomeManager.addSpawnBiome(birchWoods);
		BiomeManager.addSpawnBiome(oakMountains);
		BiomeManager.addSpawnBiome(thickOakMountains);
		BiomeManager.addSpawnBiome(snowyOakMountains);
		BiomeManager.addSpawnBiome(birchMountains);
		BiomeManager.addSpawnBiome(dunes);
		BiomeManager.addSpawnBiome(thickSwamp);
		
		BiomeManager.addSpawnBiome(lushForest);
		BiomeManager.addSpawnBiome(lushSwamp);
	}
	
	public static void addStructureBiomes()
	{
        BiomeManager.addStrongholdBiome(rainForest);
        BiomeManager.addVillageBiome(rainForest, VillageAllow.RAIN_FOREST);
        
        BiomeManager.addStrongholdBiome(birchJungle);
        BiomeManager.addVillageBiome(birchJungle, VillageAllow.BIRCH_JUNGLE);
        
        BiomeManager.addStrongholdBiome(oakWoods);
        BiomeManager.addVillageBiome(oakWoods, VillageAllow.OAK_WOODS);
        
        BiomeManager.addStrongholdBiome(thickWoods);
        BiomeManager.addVillageBiome(thickWoods, VillageAllow.THICK_WOODS);
        
        BiomeManager.addStrongholdBiome(sparseWoods);
        BiomeManager.addVillageBiome(sparseWoods, VillageAllow.SPARSE_WOODS);
        
        BiomeManager.addStrongholdBiome(snowyWoods);
        BiomeManager.addVillageBiome(snowyWoods, VillageAllow.SNOWY_WOODS);
        
        BiomeManager.addStrongholdBiome(lushPlains);
        BiomeManager.addVillageBiome(lushPlains, VillageAllow.LUSH_PLAINS);
        
        BiomeManager.addStrongholdBiome(lushMountains);
        BiomeManager.addVillageBiome(lushMountains, VillageAllow.LUSH_MOUNTAINS); 
        
        BiomeManager.addStrongholdBiome(pineForest);
        BiomeManager.addVillageBiome(pineForest, VillageAllow.PINE_FOREST); 
        
        BiomeManager.addStrongholdBiome(meadows);
        BiomeManager.addVillageBiome(meadows, VillageAllow.MEADOWS); 
        
        BiomeManager.addStrongholdBiome(shrublands);
        BiomeManager.addVillageBiome(shrublands, VillageAllow.SHRUBLANDS); 
        
        BiomeManager.addStrongholdBiome(snowyShrublands);
        BiomeManager.addVillageBiome(snowyShrublands, VillageAllow.SNOWY_SHRUBLANDS); 
        
        BiomeManager.addStrongholdBiome(marsh);
        BiomeManager.addVillageBiome(marsh, VillageAllow.MARSH); 
        
        BiomeManager.addStrongholdBiome(savannah);
        BiomeManager.addVillageBiome(savannah, VillageAllow.SAVANNAH);
        
        BiomeManager.addStrongholdBiome(birchWoods);
        BiomeManager.addVillageBiome(birchWoods, VillageAllow.BIRCH_WOODS);
        
        BiomeManager.addStrongholdBiome(oakMountains);
        BiomeManager.addVillageBiome(oakMountains, VillageAllow.OAK_MOUNTAINS);
        
        BiomeManager.addStrongholdBiome(thickOakMountains);
        BiomeManager.addVillageBiome(thickOakMountains, VillageAllow.THICK_OAK_MOUNTAINS);
        
        BiomeManager.addStrongholdBiome(sparseOakMountains);
        BiomeManager.addVillageBiome(sparseOakMountains, VillageAllow.SPARSE_OAK_MOUNTAINS);
        
        BiomeManager.addStrongholdBiome(snowyOakMountains);
        BiomeManager.addVillageBiome(snowyOakMountains, VillageAllow.SNOWY_OAK_MOUNTAINS);
        
        BiomeManager.addStrongholdBiome(birchMountains);
        BiomeManager.addVillageBiome(birchMountains, VillageAllow.BIRCH_MOUNTAINS);
        
        BiomeManager.addStrongholdBiome(dunes);
        BiomeManager.addVillageBiome(dunes, VillageAllow.DUNES);
        
        BiomeManager.addStrongholdBiome(thickSwamp);
        BiomeManager.addVillageBiome(thickSwamp, VillageAllow.THICK_SWAMP);
        
        BiomeManager.addStrongholdBiome(lushForest);
        BiomeManager.addVillageBiome(lushForest, VillageAllow.LUSH_FOREST);
        
        BiomeManager.addStrongholdBiome(lushSwamp);
        BiomeManager.addVillageBiome(lushSwamp, VillageAllow.LUSH_SWAMP);
	}
	
	public static void registerBiomes()
	{
        if (BiomeAllow.RAIN_FOREST == true)
        	GameRegistry.addBiome(rainForest);
        
        if (BiomeAllow.BIRCH_JUNGLE == true)
        	GameRegistry.addBiome(birchJungle);
        
        if (BiomeAllow.OAK_WOODS == true)
        	GameRegistry.addBiome(oakWoods);
        
        if (BiomeAllow.THICK_WOODS == true)
        	GameRegistry.addBiome(thickWoods);
        
        if (BiomeAllow.SPARSE_WOODS == true)
        	GameRegistry.addBiome(sparseWoods);
        
        if (BiomeAllow.SNOWY_WOODS == true)
        	GameRegistry.addBiome(snowyWoods);
        
        if (BiomeAllow.LUSH_PLAINS == true)
        	GameRegistry.addBiome(lushPlains);
        
        if (BiomeAllow.LUSH_MOUNTAINS == true)
        	GameRegistry.addBiome(lushMountains);
        
        if (BiomeAllow.PINE_FOREST == true)
        	GameRegistry.addBiome(pineForest);
        
        if (BiomeAllow.MEADOWS == true)
        	GameRegistry.addBiome(meadows);
        
        if (BiomeAllow.SHRUBLANDS == true)
        	GameRegistry.addBiome(shrublands);
        
        if (BiomeAllow.MARSH== true)
        	GameRegistry.addBiome(marsh);
        
        if (BiomeAllow.SAVANNAH == true)
        	GameRegistry.addBiome(savannah);
        
        if (BiomeAllow.BIRCH_WOODS == true)
        	GameRegistry.addBiome(birchWoods);
        
        if (BiomeAllow.OAK_MOUNTAINS == true)
        	GameRegistry.addBiome(oakMountains);
        
        if (BiomeAllow.THICK_OAK_MOUNTAINS == true)
        	GameRegistry.addBiome(thickOakMountains);

        if (BiomeAllow.SPARSE_OAK_MOUNTAINS == true)
        	GameRegistry.addBiome(sparseOakMountains);
        
        if (BiomeAllow.SNOWY_OAK_MOUNTAINS == true)
        	GameRegistry.addBiome(snowyOakMountains);
        
        if (BiomeAllow.BIRCH_MOUNTAINS == true)
        	GameRegistry.addBiome(birchMountains);
        
        if (BiomeAllow.DUNES == true)
        	GameRegistry.addBiome(dunes);
        
        if (BiomeAllow.THICK_SWAMP == true)
        	GameRegistry.addBiome(thickSwamp);
        
        if (BiomeAllow.LUSH_FOREST == true)
        	GameRegistry.addBiome(lushForest);
        
        if (BiomeAllow.LUSH_SWAMP == true)
        	GameRegistry.addBiome(lushSwamp);
	}
	
}
