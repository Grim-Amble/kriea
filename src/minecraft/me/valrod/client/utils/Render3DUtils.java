package me.valrod.client.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;

public class Render3DUtils {

	 public static void drawNameplate(FontRenderer fontRendererIn, Entity ent, double x, double y, double z, int verticalShift, float viewerYaw, float viewerPitch, boolean isThirdPersonFrontal)
	    {
	        GlStateManager.pushMatrix();
	        double dist = Minecraft.getMinecraft().player.getDistanceToEntity(ent) / 5;

	        GlStateManager.translate(x, y + 0.5f * dist/2, z);
	        GlStateManager.glNormal3f(0.0F, 1.0F, 0.0F);
	        GlStateManager.rotate(-viewerYaw, 0.0F, 1.0F, 0.0F);
	        GlStateManager.rotate((float)(isThirdPersonFrontal ? -1 : 1) * viewerPitch, 1.0F, 0.0F, 0.0F);
	        
	        GlStateManager.scale(-0.025F * dist, -0.025F * dist, 0.025F * dist);
	        GlStateManager.disableLighting();
	        GlStateManager.depthMask(false);
            GlStateManager.disableDepth();
	        GlStateManager.enableBlend();
	        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
	        int i = fontRendererIn.getStringWidth(ent.getName()) / 2;
	        GlStateManager.disableTexture2D();
	        Tessellator tessellator = Tessellator.getInstance();
	        BufferBuilder bufferbuilder = tessellator.getBuffer();
	        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
	        bufferbuilder.pos((double)(-i - 1), (double)(-1 + verticalShift), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
	        bufferbuilder.pos((double)(-i - 1), (double)(8 + verticalShift), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
	        bufferbuilder.pos((double)(i + 1), (double)(8 + verticalShift), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
	        bufferbuilder.pos((double)(i + 1), (double)(-1 + verticalShift), 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
	        tessellator.draw();
	        GlStateManager.enableTexture2D();

	        fontRendererIn.drawString(ent.getName(), -fontRendererIn.getStringWidth(ent.getName()) / 2, verticalShift, -1);
	        GlStateManager.enableLighting();
	        GlStateManager.disableBlend();
	        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
	        GlStateManager.popMatrix();
	    }
	
}
