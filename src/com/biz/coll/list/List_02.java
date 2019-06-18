package com.biz.coll.list;

import java.util.LinkedList;
import java.util.List;

public class List_02 {
	
	public static void main(String[] args) {
		
		//중간중간 데이터를 삭제, 추가가 자주 일어날 것 같다.
		// ArrayList보다 LinkedList를 사용하는 것이 좋다.
		//
		// ArrayList<String>();
		// List 인터페이스를 사용해서
		// 객체를 선언해주면
		// 필요에 따라서 클래스를 바꿀 때
		// 코드 변경이 거의 일어나지 않는다.
		
		List<String> strList = new LinkedList<String>();
		
		//List에 데이터를 추가
		strList.add("홍길동");
		strList.add("성춘향");
		strList.add("이몽룡");
		strList.add("임꺽정");
		strList.add("장녹수");
		
		for(String s : strList) {
			System.out.print(s + "\t");
		}
		System.out.println();
		// 중간에 포함된 리스트를 변경하고자 할 때
		// 3번위치에 있는 임꺽정을 장보고로 변경
		System.out.println("=============================");
		strList.set(4, "장보고");
		for(String s : strList) {
			System.out.print(s.toString() +"\t");
		}
		System.out.println();
		
		// 중간에 포함된 리스트를 삭제하고자 할 때
		strList.remove(2); // 2번위치에 리스트를 제거 
		System.out.println("=============================");
		for(String s : strList) {
			System.out.print(s.toString() +"\t");
		}
		// 중간에 리스트를 삭제하면
		// 자동으로 전체 크기가 1만큼 감소
		
		//리스트 중간에 한 개의 값을 읽어서 변수에 담기
		String strName = strList.get(2);
		System.out.println(strName);
		System.out.println("=============================");
		strList.add(2, "장영실");
		for(String s : strList) {
			System.out.print(s.toString() + "\t");
		}
		
	}
}
