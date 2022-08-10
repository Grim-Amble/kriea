package me.valrod.client.modules.render;

import org.lwjgl.input.Keyboard;

import me.valrod.client.events.Event;
import me.valrod.client.events.EventRender3D;
import me.valrod.client.modules.Category;
import me.valrod.client.modules.Module;
import me.valrod.client.utils.Render3DUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class Nametags extends Module{

	public Nametags() {
		super("Nametags", Keyboard.KEY_O, Category.RENDER);
	}
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
	}
	
	public void onUpdate(Event event) {
		
		if(event instanceof EventRender3D) {
			for(Entity e : mc.world.loadedEntityList) {
				if(e instanceof EntityPlayer && e != mc.player) {
//					float f = mc.renderManager.playerViewY;
//		            float f1 = mc.renderManager.playerViewX;
//		            boolean flag1 = mc.renderManager.options.thirdPersonView == 2;
//		            float f2 = e.height + 0.5F;
//		            
//					Render3DUtils.drawNameplate(mc.fontRendererObj, e, mc.renderManager.viewerPosX + e.posX, mc.renderManager.viewerPosY + e.posY, mc.renderManager.viewerPosZ + e.posZ, 0, f, f1, flag1);
				}
			}
		}
		
	}

}
