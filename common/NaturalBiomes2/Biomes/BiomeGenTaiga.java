package NaturalBiomes2.Biomes;

import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenTaiga1;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenTaiga extends BiomeGenBase {

	public BiomeGenTaiga(int id, int treesChunk, int grassChunk) {
		super(id);
		this.theBiomeDecorator.treesPerChunk = treesChunk;
		this.theBiomeDecorator.grassPerChunk = grassChunk;
	}
	
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random){
	    return new WorldGenTaiga1();
	}

}
