package NaturalBiomes2.Biomes;

import java.util.Random;

import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenPlain extends BiomeGenBase { 
	
	public BiomeGenPlain(int id) {
		super(id);
		this.spawnableCreatureList.add(new SpawnListEntry(EntityHorse.class, 5, 2, 6));
	}
	
	public BiomeGenPlain(int id, int grassChunk) {
		super(id);
		this.spawnableCreatureList.add(new SpawnListEntry(EntityHorse.class, 5, 2, 6));
		this.theBiomeDecorator.grassPerChunk = grassChunk;
		this.theBiomeDecorator.flowersPerChunk = 5;
	}
	
	public WorldGenerator getRandomGenForTrees(Random par1Random){
		if (par1Random.nextInt(5) == 0){
			return new WorldGenShrub(0, 0);
		}else{
			return new WorldGenTrees(false);
		}
	}

}
