package com.innohub;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * 物理路径拆分拼接
	 * @param args
	 * 
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
		SysConvert();
	}
	
	/**
	 * <a href='http://blog.csdn.net/xiaochunyong/article/details/7748713'>Java 位运算(移位、位与、或、异或、非）<br>
	 * <a href='https://jingyan.baidu.com/article/495ba84109665338b30ede98.html'>二进制、八进制、十进制、十六进制之间的转换
	 * 
	 */
	public static void SysConvert(){
		//位或运算   八进制以数字0打头   十六进制以0x打头
		System.out.println(010 | 4);

	}

}
