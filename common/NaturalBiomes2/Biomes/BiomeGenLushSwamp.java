package NaturalBiomes2.Biomes;

import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenLushSwamp extends BiomeGenBase
{
	public BiomeGenLushSwamp(int id, int treesChunk)
	{
		super(id);
		this.theBiomeDecorator.treesPerChunk = treesChunk;
		this.theBiomeDecorator.flowersPerChunk = 3;
		this.theBiomeDecorator.deadBushPerChunk = 1;
		this.theBiomeDecorator.mushroomsPerChunk = 8;
		this.theBiomeDecorator.reedsPerChunk = 10;
		this.theBiomeDecorator.clayPerChunk = 1;
		this.theBiomeDecorator.waterlilyPerChunk = 4;
		this.theBiomeDecorator.bigMushroomsPerChunk = 1;
		this.theBiomeDecorator.grassPerChunk = 15;
	}

	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
	{
		return this.worldGeneratorSwamp;
	}
}

