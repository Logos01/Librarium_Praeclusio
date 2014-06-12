package logos01.librariumpraeclusio.common;


import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry

public class LibrariumPraeclusioCommonProxy implements IGuiHandler{
	public void registerRenderInformation(){
		//Client side texture registering
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){ 
		//For GUI's
		return null;
	}
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z){ 
		//For GUI's
		return null;
	}

	
	public void registerTiles()	{ 
		//For registering TileEntities
	}	

	public void registerBlocks(){ 
		//Shelf
		GameRegistry.registerBlock(LibrariumPraeclusio.Shelf, "Shelf");//Needed for all blocks
		LanguageRegistry.addName(LibrariumPraeclusio.Shelf, "Shelf");//In-game name

		
	}

	public void registerItems(){ 
		//For registering Items
	}
	
}