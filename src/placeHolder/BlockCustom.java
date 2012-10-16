/**
  * Copyright © 2012 AvailingEntertainment
  * 
  * File: BlockCustom.java
  * Version: 1.0 (100)
  * Developed and Maintained by AvailingEntertainment
  */
package net.minecraft.src;

import java.util.Random;

public class BlockCustom extends Block {
	public BlockCustom(int i, int j) {
		super(i, j, Material.ground);
	}
	
	public int quantityDropped(Random random) {
		return 1;
	}
}