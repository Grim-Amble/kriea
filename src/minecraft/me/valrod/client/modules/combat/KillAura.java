package me.valrod.client.modules.combat;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.input.Keyboard;

import me.valrod.client.events.Event;
import me.valrod.client.events.EventMotion;
import me.valrod.client.events.EventUpdate;
import me.valrod.client.modules.Category;
import me.valrod.client.modules.Module;
import me.valrod.client.utils.CombatUtils;
import me.valrod.client.utils.RotationUtils;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;

public class KillAura extends Module{

	private final double RANGE = 4;
	private int timer;
	
	public KillAura() {
		super("KillAura", Keyboard.KEY_R, Category.COMBAT);
		this.timer = 0;
	}

	public void onEnable() {

	}

	public void onDisable() {
		
	}

	public void onUpdate(Event event) {
		if(event instanceof EventMotion) {
			
			EntityPlayer target = CombatUtils.getTarget(mc, RANGE + 1);	

			if(target != null) {
				float[] rot = RotationUtils.getRotation(mc.player, target);

				((EventMotion) event).setYaw(rot[0]);
				((EventMotion) event).setPitch(rot[1]);

				if(this.timer >= 20/14) {
					this.timer = 0;
					mc.playerController.attackEntity(mc.player, target);
					mc.player.swingArm(EnumHand.MAIN_HAND);
				}
				this.timer++;
			}

		}
	}

}
