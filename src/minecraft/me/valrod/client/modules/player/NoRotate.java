package me.valrod.client.modules.player;

import org.lwjgl.input.Keyboard;

import me.valrod.client.events.Event;
import me.valrod.client.events.EventPacketReceived;
import me.valrod.client.modules.Category;
import me.valrod.client.modules.Module;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketPlayerPosLook;

public class NoRotate extends Module{

	public NoRotate() {
		super("NoRotate", Keyboard.KEY_O, Category.PLAYER);
	}
	
	public void onEnable() {
	}
	
	public void onDisable() {
	}
	
	public void onUpdate(Event event) {
		if(event instanceof EventPacketReceived) {
			Packet p = ((EventPacketReceived)event).getPacket();
			
			if(p instanceof SPacketPlayerPosLook) {
				((SPacketPlayerPosLook) p).setPitch(mc.player.rotationPitch);
				((SPacketPlayerPosLook) p).setYaw(mc.player.rotationYaw);
			}
		
		}
	}

}
