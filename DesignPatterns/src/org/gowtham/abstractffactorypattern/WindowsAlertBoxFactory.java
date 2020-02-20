package org.gowtham.abstractffactorypattern;

public class WindowsAlertBoxFactory implements AbstractAlertBoxFactory {

	@Override
	public IAlertBox getAlertBox() {
		
		return new WinAlertBox();
	}

	@Override
	public IButton getButton() {
		
		return new WinButton();
	}

}
