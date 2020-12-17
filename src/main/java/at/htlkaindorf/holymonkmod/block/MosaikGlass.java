package at.htlkaindorf.holymonkmod.block;

import at.htlkaindorf.holymonkmod.HolyMonkMod;
import at.htlkaindorf.holymonkmod.init.BlockInit;
import at.htlkaindorf.holymonkmod.init.ItemInit;
import at.htlkaindorf.holymonkmod.util.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class MosaikGlass extends BlockBase implements IHasModel
{

    public MosaikGlass(String name) {
        super(Material.GLASS, name);

        setHardness(1f);
        setResistance(1f);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public MosaikGlass setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Override
    public void registerModels()
    {
        HolyMonkMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}