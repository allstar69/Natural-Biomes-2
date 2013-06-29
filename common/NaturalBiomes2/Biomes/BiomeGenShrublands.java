package naturalbiomes2.biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTaiga1;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenShrublands extends BiomeGenBase {

	public BiomeGenShrublands(int par1) {
		super(par1);
		this.theBiomeDecorator.treesPerChunk = 2;
		this.theBiomeDecorator.grassPerChunk = 5;
	}

	public WorldGenerator getRandomWorldGenForTrees(Random par1Random){
	    return new WorldGenShrub(0, 0);
	}
	
	public WorldGenerator getRandomWorldGenForGrass(Random par1Random){
		if (par1Random.nextInt(2) == 0){
			return new WorldGenTallGrass(Block.tallGrass.blockID, 1);
		}else{
			return new WorldGenTallGrass(Block.tallGrass.blockID, 2);
		}
	}
	
}
