/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spatialindex.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.spatialindex.graph.DrawGraph;
import com.spatialindex.graph.GraphGenerator;
import com.spatialindex.graph.Point;

/**
 *
 * @author Imam Mustafa Kamal <imamkamal52@gmail.com>
 */
public class Main extends javax.swing.JFrame {

	/**
	 * Creates new form Main
	 */
	public Main() {
		initComponents();
		setLocationRelativeTo(null);
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		ArrayList<Point> point = new ArrayList<Point>();
		CalculateDistance dist = new CalculateDistance();

		DrawGraph gridCW = new DrawGraph();
		DrawGraph gridHC = new DrawGraph();
		DrawGraph gridZO = new DrawGraph();
		gridCW.setSize(360, 360);
		gridHC.setSize(360, 360);
		gridZO.setSize(360, 360);
		gridCW.setAlignmentX(CENTER_ALIGNMENT);
		gridCW.setAlignmentY(CENTER_ALIGNMENT);
		GraphGenerator gG = new GraphGenerator();
		gG.generateGraph(gridCW, gridHC, gridZO);

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jPanelGrid1 = new javax.swing.JPanel();
		jPanelGrid2 = new javax.swing.JPanel();
		jPanelGrid3 = new javax.swing.JPanel();
		jPanel7 = new javax.swing.JPanel();
		jPanel8 = new javax.swing.JPanel();
		jPanel11 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		inputX2Coordinate = new javax.swing.JTextField();
		inputY2Coordinate = new javax.swing.JTextField();
		jButtonSubmit2Coordinate = new javax.swing.JButton();
		jButtonClear2Coordinate = new javax.swing.JButton();
		jPanel12 = new javax.swing.JPanel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabelPoint1 = new javax.swing.JLabel();
		jLabelPoint2 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jPanel17 = new javax.swing.JPanel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		inputEU2Coord = new javax.swing.JTextField();
		inputCW2Coord = new javax.swing.JTextField();
		inputHC2Coordinate = new javax.swing.JTextField();
		inputZO2Coord = new javax.swing.JTextField();
		jPanel15 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jPanel9 = new javax.swing.JPanel();
		jPanel13 = new javax.swing.JPanel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		inputXProx = new javax.swing.JTextField();
		inputYProx = new javax.swing.JTextField();
		jButtonSubmitProx = new javax.swing.JButton();
		jButtonClearProx = new javax.swing.JButton();
		jPanel14 = new javax.swing.JPanel();
		jPanel18 = new javax.swing.JPanel();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		inputEUProx = new javax.swing.JTextField();
		inputEuCW = new javax.swing.JTextField();
		inputHCProx = new javax.swing.JTextField();
		inputZOProx = new javax.swing.JTextField();
		jLabel18 = new javax.swing.JLabel();
		ValueXYProximity = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		jButtonCalcProx = new javax.swing.JButton();
		jPanel16 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jPanel10 = new javax.swing.JPanel();
		jPanel19 = new javax.swing.JPanel();
		jLabelBestMethod = new javax.swing.JLabel();
		jPanel20 = new javax.swing.JPanel();
		jLabel19 = new javax.swing.JLabel();
		jPanel21 = new javax.swing.JPanel();
		jComboBoxLevel = new javax.swing.JComboBox<>();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Spatial Index");
		setBackground(new java.awt.Color(153, 153, 153));

		jPanel1.setBackground(new java.awt.Color(204, 204, 204));
		jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jPanel2.setBackground(new java.awt.Color(153, 153, 153));
		jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jPanel2.setForeground(new java.awt.Color(204, 204, 204));

		jPanel3.setBackground(new java.awt.Color(204, 204, 204));
		jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel1.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
		jLabel1.setText("Column-Wise");

		jLabel2.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
		jLabel2.setText("Hilbert Curve");

		jLabel3.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
		jLabel3.setText("Z-Order");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(156, 156, 156)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(230, 230, 230)
						.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel3).addGap(172, 172, 172)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
								javax.swing.GroupLayout.PREFERRED_SIZE)));

		jPanelGrid1.setPreferredSize(new java.awt.Dimension(360, 360));
		jPanelGrid1.setBackground(new java.awt.Color(204, 204, 204));
		jPanelGrid1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jPanelGrid1.add(gridCW, BorderLayout.CENTER);
		javax.swing.GroupLayout jPanelGrid1Layout = new javax.swing.GroupLayout(jPanelGrid1);
		jPanelGrid1.setLayout(jPanelGrid1Layout);
		jPanelGrid1Layout.setHorizontalGroup(jPanelGrid1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 360, Short.MAX_VALUE));
		jPanelGrid1Layout.setVerticalGroup(jPanelGrid1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 414, Short.MAX_VALUE));

		jPanelGrid2.setPreferredSize(new java.awt.Dimension(360, 360));
		jPanelGrid2.setBackground(new java.awt.Color(204, 204, 204));
		jPanelGrid2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jPanelGrid2.add(gridHC, BorderLayout.CENTER);

		javax.swing.GroupLayout jPanelGrid2Layout = new javax.swing.GroupLayout(jPanelGrid2);
		jPanelGrid2.setLayout(jPanelGrid2Layout);
		jPanelGrid2Layout.setHorizontalGroup(jPanelGrid2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 360, Short.MAX_VALUE));
		jPanelGrid2Layout.setVerticalGroup(jPanelGrid2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));

		jPanelGrid3.setPreferredSize(new java.awt.Dimension(360, 360));
		jPanelGrid3.setBackground(new java.awt.Color(204, 204, 204));
		jPanelGrid3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jPanelGrid3.add(gridZO, BorderLayout.CENTER);

		javax.swing.GroupLayout jPanelGrid3Layout = new javax.swing.GroupLayout(jPanelGrid3);
		jPanelGrid3.setLayout(jPanelGrid3Layout);
		jPanelGrid3Layout.setHorizontalGroup(jPanelGrid3Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));
		jPanelGrid3Layout.setVerticalGroup(jPanelGrid3Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addComponent(jPanelGrid1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanelGrid2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanelGrid3, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanelGrid1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanelGrid2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanelGrid3, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));

		jPanel7.setBackground(new java.awt.Color(153, 153, 153));
		jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jPanel8.setBackground(new java.awt.Color(204, 204, 204));
		jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jPanel11.setBackground(new java.awt.Color(204, 204, 204));
		jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel6.setText("X");

		jLabel7.setText("Y");

		inputX2Coordinate.setName("inputX2Coordinate"); // NOI18N

		inputY2Coordinate.setName("inputY2Coordinate"); // NOI18N

		jButtonSubmit2Coordinate.setText("Submit");
		jButtonSubmit2Coordinate.setName("submitButton2Coordinate"); // NOI18N

		jButtonSubmit2Coordinate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = 0, y = 0;
				try {
					x = Integer.valueOf(inputX2Coordinate.getText());
					y = Integer.valueOf(inputY2Coordinate.getText());

					if (x > Math.sqrt(gridCW.getN()) - 1 || y > Math.sqrt(gridCW.getN() - 1)) {
						infoBox("X or Y values more than matrix dimension", "Wrong input");
					} else if (x < 0 || y < 0) {
						infoBox("X or Y values cannot be negative", "Wrong input");
					} else if (!point.isEmpty() && x == point.get(0).getX() && y == point.get(0).getY()) {
						infoBox("X or Y value are same", "Alert Menu");
					} else {
						point.add(new Point(x, y));
						// point.add(new Point(x,y));
						String xy1 = point.get(0).getX() + "," + point.get(0).getY();
						jLabelPoint1.setText(xy1);
						gG.fillPoint(gridCW, gridHC, gridZO, x, y);
						jButton1.setEnabled(false);

					}
				} catch (NumberFormatException ex) {
					infoBox("Your input is not numeric", "Wrong input");
				}

				if (point.size() == 2) {

					String xy2 = point.get(1).getX() + "," + point.get(1).getY();

					jLabelPoint2.setText(xy2);
					jButtonSubmit2Coordinate.setEnabled(false);
					jButton1.setEnabled(true);
				}

				inputX2Coordinate.setText("");
				inputY2Coordinate.setText("");

				inputXProx.setEnabled(false);
				inputYProx.setEnabled(false);
				jButtonSubmitProx.setEnabled(false);
				jButtonCalcProx.setEnabled(false);
				jButtonClearProx.setEnabled(false);

			}
		});

		jButtonClear2Coordinate.setText("Clear");
		jButtonClear2Coordinate.setName("clearButton2Coordinate"); // NOI18N
		jButtonClear2Coordinate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputX2Coordinate.setText("");
				inputY2Coordinate.setText("");
				jLabelPoint1.setText("Null");
				jLabelPoint2.setText("Null");
				inputEU2Coord.setText("");
				inputCW2Coord.setText("");
				inputHC2Coordinate.setText("");
				inputZO2Coord.setText("");
				gridCW.fillCells.clear();
				gridHC.fillCells.clear();
				gridZO.fillCells.clear();
				gridCW.revalidate();
				gridHC.revalidate();
				gridZO.revalidate();

				gridCW.updateUI();
				gridHC.updateUI();
				gridZO.updateUI();
				point.clear();
				jButton1.setEnabled(false);
				jButtonSubmit2Coordinate.setEnabled(true);
				jLabelBestMethod.setText("");

				inputXProx.setEnabled(true);
				inputYProx.setEnabled(true);
				jButtonSubmitProx.setEnabled(true);
				jButtonClearProx.setEnabled(true);
			}
		});

		javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
		jPanel11.setLayout(jPanel11Layout);
		jPanel11Layout
				.setHorizontalGroup(
						jPanel11Layout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel11Layout.createSequentialGroup().addContainerGap()
										.addGroup(jPanel11Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel6).addComponent(jLabel7))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel11Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jButtonClear2Coordinate,
														javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
												.addGroup(jPanel11Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(jButtonSubmit2Coordinate,
																javax.swing.GroupLayout.DEFAULT_SIZE, 76,
																Short.MAX_VALUE)
														.addComponent(inputX2Coordinate)
														.addComponent(inputY2Coordinate)))
										.addContainerGap(23, Short.MAX_VALUE)));
		jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel11Layout.createSequentialGroup().addGap(18, 18, 18)
						.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(inputX2Coordinate,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel7).addComponent(inputY2Coordinate,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(11, 11, 11).addComponent(jButtonSubmit2Coordinate)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jButtonClear2Coordinate).addContainerGap(50, Short.MAX_VALUE)));

		jPanel12.setBackground(new java.awt.Color(204, 204, 204));
		jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel8.setText("Point 1");

		jLabel9.setText("Point 2");

		jLabel10.setText(":");

		jLabel11.setText(":");

		jLabelPoint1.setText("Null");

		jLabelPoint2.setText("Null");

		jButton1.setText("Calc. Distance");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double[] xy = new double[2];
				double[] xy2 = new double[2];
				CalculateDistance dist = new CalculateDistance();

				xy[0] = point.get(0).getX();
				xy[1] = point.get(0).getY();
				xy2[0] = point.get(1).getX();
				xy2[1] = point.get(1).getY();
				String EUCresult = String.format("%.2f", dist.euclideanDistance(xy, xy2));
				inputEU2Coord.setText(EUCresult);
				int CWResult;
				CWResult = Math.abs(gG.getcW().getIndex((int) xy[0], (int) xy[1])
						- gG.getcW().getIndex((int) xy2[0], (int) xy2[1]));
				inputCW2Coord.setText(String.valueOf(CWResult));
				int HCResult;
				HCResult = Math.abs((gG.gethC().index((long) xy[0], (long) xy[1]).intValue())
						- (gG.gethC().index((long) xy2[0], (long) xy2[1]).intValue()));
				inputHC2Coordinate.setText(String.valueOf(HCResult));
				long ZOResult;

				ZOResult = Math.abs(gG.getzO().getIndex((int) xy[0], (int) xy[1])
						- gG.getzO().getIndex((int) xy2[0], (int) xy2[1]));
				inputZO2Coord.setText(String.valueOf(ZOResult));

			}
		});

		jPanel17.setBackground(new java.awt.Color(204, 204, 204));
		jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel12.setText("Euclidean");

		jLabel13.setText("Column-Wise");

		jLabel14.setText("Hilbert Curve");

		jLabel15.setText("Z-Order");

		javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
		jPanel17.setLayout(jPanel17Layout);
		jPanel17Layout
				.setHorizontalGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel13).addComponent(jLabel12).addComponent(jLabel14)
										.addComponent(jLabel15))
								.addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout
												.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel17Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(inputCW2Coord,
																javax.swing.GroupLayout.PREFERRED_SIZE, 92,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																inputEU2Coord, javax.swing.GroupLayout.PREFERRED_SIZE,
																92, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(jPanel17Layout.createSequentialGroup().addGap(31, 31, 31)
												.addGroup(jPanel17Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(inputHC2Coordinate).addComponent(inputZO2Coord,
																javax.swing.GroupLayout.DEFAULT_SIZE, 92,
																Short.MAX_VALUE))))
								.addGap(43, 43, 43)));
		jPanel17Layout.setVerticalGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel17Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel12).addComponent(inputEU2Coord,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel13).addComponent(inputCW2Coord,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(6, 6, 6)
						.addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel14).addComponent(inputHC2Coordinate,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(inputZO2Coord, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel15))
						.addContainerGap(19, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
		jPanel12.setLayout(jPanel12Layout);
		jPanel12Layout
				.setHorizontalGroup(
						jPanel12Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING).addGroup(jPanel12Layout
										.createSequentialGroup().addContainerGap()
										.addGroup(jPanel12Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(jPanel12Layout.createSequentialGroup().addGroup(jPanel12Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(jPanel12Layout.createSequentialGroup()
																.addComponent(jLabel9).addGap(18, 18, 18)
																.addComponent(jLabel11)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(jLabelPoint2,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE))
														.addGroup(jPanel12Layout.createSequentialGroup()
																.addComponent(jLabel8).addGap(18, 18, 18)
																.addComponent(jLabel10)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(jLabelPoint1,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 28,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGap(18, 18, 18).addComponent(jButton1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
										.addContainerGap()));
		jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel12Layout.createSequentialGroup().addGroup(jPanel12Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel12Layout.createSequentialGroup().addGap(10, 10, 10)
								.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel10).addComponent(jLabelPoint1)
										.addGroup(jPanel12Layout.createSequentialGroup().addComponent(jLabel8)
												.addGap(10, 10, 10)))
								.addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel12Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel11).addComponent(jLabelPoint2))
										.addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel12Layout.createSequentialGroup().addContainerGap().addComponent(jButton1,
										javax.swing.GroupLayout.PREFERRED_SIZE, 40,
										javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		jPanel15.setBackground(new java.awt.Color(204, 204, 204));
		jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel4.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
		jLabel4.setText("Distance of 2 Points");

		javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
		jPanel15.setLayout(jPanel15Layout);
		jPanel15Layout.setHorizontalGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel15Layout.createSequentialGroup().addGap(128, 128, 128).addComponent(jLabel4)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel15Layout.setVerticalGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel15Layout.createSequentialGroup().addContainerGap().addComponent(jLabel4)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout.setHorizontalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel8Layout.createSequentialGroup().addContainerGap()
								.addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(jPanel8Layout.createSequentialGroup()
												.addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addContainerGap()));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		jPanel9.setBackground(new java.awt.Color(204, 204, 204));
		jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jPanel13.setBackground(new java.awt.Color(204, 204, 204));
		jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel16.setText("X");

		jLabel17.setText("Y");

		jButtonSubmitProx.setText("Submit");
		jButtonSubmitProx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = 0, y = 0;

				try {
					x = Integer.valueOf(inputXProx.getText());
					y = Integer.valueOf(inputYProx.getText());

					String xy = "";
					int i = 0;
					if (x > Math.sqrt(gridCW.getN()) - 1 || y > Math.sqrt(gridCW.getN() - 1)) {
						infoBox("X or Y values more than matrix dimension", "Wrong input");
					} else if (x < 0 || y < 0) {
						infoBox("X or Y values cannot be negative", "Wrong input");
					} else {
						point.addAll(dist.getProximityDistance(x, y, gridCW.getN()));
						// point.add(new Point(x,y));
						for (Point pot : point) {
							if(pot.getX() < gridCW.getN()){
								
							}
							gG.fillPoint(gridCW, gridHC, gridZO, pot.getX(), pot.getY());
							xy += "[" + point.get(i).getX() + "," + point.get(i).getY() + "], ";
							i++;
						}
						ValueXYProximity.setText(xy);
					}
				} catch (NumberFormatException ex) {
					infoBox("Your input is not numeric", "Wrong input");
				}

				jButtonSubmitProx.setEnabled(false);
				jButtonCalcProx.setEnabled(true);
				inputXProx.setText("");
				inputYProx.setText("");

				inputX2Coordinate.setEnabled(false);
				inputY2Coordinate.setEnabled(false);
				jButtonSubmit2Coordinate.setEnabled(false);
				jButton1.setEnabled(false);
				jButtonClear2Coordinate.setEnabled(false);
			}
		});

		jButtonClearProx.setText("Clear");
		jButtonClearProx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputXProx.setText("");
				inputYProx.setText("");
				ValueXYProximity.setText("Null");
				inputEUProx.setText("");
				inputEuCW.setText("");
				inputHCProx.setText("");
				inputZOProx.setText("");
				gridCW.fillCells.clear();
				gridHC.fillCells.clear();
				gridZO.fillCells.clear();
				gridCW.revalidate();
				gridHC.revalidate();
				gridZO.revalidate();

				gridCW.updateUI();
				gridHC.updateUI();
				gridZO.updateUI();
				point.clear();
				jButtonCalcProx.setEnabled(false);
				jButtonSubmitProx.setEnabled(true);

				jLabelBestMethod.setText("");

				inputX2Coordinate.setEnabled(true);
				inputY2Coordinate.setEnabled(true);
				jButtonSubmit2Coordinate.setEnabled(true);
				jButtonClear2Coordinate.setEnabled(true);
			}
		});

		javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
		jPanel13.setLayout(jPanel13Layout);
		jPanel13Layout.setHorizontalGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel13Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										jPanel13Layout.createSequentialGroup().addComponent(jLabel17)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(inputYProx))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										jPanel13Layout.createSequentialGroup()
												.addComponent(jLabel16)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(inputXProx))
								.addGroup(jPanel13Layout.createSequentialGroup().addGap(0, 12, Short.MAX_VALUE)
										.addGroup(jPanel13Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(jButtonSubmitProx, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(jButtonClearProx, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGap(21, 21, 21)));
		jPanel13Layout.setVerticalGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel13Layout.createSequentialGroup().addGap(16, 16, 16)
						.addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel16).addComponent(inputXProx, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel17).addComponent(inputYProx, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18).addComponent(jButtonSubmitProx).addGap(10, 10, 10)
						.addComponent(jButtonClearProx)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanel14.setBackground(new java.awt.Color(204, 204, 204));
		jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jPanel18.setBackground(new java.awt.Color(204, 204, 204));
		jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel20.setText("Euclidean");

		jLabel21.setText("Column-Wise");

		jLabel22.setText("Hilbert-Curve");

		jLabel23.setText("Z-Order");

		javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
		jPanel18.setLayout(jPanel18Layout);
		jPanel18Layout.setHorizontalGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel18Layout.createSequentialGroup().addGap(57, 57, 57)
						.addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel21).addComponent(jLabel23).addComponent(jLabel22)
								.addComponent(jLabel20))
						.addGap(29, 29, 29)
						.addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(inputEUProx, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
								.addComponent(inputEuCW).addComponent(inputHCProx).addComponent(inputZOProx))
						.addGap(86, 86, 86)));
		jPanel18Layout.setVerticalGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel18Layout.createSequentialGroup().addGap(22, 22, 22)
						.addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(inputEUProx, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel20))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(inputEuCW, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel21))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(inputHCProx, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel22))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(inputZOProx, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel23))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jLabel18.setText("Proximity Points");

		ValueXYProximity.setText("Null");

		jLabel24.setText(":");

		jButtonCalcProx.setText("Calc. Distance");
		jButtonCalcProx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double sumED = 0;
				int sumCW = 0;
				int sumHC = 0;
				long sumZO = 0;

				double[] xyp = new double[2];
				xyp[0] = point.get(0).getX();
				xyp[1] = point.get(0).getY();
				for (int i = 1; i < point.size(); i++) {

					double[] xyp2 = new double[2];
					xyp2[0] = point.get(i).getX();
					xyp2[1] = point.get(i).getY();
					sumED += dist.euclideanDistance(xyp, xyp2);
					sumCW += Math.abs(gG.getcW().getIndex((int) xyp[0], (int) xyp[1])
							- gG.getcW().getIndex((int) xyp2[0], (int) xyp2[1]));
					sumHC += Math.abs((gG.gethC().index((long) xyp[0], (long) xyp[1]).intValue())
							- (gG.gethC().index((long) xyp2[0], (long) xyp2[1]).intValue()));
					sumZO += Math.abs(gG.getzO().getIndex((int) xyp[0], (int) xyp[1])
							- gG.getzO().getIndex((int) xyp2[0], (int) xyp2[1]));
				}
				int sumMin = (int) Math.min(Math.min(sumCW, sumHC), sumZO);
				String labelMin = "";
				if (sumMin == sumCW)
					labelMin += "Column-Wise ";
				if (sumMin == sumHC)
					labelMin += "Hilbert Curve ";
				if (sumMin == sumZO)
					labelMin += "Z-Order ";
				jLabelBestMethod.setText(labelMin);
				inputEUProx.setText(String.valueOf(sumED));
				inputEuCW.setText(String.valueOf(sumCW));
				inputHCProx.setText(String.valueOf(sumHC));
				inputZOProx.setText(String.valueOf(sumZO));
				System.out.println("SUM euclidiean : " + sumED);
				System.out.println("SUM CW : " + sumCW);
				System.out.println("SUM HC : " + sumHC);
				System.out.println("SUM ZO : " + sumZO);

			}
		});

		javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
		jPanel14.setLayout(jPanel14Layout);
		jPanel14Layout.setHorizontalGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel14Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jButtonCalcProx, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(jPanel14Layout.createSequentialGroup().addComponent(jLabel18)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel24)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(ValueXYProximity, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel14Layout.setVerticalGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(ValueXYProximity)
								.addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel18).addComponent(jLabel24)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jButtonCalcProx)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		jPanel16.setBackground(new java.awt.Color(204, 204, 204));
		jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel5.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
		jLabel5.setText("Proximity Distance");

		javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
		jPanel16.setLayout(jPanel16Layout);
		jPanel16Layout.setHorizontalGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel16Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel5).addGap(189, 189, 189)));
		jPanel16Layout.setVerticalGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel16Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel5).addContainerGap()));

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel9Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				.addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel9Layout.createSequentialGroup().addGap(6, 6, 6)
								.addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap()));

		jPanel10.setBackground(new java.awt.Color(204, 204, 204));
		jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jPanel19.setBackground(new java.awt.Color(204, 204, 204));
		jPanel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabelBestMethod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabelBestMethod.setText("");
        jLabelBestMethod.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBestMethod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBestMethod, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

		jPanel20.setBackground(new java.awt.Color(204, 204, 204));
		jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jLabel19.setFont(new java.awt.Font("±¼¸²", 1, 12)); // NOI18N
		jLabel19.setText("Best Method");

		javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
		jPanel20.setLayout(jPanel20Layout);
		jPanel20Layout.setHorizontalGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel20Layout
						.createSequentialGroup().addGap(21, 21, 21).addComponent(jLabel19,
								javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(21, Short.MAX_VALUE)));
		jPanel20Layout.setVerticalGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel20Layout.createSequentialGroup().addContainerGap().addComponent(jLabel19)
						.addContainerGap(14, Short.MAX_VALUE)));

		jPanel21.setBackground(new java.awt.Color(204, 204, 204));
		jPanel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jComboBoxLevel.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Level 4", "Level 3", "Level 2", "Level 1" }));

		jComboBoxLevel.addItemListener(new ItemListener() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see java.awt.event.ItemListener#itemStateChanged(java.awt.event.
			 * ItemEvent)
			 */
			public void itemStateChanged(ItemEvent ie) {
				String str = (String) jComboBoxLevel.getSelectedItem();
				if (str == "Level 1") {
					gridCW.setN(4);
					gridHC.setN(4);
					gridZO.setN(4);
				} else if (str == "Level 2") {
					gridCW.setN(16);
					gridHC.setN(16);
					gridZO.setN(16);
				} else if (str == "Level 3") {
					gridCW.setN(64);
					gridHC.setN(64);
					gridZO.setN(64);
				} else if (str == "Level 4") {

					gridCW.setN(256);
					gridHC.setN(256);
					gridZO.setN(256);
				}
				gridCW.fillCells.clear();
				gridCW.fillValues.clear();
				gridHC.fillCells.clear();
				gridHC.fillValues.clear();
				gridZO.fillCells.clear();
				gridZO.fillValues.clear();

				gG.generateGraph(gridCW, gridHC, gridZO);

				gridCW.revalidate();
				gridHC.revalidate();
				gridZO.revalidate();

				gridCW.updateUI();
				gridHC.updateUI();
				gridZO.updateUI();

				inputX2Coordinate.setText("");
				inputY2Coordinate.setText("");
				jLabelPoint1.setText("Null");
				jLabelPoint2.setText("Null");
				inputEU2Coord.setText("");
				inputCW2Coord.setText("");
				inputHC2Coordinate.setText("");
				inputZO2Coord.setText("");

				inputXProx.setText("");
				inputYProx.setText("");
				inputEUProx.setText("");
				inputEuCW.setText("");
				inputHCProx.setText("");
				inputZOProx.setText("");
				jButtonCalcProx.setEnabled(false);
				jButtonSubmitProx.setEnabled(true);
				jButtonSubmit2Coordinate.setEnabled(true);
				jButton1.setEnabled(false);
				jLabelBestMethod.setText("");

				inputX2Coordinate.setEnabled(true);
				inputY2Coordinate.setEnabled(true);
				inputXProx.setEnabled(true);
				inputYProx.setEnabled(true);
				jButtonClear2Coordinate.setEnabled(true);
				jButtonClearProx.setEnabled(true);
				jButtonSubmit2Coordinate.setEnabled(true);
				jButtonSubmitProx.setEnabled(true);
				ValueXYProximity.setText("");

				point.clear();
			}
		});

		javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
		jPanel21.setLayout(jPanel21Layout);
		jPanel21Layout.setHorizontalGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel21Layout.createSequentialGroup().addContainerGap()
						.addComponent(jComboBoxLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel21Layout.setVerticalGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel21Layout.createSequentialGroup().addContainerGap()
						.addComponent(jComboBoxLevel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout.setHorizontalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		jPanel10Layout.setVerticalGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel10Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel7Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jPanel1,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}// </editor-fold>

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JLabel ValueXYProximity;
	private javax.swing.JTextField inputCW2Coord;
	private javax.swing.JTextField inputEU2Coord;
	private javax.swing.JTextField inputEUProx;
	private javax.swing.JTextField inputEuCW;
	private javax.swing.JTextField inputHC2Coordinate;
	private javax.swing.JTextField inputHCProx;
	private javax.swing.JTextField inputX2Coordinate;
	private javax.swing.JTextField inputXProx;
	private javax.swing.JTextField inputY2Coordinate;
	private javax.swing.JTextField inputYProx;
	private javax.swing.JTextField inputZO2Coord;
	private javax.swing.JTextField inputZOProx;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButtonCalcProx;
	private javax.swing.JButton jButtonClear2Coordinate;
	private javax.swing.JButton jButtonClearProx;
	private javax.swing.JButton jButtonSubmit2Coordinate;
	private javax.swing.JButton jButtonSubmitProx;
	private javax.swing.JComboBox<String> jComboBoxLevel;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel jLabelBestMethod;
	private javax.swing.JLabel jLabelPoint1;
	private javax.swing.JLabel jLabelPoint2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel11;
	private javax.swing.JPanel jPanel12;
	private javax.swing.JPanel jPanel13;
	private javax.swing.JPanel jPanel14;
	private javax.swing.JPanel jPanel15;
	private javax.swing.JPanel jPanel16;
	private javax.swing.JPanel jPanel17;
	private javax.swing.JPanel jPanel18;
	private javax.swing.JPanel jPanel19;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel20;
	private javax.swing.JPanel jPanel21;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JPanel jPanelGrid1;
	private javax.swing.JPanel jPanelGrid2;
	private javax.swing.JPanel jPanelGrid3;

	// End of variables declaration
	public static void infoBox(String infoMessage, String titleBar) {
		JOptionPane.showMessageDialog(null, infoMessage, "Warning : " + titleBar, JOptionPane.INFORMATION_MESSAGE);
	}
}
