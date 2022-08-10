package me.valrod.client.modules.movement;

import org.lwjgl.input.Keyboard;

import me.valrod.client.events.Event;
import me.valrod.client.events.EventUpdate;
import me.valrod.client.modules.Category;
import me.valrod.client.modules.Module;

public class Fly extends Module{

	public Fly() {
		super("Fly", Keyboard.KEY_F, Category.MOVEMENT);
	}
	
	public void onEnable() {
		mc.player.capabilities.allowFlying = true;
		
	}
	
	public void onDisable() {
		mc.player.capabilities.allowFlying = false;
		mc.player.capabilities.isFlying = false;
	}
	
	public void onUpdate(Event event) {
		if(event instanceof EventUpdate) {
			mc.player.capabilities.isFlying = true;
		}
	}

}
