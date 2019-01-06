/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spatialindex.graph;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

/**
 *
 * @author Imam Mustafa Kamal <imamkamal52@gmail.com>
 */
public class DrawGraph extends JPanel {
	public List<Point> fillCells;
	public List<Point> fillValues;

	private int n = 256;
	private int dimension;

	public DrawGraph() {
		fillCells = new ArrayList<Point>();
		fillValues = new ArrayList<Point>();
		this.n = n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getN() {
		return this.n;
	}

	@Override
	protected void paintComponent(Graphics g) {

		dimension = (int) Math.sqrt(n);
		super.paintComponent(g);
		for (Point fillCell : fillCells) {
			int cellX = 20 + (fillCell.x * 20);
			int cellY = 20 + (fillCell.y * 20);
			g.setColor(Color.CYAN);
			g.fillRect(cellX, cellY, 20, 20);
		}
		for (Point fillValue : fillValues) {
			int cellX = 20 + (fillValue.x * 20);
			int cellY = 40 + (fillValue.y * 20);
			g.setColor(Color.BLUE);
			g.drawString(String.valueOf(fillValue.value), cellX, cellY);
		}

		g.setColor(Color.BLACK);
		g.drawRect(20, 20, 20 * dimension, 20 * dimension);

		for (int i = 20; i <= 20 * dimension; i += 20)
			g.drawLine(i, 20, i, 20 * dimension + 20);

		for (int i = 20; i <= 20 * dimension; i += 20)
			g.drawLine(20, i, 20 * dimension + 20, i);
	}

	public void fillCell(int x, int y) {
		fillCells.add(new Point(x, y));
		repaint();
	}

	public void fillValue(int x, int y, int value) {
		fillValues.add(new Point(x, y, value));
	}
}
