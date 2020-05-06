package com.practice.observer;

public class Main {
	public static void main(String[] args) {
		SteveObserver steve = new SteveObserver();
		JohnObserver john = new JohnObserver();
		NotificationService service = new NotificationService();
		service.AddSubscriber(john);
		service.AddSubscriber(steve);
		service.NotifySubscriber();
		service.RemoveSubscriber(steve);
	}

}
