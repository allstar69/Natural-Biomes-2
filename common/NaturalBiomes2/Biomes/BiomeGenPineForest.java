package naturalbiomes2.Biomes;

import java.util.Random;

import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTaiga1;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenPineForest extends BiomeGenBase {

	public BiomeGenPineForest(int par1) {
		super(par1);
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 5, 2, 3));
		this.theBiomeDecorator.treesPerChunk = 10;
		this.theBiomeDecorator.flowersPerChunk = 3;
	}
	
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        if (par1Random.nextInt(5) == 0){
        	return new WorldGenTaiga1();
        }else{
        	if (par1Random.nextInt(5) == 0){
        		return new WorldGenShrub(1, 1);
        	}else{
        		return new WorldGenTaiga2(false);
        	}
        }
    }

}
