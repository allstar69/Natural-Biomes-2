package NaturalBiomes2.Biomes;

import java.util.Random;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenMiniJungle extends BiomeGenBase {

	public BiomeGenMiniJungle(int id) {
		super(id);
        this.theBiomeDecorator.treesPerChunk = 50;
        this.theBiomeDecorator.grassPerChunk = 25;
        this.theBiomeDecorator.flowersPerChunk = 4;
        this.spawnableMonsterList.add(new SpawnListEntry(EntityOcelot.class, 2, 1, 1));
        this.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 10, 4, 4));
	}
	
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random){
		if (par1Random.nextInt(5) == 0){
			return new WorldGenShrub(2, 2);
		}else{
			return new WorldGenHugeTrees(false, 14 + par1Random.nextInt(4), 3, 3);
		}
	}
}
