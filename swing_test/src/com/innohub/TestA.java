package com.innohub;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Administrator
 * 在顶层容器中添加内容面板
 */
public class TestA {

	public static void main(String[] args) {
		 
		JFrame jFrame = new JFrame("测试窗口");
		jFrame.setVisible(true);
		
		JPanel jPanel = new  JPanel();
		jFrame.setContentPane(jPanel);
		
		JButton jButton = new JButton("测试按钮");
		jPanel.add(jButton);
		
		

	}

}
