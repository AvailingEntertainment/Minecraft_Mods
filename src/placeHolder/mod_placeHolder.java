/**
  * Copyright © 2012 AvailingEntertainment
  * 
  * File: mod_placeHolder.java
  * Version: 1.7 (0177)
  * Developed and Maintained by AvailingEntertainment
  */
package net.minecraft.src;

public class mod_placeHolder extends BaseMod {
	public static final String Version = "1.7 (0177)";
	public static final Block Platinum = new BlockCustom(165, 0).setBlockName("Platinum").setHardness(4F).setResistance(12.5F).setCreativeTab(CreativeTabs.tabBlock);	// Drops Ore
	public static final Block Bisimuth = new BlockCustom(166, 0).setBlockName("Bisimuth").setHardness(2.5F).setResistance(10F).setCreativeTab(CreativeTabs.tabBlock);	// Drops Item
	public static final Block Vranium = new BlockCustom(167, 0).setBlockName("Vranium").setHardness(2.0F).setResistance(2.0F).setCreativeTab(CreativeTabs.tabBlock);	// Drops Ore
	public static final Block Cobalt = new BlockCustom(168, 0).setBlockName("Cobalt").setHardness(1.5F).setResistance(7.5F).setCreativeTab(CreativeTabs.tabBlock);		// Drops Item
	public static final Block Chromium = new BlockCustom(169, 0).setBlockName("Chromium").setHardness(1.0F).setResistance(4.0F).setCreativeTab(CreativeTabs.tabBlock);	// Drops Item
	public static final Block Thallium = new BlockCustom(170, 0).setBlockName("Thallium").setHardness(1.0F).setResistance(2.0F).setCreativeTab(CreativeTabs.tabBlock);	// Drops Ore
	
	public static final Block PlatinumBlock = new BlockCustom(171, 0).setBlockName("PlatinumBlock").setHardness(4.5F).setResistance(15F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block BisimithBlock = new BlockCustom(172, 0).setBlockName("BisimuthBlock").setHardness(3.0F).setResistance(12.5F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block VraniumBlock = new BlockCustom(173, 0).setBlockName("VraniumBlock").setHardness(3.0F).setResistance(4.0F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block CobaltBlock = new BlockCustom(174, 0).setBlockName("CobaltBlock").setHardness(2.0F).setResistance(10F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block ChromiumBlock = new BlockCustom(175, 0).setBlockName("ChromiumBlock").setHardness(2.0F).setResistance(3.0F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block ThalliumBlock = new BlockCustom(176, 0).setBlockName("ThalliumBlock").setHardness(1.5F).setResistance(5.0F).setCreativeTab(CreativeTabs.tabBlock);
	
	public static final Item BisimuthItem = new ItemCustom(1700).setItemName("BisimuthItem");
	public static final Item CobaltItem = new ItemCustom(1701).setItemName("CobaltItem");
	public static final Item ChromiumItem = new ItemCustom(1702).setItemName("ChromiumItem");
	
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
			"###", "###", "###", Character.valueOf('#'), Block.Platinum });	
		ModLoader.addRecipe(new ItemStack(BisimuthBlock, 1), new Object[] {
			"###", "###", "###", Character.valueOf('#'), Block.BisimuthItem });
		ModLoader.addRecipe(new ItemStack(VraniumBlock, 1), new Object[] {
			"###", "###", "###", Character.valueOf('#'), Block.Vranium });	
		ModLoader.addRecipe(new ItemStack(CobaltBlock, 1), new Object[] {
			"###", "###", "###", Character.valueOf('#'), Block.CobaltItem });
		ModLoader.addRecipe(new ItemStack(ChromiumBlock, 1), new Object[] {
			"###", "###", "###", Character.valueOf('#'), Block.ChromiumItem });	
		ModLoader.addRecipe(new ItemStack(ThalliumBlock, 1), new Object[] {
			"###", "###", "###", Character.valueOf('#'), Block.Thallium });
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