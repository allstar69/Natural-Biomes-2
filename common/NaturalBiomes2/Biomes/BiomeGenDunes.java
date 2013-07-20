package NaturalBiomes2.Biomes;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenDesertWells;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenDunes extends BiomeGenBase
{
	private WorldGenerator theWorldGenerator;
	
    public BiomeGenDunes(int var1)
    {
        super(var1);
        this.spawnableCreatureList.clear();
        this.topBlock = (byte)Block.sand.blockID;
        this.fillerBlock = (byte)Block.sand.blockID;
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.deadBushPerChunk = -999;
        this.theBiomeDecorator.reedsPerChunk = -999;
        this.theBiomeDecorator.cactiPerChunk = -999;
        this.theBiomeDecorator.generateLakes = false;
        this.theWorldGenerator = new WorldGenMinable(Block.silverfish.blockID, 8);
    }
    
    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);
        int k = 3 + par2Random.nextInt(6);
        int l;
        int i1;
        int j1;

        for (l = 0; l < k; ++l)
        {
            i1 = par3 + par2Random.nextInt(16);
            j1 = par2Random.nextInt(28) + 4;
            int k1 = par4 + par2Random.nextInt(16);
            int l1 = par1World.getBlockId(i1, j1, k1);

            if (l1 == Block.stone.blockID)
            {
                par1World.setBlock(i1, j1, k1, Block.oreEmerald.blockID, 0, 2);
            }
        }

        for (k = 0; k < 7; ++k)
        {
            l = par3 + par2Random.nextInt(16);
            i1 = par2Random.nextInt(64);
            j1 = par4 + par2Random.nextInt(16);
            this.theWorldGenerator.generate(par1World, par2Random, l, i1, j1);
        }
        
        if (par2Random.nextInt(1000) == 0)
        {
            int var5 = par3 + par2Random.nextInt(16) + 8;
            int var6 = par4 + par2Random.nextInt(16) + 8;
            WorldGenDesertWells var7 = new WorldGenDesertWells();
            var7.generate(par1World, par2Random, var5, par1World.getHeightValue(var5, var6) + 1, var6);
        }
    }
}
