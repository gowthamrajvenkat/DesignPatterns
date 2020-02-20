package org.gowtham.abstractffactorypattern;

public class IOSAlertBoxFactory implements AbstractAlertBoxFactory {

	@Override
	public IAlertBox getAlertBox() {
		
		return new IOSAlertBox();
	}

	@Override
	public IButton getButton() {
		
		return new IOSButton();
	}

}
