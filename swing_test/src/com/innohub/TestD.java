package com.innohub;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * @author Administrator
 * 顶层容器添加菜单栏，菜单空白添加基本组件
 */
public class TestD {
	static final int WIDTH=300;
	static final int HEIGTH=200;
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(WIDTH, HEIGTH);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("学生管理系统");
		
		JMenuBar menuBar = new JMenuBar();//添加菜单条组件
		jf.setJMenuBar(menuBar);//将菜单条添加到顶层容器中
		
		JMenu menu_file = new  JMenu("文件");
		JMenu menu_editor = new  JMenu("编辑");
		JMenu menu_view = new  JMenu("视图");
		JMenu menu_help = new  JMenu("帮助");
		
		menuBar.add(menu_file);
		menuBar.add(menu_editor);
		menuBar.add(menu_view);
		menuBar.add(menu_help);
		
		JMenuItem item_open = new JMenuItem("打开");
		JMenuItem item_save = new JMenuItem("保存");
		JMenuItem item_print = new JMenuItem("打印");
		JMenuItem item_exit = new JMenuItem("退出");
		
		menu_file.add(item_open);
		menu_file.add(item_save);
		//菜单项之间的分割线组件
		menu_file.addSeparator();
		menu_file.add(item_print);
		//菜单项之间的分割线组件
		menu_file.addSeparator();
		menu_file.add(item_exit);
		
		JPanel panel = new JPanel();
		jf.setContentPane(panel);
		
		JButton button_test = new JButton("测试按钮");
		panel.add(button_test);
		

	}

}
