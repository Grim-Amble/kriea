package me.valrod.client.utils;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class RotationUtils {

	public static float[] getRotation(EntityPlayer player, Entity ent) {
		double diffX = player.posX - ent.posX;
		double diffY = player.posY - ent.posY;
		double diffZ = player.posZ - ent.posZ;
		
		double dist = Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffZ, 2));
		
		float yaw = (float) (-Math.atan2(diffX, diffZ) * (180F / (float)Math.PI) + 180);
		float pitch = (float) (Math.atan2(diffY, dist) * (180F / (float)Math.PI));
		
		return new float[] {yaw, pitch};
	}
	
}
