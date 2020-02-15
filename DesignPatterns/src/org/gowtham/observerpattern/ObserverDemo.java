package org.gowtham.observerpattern;

public class ObserverDemo {

	public static void main(String[] args) {
		
		WeatherStation station = new WeatherStation();
		station.setTemperature(100);
		PhoneDisplay pd = new PhoneDisplay();
		WindowDisplay wd = new WindowDisplay();
		station.add(pd);
		station.add(wd);
		station.setTemperature(101);
		pd.display();
		wd.display();
		
		station.setTemperature(102);
		pd.display();
		wd.display();
		
		station.setTemperature(103);
		pd.display();
		wd.display();
	}

}
