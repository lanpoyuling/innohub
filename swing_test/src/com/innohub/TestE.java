package com.innohub;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Administrator
 * 为组件添加工具提示功能
 */
public class TestE {
	static final int WIDTH=300;
	static final int HEIGTH=200;
	public static void main(String[] args) {
		JFrame jf = new JFrame("添加内容面板测试程序");
		jf.setSize(WIDTH, HEIGTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		JPanel panel = new JPanel();
		jf.setContentPane(panel);
		
		JButton button_ok = new JButton("确定");
		JButton button_cancel = new JButton("取消");
		
		panel.add(button_ok);
		panel.add(button_cancel);
		
		//按钮组件的工具提示功能
		button_ok.setToolTipText("这个按钮是一个确定按钮");
		button_cancel.setToolTipText("这个按钮是一个取消按钮");
	}

}
