package com.logos01.librariumpraeclusio;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = LibrariumPraeclusio.MODID, version = LibrariumPraeclusio.VERSION)
public class LibrariumPraeclusio
{
    public static final String MODID = "librariumpraeclusio";
    public static final String VERSION = "0.1";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Block.dirt.getUnlocalizedName());
    }
}
