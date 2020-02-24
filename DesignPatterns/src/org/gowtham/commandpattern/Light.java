package org.gowtham.commandpattern;

public class Light {
	
	private boolean isOn;
	private int brightness;
	
	public Light()
	{
		this.isOn = false;
		this.brightness = 0;
	}
	
	public boolean turnOn()
	{
		boolean isExecuted = false;
		if(!this.isOn) {
			this.isOn = true;
			this.brightness = 1;
			isExecuted = true;
		}
		return isExecuted;
	}
	
	public boolean turnOff()
	{
		boolean isExecuted = false;
		if(this.isOn)
		{
			this.isOn = false;
			this.brightness = 0;
			isExecuted = true;
		}
		return isExecuted;
	}
	
	public boolean turnBright()
	{
		boolean isExecuted = false;
		if (this.isOn)
		{
			this.brightness++;
			isExecuted = true;
		}
		return isExecuted;		
	}
	
	public boolean turnDim()
	{
		boolean isExecuted = false;
		if (this.isOn)
		{
			this.brightness--;
			isExecuted = true;
		}
		return isExecuted;	
	}
	
	public String lightState()
	{
		String isOn = this.isOn?"On":"Off";
		
		return "Light is " + isOn + " and brightness level is " + this.brightness;
	}
	

}
