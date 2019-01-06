package com.spatialindex.algorithm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

import com.spatialindex.graph.Point;

/**
 *
 * @author Imam Mustafa Kamal <imamkamal52@gmail.com>
 */
public class ColumnWise {

	List<Point> points = new ArrayList<Point>();

	public ColumnWise(int n) {
		int dimensions = (int) Math.sqrt(n);
		int check = 1;
		for (int i = 0; i < dimensions; i++) {
			if (check % 2 != 0) {
				for (int j = 0; j < dimensions; j++) {
					// System.out.print(i + "," +j+ " ");
					points.add(new Point(i, j));
				}
				// System.out.println();
			} else {
				for (int k = dimensions - 1; k >= 0; k--) {
					// System.out.print(i + "," +k +" ");
					points.add(new Point(i, k));
				}
				// System.out.println();
			}
			check++;
		}
	}

	public int getIndex(int x, int y) {
		int index = -1;
		for (int i = 0; i < points.size(); i++) {
			if (points.get(i).getX() == x && points.get(i).getY() == y) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int[] getCoordinate(int index) {
		int[] result = new int[2];
		result[0] = points.get(index).getX();
		// System.out.println(points.get(index).getX());
		result[1] = points.get(index).getY();
		// System.out.println(points.get(index).getY());
		return result;
	}
}
