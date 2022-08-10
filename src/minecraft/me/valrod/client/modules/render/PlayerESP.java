package me.valrod.client.modules.render;

import org.lwjgl.input.Keyboard;

import me.valrod.client.events.Event;
import me.valrod.client.events.EventRender3D;
import me.valrod.client.modules.Category;
import me.valrod.client.modules.Module;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class PlayerESP extends Module{

	public PlayerESP() {
		super("PlayerESP", Keyboard.KEY_O, Category.RENDER);
	}
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
	}
	
	public void onUpdate(Event event) {
		
	}

}
