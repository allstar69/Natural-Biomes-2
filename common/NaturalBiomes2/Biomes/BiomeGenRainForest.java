package naturalbiomes2.Biomes;

import java.util.Random;

import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenRainForest extends BiomeGenBase {

	public BiomeGenRainForest(int par1) {
		super(par1);
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 5, 2, 3));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityOcelot.class, 5, 1, 2));
		this.spawnableMonsterList.add(new SpawnListEntry(EntityCaveSpider.class, 5, 1, 2));
		this.theBiomeDecorator.treesPerChunk = 20;
		this.theBiomeDecorator.grassPerChunk = 7;
		this.theBiomeDecorator.bigMushroomsPerChunk = 1;
		this.theBiomeDecorator.waterlilyPerChunk = 4;
		this.theBiomeDecorator.reedsPerChunk = 2;
		this.theBiomeDecorator.mushroomsPerChunk = 3;
		this.theBiomeDecorator.flowersPerChunk = 3;
	}

    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        if (par1Random.nextInt(5) == 0){
        	return this.worldGeneratorBigTree;
        }else{
        	if (par1Random.nextInt(5) == 0){
        		return new WorldGenShrub(0, 0);
        	}else{
        		if (par1Random.nextInt(5) == 0){
        			if(par1Random.nextInt(5) == 0){
        				return new WorldGenHugeTrees(false, 10 + par1Random.nextInt(8), 2, 2);
        			}else{
        				return new WorldGenHugeTrees(false, 10 + par1Random.nextInt(8), 0, 0);
        			}
                }else{
        			if(par1Random.nextInt(5) == 0){
        				return new WorldGenTrees(false, 5 + par1Random.nextInt(7), 2, 2, false);
        			}else{
        				return new WorldGenTrees(false, 5 + par1Random.nextInt(7), 0, 0, false);
        			}
                }
        	}
        }
    }
	
}
