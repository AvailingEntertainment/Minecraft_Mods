/**
  * Copyright © 2012 AvailingEntertainment
  * 
  * File: mod_placeHolder.java
  * Version: 0.3.6 (0363)
  * Developed and Maintained by AvailingEntertainment
  */
package net.minecraft.src;

import java.util.Random;

public class mod_placeHolder extends BaseMod {
	public static final String Version = "0.3.6 (0363)";
	public static final Block Platinum = new Block(165, 0, Material.rock).setBlockName("Platinum").setHardness(7F).setResistance(12.5F).setCreativeTab(CreativeTabs.tabBlock);	// Drops Ore
	public static final Block Bisimuth = new BlockCustom(166, 0).setBlockName("Bisimuth").setHardness(5.5F).setResistance(10F).setCreativeTab(CreativeTabs.tabBlock);	// Drops Item
	public static final Block Vranium = new Block(167, 0, Material.rock).setBlockName("Vranium").setHardness(4.8F).setResistance(2.0F).setCreativeTab(CreativeTabs.tabBlock);	// Drops Ore
	public static final Block Cobalt = new BlockCustom(168, 0).setBlockName("Cobalt").setHardness(1.5F).setResistance(7.5F).setCreativeTab(CreativeTabs.tabBlock);		// Drops Item
	public static final Block Chromium = new BlockCustom(169, 0).setBlockName("Chromium").setHardness(1.0F).setResistance(4.0F).setCreativeTab(CreativeTabs.tabBlock);	// Drops Item
	public static final Block Thallium = new Block(170, 0, Material.rock).setBlockName("Thallium").setHardness(1.0F).setResistance(2.0F).setCreativeTab(CreativeTabs.tabBlock);	// Drops Ore
	
