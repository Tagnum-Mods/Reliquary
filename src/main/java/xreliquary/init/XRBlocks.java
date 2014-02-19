package xreliquary.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import xreliquary.blocks.BlockAltar;
import xreliquary.blocks.BlockFertileLilypad;
import xreliquary.blocks.BlockWraithNode;
import xreliquary.items.ItemFertileLilypad;
import xreliquary.lib.Names;
import xreliquary.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

public class XRBlocks {

	public static Block altarActive;
	public static Block altarIdle;
	public static Block lilypad;
	public static Block wraithNode;

	public static void init() {
		altarActive = new BlockAltar(true);
		altarIdle = new BlockAltar(false);
		lilypad = new BlockFertileLilypad();
		wraithNode = new BlockWraithNode();

		/*
		 * LanguageRegistry.addName(altarActive, Names.ALTAR_LOCAL);
		 * LanguageRegistry.addName(altarIdle, Names.ALTAR_LOCAL);
		 * LanguageRegistry.addName(lilypad, Names.LILYPAD_LOCAL);
		 * LanguageRegistry.addName(wraithNode, Names.WRAITHNODE_LOCAL);
		 */

		GameRegistry.registerBlock(altarActive, Names.ALTAR_ACTIVE_NAME);
		GameRegistry.registerBlock(altarIdle, Names.ALTAR_IDLE_NAME);
		GameRegistry.registerBlock(lilypad, ItemFertileLilypad.class, Names.LILYPAD_NAME);
		GameRegistry.registerBlock(wraithNode, Names.WRAITHNODE_NAME);

		addRecipes();
	}

	public static void addRecipes() {
		GameRegistry.addRecipe(new ItemStack(altarIdle, 1), "olo", "lel", "olo", 'o', Blocks.obsidian, 'l', Blocks.redstone_lamp, 'e', Items.emerald);
		GameRegistry.addRecipe(new ItemStack(lilypad, 1), "www", "wlw", "www", 'w', XRRecipes.potion(Reference.FERTILIZER_META), 'l', Blocks.waterlily);
		GameRegistry.addRecipe(new ItemStack(wraithNode, 1), "vv", "vv", 'v', AbstractionHandler.getItem(Names.EMPTY_VOID_TEAR_NAME));
	}
}