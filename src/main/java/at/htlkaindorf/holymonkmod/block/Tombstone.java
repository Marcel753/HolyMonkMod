package at.htlkaindorf.holymonkmod.block;

import at.htlkaindorf.holymonkmod.HolyMonkMod;
import at.htlkaindorf.holymonkmod.init.BlockInit;
import at.htlkaindorf.holymonkmod.init.ItemInit;
import at.htlkaindorf.holymonkmod.util.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Tombstone extends BlockBase implements IHasModel {

    public static final AxisAlignedBB TOMBSTONE_AABB =  new AxisAlignedBB(0.0625D, 0, 0.0625D, 0.9375D, 1D, 0.9375D);

    public Tombstone(String name) {
        super(Material.ROCK, name);

        setHardness(3f);
        setResistance(5f);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public Tombstone setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return TOMBSTONE_AABB;
    }

    @Override
    public void registerModels()
    {
        HolyMonkMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}