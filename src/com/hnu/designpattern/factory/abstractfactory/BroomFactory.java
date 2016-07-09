package com.hnu.designpattern.factory.abstractfactory;

public class BroomFactory extends VehicleFactory{
	public Moveable create() {
		return new Broom();
	}
}
