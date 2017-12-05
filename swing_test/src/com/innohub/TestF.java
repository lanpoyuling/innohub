package com.innohub;

import java.awt.Color;
import java.awt.Panel;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Administrator
 * 设置按钮组件的边框
 */
public class TestF {
	static final int WIDTH=300;
	static final int HEIGTH=200;
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(WIDTH, HEIGTH);
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);
  		
		JButton button_ok = new JButton("确定");
		JButton button_cancel = new JButton("取消");
		
		contentPane.add(button_ok);
		contentPane.add(button_cancel);
		
		//设置按钮边框
		button_ok.setBorder(BorderFactory.createLineBorder(Color.red));
		
		
	}

}
