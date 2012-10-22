package net.minecraft.src;

public class ItemCustomAxe extends ItemCustomTool
{
    /** an array of the blocks this axe is effective against */
    private static Block[] blocksEffectiveAgainst = new Block[] {
    	Block.planks, Block.bookShelf,
    	Block.wood, Block.chest,
    	Block.stoneDoubleSlab, Block.stoneSingleSlab,
    	Block.pumpkin, Block.pumpkinLantern
    };

    protected ItemCustomAxe(int i, EnumToolMaterialCustom etmc) {
        super(i, 3, etmc, blocksEffectiveAgainst);
    }

    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
        return par2Block != null && par2Block.blockMaterial == Material.wood ? this.efficiencyOnProperMaterial : super.getStrVsBlock(par1ItemStack, par2Block);
    }
}