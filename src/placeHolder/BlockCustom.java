package net.minecraft.src;

import java.util.Random;

public class BlockCustom extends Block {
	BlockCustom(int i, int j) {
		super(i, j, Material.rock);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	/**
	 * Get drop ID
	 * **/
	public int idDropped(int par1, Random par2Random, int par3) {
		return this.blockID == mod_placeHolder.Bisimuth.blockID ? mod_placeHolder.BisimuthItem.shiftedIndex : (this.blockID == mod_placeHolder.Cobalt.blockID ? mod_placeHolder.CobaltItem.shiftedIndex : (this.blockID == mod_placeHolder.Chromium.blockID ? mod_placeHolder.ChromiumItem.shiftedIndex : this.blockID));
    }
}