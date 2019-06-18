package com.biz.coll.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class List_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		List<Integer> intList = new LinkedList<Integer>();

		for (int i = 0; i < 50; i++) {
			int intR = rnd.nextInt(50);
			intList.add(intR);
		}

		// 키보드에서 임의의 숫자를 입력받고
		// 그 숫자가 intList에 몇번에 포함되어 있는지 찾아보기

		System.out.println("숫자입력(0~49)");
		String strNum = scan.nextLine();
		int intNum = Integer.valueOf(strNum);

		int intLen = intList.size();
		for (int i = 0; i < intLen; i++) {
			if (intNum == intList.get(i)) {
				System.out.println(intList.get(i) + "은 " + "" + i + "번째에서 찾았습니다.");
				break;
			}

		}
		
		int index  = 0;
		intLen = intList.size();
		for (Integer in : intList) {
			index++;
			if(in == intNum) {
				System.out.println(index + "번째에 있음");
				break;
			}
		}
		
		if(index > intLen) {
			System.out.println("값을 찾지 못함");
		}

	}

}
