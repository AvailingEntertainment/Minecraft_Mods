/**
  * Copyright © 2012 AvailingEntertainment
  * 
  * File: mod_placeHolder.java
  * Version: 1.3 (139)
  * Developed and Maintained by AvailingEntertainment
  */
package net.minecraft.src;

public class mod_placeHolder extends BaseMod {
	public static final Block placeHolder1 = new BlockCustom(165, 0).setBlockName("DontMatter").setHardness(4F).setResistance(12.5F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block placeHolder2 = new BlockCustom(166, 0).setBlockName("DontMatter").setHardness(2.5F).setResistance(10F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block placeHolder3 = new BlockCustom(167, 0).setBlockName("DontMatter").setHardness(2.0F).setResistance(2.0F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block placeHolder4 = new BlockCustom(168, 0).setBlockName("DontMatter").setHardness(1.5F).setResistance(7.5F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block placeHolder5 = new BlockCustom(169, 0).setBlockName("DontMatter").setHardness(1.0F).setResistance(4.0F).setCreativeTab(CreativeTabs.tabBlock);
	public static final Block placeHolder6 = new BlockCustom(170, 0).setBlockName("DontMatter").setHardness(1.0F).setResistance(2.0F).setCreativeTab(CreativeTabs.tabBlock);
	
	public void load() {
		ModLoader.registerBlock(placeHolder1);
		ModLoader.registerBlock(placeHolder2);
		ModLoader.registerBlock(placeHolder3);
		ModLoader.registerBlock(placeHolder4);
		ModLoader.registerBlock(placeHolder5);
		ModLoader.registerBlock(placeHolder6);
		
		ModLoader.addName(placeHolder1, "???");
		ModLoader.addName(placeHolder2, "???");
		ModLoader.addName(placeHolder3, "???");
		ModLoader.addName(placeHolder4, "???");
		ModLoader.addName(placeHolder5, "???");
		ModLoader.addName(placeHolder6, "???");
		
		placeHolder1.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/nh.png");
		placeHolder2.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/nh2.png");
		placeHolder3.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/nh3.png");
		placeHolder4.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/nh4.png");
		placeHolder5.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/nh5.png");
		placeHolder6.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/gfx/blocks/nh6.png");
		
		ModLoader.addRecipe(new ItemStack(placeHolder1, 1), new Object[] {
			"#", Character.valueOf('#'), Block.dirt });	
		ModLoader.addRecipe(new ItemStack(placeHolder2, 1), new Object[] {
			"#", Character.valueOf('#'), Block.dirt });
		ModLoader.addRecipe(new ItemStack(placeHolder3, 1), new Object[] {
			"#", Character.valueOf('#'), Block.dirt });	
		ModLoader.addRecipe(new ItemStack(placeHolder4, 1), new Object[] {
			"#", Character.valueOf('#'), Block.dirt });
		ModLoader.addRecipe(new ItemStack(placeHolder5, 1), new Object[] {
			"#", Character.valueOf('#'), Block.dirt });	
		ModLoader.addRecipe(new ItemStack(placeHolder6, 1), new Object[] {
			"#", Character.valueOf('#'), Block.dirt });
	}	
	
	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
		for (int i = 0; i < 10; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(128);
			int randPosZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(placeHolder1.blockID, 3)).generate(world, random, randPosX, randPosY, randPosZ);
		}

		for (int i = 0; i < 8; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(128);
			int randPosZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(placeHolder2.blockID, 4)).generate(world, random, randPosX, randPosY, randPosZ);
		}
		
		for (int i = 0; i < 7; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(128);
			int randPosZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(placeHolder3.blockID, 4)).generate(world, random, randPosX, randPosY, randPosZ);
		}
		
		for (int i = 0; i < 6; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(128);
			int randPosZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(placeHolder4.blockID, 6)).generate(world, random, randPosX, randPosY, randPosZ);
		}
		
		for (int i = 0; i < 4; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(128);
			int randPosZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(placeHolder5.blockID, 6)).generate(world, random, randPosX, randPosY, randPosZ);
		}
		
		for (int i = 0; i < 3; i++) {
			int randPosX = chunkX + random.nextInt(16);
			int randPosY = random.nextInt(128);
			int randPosZ = chunkZ + random.nextInt(16);
			(new WorldGenMinable(placeHolder6.blockID, 8)).generate(world, random, randPosX, randPosY, randPosZ);
		}
	}
}