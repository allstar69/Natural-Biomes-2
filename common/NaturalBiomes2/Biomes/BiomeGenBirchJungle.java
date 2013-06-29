package naturalbiomes2.biomes;

import java.util.Random;

import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenBirchJungle extends BiomeGenBase {

	public BiomeGenBirchJungle(int par1) {
		super(par1);
		this.theBiomeDecorator.treesPerChunk = 20;
		this.theBiomeDecorator.grassPerChunk = 7;
		this.theBiomeDecorator.reedsPerChunk = 4;
	}
	
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random){
		if (par1Random.nextInt(5) == 0){
			return new WorldGenShrub(2, 2);
		}else{
			if(par1Random.nextInt(5) == 0){
				return new WorldGenHugeTrees(false, 8 + par1Random.nextInt(15), 2, 2);
			}else{
				return new WorldGenTrees(false, 4 + par1Random.nextInt(3), 2, 2, false);
			}
		}
	}

}
