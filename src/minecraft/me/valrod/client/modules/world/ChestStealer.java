package me.valrod.client.modules.world;

import org.lwjgl.input.Keyboard;

import me.valrod.client.events.Event;
import me.valrod.client.events.EventUpdate;
import me.valrod.client.modules.Category;
import me.valrod.client.modules.Module;
import net.minecraft.inventory.ClickType;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;

public class ChestStealer extends Module{

	private int timer;

	public ChestStealer() {
		super("ChestStealer", Keyboard.KEY_P, Category.WORLD);
		this.timer = 0;
	}

	public void onEnable() {

	}

	public void onDisable() {

	}

	public void onUpdate(Event event) {
		if(event instanceof EventUpdate) {

			Container ctn = mc.player.openContainer;

			if(ctn != null) {
				if(ctn instanceof ContainerChest) {
					ContainerChest chest = (ContainerChest) ctn;

					for (int i = 0; i < 27; i++) {
						if(this.timer >= 20/2) {
							this.timer = 0;
							mc.playerController.windowClick(chest.windowId, i, 0, ClickType.QUICK_MOVE, mc.player);
						}
						this.timer++;
					}
				}
			}

		}
	}

}
