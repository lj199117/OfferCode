package com.hnu.designpattern.factory.abstractfactory;

public class PlaneFactory extends VehicleFactory{
	public Moveable create() {
		return new Plane();
	}
}
