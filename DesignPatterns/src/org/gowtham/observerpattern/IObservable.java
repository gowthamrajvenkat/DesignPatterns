package org.gowtham.observerpattern;

public interface IObservable {
	
	public void add(IObserver obs);
	public void pushNotify();
}
