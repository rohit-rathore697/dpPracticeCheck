package com.practice.observer;

public class SteveObserver implements INotificationObserver {

	@Override
	public void OnServerDown() {
		// TODO Auto-generated method stub
		System.out.println(INotificationObserver.name);
	}

}
