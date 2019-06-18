package com.biz.coll.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_05 {

	public static void main(String[] args) {
			
		List<String> strList = new ArrayList<String>();
		Random rnd = new Random();
		
		for(int i = 0; i < 50; i++) {
			
			// 영문자 소문자  ASCII 코드 중 1개를 추출하라.
			int intNum = rnd.nextInt(26) + 97;
			
			// 추출한 ASCII코드를 문자로 변경하라
			char charNum = (char)intNum;
			
			// 문자를 문자열로 변경
			String strAlpha = String.valueOf(charNum);
			
			strList.add(strAlpha);
			
		}
		
		for(String s :  strList) {
			System.out.print(s + "\t");
		}
		
	}

}
