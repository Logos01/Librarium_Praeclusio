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
		GameRegistry.addRecipe(
				new ItemStack(LibrariumPraeclusio.Shelf), "MMM", " A ", "MMM",
				Character.valueOf('M'), Block.wood, 
				Character.valueOf('A'), Item.stick
			);
		LanguageRegistry.addName(LibrariumPraeclusio.Shelf, "Shelf");//In-game name
		
		//Phylactery
		GameRegistry.registerBlock(LibrariumPraeclusio.Phylactery, "Phylactery");
		GameRegistry.addRecipe(
				new ItemStack(LibrariumPraeclusio.Phylactery), " M ", "MAM", " M ",
				Character.valueOf('M'), Block.glasspane,
				Character.valueOf('A'), Block.glass
			);
		LanguageRegistry.addName(LibrariumPraeclusio.Phylactery, "Phylactery");

		
	}

	public void registerItems(){ 
		//For registering Items
	}
	
}