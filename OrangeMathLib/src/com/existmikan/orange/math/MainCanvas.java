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
		drawSine(g);
	}

	private void drawSine(Graphics g) {
		for (int i = 0; i < 360; i++) {
			float degree = i;
			float radian = (float) (degree * Math.PI / 180);
			float s = (float) Math.sin(radian);
			int x = 100 + i;
			int y = 200 - (int) (s * 100);
			s /= 2;
			int hy = 200 - (int) (s * 100);
			g.drawLine(x, y, x, y);
			g.drawLine(x, hy, x, hy);
		}
	}

}
