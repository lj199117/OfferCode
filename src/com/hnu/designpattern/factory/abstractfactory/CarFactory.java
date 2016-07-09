package com.hnu.designpattern.factory.abstractfactory;

public class CarFactory extends VehicleFactory{
	public Moveable create() {
		return new Car();
	}
}
