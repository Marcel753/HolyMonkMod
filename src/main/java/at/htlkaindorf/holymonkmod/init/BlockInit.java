package at.htlkaindorf.holymonkmod.init;

import at.htlkaindorf.holymonkmod.block.Tombstone;
import at.htlkaindorf.holymonkmod.items.food.ItemCustomFood;
import at.htlkaindorf.holymonkmod.items.kreuze.Kreuz;
import javafx.scene.paint.Material;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block TOMBSTONE = new Tombstone("tombstone");
    public static final Block MOSAIK_GLASS = new Tombstone("mosaik_glass");

}
