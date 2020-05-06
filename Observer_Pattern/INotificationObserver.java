package com.practice.observer;

public interface INotificationObserver {
	String name = "Message has been received";

	public void OnServerDown();
}
