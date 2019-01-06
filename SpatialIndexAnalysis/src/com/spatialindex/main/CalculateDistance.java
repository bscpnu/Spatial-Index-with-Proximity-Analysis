package com.spatialindex.main;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.spatialindex.graph.Point;
/**
 *
 * @author Imam Mustafa Kamal <imamkamal52@gmail.com>
 */
public class CalculateDistance {

	public double euclideanDistance(double[] xy, double[] xy2) {
		double[] xy3 = new double[2];
		if (xy[0] == xy2[0] || xy[1] == xy2[1]) {
			return calcFlatDistance(xy, xy2);
		} else {
			xy3[0] = xy[0];
			xy3[1] = xy2[1];
			return calcDiagonalDistance(xy, xy3, xy2);
		}
	}

	public double calcFlatDistance(double[] xy, double[] xy2) {
		double result;
		if (xy[0] == xy2[0]) {
			result = Math.abs(xy[1] - xy2[1]);
		} else if (xy[1] == xy2[1]) {
			result = Math.abs(xy[0] - xy2[0]);
		} else {
			result = 0.0;
		}
		return result;
	}

	public double calcDiagonalDistance(double[] xy, double[] xy2, double[] xy3) {
		double result;
		double a = calcFlatDistance(xy, xy2);
		double b = calcFlatDistance(xy2, xy3);

		result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return result;
	}
	public ArrayList<Point> getProximityDistance(int x, int y, int level){
		int n = (int) Math.sqrt(level);
		ArrayList<Point> point = new ArrayList<Point>();
		point.add(new Point(x,y));
			if(y < n-1){
				point.add(new Point(x,y+1));
			}if(y > 0){
				point.add(new Point(x,y-1));
			}if(x < n-1){
				point.add(new Point(x+1,y));
			}if(x > 0){
				point.add(new Point(x-1,y));
			}
		return point;
	}

}
