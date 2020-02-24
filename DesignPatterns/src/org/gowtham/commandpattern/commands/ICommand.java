package org.gowtham.commandpattern.commands;

public interface ICommand {

	public boolean execute();
	public boolean unexecute();
}
