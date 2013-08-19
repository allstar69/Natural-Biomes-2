package NaturalBiomes2.Biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenBirchJungle extends BiomeGenBase {

	public BiomeGenBirchJungle(int id) {
		super(id);
		this.theBiomeDecorator.treesPerChunk = 20;
		this.theBiomeDecorator.grassPerChunk = 7;
		this.theBiomeDecorator.reedsPerChunk = 4;
	}

	public WorldGenerator getRandomWorldGenForTrees(Random random){
		if (random.nextInt(5) == 0){
			return new WorldGenShrub(2, 2);
		}else{
			if(random.nextInt(5) == 0){
				return new WorldGenHugeTrees(false, 8 + random.nextInt(15), 2, 2);
			}else{
				return new WorldGenTrees(false, 4 + random.nextInt(3), 2, 2, false);
			}
		}
	}

	public WorldGenerator getRandomWorldGenForGrass(Random random)
	{
		return random.nextInt(4) == 0 ? new WorldGenTallGrass(Block.tallGrass.blockID, 2) : new WorldGenTallGrass(Block.tallGrass.blockID, 1);
	}

	public void decorate(World world, Random random, int par3, int par4)
	{
		super.decorate(world, random, par3, par4);
		WorldGenVines worldgenvines = new WorldGenVines();

		for (int k = 0; k < 50; ++k)
		{
			int l = par3 + random.nextInt(16) + 8;
			byte b0 = 64;
			int i1 = par4 + random.nextInt(16) + 8;

			worldgenvines.generate(world, random, l, b0, i1);
		}
	}

}
