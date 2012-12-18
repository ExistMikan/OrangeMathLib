package com.existmikan.orange.math;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		setTitle("Canvas_test");
		setBounds(0, 0, 900, 740);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		JPanel cp = new JPanel();
		cp.setLayout(null);
		add(cp);
		cp.setBounds(38, 20, 860, 600);
		MainCanvas canvas = new MainCanvas();
		cp.add(canvas);
		canvas.setBounds(0, 0, 860, 600);
		setVisible(true);
	}

}
