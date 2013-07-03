package NaturalBiomes2.Biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenMeadows extends BiomeGenBase {

	public BiomeGenMeadows(int par1) {
		super(par1);
		this.theBiomeDecorator.treesPerChunk = 1;
		this.theBiomeDecorator.flowersPerChunk = 25;
		this.theBiomeDecorator.grassPerChunk = 100;
		this.spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, 5, 4, 4));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityHorse.class, 5, 2, 6));
	}
	
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return new WorldGenShrub(0, 0);
    }

    public WorldGenerator getRandomWorldGenForGrass(Random par1Random)
    {
        if (par1Random.nextInt(7) == 0){
        	return new WorldGenTallGrass(Block.tallGrass.blockID, 2);
        }else{
        	return new WorldGenTallGrass(Block.tallGrass.blockID, 1);
        }
    	
    }

}
