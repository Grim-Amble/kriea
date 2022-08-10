package me.valrod.client.ui.clickgui;

import java.awt.Color;

import me.valrod.client.Client;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.init.SoundEvents;

public class ClickGuiButton extends Gui
{
	protected int width;
	protected int height;
	public int xPosition;
	public int yPosition;
	public String displayString;
	protected boolean hovered;

	public ClickGuiButton(int x, int y, String buttonText)
	{
		this(x, y, 200, 20, buttonText);
	}

	public ClickGuiButton(int x, int y, int widthIn, int heightIn, String buttonText)
	{
		this.width = 200;
		this.height = 20;
		this.xPosition = x;
		this.yPosition = y;
		this.width = widthIn;
		this.height = heightIn;
		this.displayString = buttonText;
	}

	protected int getHoverState(boolean mouseOver)
	{
		int i = 1;

		if (mouseOver)
		{
			i = 2;
		}

		return i;
	}

	public void draw(Minecraft mc, int mouseX, int mouseY, float pt)
	{
		FontRenderer fontrenderer = mc.fontRendererObj;
		Gui.drawRect(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + this.height, new Color(0, 0, 0, 150).getRGB());
		this.hovered = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
		int i = this.getHoverState(this.hovered);
		this.mouseDragged(mc, mouseX, mouseY);
		int j = 14737632;

		if (this.hovered)
		{
			j = 16777120;
		}
		
		if(Client.getModuleManager().isModuleOn(getDisplayText())) {
			j = new Color(0, 255, 30).getRGB();
		}

		this.drawCenteredString(fontrenderer, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, j);
	}

	protected void mouseDragged(Minecraft mc, int mouseX, int mouseY)
	{
	}

	public void mouseReleased(int mouseX, int mouseY)
	{
	}

	public boolean mousePressed(Minecraft mc, int mouseX, int mouseY)
	{
		return mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
	}

	public boolean isMouseOver()
	{
		return this.hovered;
	}

	public void drawButtonForegroundLayer(int mouseX, int mouseY)
	{
	}

	public void playPressSound(SoundHandler soundHandlerIn)
	{
		soundHandlerIn.playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0F));
	}

	public int getButtonWidth()
	{
		return this.width;
	}

	public String getDisplayText() {
		return this.displayString;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
}
