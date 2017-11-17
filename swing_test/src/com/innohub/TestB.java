package com.innohub;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Administrator
 * 在内容面板中添加普通组件
 */
public class TestB {

	static final int WIDTH=300;
	static final int HEIGTH=200;
	public static void main(String[] args) {
		JFrame jf = new JFrame("添加内容面板测试程序");
		jf.setSize(WIDTH, HEIGTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
		JPanel contentPane = new JPanel();
		jf.setContentPane(contentPane);
		
		//创建两个按钮组件
		JButton button_ok = new JButton("确定");
		JButton button_cancel = new JButton("取消");
		
		contentPane.add(button_ok);
		contentPane.add(button_cancel);
	}

}
