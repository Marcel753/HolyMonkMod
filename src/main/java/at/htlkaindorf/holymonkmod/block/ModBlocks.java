package at.htlkaindorf.holymonkmod.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks
{

    public static final MosaikGlass glass = new MosaikGlass("mosaik_glass").setCreativeTab(CreativeTabs.MATERIALS);
    public static final Tombstone tombstone = new Tombstone("tombstone").setCreativeTab(CreativeTabs.MATERIALS);

    public static void register(IForgeRegistry<Block> registry)
    {
        registry.registerAll(
                glass, tombstone
        );

    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
                glass.createItemBlock(),
                tombstone.createItemBlock()
        );

    }

    public static void registerModels()
    {
        glass.registerItemModel(Item.getItemFromBlock(glass));
        tombstone.registerItemModel(Item.getItemFromBlock(tombstone));
    }
}
