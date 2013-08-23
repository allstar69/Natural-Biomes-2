package NaturalBiomes2.Biomes;

import java.util.Random;

import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;
import NaturalBiomes2.World.WorldGenWaterHugeTree;
import NaturalBiomes2.World.WorldGenWaterTrees;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BiomeGenSwampyJungle extends BiomeGenBase {

	public BiomeGenSwampyJungle(int id)
	{
		super(id);
		this.theBiomeDecorator.treesPerChunk = 25;
		this.theBiomeDecorator.waterlilyPerChunk = 5;
        this.theBiomeDecorator.flowersPerChunk = -999;
        this.theBiomeDecorator.deadBushPerChunk = 1;
        this.theBiomeDecorator.mushroomsPerChunk = 8;
        this.theBiomeDecorator.reedsPerChunk = 10;
        this.theBiomeDecorator.clayPerChunk = 1;
        this.theBiomeDecorator.waterlilyPerChunk = 4;
        this.theBiomeDecorator.bigMushroomsPerChunk = 1;
        this.waterColorMultiplier = 14745518;
	}
	
	public WorldGenerator getRandomWorldGenForTrees(Random random)
	{
		if (random.nextInt(8) == 0){
			return new WorldGenShrub(3, 3);
		}else{
			if(random.nextInt(5) == 0){
				return new WorldGenWaterHugeTree(false, 15 + random.nextInt(10), 3, 3);
			}else{
				return new WorldGenTrees(false, 6 + random.nextInt(3), 3, 3, false);
			}
		}
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
	
    @SideOnly(Side.CLIENT)
    public int getBiomeGrassColor()
    {
        double d0 = (double)this.getFloatTemperature();
        double d1 = (double)this.getFloatRainfall();
        return ((ColorizerGrass.getGrassColor(d0, d1) & 16711422) + 5115470) / 2;
    }

    @SideOnly(Side.CLIENT)
    public int getBiomeFoliageColor()
    {
        double d0 = (double)this.getFloatTemperature();
        double d1 = (double)this.getFloatRainfall();
        return ((ColorizerFoliage.getFoliageColor(d0, d1) & 16711422) + 5115470) / 2;
    }
	
}
