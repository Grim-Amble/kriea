package me.valrod.client.modules;

import me.valrod.client.events.Event;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.math.MathHelper;

public class Module implements Comparable<Module>{

	private String name;
	private int keyCode;
	private Category category;
	private boolean enabled;
	public Minecraft mc;
	
	public Module(String name, int keyCode, Category category) {
		super();
		this.name = name;
		this.keyCode = keyCode;
		this.category = category;
		this.mc = Minecraft.getMinecraft();
	}

	public int getKeyCode() {
		return keyCode;
	}

	public void setKeyCode(int keyCode) {
		this.keyCode = keyCode;
	}

	public String getName() {
		return name;
	}

	public Category getCategory() {
		return category;
	}
	

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public void toggle() {
		this.enabled = !this.enabled;
		if(this.enabled) {
			this.onEnable();
		}else {
			this.onDisable();
		}
	}
	
	public void onDisable() {
		
	}
	
	public void onEnable() {
		
	}
	
	public void onUpdate(Event event) {
		
	}

	@Override
	public String toString() {
		return "Module [name=" + name + ", keyCode=" + keyCode + ", category=" + category + "]";
	}

	@Override
	public int compareTo(Module o) {
		FontRenderer fr = this.mc.fontRendererObj;
		int len1 = fr.getStringWidth(getName());
		int len2 = fr.getStringWidth(o.getName());

		return MathHelper.clamp(len1 - len2, -1, 1);
	}
	
}
