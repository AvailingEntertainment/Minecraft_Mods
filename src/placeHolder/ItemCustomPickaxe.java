package net.minecraft.src;

public class ItemCustomPickaxe extends ItemCustomTool {
    private static Block[] blocksEffectiveAgainst = new Block[] {
    	Block.cobblestone, Block.stoneDoubleSlab,
    	Block.stoneSingleSlab, Block.stone,
    	Block.sandStone, Block.cobblestoneMossy,
    	Block.oreIron, Block.blockSteel,
    	Block.oreCoal, Block.blockGold,
    	Block.oreGold, Block.oreDiamond,
    	Block.blockDiamond, Block.ice,
    	Block.netherrack, Block.oreLapis,
    	Block.blockLapis, Block.oreRedstone,
    	Block.oreRedstoneGlowing, Block.rail,
    	Block.railDetector, Block.railPowered
    };

    public ItemCustomPickaxe(int i, EnumToolMaterialCustom etmc) {
        super(i, 2, etmc, blocksEffectiveAgainst);
    }

	public boolean canHarvestBlock(Block block){
		if (block == Block.obsidian) {
			return toolMaterial.getHarvestLevel() == 3;
		} if (block == Block.blockDiamond || block == Block.oreDiamond) {
			return toolMaterial.getHarvestLevel() >= 2;
		} if (block == Block.blockGold || block == Block.oreGold) {
			return toolMaterial.getHarvestLevel() >= 2;
		} if (block == Block.blockSteel || block == Block.oreIron) {
			return toolMaterial.getHarvestLevel() >= 1;
		} if (block == Block.blockLapis || block == Block.oreLapis) {
			return toolMaterial.getHarvestLevel() >= 1;
		} if (block == Block.oreRedstone || block == Block.oreRedstoneGlowing) {
			return toolMaterial.getHarvestLevel() >= 2;
		} if (block.blockMaterial == Material.rock) {
			return true;
		}
		return block.blockMaterial == Material.iron;
    }

    public float getStrVsBlock(ItemStack is, Block block) {
        if (block != null && (block.blockMaterial== Material.iron || block.blockMaterial == Material.rock)) {
        	return efficiencyOnProperMaterial;
        } else {
        	return super.getStrVsBlock(is, block);
        }
    }
}
