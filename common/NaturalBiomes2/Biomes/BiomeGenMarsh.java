package naturalbiomes2.Biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenMarsh extends BiomeGenBase {

	public BiomeGenMarsh(int par1) {
		super(par1);
		this.theBiomeDecorator.treesPerChunk = 6;
	}
	
    public WorldGenerator getRandomWorldGenForTrees(Random rand)
    {
        return rand.nextInt(1) == 0 ? new WorldGenLakes(9) : new WorldGenLakes(9);
    }

}
