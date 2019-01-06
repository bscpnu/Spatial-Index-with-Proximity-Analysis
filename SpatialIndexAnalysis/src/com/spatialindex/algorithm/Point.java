/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spatialindex.graph;

/**
 *
 * @author Imam Mustafa Kamal <imamkamal52@gmail.com>
 */
public class Point {

	public int x;
	public int y;
	public int value;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Point(int x, int y, int value) {
		this.x = x;
		this.y = y;
		this.value = value;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
	}
}
