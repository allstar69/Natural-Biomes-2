package NaturalBiomes2.Util;

public class BiomeHeights {
	
	public float Min;
	public float Max;
	
	public BiomeHeights(float min, float max)
	{
		this.Min = min;
		this.Max = max;
	}
	
	public float getMin() {
        return this.Min;
    }

    public float getMax() {
        return this.Max;
    }

}
