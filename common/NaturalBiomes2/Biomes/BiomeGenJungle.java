package NaturalBiomes2.Biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenHugeTrees;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenJungle extends BiomeGenBase {

	public BiomeGenJungle(int id, int treesChunk, int grassChunk, int flowersChunk)
	{
		super(id);
		this.theBiomeDecorator.treesPerChunk = treesChunk;
		this.theBiomeDecorator.grassPerChunk = grassChunk;
		this.theBiomeDecorator.flowersPerChunk = flowersChunk;
		this.spawnableMonsterList.add(new SpawnListEntry(EntityOcelot.class, 2, 1, 1));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 10, 4, 4));
	}

	public WorldGenerator getRandomWorldGenForTrees(Random random)
	{
		if (random.nextInt(5) == 0){
			return new WorldGenShrub(3, 3);
		}else{
			if(random.nextInt(5) == 0){
				return new WorldGenHugeTrees(false, 8 + random.nextInt(15), 3, 3);
			}else{
				return new WorldGenTrees(false, 4 + random.nextInt(3), 3, 3, false);
			}
		}
	}

	public WorldGenerator getRandomWorldGenForGrass(Random par1Random)
	{
		return par1Random.nextInt(4) == 0 ? new WorldGenTallGrass(Block.tallGrass.blockID, 2) : new WorldGenTallGrass(Block.tallGrass.blockID, 1);
	}

	public void decorate(World par1World, Random par2Random, int par3, int par4)
	{
		super.decorate(par1World, par2Random, par3, par4);
		WorldGenVines worldgenvines = new WorldGenVines();

		for (int k = 0; k < 50; ++k)
		{
			int l = par3 + par2Random.nextInt(16) + 8;
			byte b0 = 64;
			int i1 = par4 + par2Random.nextInt(16) + 8;

			worldgenvines.generate(par1World, par2Random, l, b0, i1);
		}
	}

}
