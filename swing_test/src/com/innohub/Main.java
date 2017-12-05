package com.innohub;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * 物理路径拆分拼接
	 * @param args
	 */
	public static void main(String[] args) {
		String uploadPath="E:\\workspace\\sdny-web\\src\\main\\webapp\\upload\\";
		System.out.println(uploadPath);
		uploadPath=uploadPath.replace("\\", "#");
		String[] split = uploadPath.split("#");
		List<String> list=new ArrayList<>();
		for (String string : split) {
			list.add(string);
		}
		System.out.println(list);
		String path="";
		for (String string : list) {
			path=path+string+"\\"+"\\";
		}
		System.out.println(path);

	}

}
