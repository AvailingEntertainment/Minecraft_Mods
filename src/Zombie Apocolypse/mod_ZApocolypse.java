/**
  * Copyright © 2012 AvailingEntertainment
  * 
  * File: mod_ZApocolypse.java
  * Version: 0.0.1 (0010)
  * Developed and Maintained by AvailingEntertainment
  */
package net.minecraft.src;

public class mod_placeHolder extends BaseMod {
	public static final String Version = "0.0.1 (0010)";
	
	public static final Item Knife = new ItemKnife(1700, EnumToolMaterialApoc.IRON).setItemName("Knife").setCreativeTab(CreativeTabs.tabTools);
	public static final Item WoodBat = new ItemBat(1701, EnumToolMaterialApoc.WOOD).setItemName("Wooden Bat").setCreativeTab(CreativeTabs.tabTools);
	public static final ITem IronBat = new ItemBat(1702, EnumToolMaterialApoc.IRON).setItemName("Metal Bat").setCreativeTab(CreativeTabs.tabTools);
	public static final Item Bandage = new ItemBandage(1707).setItemName("Bandage");
	
	public void load() {			
		ModLoader.addName(Knife, "Knife");
		ModLoader.addName(WoodBat, "Wooden Bat");
		ModLoader.addName(IronBat, "Metal Bat");
		ModLoader.addName(Bandage, "Bandage");
		
		Knife.iconIndex = ModLoader.addOverride("/gui/items.png", "/img/items.png");
		
		ModLoader.addAchievementDesc(getPlatinum, "Getting Platinum", "Make a Platinum Block!");
		ModLoader.addAchievementDesc(getBisimuth, "Getting Bisimuth", "Make a Bisimuth Block!");
	}
	
	public String getVersion() {
		return "placeHolder " + Version + " for Minecraft 1.4.2";
	}
}