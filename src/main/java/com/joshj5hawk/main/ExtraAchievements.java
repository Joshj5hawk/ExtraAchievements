package com.joshj5hawk.main;


import net.minecraft.init.Blocks;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.joshj5hawk.event.AchievementListener;
import com.joshj5hawk.lib.Strings;
import com.joshj5hawk.proxies.CommonProxy;

@Mod(modid = Strings.modid, version = Strings.version, name = Strings.name)
public class ExtraAchievements
{
	//Achievements Start
	public static Achievement Cool;
	
	//Achievements Page
	public static AchievementPage ExtraAchievementsPage;
	
	@SidedProxy(clientSide = "com.joshj5hawk.proxies.ClientProxy", serverSide = "com.joshj5hawk.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preInit)
	{
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent init)
	{
		//Achievements
		Cool = new Achievement("", "CoolAchievement", 0, 0, Blocks.bedrock, null);
		
		
		ExtraAchievementsPage = new AchievementPage("Extra Achievements", Cool);
		AchievementPage.registerAchievementPage(ExtraAchievementsPage);
		
		FMLCommonHandler.instance().bus().register(new AchievementListener());
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postInit)
	{
		
	}
	
}