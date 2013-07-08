package NaturalBiomes2.Biomes;

import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenBirchForest extends BiomeGenBase {

	public BiomeGenBirchForest(int id) {
		super(id);
		theBiomeDecorator.grassPerChunk = 5;
		theBiomeDecorator.reedsPerChunk = 10;
		theBiomeDecorator.treesPerChunk = 10;
	}
	
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        if (par1Random.nextInt(5) == 0){
        	return new WorldGenShrub(2, 2);
        }else{
        	return new WorldGenTrees(false, 7 + par1Random.nextInt(2), 2, 2, false);
        }
    }

}
