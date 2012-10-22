package net.minecraft.src;

public class ItemCustomHoe extends Item {
    protected EnumToolMaterialCustom theToolMaterial;

    public ItemCustomHoe(int i, EnumToolMaterialCustom etmc) {
        super(i);
        this.theToolMaterial = etmc;
        this.maxStackSize = 1;
        this.setMaxDamage(etmc.getMaxUses());
        this.setCreativeTab(CreativeTabs.tabTools);
    }

    public boolean onItemUse(ItemStack is, EntityPlayer ep, World world, int i, int j, int k, int l, float m, float n, float o) {
        if (!ep.canPlayerEdit(i, j, k)) {
            return false;
        } else {
            int i1 = world.getBlockId(i, j, k);
            int i2 = world.getBlockId(i, j + 1, k);

            if ((l == 0 || i2 != 0 || i1 != Block.grass.blockID) && i1 != Block.dirt.blockID) {
                return false;
            } else {
                Block i3 = Block.tilledField;
                world.playSoundEffect((double)((float)i + 0.5F), (double)((float)j + 0.5F), (double)((float)k + 0.5F), i3.stepSound.getStepSound(), (i3.stepSound.getVolume() + 1.0F) / 2.0F, i3.stepSound.getPitch() * 0.8F);

                if (world.isRemote) {
                    return true;
                } else {
                    world.setBlockWithNotify(i, j, k, i3.blockID);
                    is.damageItem(1, ep);
                    return true;
                }
            }
        }
    }

    public boolean isFull3D() {
        return true;
    }

    public String func_77842_f() {
        return this.theToolMaterial.toString();
    }
}
