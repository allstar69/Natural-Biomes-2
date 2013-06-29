package NaturalBiomes2.Biomes;

import java.util.Random;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenGrass extends BiomeGenBase {

	public BiomeGenGrass(int par1) {
		super(par1);
		this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, 5, 2, 3));
		this.theBiomeDecorator.grassPerChunk = 100;
	}
	
	public WorldGenerator getRandomGenForTrees(Random par1Random){
		if (par1Random.nextInt(5) == 0){
			return new WorldGenShrub(0, 0);
		}else{
			return new WorldGenTrees(false);
		}
	}

}
