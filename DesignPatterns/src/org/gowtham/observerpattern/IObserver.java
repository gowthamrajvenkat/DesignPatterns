package org.gowtham.observerpattern;

public interface IObserver {
	public <T> void update(T val);
}
