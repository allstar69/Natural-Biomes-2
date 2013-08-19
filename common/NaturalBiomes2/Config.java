package NaturalBiomes2;

import java.io.File;

import NaturalBiomes2.Lib.BiomeAllow;
import NaturalBiomes2.Lib.BiomeIds;
import NaturalBiomes2.Lib.Strings;

import net.minecraftforge.common.Configuration;

public class Config
{
	public static Configuration config;
	
	public static void initialize(File file)
	{
		config = new Configuration(file);
		
		biomeIds();
		allowBiomes();	
		
		config.save();
	}

	public static void save()
	{
		config.save();
	}
	
	public static void biomeIds()
	{
		BiomeIds.RAIN_FOREST= config.get(Strings.CATEGORY_BIOME, Strings.RAIN_FOREST, BiomeIds.RAIN_FOREST_DEFAULT).getInt(BiomeIds.RAIN_FOREST_DEFAULT);
        BiomeIds.BIRCH_JUNGLE = config.get(Strings.CATEGORY_BIOME, Strings.BIRCH_JUNGLE, BiomeIds.BIRCH_JUNGLE_DEFAULT).getInt(BiomeIds.BIRCH_JUNGLE_DEFAULT);
        BiomeIds.OAK_WOODS = config.get(Strings.CATEGORY_BIOME, Strings.OAK_WOODS, BiomeIds.OAK_WOODS_DEFAULT).getInt(BiomeIds.OAK_WOODS_DEFAULT);
        BiomeIds.THICK_WOODS = config.get(Strings.CATEGORY_BIOME, Strings.THICK_WOODS, BiomeIds.THICK_WOODS_DEFAULT).getInt(BiomeIds.THICK_WOODS_DEFAULT);
        BiomeIds.SPARSE_WOODS = config.get(Strings.CATEGORY_BIOME, Strings.SPARSE_WOODS, BiomeIds.SPARSE_WOODS_DEFAULT).getInt(BiomeIds.SPARSE_WOODS_DEFAULT);
        BiomeIds.SNOWY_WOODS = config.get(Strings.CATEGORY_BIOME, Strings.SNOWY_WOODS, BiomeIds.SNOWY_WOODS_DEFAULT).getInt(BiomeIds.SNOWY_WOODS_DEFAULT);
        BiomeIds.LUSH_PLAINS = config.get(Strings.CATEGORY_BIOME, Strings.LUSH_PLAINS, BiomeIds.LUSH_PLAINS_DEFAULT).getInt(BiomeIds.LUSH_PLAINS_DEFAULT);
        BiomeIds.LUSH_MOUNTAINS = config.get(Strings.CATEGORY_BIOME, Strings.LUSH_MOUNTAINS, BiomeIds.LUSH_MOUNTAINS_DEFAULT).getInt(BiomeIds.LUSH_MOUNTAINS_DEFAULT);
        BiomeIds.PINE_FOREST = config.get(Strings.CATEGORY_BIOME, Strings.PINE_FOREST, BiomeIds.PINE_FOREST_DEFAULT).getInt(BiomeIds.PINE_FOREST_DEFAULT);
        BiomeIds.MEADOWS = config.get(Strings.CATEGORY_BIOME, Strings.MEADOWS, BiomeIds.MEADOWS_DEFAULT).getInt(BiomeIds.MEADOWS_DEFAULT);
        BiomeIds.SHRUBLANDS = config.get(Strings.CATEGORY_BIOME, Strings.SHRUBLANDS, BiomeIds.SHRUBLANDS_DEFAULT).getInt(BiomeIds.SHRUBLANDS_DEFAULT);
        BiomeIds.SNOWY_SHRUBLANDS= config.get(Strings.CATEGORY_BIOME, Strings.SNOWY_SHRUBLANDS, BiomeIds.SNOWY_SHRUBLANDS_DEFAULT).getInt(BiomeIds.SNOWY_SHRUBLANDS_DEFAULT);
        BiomeIds.MARSH = config.get(Strings.CATEGORY_BIOME, Strings.MARSH, BiomeIds.MARSH_DEFAULT).getInt(BiomeIds.MARSH_DEFAULT);
        BiomeIds.SAVANNAH = config.get(Strings.CATEGORY_BIOME, Strings.SAVANNAH, BiomeIds.SAVANNAH_DEFAULT).getInt(BiomeIds.SAVANNAH_DEFAULT);
        BiomeIds.BIRCH_WOODS = config.get(Strings.CATEGORY_BIOME, Strings.BIRCH_WOODS, BiomeIds.BIRCH_WOODS_DEFAULT).getInt(BiomeIds.BIRCH_WOODS_DEFAULT);
        BiomeIds.OAK_MOUNTAINS = config.get(Strings.CATEGORY_BIOME, Strings.OAK_MOUNTAINS, BiomeIds.OAK_MOUNTAINS_DEFAULT).getInt(BiomeIds.OAK_MOUNTAINS_DEFAULT);
        BiomeIds.THICK_OAK_MOUNTAINS = config.get(Strings.CATEGORY_BIOME, Strings.THICK_OAK_MOUNTAINS, BiomeIds.THICK_OAK_MOUNTAINS_DEFAULT).getInt(BiomeIds.THICK_OAK_MOUNTAINS_DEFAULT);
        BiomeIds.SPARSE_OAK_MOUNTAINS = config.get(Strings.CATEGORY_BIOME, Strings.SPARSE_OAK_MOUNTAINS, BiomeIds.SPARSE_OAK_MOUNTAINS_DEFAULT).getInt(BiomeIds.SPARSE_OAK_MOUNTAINS_DEFAULT);
        BiomeIds.SNOWY_OAK_MOUNTAINS = config.get(Strings.CATEGORY_BIOME, Strings.SNOWY_OAK_MOUNTAINS, BiomeIds.SNOWY_OAK_MOUNTAINS_DEFAULT).getInt(BiomeIds.SNOWY_OAK_MOUNTAINS_DEFAULT);
        BiomeIds.BIRCH_MOUNTAINS = config.get(Strings.CATEGORY_BIOME, Strings.BIRCH_MOUNTAINS, BiomeIds.BIRCH_MOUNTAINS_DEFAULT).getInt(BiomeIds.BIRCH_MOUNTAINS_DEFAULT);   
        BiomeIds.DUNES = config.get(Strings.CATEGORY_BIOME, Strings.DUNES, BiomeIds.DUNES_DEFAULT).getInt(BiomeIds.DUNES_DEFAULT);
        BiomeIds.THICK_SWAMP = config.get(Strings.CATEGORY_BIOME, Strings.THICK_SWAMP, BiomeIds.THICK_SWAMP_DEFAULT).getInt(BiomeIds.THICK_SWAMP_DEFAULT);
        BiomeIds.LUSH_FOREST = config.get(Strings.CATEGORY_BIOME, Strings.LUSH_FOREST, BiomeIds.LUSH_FOREST_DEFAULT).getInt(BiomeIds.LUSH_FOREST_DEFAULT);
        BiomeIds.LUSH_SWAMP = config.get(Strings.CATEGORY_BIOME, Strings.LUSH_SWAMP, BiomeIds.LUSH_SWAMP_DEFAULT).getInt(BiomeIds.LUSH_SWAMP_DEFAULT);
        BiomeIds.EXTREME_BIRCH_WOODS = config.get(Strings.CATEGORY_BIOME, Strings.EXTREME_BIRCH_WOODS, BiomeIds.EXTREME_BIRCH_WOODS_DEFAULT).getInt(BiomeIds.EXTREME_BIRCH_WOODS_DEFAULT);
        BiomeIds.EXTREME_DESERT_HILLS = config.get(Strings.CATEGORY_BIOME, Strings.EXTREME_DESERT_HILLS, BiomeIds.EXTREME_DESERT_HILLS_DEFAULT).getInt(BiomeIds.EXTREME_DESERT_HILLS_DEFAULT);
        BiomeIds.EXTREME_DUNES = config.get(Strings.CATEGORY_BIOME, Strings.EXTREME_DUNES, BiomeIds.EXTREME_DUNES_DEFAULT).getInt(BiomeIds.EXTREME_DUNES_DEFAULT);
        BiomeIds.EXTREME_FORESTED_HILLS = config.get(Strings.CATEGORY_BIOME, Strings.EXTREME_FORESTED_HILLS, BiomeIds.EXTREME_FORESTED_HILLS_DEFAULT).getInt(BiomeIds.EXTREME_FORESTED_HILLS_DEFAULT);
        BiomeIds.EXTREME_GRASS_HILLS = config.get(Strings.CATEGORY_BIOME, Strings.EXTREME_GRASS_HILLS, BiomeIds.EXTREME_GRASS_HILLS_DEFAULT).getInt(BiomeIds.EXTREME_GRASS_HILLS_DEFAULT);
        BiomeIds.EXTREME_PINE_HILLS = config.get(Strings.CATEGORY_BIOME, Strings.EXTREME_PINE_HILLS, BiomeIds.EXTREME_PINE_HILLS_DEFAULT).getInt(BiomeIds.EXTREME_PINE_HILLS_DEFAULT);
        BiomeIds.EXTREME_SNOW_HILLS = config.get(Strings.CATEGORY_BIOME, Strings.EXTREME_SNOW_HILLS, BiomeIds.EXTREME_SNOW_HILLS_DEFAULT).getInt(BiomeIds.EXTREME_SNOW_HILLS_DEFAULT);
        BiomeIds.EXTREME_SPARSE_WOODS = config.get(Strings.CATEGORY_BIOME, Strings.EXTREME_SPARSE_WOODS, BiomeIds.EXTREME_SPARSE_WOODS_DEFAULT).getInt(BiomeIds.EXTREME_SPARSE_WOODS_DEFAULT);
        BiomeIds.MASSIVE_HILLS = config.get(Strings.CATEGORY_BIOME, Strings.MASSIVE_HILLS, BiomeIds.MASSIVE_HILLS_DEFAULT).getInt(BiomeIds.MASSIVE_HILLS_DEFAULT);
        BiomeIds.EXTREME_WOODS = config.get(Strings.CATEGORY_BIOME, Strings.EXTREME_WOODS, BiomeIds.EXTREME_WOODS_DEFAULT).getInt(BiomeIds.EXTREME_WOODS_DEFAULT);
        BiomeIds.EXTREME_MEADOW_HILLS = config.get(Strings.CATEGORY_BIOME, Strings.EXTREME_MEADOW_HILLS, BiomeIds.EXTREME_MEADOW_HILLS_DEFAULT).getInt(BiomeIds.EXTREME_MEADOW_HILLS_DEFAULT);
        BiomeIds.FOREST = config.get(Strings.CATEGORY_BIOME, Strings.FOREST, BiomeIds.FOREST_DEFAULT).getInt(BiomeIds.FOREST_DEFAULT);
        BiomeIds.SNOWY_FOREST = config.get(Strings.CATEGORY_BIOME, Strings.SNOWY_FOREST, BiomeIds.SNOWY_FOREST_DEFAULT).getInt(BiomeIds.SNOWY_FOREST_DEFAULT);
        BiomeIds.BIRCH_FOREST = config.get(Strings.CATEGORY_BIOME, Strings.BIRCH_FOREST, BiomeIds.BIRCH_FOREST_DEFAULT).getInt(BiomeIds.BIRCH_FOREST_DEFAULT);
        BiomeIds.BLACK_MARSH = config.get(Strings.CATEGORY_BIOME, Strings.BLACK_MARSH, BiomeIds.BLACK_MARSH_DEFAULT).getInt(BiomeIds.BLACK_MARSH_DEFAULT);
        BiomeIds.DESERT_MOUNTAINS = config.get(Strings.CATEGORY_BIOME, Strings.DESERT_MOUNTAINS, BiomeIds.DESERT_MOUNTAINS_DEFAULT).getInt(BiomeIds.DESERT_MOUNTAINS_DEFAULT);
        BiomeIds.FOREST_MOUNTAINS = config.get(Strings.CATEGORY_BIOME, Strings.FOREST_MOUNTAINS, BiomeIds.FOREST_MOUNTAINS_DEFAULT).getInt(BiomeIds.FOREST_MOUNTAINS_DEFAULT);
        BiomeIds.EMPTY_PLAINS = config.get(Strings.CATEGORY_BIOME, Strings.EMPTY_PLAINS, BiomeIds.EMPTY_PLAINS_DEFAULT).getInt(BiomeIds.EMPTY_PLAINS_DEFAULT);
        BiomeIds.TAIGA_MOUNTAINS = config.get(Strings.CATEGORY_BIOME, Strings.TAIGA_MOUNTAINS, BiomeIds.TAIGA_MOUNTAINS_DEFAULT).getInt(BiomeIds.TAIGA_MOUNTAINS_DEFAULT);
        BiomeIds.SWAMPY_HILLS = config.get(Strings.CATEGORY_BIOME, Strings.SWAMPY_HILLS, BiomeIds.SWAMPY_HILLS_DEFAULT).getInt(BiomeIds.SWAMPY_HILLS_DEFAULT);
        BiomeIds.SNOWY_MOUNTAINS = config.get(Strings.CATEGORY_BIOME, Strings.SNOWY_MOUNTAINS, BiomeIds.SNOWY_MOUNTAINS_DEFAULT).getInt(BiomeIds.SNOWY_MOUNTAINS_DEFAULT);
        BiomeIds.MINI_JUNGLE = config.get(Strings.CATEGORY_BIOME, Strings.MINI_JUNGLE, BiomeIds.MINI_JUNGLE_DEFAULT).getInt(BiomeIds.MINI_JUNGLE_DEFAULT);
        BiomeIds.SPARSE_JUNGLE = config.get(Strings.CATEGORY_BIOME, Strings.SPARSE_JUNGLE, BiomeIds.SPARSE_JUNGLE_DEFAULT).getInt(BiomeIds.SPARSE_JUNGLE_DEFAULT);
	}
	
