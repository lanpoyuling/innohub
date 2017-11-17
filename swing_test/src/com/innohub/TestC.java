package com.innohub;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author Administrator
 * 在顶层容器中添加菜单栏
 */
public class TestC {
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
		
		menuBar.add(menu_file);
		menuBar.add(menu_editor);
		menuBar.add(menu_view);
		
		JMenuItem item_open = new JMenuItem("打开");
		JMenuItem item_save = new JMenuItem("保存");
		JMenuItem item_print = new JMenuItem("打印");
		JMenuItem item_exit = new JMenuItem("退出");
		
		menu_file.add(item_open);
		menu_file.add(item_save);
		menu_file.add(item_print);
		menu_file.add(item_exit);
		
		
	}

}
