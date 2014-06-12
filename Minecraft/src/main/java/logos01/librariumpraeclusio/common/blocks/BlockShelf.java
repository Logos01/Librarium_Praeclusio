package logos01.librariumpraeclusio.common.blocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockShelf extends Block {
	public BlockShelf(int par1){
		super(par1, Material.wood);
	}
	public void registerIcons(IconRegister iconrRegister){
		//Informs Forge where our texture is located.
		blockIcon = iconRegister.registerIcon("librariumpraeclusio:Shelf")
	}
	
}
