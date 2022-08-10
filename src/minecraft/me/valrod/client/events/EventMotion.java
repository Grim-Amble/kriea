package me.valrod.client.events;

public class EventMotion extends Event{
	
	private double posX, posY, posZ, prevPosX, prevPosY, prevPosZ;
	private static float yaw;
	private static float pitch;
	private static float prevYaw, prevPitch;
	private boolean onGround, prevOnGround;
	
	public EventMotion(double posX, double posY, double posZ, float yaw, float pitch, float prevYaw, float prevPitch,
			boolean onGround) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.posZ = posZ;
		this.yaw = yaw;
		this.pitch = pitch;
		this.prevYaw = prevYaw;
		this.prevPitch = prevPitch;
		this.onGround = onGround;
	}

	public boolean isPrevOnGround() {
		return prevOnGround;
	}

	public void setPrevOnGround(boolean prevOnGround) {
		this.prevOnGround = prevOnGround;
	}


	public double getPrevPosX() {
		return prevPosX;
	}

	public void setPrevPosX(double prevPosX) {
		this.prevPosX = prevPosX;
	}

	public double getPrevPosY() {
		return prevPosY;
	}

	public void setPrevPosY(double prevPosY) {
		this.prevPosY = prevPosY;
	}

	public double getPrevPosZ() {
		return prevPosZ;
	}

	public void setPrevPosZ(double prevPosZ) {
		this.prevPosZ = prevPosZ;
	}

	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public double getPosZ() {
		return posZ;
	}

	public void setPosZ(double posZ) {
		this.posZ = posZ;
	}

	public static float getYaw() {
		return yaw;
	}

	public void setYaw(float yaw) {
		this.yaw = yaw;
	}

	public static float getPitch() {
		return pitch;
	}

	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	public static float getPrevYaw() {
		return prevYaw;
	}

	public void setPrevYaw(float prevYaw) {
		this.prevYaw = prevYaw;
	}

	public static float getPrevPitch() {
		return prevPitch;
	}

	public void setPrevPitch(float prevPitch) {
		this.prevPitch = prevPitch;
	}

	public boolean isOnGround() {
		return onGround;
	}

	public void setOnGround(boolean onGround) {
		this.onGround = onGround;
	}
	
}
