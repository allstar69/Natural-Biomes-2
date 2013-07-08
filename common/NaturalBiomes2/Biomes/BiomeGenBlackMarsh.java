package NaturalBiomes2.Biomes;

import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenBlackMarsh extends BiomeGenBase {

	public BiomeGenBlackMarsh(int id) {
		super(id);
		this.theBiomeDecorator.treesPerChunk = 6;
	}
	
    public WorldGenerator getRandomWorldGenForTrees(Random rand)
    {
        return rand.nextInt(1) == 0 ? new WorldGenLakes(9) : new WorldGenLakes(9);
    }
}
