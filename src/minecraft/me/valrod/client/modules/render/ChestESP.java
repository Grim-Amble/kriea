package me.valrod.client.modules.render;

import org.lwjgl.input.Keyboard;

import me.valrod.client.events.Event;
import me.valrod.client.events.EventUpdate;
import me.valrod.client.modules.Category;
import me.valrod.client.modules.Module;

public class ChestESP extends Module{

	public ChestESP() {
		super("ChestESP", Keyboard.KEY_O, Category.RENDER);
	}
	
	public void onEnable() {
		
	}
	
	public void onDisable() {
	}
	
	public void onUpdate(Event event) {
	}

}
