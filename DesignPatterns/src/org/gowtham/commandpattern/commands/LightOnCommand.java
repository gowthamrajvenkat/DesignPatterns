package org.gowtham.commandpattern.commands;

import org.gowtham.commandpattern.Light;

public class LightOnCommand implements ICommand {

	private Light light;
	
	public LightOnCommand(Light light)
	{
		this.light = light;
	}
	
	@Override
	public boolean execute() {
		return this.light.turnOn();
	}

	@Override
	public boolean unexecute() {
		return this.light.turnOff();
	}

}
