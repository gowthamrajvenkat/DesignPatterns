package org.gowtham.commandpattern;

import java.util.ArrayDeque;
import java.util.Deque;

import org.gowtham.commandpattern.commands.ICommand;

public class Invoker {
	
	private ICommand turnOn;
	private ICommand turnOff;
	private ICommand turnBright;
	private ICommand turnDim;
	
	private Deque<ICommand> cmdStack = new ArrayDeque<ICommand>();
	
	public Invoker(ICommand on, ICommand off, ICommand bright, ICommand dim)
	{
		this.turnOn = on;
		this.turnOff = off;
		this.turnBright = bright;
		this.turnDim = dim;
	}
	
	public void on()
	{
		if (this.turnOn.execute())
			cmdStack.push(turnOn);
	}
	
	public void off()
	{
		if(this.turnOff.execute())
			cmdStack.push(turnOff);
	}
	
	public void bright()
	{
		if(this.turnBright.execute())
			cmdStack.push(turnBright);
	}
	
	public void dim()
	{
		if(this.turnDim.execute())
			cmdStack.push(turnDim);
	}
	
	public void undo()
	{
		ICommand lastCmd = cmdStack.peek();
		if(lastCmd != null)
		{
			if(lastCmd.unexecute())
				cmdStack.pop();
		}
	}

}
