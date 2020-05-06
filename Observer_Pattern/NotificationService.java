package com.practice.observer;

import java.util.ArrayList;

public class NotificationService implements INotificationService {

	private ArrayList<INotificationObserver> observers;

	public NotificationService(ArrayList<INotificationObserver> observers) {
		super();
		this.observers = observers;
	}

	public NotificationService() {
		// TODO Auto-generated constructor stub
		this.observers = new ArrayList<INotificationObserver>();
	}

	@Override
	public void AddSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		this.observers.add(observer);
		for (INotificationObserver ob : observers) {
			System.out.println(ob);
		}
	}

	@Override
	public void RemoveSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		this.observers.remove(observer);
		for (INotificationObserver ob : observers) {
			System.out.println(ob);
		}

	}

	@Override
	public void NotifySubscriber() {
		// TODO Auto-generated method stub
		for (INotificationObserver ob : observers) {
			ob.OnServerDown();
		}

	}

}
