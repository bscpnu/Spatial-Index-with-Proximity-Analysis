/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spatialindex.graph;

import static java.lang.Math.toIntExact;

import java.math.BigInteger;

import com.spatialindex.algorithm.ColumnWise;
import com.spatialindex.algorithm.HilbertCurve;
import com.spatialindex.algorithm.ZOrder;

/**
 *
 * @author Imam Mustafa Kamal <imamkamal52@gmail.com>
 */
public class GraphGenerator {

	private ColumnWise cW;
	private HilbertCurve hC;
	private ZOrder zO;

	public ColumnWise getcW() {
		return cW;
	}

	public void setcW(ColumnWise cW) {
		this.cW = cW;
	}

	public HilbertCurve gethC() {
		return hC;
	}

	public void sethC(HilbertCurve hC) {
		this.hC = hC;
	}

	public ZOrder getzO() {
		return zO;
	}

	public void setzO(ZOrder zO) {
		this.zO = zO;
	}

	public void generateGraph(DrawGraph grid1, DrawGraph grid2, DrawGraph grid3) {
		this.cW = new ColumnWise(grid1.getN());
		for (int i = 0; i < grid1.getN(); i++) {
			int[] xy = this.cW.getCoordinate(i);

			grid1.fillValue((xy[0]), (xy[1]), i);
			// System.out.println(i + "\t" +xy[0]+","+xy[1]);
		}
		int bits = 4;
		this.hC = HilbertCurve.bits(bits).dimensions(2);
		for (int i = 0; i < grid2.getN(); i++) {
			// int[] xy = a.getCoordinate(i);
			long[] xy = this.hC.point(BigInteger.valueOf(i));
			grid2.fillValue(toIntExact(xy[0]), toIntExact(xy[1]), i);
			// System.out.println(i + "\t" +xy[0]+","+xy[1]);
		}

		this.zO = new ZOrder();
		for (int i = 0; i < grid3.getN(); i++) {
			int[] xy = this.zO.getCoordinate(i);

			grid3.fillValue((xy[0]), (xy[1]), i);
			//System.out.println(i + "\t" + xy[0] + "," + xy[1]);
		}
	}

	public void fillPoint(DrawGraph grid1, DrawGraph grid2, DrawGraph grid3, int x, int y) {
		grid1.fillCell(x, y);
		grid2.fillCell(x, y);
		grid3.fillCell(x, y);
	}
}
