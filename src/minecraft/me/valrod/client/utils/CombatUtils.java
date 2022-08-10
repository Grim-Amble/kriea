package me.valrod.client.utils;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class CombatUtils {

	public static EntityPlayer getTarget(Minecraft mc, double range) {
		List<EntityPlayer> players = new ArrayList<EntityPlayer>();

		for(Entity e : mc.world.loadedEntityList) {
			if(e instanceof EntityPlayer && e != mc.player && mc.player.getDistanceToEntity(e) <= range) {
				players.add((EntityPlayer) e);
			}
		}

		if(!players.isEmpty()) {
			EntityPlayer target = players.get(0);
			return target;
		}
		return null;
	}
	
}
