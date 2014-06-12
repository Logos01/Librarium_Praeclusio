package com.logos01.librariumpraeclusio;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = LibrariumPraeclusio.MODID, version = LibrariumPraeclusio.VERSION)

@NetworkMod(clientSideRequired=true,serverSideRequired=true, //Whether client side and server side are needed
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"LibrariumPraeclusio"}, packetHandler = LibrariumPraeclusioClientPacketHandler.class), //For clientside packet handling
serverPacketHandlerSpec = @SidedPacketHandler(channels = {"LibrariumPraeclusio"}, packetHandler = LibrariumPraeclusioServerPacketHandler.class)) //For serverside packet handling


public class LibrariumPraeclusio
{
    public static final String MODID = "librariumpraeclusio";
    public static final String VERSION = "0.1";
    
    @Instance("LibrariumPraeclusio")
    public static LibrariumPraeclusio instance = new LibrariumPraeclusio();

    @SidedProxy(clientSide = "com.logos01.librariumpraeclusio.client.LibrariumPraeclusioClientProxy", serverSide = "com.logos01.librariumpraeclusio.LibrariumPraeclusioCommonProxy") //Tells Forge the location of your proxies
    public static LibrariumPraeclusioCommonProxy proxy;

    @PreInit
    public void PreInit(FMLPreInitializationEvent e){

    }
    
    @Init
    public void InitLibrariumPraeclusio(FMLInitializationEvent event)
    {
    	//MULTIPLAYER ABILITY
    	NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers the class that deals with GUI data

		// some example code
        System.out.println("DIRT BLOCK >> "+Block.dirt.getUnlocalizedName());
    }
    

}
