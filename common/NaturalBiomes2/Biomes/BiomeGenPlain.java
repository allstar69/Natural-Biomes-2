package NaturalBiomes2.Biomes;

import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

public class BiomeGenPlain extends BiomeGenBase {

	public BiomeGenPlain(int id) {
		super(id);
		this.spawnableCreatureList.add(new SpawnListEntry(EntityHorse.class, 5, 2, 6));
	}

}
