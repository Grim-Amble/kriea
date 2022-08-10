package me.valrod.client;

import me.valrod.client.modules.ModuleManager;
import me.valrod.client.modules.combat.KillAura;
import me.valrod.client.modules.movement.Fly;
import me.valrod.client.modules.movement.Speed;
import me.valrod.client.modules.player.NoRotate;
import me.valrod.client.modules.player.Velocity;
import me.valrod.client.modules.render.ChestESP;
import me.valrod.client.modules.render.Nametags;
import me.valrod.client.modules.render.PlayerESP;
import me.valrod.client.modules.world.ChestStealer;

public class Client {

	public static final String USERNAME = "IUYTrtyu123456";
	public static final String CLIENT_NAME = "Hacked Client";
	public static final String CLIENT_VERSION = "b0.1";
	private static ModuleManager moduleManager;
	
	public static void onStartup() {
		moduleManager = new ModuleManager();
		
		// Movement
		moduleManager.register(new Speed());
		moduleManager.register(new Fly());
		
		// Combat
		moduleManager.register(new KillAura());
		
		// World
		moduleManager.register(new ChestStealer());
		
		// Player
		moduleManager.register(new Velocity());
		moduleManager.register(new NoRotate());
		
		// Render
		moduleManager.register(new ChestESP());
		moduleManager.register(new PlayerESP());
		moduleManager.register(new Nametags());
	}

	public static ModuleManager getModuleManager() {
		return moduleManager;
	}
	
	public static void onShutdown() {
		
	}

}
