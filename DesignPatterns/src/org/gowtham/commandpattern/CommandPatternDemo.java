package org.gowtham.commandpattern;

import org.gowtham.commandpattern.commands.LightBrightCommand;
import org.gowtham.commandpattern.commands.LightDimCommand;
import org.gowtham.commandpattern.commands.LightOffCommand;
import org.gowtham.commandpattern.commands.LightOnCommand;

public class CommandPatternDemo {

	public static void main(String[] args) {
		
		Light light = new Light();
		Invoker invoke = new Invoker(
				new LightOnCommand(light),
				new LightOffCommand(light),
				new LightBrightCommand(light),
				new LightDimCommand(light)
				);
		System.out.println("Initial state: \n" + light.lightState());
		invoke.on(); System.out.println(light.lightState());
		invoke.bright(); System.out.println(light.lightState());
		invoke.dim(); System.out.println(light.lightState());
		invoke.off(); System.out.println(light.lightState());
		invoke.off(); System.out.println(light.lightState());
		invoke.bright(); System.out.println(light.lightState());
		invoke.dim(); System.out.println(light.lightState());
		
		System.out.println("undoing..");
		invoke.undo(); System.out.println(light.lightState());
		invoke.undo(); System.out.println(light.lightState());
		invoke.undo(); System.out.println(light.lightState());
		invoke.undo(); System.out.println(light.lightState());
		
		
		
	}

}