	public static void allowBiomes(){
		BiomeAllow.RAIN_FOREST = config.get(Strings.CATEGORY_BIOME_ON, Strings.RAIN_FOREST, BiomeAllow.RAIN_FOREST_DEFAULT).getBoolean(BiomeAllow.RAIN_FOREST_DEFAULT);
		BiomeAllow.BIRCH_JUNGLE = config.get(Strings.CATEGORY_BIOME_ON, Strings.BIRCH_JUNGLE, BiomeAllow.BIRCH_JUNGLE_DEFAULT).getBoolean(BiomeAllow.BIRCH_JUNGLE_DEFAULT);
		BiomeAllow.OAK_WOODS = config.get(Strings.CATEGORY_BIOME_ON, Strings.OAK_WOODS, BiomeAllow.OAK_WOODS_DEFAULT).getBoolean(BiomeAllow.OAK_WOODS_DEFAULT);
		BiomeAllow.THICK_WOODS = config.get(Strings.CATEGORY_BIOME_ON, Strings.THICK_WOODS, BiomeAllow.THICK_WOODS_DEFAULT).getBoolean(BiomeAllow.THICK_WOODS_DEFAULT);
		BiomeAllow.SPARSE_WOODS = config.get(Strings.CATEGORY_BIOME_ON, Strings.SPARSE_WOODS, BiomeAllow.SPARSE_WOODS_DEFAULT).getBoolean(BiomeAllow.SPARSE_WOODS_DEFAULT);
		BiomeAllow.SNOWY_WOODS = config.get(Strings.CATEGORY_BIOME_ON, Strings.SNOWY_WOODS, BiomeAllow.SNOWY_WOODS_DEFAULT).getBoolean(BiomeAllow.SNOWY_WOODS_DEFAULT);
		BiomeAllow.LUSH_PLAINS = config.get(Strings.CATEGORY_BIOME_ON, Strings.LUSH_PLAINS, BiomeAllow.LUSH_PLAINS_DEFAULT).getBoolean(BiomeAllow.LUSH_PLAINS_DEFAULT);
		BiomeAllow.LUSH_MOUNTAINS = config.get(Strings.CATEGORY_BIOME_ON, Strings.LUSH_MOUNTAINS, BiomeAllow.LUSH_MOUNTAINS_DEFAULT).getBoolean(BiomeAllow.LUSH_MOUNTAINS_DEFAULT);
		BiomeAllow.PINE_FOREST = config.get(Strings.CATEGORY_BIOME_ON, Strings.PINE_FOREST, BiomeAllow.PINE_FOREST_DEFAULT).getBoolean(BiomeAllow.PINE_FOREST_DEFAULT);
		BiomeAllow.MEADOWS = config.get(Strings.CATEGORY_BIOME_ON, Strings.MEADOWS, BiomeAllow.MEADOWS_DEFAULT).getBoolean(BiomeAllow.MEADOWS_DEFAULT);
		BiomeAllow.SHRUBLANDS = config.get(Strings.CATEGORY_BIOME_ON, Strings.SHRUBLANDS, BiomeAllow.SHRUBLANDS_DEFAULT).getBoolean(BiomeAllow.SHRUBLANDS_DEFAULT);
		BiomeAllow.SNOWY_SHRUBLANDS = config.get(Strings.CATEGORY_BIOME_ON, Strings.SNOWY_SHRUBLANDS, BiomeAllow.SNOWY_SHRUBLANDS_DEFAULT).getBoolean(BiomeAllow.SNOWY_SHRUBLANDS_DEFAULT);
		BiomeAllow.MARSH = config.get(Strings.CATEGORY_BIOME_ON, Strings.MARSH, BiomeAllow.MARSH_DEFAULT).getBoolean(BiomeAllow.MARSH_DEFAULT);
		BiomeAllow.SAVANNAH = config.get(Strings.CATEGORY_BIOME_ON, Strings.SAVANNAH, BiomeAllow.SAVANNAH_DEFAULT).getBoolean(BiomeAllow.SAVANNAH_DEFAULT);
		BiomeAllow.BIRCH_WOODS = config.get(Strings.CATEGORY_BIOME_ON, Strings.BIRCH_WOODS, BiomeAllow.BIRCH_WOODS_DEFAULT).getBoolean(BiomeAllow.BIRCH_WOODS_DEFAULT);
		BiomeAllow.OAK_MOUNTAINS = config.get(Strings.CATEGORY_BIOME_ON, Strings.OAK_MOUNTAINS, BiomeAllow.OAK_MOUNTAINS_DEFAULT).getBoolean(BiomeAllow.OAK_MOUNTAINS_DEFAULT);
		BiomeAllow.THICK_OAK_MOUNTAINS = config.get(Strings.CATEGORY_BIOME_ON, Strings.THICK_OAK_MOUNTAINS, BiomeAllow.THICK_OAK_MOUNTAINS_DEFAULT).getBoolean(BiomeAllow.THICK_OAK_MOUNTAINS_DEFAULT);
		BiomeAllow.SPARSE_OAK_MOUNTAINS = config.get(Strings.CATEGORY_BIOME_ON, Strings.SPARSE_OAK_MOUNTAINS, BiomeAllow.SPARSE_OAK_MOUNTAINS_DEFAULT).getBoolean(BiomeAllow.SPARSE_OAK_MOUNTAINS_DEFAULT);
		BiomeAllow.SNOWY_OAK_MOUNTAINS = config.get(Strings.CATEGORY_BIOME_ON, Strings.SNOWY_OAK_MOUNTAINS, BiomeAllow.SNOWY_OAK_MOUNTAINS_DEFAULT).getBoolean(BiomeAllow.SNOWY_OAK_MOUNTAINS_DEFAULT);
		BiomeAllow.BIRCH_MOUNTAINS_DEFAULT = config.get(Strings.CATEGORY_BIOME_ON, Strings.BIRCH_MOUNTAINS, BiomeAllow.BIRCH_MOUNTAINS_DEFAULT).getBoolean(BiomeAllow.BIRCH_MOUNTAINS_DEFAULT);
		BiomeAllow.DUNES = config.get(Strings.CATEGORY_BIOME_ON, Strings.DUNES, BiomeAllow.DUNES_DEFAULT).getBoolean(BiomeAllow.DUNES_DEFAULT);
		BiomeAllow.THICK_SWAMP = config.get(Strings.CATEGORY_BIOME_ON, Strings.THICK_SWAMP, BiomeAllow.THICK_SWAMP_DEFAULT).getBoolean(BiomeAllow.THICK_SWAMP_DEFAULT);
		BiomeAllow.LUSH_FOREST = config.get(Strings.CATEGORY_BIOME_ON, Strings.LUSH_FOREST, BiomeAllow.LUSH_FOREST_DEFAULT).getBoolean(BiomeAllow.LUSH_FOREST_DEFAULT);
		BiomeAllow.LUSH_SWAMP = config.get(Strings.CATEGORY_BIOME_ON, Strings.LUSH_SWAMP, BiomeAllow.LUSH_SWAMP_DEFAULT).getBoolean(BiomeAllow.LUSH_SWAMP_DEFAULT);
		BiomeAllow.EXTREME_BIRCH_WOODS = config.get(Strings.CATEGORY_BIOME_ON, Strings.EXTREME_BIRCH_WOODS, BiomeAllow.EXTREME_BIRCH_WOODS_DEFAULT).getBoolean(BiomeAllow.EXTREME_BIRCH_WOODS_DEFAULT);
        BiomeAllow.EXTREME_DESERT_HILLS = config.get(Strings.CATEGORY_BIOME_ON, Strings.EXTREME_DESERT_HILLS, BiomeAllow.EXTREME_DESERT_HILLS_DEFAULT).getBoolean(BiomeAllow.EXTREME_DESERT_HILLS_DEFAULT);
        BiomeAllow.EXTREME_DUNES = config.get(Strings.CATEGORY_BIOME_ON, Strings.EXTREME_DUNES, BiomeAllow.EXTREME_DUNES_DEFAULT).getBoolean(BiomeAllow.EXTREME_DUNES_DEFAULT);
        BiomeAllow.EXTREME_FORESTED_HILLS = config.get(Strings.CATEGORY_BIOME_ON, Strings.EXTREME_FORESTED_HILLS, BiomeAllow.EXTREME_FORESTED_HILLS_DEFAULT).getBoolean(BiomeAllow.EXTREME_FORESTED_HILLS_DEFAULT);
        BiomeAllow.EXTREME_GRASS_HILLS = config.get(Strings.CATEGORY_BIOME_ON, Strings.EXTREME_GRASS_HILLS, BiomeAllow.EXTREME_GRASS_HILLS_DEFAULT).getBoolean(BiomeAllow.EXTREME_GRASS_HILLS_DEFAULT);
        BiomeAllow.EXTREME_PINE_HILLS = config.get(Strings.CATEGORY_BIOME_ON, Strings.EXTREME_PINE_HILLS, BiomeAllow.EXTREME_PINE_HILLS_DEFAULT).getBoolean(BiomeAllow.EXTREME_PINE_HILLS_DEFAULT);
        BiomeAllow.EXTREME_SNOW_HILLS = config.get(Strings.CATEGORY_BIOME_ON, Strings.EXTREME_SNOW_HILLS, BiomeAllow.EXTREME_SNOW_HILLS_DEFAULT).getBoolean(BiomeAllow.EXTREME_SNOW_HILLS_DEFAULT);
        BiomeAllow.EXTREME_SPARSE_WOODS = config.get(Strings.CATEGORY_BIOME_ON, Strings.EXTREME_SPARSE_WOODS, BiomeAllow.EXTREME_SPARSE_WOODS_DEFAULT).getBoolean(BiomeAllow.EXTREME_SPARSE_WOODS_DEFAULT);
        BiomeAllow.EXTREME_MEADOW_HILLS = config.get(Strings.CATEGORY_BIOME_ON, Strings.EXTREME_MEADOW_HILLS, BiomeAllow.EXTREME_MEADOW_HILLS_DEFAULT).getBoolean(BiomeAllow.EXTREME_MEADOW_HILLS_DEFAULT);
        BiomeAllow.MASSIVE_HILLS = config.get(Strings.CATEGORY_BIOME_ON, Strings.MASSIVE_HILLS, BiomeAllow.MASSIVE_HILLS_DEFAULT).getBoolean(BiomeAllow.MASSIVE_HILLS_DEFAULT);
        BiomeAllow.EXTREME_WOODS = config.get(Strings.CATEGORY_BIOME_ON, Strings.EXTREME_WOODS, BiomeAllow.EXTREME_WOODS_DEFAULT).getBoolean(BiomeAllow.EXTREME_WOODS_DEFAULT);
        BiomeAllow.FOREST = config.get(Strings.CATEGORY_BIOME_ON, Strings.FOREST, BiomeAllow.FOREST_DEFAULT).getBoolean(BiomeAllow.FOREST_DEFAULT);
        BiomeAllow.SNOWY_FOREST = config.get(Strings.CATEGORY_BIOME_ON, Strings.SNOWY_FOREST, BiomeAllow.SNOWY_FOREST_DEFAULT).getBoolean(BiomeAllow.SNOWY_FOREST_DEFAULT);
        BiomeAllow.BIRCH_FOREST = config.get(Strings.CATEGORY_BIOME_ON, Strings.BIRCH_FOREST, BiomeAllow.BIRCH_FOREST_DEFAULT).getBoolean(BiomeAllow.BIRCH_FOREST_DEFAULT);
        BiomeAllow.BLACK_MARSH = config.get(Strings.CATEGORY_BIOME_ON, Strings.BLACK_MARSH, BiomeAllow.BLACK_MARSH_DEFAULT).getBoolean(BiomeAllow.BLACK_MARSH_DEFAULT);
        BiomeAllow.DESERT_MOUNTAINS = config.get(Strings.CATEGORY_BIOME_ON, Strings.DESERT_MOUNTAINS, BiomeAllow.DESERT_MOUNTAINS_DEFAULT).getBoolean(BiomeAllow.DESERT_MOUNTAINS_DEFAULT);
        BiomeAllow.FOREST_MOUNTAINS = config.get(Strings.CATEGORY_BIOME_ON, Strings.FOREST_MOUNTAINS, BiomeAllow.FOREST_MOUNTAINS_DEFAULT).getBoolean(BiomeAllow.FOREST_MOUNTAINS_DEFAULT);
        BiomeAllow.EMPTY_PLAINS = config.get(Strings.CATEGORY_BIOME_ON, Strings.EMPTY_PLAINS, BiomeAllow.EMPTY_PLAINS_DEFAULT).getBoolean(BiomeAllow.EMPTY_PLAINS_DEFAULT);
        BiomeAllow.TAIGA_MOUNTAINS = config.get(Strings.CATEGORY_BIOME_ON, Strings.TAIGA_MOUNTAINS, BiomeAllow.TAIGA_MOUNTAINS_DEFAULT).getBoolean(BiomeAllow.TAIGA_MOUNTAINS_DEFAULT);
        BiomeAllow.SWAMPY_HILLS = config.get(Strings.CATEGORY_BIOME_ON, Strings.SWAMPY_HILLS, BiomeAllow.SWAMPY_HILLS_DEFAULT).getBoolean(BiomeAllow.SWAMPY_HILLS_DEFAULT);
        BiomeAllow.SNOWY_MOUNTAINS = config.get(Strings.CATEGORY_BIOME_ON, Strings.SNOWY_MOUNTAINS, BiomeAllow.SNOWY_MOUNTAINS_DEFAULT).getBoolean(BiomeAllow.SNOWY_MOUNTAINS_DEFAULT);
        BiomeAllow.MINI_JUNGLE = config.get(Strings.CATEGORY_BIOME_ON, Strings.MINI_JUNGLE, BiomeAllow.MINI_JUNGLE_DEFAULT).getBoolean(BiomeAllow.MINI_JUNGLE_DEFAULT);
        BiomeAllow.SPARSE_JUNGLE = config.get(Strings.CATEGORY_BIOME_ON, Strings.SPARSE_JUNGLE, BiomeAllow.SPARSE_JUNGLE_DEFAULT).getBoolean(BiomeAllow.SPARSE_JUNGLE_DEFAULT);
	}
}
