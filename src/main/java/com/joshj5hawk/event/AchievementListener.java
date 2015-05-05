package com.joshj5hawk.event;

import net.minecraft.init.Items;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemPickupEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;

import com.joshj5hawk.main.ExtraAchievements;

public class AchievementListener 
{
	public void crafting(ItemCraftedEvent event)
	{
		
	}
	
	public void smelting(ItemSmeltedEvent event)
	{
		
	}
	
	public void pickup(ItemPickupEvent event)
	{
		if(event.pickedUp.getEntityItem().getItem() == Items.stick)
				{
					event.player.addStat(ExtraAchievements.Cool, 1);
				}
	}
}
