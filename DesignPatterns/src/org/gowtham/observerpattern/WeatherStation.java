/**
 * 
 */
package org.gowtham.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

	private List<IObserver> observerList = new ArrayList<IObserver>();
	private int temperature;
	@Override
	public void add(IObserver obs) {
		
		this.observerList.add(obs);
	}

	@Override
	public void pushNotify() {
		if (this.observerList != null) {
		for(IObserver obs : this.observerList)
			obs.update(this.getTemperature());
		}
	}
	
	public int getTemperature() {
		return this.temperature;
	}
	
	public void setTemperature(int temp) {
		 this.temperature = temp;
		 pushNotify();
	}

}
