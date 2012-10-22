package net.minecraft.src;

public class ItemCustomSword extends Item {
    private int weaponDamage;
    private final EnumToolMaterialCustom toolMaterial;

    public ItemCustomSword(int i, EnumToolMaterialCustom etmc) {
        super(i);
        this.toolMaterial = etmc;
        this.maxStackSize = 1;
        this.setMaxDamage(etmc.getMaxUses());
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.weaponDamage = 4 + etmc.getDamageVsEntity();
    }

    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
        return par2Block.blockID == Block.web.blockID ? 15.0F : 1.5F;
    }

    public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving) {
        par1ItemStack.damageItem(1, par3EntityLiving);
        return true;
    }

    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLiving par7EntityLiving) {
    	if ((double)Block.blocksList[par3].getBlockHardness(par2World, par4, par5, par6) != 0.0D) {
            par1ItemStack.damageItem(2, par7EntityLiving);
        }

        return true;
    }

    public int getDamageVsEntity(Entity par1Entity) {
        return this.weaponDamage;
    }

    public boolean isFull3D() {
        return true;
    }

    public EnumAction getItemUseAction(ItemStack par1ItemStack) {
        return EnumAction.block;
    }

    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 72000;
    }

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
    
    public boolean canHarvestBlock(Block par1Block) {
        return par1Block.blockID == Block.web.blockID;
    }

    public int getItemEnchantability() {
        return this.toolMaterial.getEnchantability();
    }

    public String func_77825_f() {
        return this.toolMaterial.toString();
    }
}
