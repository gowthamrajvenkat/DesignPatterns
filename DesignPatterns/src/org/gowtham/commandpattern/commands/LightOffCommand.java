package org.gowtham.commandpattern.commands;

import org.gowtham.commandpattern.Light;

public class LightOffCommand implements ICommand {

	private Light light;
	
	public LightOffCommand(Light light)
	{
		this.light = light;
	}
	@Override
	public boolean execute() {
		return this.light.turnOff();
	}

	@Override
	public boolean unexecute() {
		return this.light.turnOn();
	}

}
