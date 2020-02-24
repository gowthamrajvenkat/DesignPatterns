package org.gowtham.commandpattern.commands;

import org.gowtham.commandpattern.Light;

public class LightDimCommand implements ICommand {

	private Light light;
	
	public LightDimCommand(Light light)
	{
		this.light = light;
	}	
	@Override
	public boolean execute() {
		return this.light.turnDim();
	}

	@Override
	public boolean unexecute() {
		return this.light.turnBright();
	}

}
