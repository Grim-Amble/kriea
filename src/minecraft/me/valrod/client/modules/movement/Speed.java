package me.valrod.client.modules.movement;

import org.lwjgl.input.Keyboard;

import me.valrod.client.events.Event;
import me.valrod.client.events.EventUpdate;
import me.valrod.client.modules.Category;
import me.valrod.client.modules.Module;

public class Speed extends Module{

	public Speed() {
		super("Speed", Keyboard.KEY_V, Category.MOVEMENT);
	}
	
	public void onEnable() {
		System.out.println("enabled");
	}
	
	public void onDisable() {
		System.out.println("disabled");
	}
	
	public void onUpdate(Event event) {
		if(event instanceof EventUpdate) {
			mc.gameSettings.keyBindSprint.pressed = true;
			if(mc.player.onGround) {
				mc.player.jump();
			}else {
				mc.player.jumpMovementFactor = 0.035F;
			}
		}
	}

}
