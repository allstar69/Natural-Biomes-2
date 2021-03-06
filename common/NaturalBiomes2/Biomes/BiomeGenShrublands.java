package NaturalBiomes2.Biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTaiga1;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenShrublands extends BiomeGenBase {

	public BiomeGenShrublands(int id) {
		super(id);
		this.theBiomeDecorator.grassPerChunk = 5;
		this.spawnableCreatureList.add(new SpawnListEntry(EntityHorse.class, 5, 2, 6));
	}

	public WorldGenerator getRandomWorldGenForTrees(Random par1Random){
	    return new WorldGenShrub(0, 0);
	}
	
}
