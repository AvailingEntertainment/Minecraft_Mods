package net.minecraft.src;

public class ItemCustomTool extends Item {
    private Block[] blocksEffectiveAgainst;
    protected float efficiencyOnProperMaterial = 4.0F;
    private int damageVsEntity;
    protected EnumToolMaterialCustom toolMaterial;

    protected ItemCustomTool(int i, int j, EnumToolMaterialCustom etmc, Block[] block) {
        super(i);
        this.toolMaterial = etmc;
        this.blocksEffectiveAgainst = block;
        this.maxStackSize = 1;
        this.setMaxDamage(etmc.getMaxUses());
        this.efficiencyOnProperMaterial = etmc.getEfficiencyOnProperMaterial();
        this.damageVsEntity = j + etmc.getDamageVsEntity();
        this.setCreativeTab(CreativeTabs.tabTools);
    }

	public float getStrVsBlock(ItemStack is, Block block) {
        Block[] i= this.blocksEffectiveAgainst;
        int j = i.length;

        for (int k = 0; k < j; ++k)
        {
            Block l = i[k];

            if (l == block)
            {
                return this.efficiencyOnProperMaterial;
            }
        }

        return 1.0F;
    }

    public boolean hitEntity(ItemStack is, EntityLiving el, EntityLiving el1) {
        is.damageItem(2, el1);
        return true;
    }

    public boolean onBlockDestroyed(ItemStack is, World world, int i, int j, int k, int l, EntityLiving el) {
        if ((double)Block.blocksList[i].getBlockHardness(world, j, k, l) != 0.0D) {
            is.damageItem(1, el);
        }

        return true;
    }

    public int getDamageVsEntity(Entity entity) {
        return this.damageVsEntity;
    }

    public boolean isFull3D() {
        return true;
    }

    public int getItemEnchantability() {
        return this.toolMaterial.getEnchantability();
    }

    public String func_77861_e() {
        return this.toolMaterial.toString();
    }
}
