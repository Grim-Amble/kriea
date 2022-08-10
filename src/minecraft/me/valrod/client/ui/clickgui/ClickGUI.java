package me.valrod.client.ui.clickgui;

import java.awt.Color;
import java.io.IOException;

import me.valrod.client.Client;
import me.valrod.client.modules.Category;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;

public class ClickGUI extends GuiScreen
{
    public void initGui()
    {
        this.buttonList.clear();
        int buttonW = 110;
        int buttonH = 15;
    	int marginTop = 20;
    	int marginLeft = mc.displayWidth / 4 - (Category.values().length * buttonW) / 2;

        for (int i = 0; i < Category.values().length; i++) {
        	Category category = Category.values()[i];
        	
        	me.valrod.client.modules.Module[] modules = Client.getModuleManager().getModulesByCategory(category);
        	for (int j = 0; j < modules.length; j++) {
        		me.valrod.client.modules.Module module = modules[j];
				
        		this.clickGuiButton.add(new ClickGuiButton(marginLeft + (i * (buttonW + 10)), marginTop + (j * buttonH), buttonW, buttonH, module.getName()));
			}
		}
    }
    
    protected void keyTyped(char typedChar, int keyCode) throws IOException
    {
    	if(keyCode == 1) {
    		mc.displayGuiScreen(null);
    	}
    }

    protected void actionPerformed(ClickGuiButton button) throws IOException
    {
    	Client.getModuleManager().toggleModule(button.getDisplayText());
    }

    public void updateScreen()
    {
        super.updateScreen();
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks)
    {
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}
