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

    protected ItemCustomPickaxe(int i, EnumToolMaterialCustom etm) {
        super(i, 2, etm, blocksEffectiveAgainst);
    }

	public boolean canHarvestBlock(Block block){
        return block == Block.obsidian ? this.toolMaterial.getHarvestLevel() == 3 : (
        		block != Block.blockDiamond && block != Block.oreDiamond ? (
        		block == Block.oreEmerald ? this.toolMaterial.getHarvestLevel() >= 2 : (
        		block != Block.blockGold && block != Block.oreGold ? (
        		block != Block.blockSteel && block != Block.oreIron ? (
        		block != Block.blockLapis && block != Block.oreLapis ? (
        		block != Block.oreRedstone && block != Block.oreRedstoneGlowing ? (
        		block.blockMaterial == Material.rock ? true : block.blockMaterial == Material.iron) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 2)) : this.toolMaterial.getHarvestLevel() >= 2);
    }

    public float getStrVsBlock(ItemStack is, Block block) {
        return block != null && (block.blockMaterial == Material.iron || block.blockMaterial == Material.rock) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(is, block);
    }
}
