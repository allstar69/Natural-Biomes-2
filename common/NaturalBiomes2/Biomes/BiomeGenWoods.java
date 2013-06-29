package NaturalBiomes2.Biomes;

import java.util.Random;

import NaturalBiomes2.WorldGenCustomBigTree;


import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenWoods extends BiomeGenBase {

	public BiomeGenWoods(int par1, int treesChunk, int grassChunk) {
		super(par1);
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 5, 1, 2));
		this.theBiomeDecorator.treesPerChunk = treesChunk;
		this.theBiomeDecorator.grassPerChunk = grassChunk;
		this.theBiomeDecorator.flowersPerChunk = 1;
		this.theBiomeDecorator.reedsPerChunk = 3;
	}
	
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
		if (par1Random.nextInt(10) == 0){
	        return new WorldGenTrees(false, 7 + par1Random.nextInt(2), 0, 0, false);
	    }else{
	        return new WorldGenBigTree(false);
	    }
    }

}