	public static final Block PlatinumBlock = new Block(171, 0, Material.rock).setBlockName("PlatinumBlock").setHardness(7.5F).setResistance(15F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block BisimuthBlock = new Block(172, 0, Material.rock).setBlockName("BisimuthBlock").setHardness(6.0F).setResistance(12.5F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block VraniumBlock = new Block(173, 0, Material.rock).setBlockName("VraniumBlock").setHardness(3.0F).setResistance(4.0F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block CobaltBlock = new Block(174, 0, Material.rock).setBlockName("CobaltBlock").setHardness(2.0F).setResistance(10F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block ChromiumBlock = new Block(175, 0, Material.rock).setBlockName("ChromiumBlock").setHardness(2.0F).setResistance(3.0F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block ThalliumBlock = new Block(176, 0, Material.rock).setBlockName("ThalliumBlock").setHardness(1.5F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
	
	public static final Item BisimuthItem = new Item(1700).setItemName("BisimuthItem");
	public static final Item CobaltItem = new Item(1701).setItemName("CobaltItem");
	public static final Item ChromiumItem = new Item(1702).setItemName("ChromiumItem");
	/** Item #1703, #1704, #1705 are reserved */
	
	public static final Achievement getVranium = new Achievement(1751, "getVranium", -5, -7, Vranium, null).registerAchievement();
	public static final Achievement getBisimuth = new Achievement(1751, "getBisimuth", -7, -7, Bisimuth, getVranium).registerAchievement();
	public static final Achievement getPlatinum = new Achievement(1752, "getPlatinum", -9, -7,  Platinum, getBisimuth).registerAchievement();
	// public static final Achievement outGrowingNormal = new Achievement(1753, "outGrowingNormal", pos_x, pos_y, ???, getPlatinum).setSpecial().registerAchievement();
	
	public static final Item PlatinumPickaxe = new ItemCustomPickaxe(1706, EnumToolMaterialCustom.PLATINUM).setItemName("Platinum Pickaxe").setCreativeTab(CreativeTabs.tabTools);
	public static final Item BisimuthPickaxe = new ItemCustomPickaxe(1707, EnumToolMaterialCustom.BISIMUTH).setItemName("Bisimuth Pickaxe").setCreativeTab(CreativeTabs.tabTools);
	public static final Item CobaltPickaxe = new ItemCustomPickaxe(1708, EnumToolMaterialCustom.COBALT).setItemName("Cobalt Pickaxe").setCreativeTab(CreativeTabs.tabTools);
	public static final Item ChromiumPickaxe = new ItemCustomPickaxe(1709, EnumToolMaterialCustom.CHROMIUM).setItemName("Chromium Pickaxe").setCreativeTab(CreativeTabs.tabTools);
		
	public static final Item PlatinumAxe = new ItemCustomAxe(1710, EnumToolMaterialCustom.PLATINUM).setItemName("Platinum Axe").setCreativeTab(CreativeTabs.tabTools);
	public static final Item BisimuthAxe = new ItemCustomAxe(1711, EnumToolMaterialCustom.BISIMUTH).setItemName("Bisimuth Axe").setCreativeTab(CreativeTabs.tabTools);
	public static final Item VraniumAxe = new ItemCustomAxe(1712, EnumToolMaterialCustom.VRANIUM).setItemName("Vranium Axe").setCreativeTab(CreativeTabs.tabTools);
	public static final Item ChromiumAxe = new ItemCustomAxe(1713, EnumToolMaterialCustom.CHROMIUM).setItemName("Chromium Axe").setCreativeTab(CreativeTabs.tabTools);
	
	public static final Item BisimuthSpade = new ItemCustomSpade(1714, EnumToolMaterialCustom.BISIMUTH).setItemName("Bisimuth Axe").setCreativeTab(CreativeTabs.tabTools);
	public static final Item VraniumSpade = new ItemCustomSpade(1715, EnumToolMaterialCustom.VRANIUM).setItemName("Vranium Axe").setCreativeTab(CreativeTabs.tabTools);
	public static final Item ThalliumSpade = new ItemCustomSpade(1716, EnumToolMaterialCustom.THALLIUM).setItemName("Thallium Axe").setCreativeTab(CreativeTabs.tabTools);
	
	public static final Item PlatinumSword = new ItemCustomSword(1717, EnumToolMaterialCustom.PLATINUM).setItemName("Platinum Sword").setCreativeTab(CreativeTabs.tabTools);
	public static final Item BisimuthSword = new ItemCustomSword(1718, EnumToolMaterialCustom.BISIMUTH).setItemName("Bisimuth Sword").setCreativeTab(CreativeTabs.tabTools);
	public static final Item VraniumSword = new ItemCustomSword(1719, EnumToolMaterialCustom.VRANIUM).setItemName("Vranium Sword").setCreativeTab(CreativeTabs.tabTools);
	public static final Item CobaltSword = new ItemCustomSword(1720, EnumToolMaterialCustom.COBALT).setItemName("Cobalt Sword").setCreativeTab(CreativeTabs.tabTools);
	
	public static final Item BisimuthHoe = new ItemCustomHoe(1721, EnumToolMaterialCustom.BISIMUTH).setItemName("Bisimuth Hoe").setCreativeTab(CreativeTabs.tabTools);
	public static final Item ChromiumHoe = new ItemCustomHoe(1722, EnumToolMaterialCustom.CHROMIUM).setItemName("Chromium Hoe").setCreativeTab(CreativeTabs.tabTools);
	public static final Item ThalliumHoe = new ItemCustomHoe(1723, EnumToolMaterialCustom.THALLIUM).setItemName("Thallium Hoe").setCreativeTab(CreativeTabs.tabTools);
	
	public void load() {
			/*-- Ore Register --*/
		ModLoader.registerBlock(Platinum);
		ModLoader.registerBlock(Bisimuth);
		ModLoader.registerBlock(Vranium);
		ModLoader.registerBlock(Cobalt);
		ModLoader.registerBlock(Chromium);
		ModLoader.registerBlock(Thallium);
			/*-- OreBlock Register --*/
		ModLoader.registerBlock(PlatinumBlock);
		ModLoader.registerBlock(BisimuthBlock);
		ModLoader.registerBlock(VraniumBlock);
		ModLoader.registerBlock(CobaltBlock);
		ModLoader.registerBlock(ChromiumBlock);
		ModLoader.registerBlock(ThalliumBlock);
			/*-- Ore Name --*/
		ModLoader.addName(Platinum, "Platinum");
		ModLoader.addName(Bisimuth, "Bisimuth");
		ModLoader.addName(Vranium, "Vranium");
		ModLoader.addName(Cobalt, "Cobalt");
		ModLoader.addName(Chromium, "Chromium");
		ModLoader.addName(Thallium, "Thallium");
			/*-- OreBlock Name --*/
		ModLoader.addName(PlatinumBlock, "Platinum Block");
		ModLoader.addName(BisimuthBlock, "Bisimuth Block");
		ModLoader.addName(VraniumBlock, "Vranium Block");
		ModLoader.addName(CobaltBlock, "Cobalt Block");
		ModLoader.addName(ChromiumBlock, "Chromium Block");
		ModLoader.addName(ThalliumBlock, "Thallium Block");
			/*-- Item Name --*/
		ModLoader.addName(BisimuthItem, "Bisimuth");
		ModLoader.addName(CobaltItem, "Cobalt Shard"); 			// Change Name?
		ModLoader.addName(ChromiumItem, "Chromium Fragment"); 	// Change Name?
		
		ModLoader.addName(PlatinumPickaxe, "Platinum Pickaxe");
		ModLoader.addName(BisimuthPickaxe, "Bisimuth Pickaxe");
		ModLoader.addName(CobaltPickaxe, "");
		ModLoader.addName(ChromiumPickaxe, "Chromium Pickaxe");
		
			/*-- Ore GFX --*/
		Platinum.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/platinumore.png");
		Bisimuth.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/bisimuthore.png");
		Vranium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/vraniumore.png");
		Cobalt.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/cobaltore.png");
		Chromium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/chromiumore.png");
		Thallium.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/thalliumore.png");
			/*-- OreBlock GFX --*/
		PlatinumBlock.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/platinumblock.png");
		BisimuthBlock.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/bisimuthblock.png");
		VraniumBlock.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/vraniumblock.png");
		CobaltBlock.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/cobaltblock.png");
		ChromiumBlock.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/chromiumblock.png");
		ThalliumBlock.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/thalliumblock.png");
			/*-- Item GFX --*/
		BisimuthItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/gfx/items.png");
		CobaltItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/gfx/items.png");
		ChromiumItem.iconIndex = ModLoader.addOverride("/gui/items.png", "/gfx/items.png");
			/*-- OreBlock Recipes --*/
		ModLoader.addRecipe(new ItemStack(PlatinumBlock, 1), new Object[] {
			"###", "###", "###", Character.valueOf('#'), Platinum });	
		ModLoader.addRecipe(new ItemStack(BisimuthBlock, 1), new Object[] {
			"###", "###", "###", Character.valueOf('#'), BisimuthItem });
		ModLoader.addRecipe(new ItemStack(VraniumBlock, 1), new Object[] {
			"###", "###", "###", Character.valueOf('#'), Vranium });	
		ModLoader.addRecipe(new ItemStack(CobaltBlock, 1), new Object[] {
			"###", "###", "###", Character.valueOf('#'), CobaltItem });
		ModLoader.addRecipe(new ItemStack(ChromiumBlock, 1), new Object[] {
			"###", "###", "###", Character.valueOf('#'), ChromiumItem });	
		ModLoader.addRecipe(new ItemStack(ThalliumBlock, 1), new Object[] {
			"###", "###", "###", Character.valueOf('#'), Thallium });
			
		ModLoader.addAchievementDesc(getPlatinum, "Getting Platinum", "Make a Platinum Block!");
		ModLoader.addAchievementDesc(getBisimuth, "Getting Bisimuth", "Make a Bisimuth Block!");
		ModLoader.addAchievementDesc(getVranium, "Getting Vranium", "Make a Vranium Block!");
		// ModLoader.addAchievementDesc(outgrowingNormal, "Outgrowing Normal!", "Create all of the Platinum, Bisimuth, and Vranium tools.");
	}
	
	public void takenFromCrafting(EntityPlayer ep, ItemStack is, IInventory ii) {
		if (is.itemID == PlatinumBlock.blockID) {
			ep.addStat(getPlatinum, 1);
		} if (is.itemID == BisimuthBlock.blockID) {
			ep.addStat(getBisimuth, 1);
		} if (is.itemID == VraniumBlock.blockID) {
			ep.addStat(getVranium, 1);
		}
		
		/** For the Outgrowing Normal achievement use void inventoryHasItem or something like that and check if player has all the required items.  **/
	}
	
	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		for (int i = 0; i < 10; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(128);
			int randPosZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Platinum.blockID, 3)).generate(world, random, randPosX, randPosY, randPosZ);
		} for (int i = 0; i < 8; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(128);
			int randPosZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Bisimuth.blockID, 4)).generate(world, random, randPosX, randPosY, randPosZ);
		} for (int i = 0; i < 7; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(128);
			int randPosZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Vranium.blockID, 4)).generate(world, random, randPosX, randPosY, randPosZ);
		} for (int i = 0; i < 6; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(128);
			int randPosZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Cobalt.blockID, 6)).generate(world, random, randPosX, randPosY, randPosZ);
		} for (int i = 0; i < 4; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(128);
			int randPosZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Chromium.blockID, 6)).generate(world, random, randPosX, randPosY, randPosZ);
		} for (int i = 0; i < 3; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(128);
			int randPosZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(Thallium.blockID, 8)).generate(world, random, randPosX, randPosY, randPosZ);
		}
	}
	
	public String getVersion() {
		return "placeHolder " + Version + " for Minecraft 1.3.2";
	}
}

/*
	Thallium:
		Armor (Stone +* 0.5): Boots (Slight running speed increase)
		
	Chromium:
		Armor (Iron +* 0.1): Chest, Legs
	
	Cobalt:
		Armor (Iron +* 0.15): Helm, Chest, Boots
		
	Vranium:
		Armor (Diamond * 0.75): Helm, Legs, Boots
		
	Bisimuth:
		Armor (Diamond +* 0.35): Helm
		
	Platinum:
		Armor (Diamond * 0.85): Helm, Chest, Legs, Boots
*/