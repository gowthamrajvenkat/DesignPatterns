package org.gowtham.commandpattern.commands;

import org.gowtham.commandpattern.Light;

public class LightBrightCommand implements ICommand {

	private Light light;
	
	public LightBrightCommand(Light light)
	{
		this.light = light;
	}
	@Override
	public boolean execute() {
		return this.light.turnBright();
	}

	@Override
	public boolean unexecute() {
		return this.light.turnDim();
	}

}
