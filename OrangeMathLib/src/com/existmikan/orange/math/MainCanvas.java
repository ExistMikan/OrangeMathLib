package com.existmikan.orange.math;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MainCanvas extends Canvas {

	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		setBackground(Color.lightGray);
		g.drawLine(40, 60, 100, 250);
	}

}
