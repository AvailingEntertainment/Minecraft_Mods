package net.minecraft.src;

public enum EnumToolMaterialCustom {
	THALLIUM(1, 196, 3.0F, 1, 3),
	CHROMIUM(2, 275, 5.5F, 2, 4),
	COBALT(2, 325, 6.25F, 4, 2),
	VRANIUM(3, 781, 6.75F, 3, 8),
	BISIMUTH(3, 1678, 8.0F, 4, 31),
	PLATINUM(3, 3122, 10.5F, 6, 22);
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiencyOnProperMaterial;
	private final int damageVsEntity;
	private final int enchantability;
	
	private EnumToolMaterialCustom(int i, int j, float k, int i1, int j1) {
		this.harvestLevel = i;
		this.maxUses = j;
		this.efficiencyOnProperMaterial = k;
		this.damageVsEntity = i1;
		this.enchantability = j1;
	}
	
	public int getMaxUses() {
		return this.maxUses;  }
	
	public float getEfficiencyOnProperMaterial() {
		return this.efficiencyOnProperMaterial;  }
	
	public int getDamageVsEntity() {
		return this.damageVsEntity;  }
	
	public int getHarvestLevel() {
		return this.harvestLevel;
	}
	
	public int getEnchantability() {
		return this.enchantability;  }
}