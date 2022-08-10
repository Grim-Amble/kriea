package me.valrod.client.ui;

import java.awt.Color;

import me.valrod.client.Client;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;

public class InGameOverlay {

	public static void render() {
		Minecraft mc = Minecraft.getMinecraft();
		FontRenderer fr = mc.fontRendererObj;

		int max = Client.getModuleManager().getEnabledModules().length;
		for (int i = 0; i < max; i++) {
			try {
				me.valrod.client.modules.Module mod = Client.getModuleManager().getEnabledModules()[max - i - 1];

				int x = mc.displayWidth/2 - 5;
				int y = ((fr.FONT_HEIGHT+2) * i) + 2;

				Gui.drawRect(mc.displayWidth/2, y-2, mc.displayWidth/2 - fr.getStringWidth(mod.getName()) - 8, y + fr.FONT_HEIGHT, new Color(0, 0, 0, 150).getRGB());
				Gui.drawRect(mc.displayWidth/2, y-2, mc.displayWidth/2 - 3, y + fr.FONT_HEIGHT, Color.RED.getRGB());
				fr.drawString(mod.getName(), x - fr.getStringWidth(mod.getName()), y, Color.RED.getRGB());

			} catch (Exception e) {
				e.printStackTrace();
			}}
	}

}
