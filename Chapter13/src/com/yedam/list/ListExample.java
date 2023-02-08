package com.yedam.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		//List<E>
		//데이터는 String문자열을 넣을 수 있는 ArrayList
		List<String>list = new ArrayList<String>();
		
		
		//list 데이터 추가
		list.add("Java");//인덱스 0 데이터 추가
		list.add("JDBC");//인덱스 1 데이터 추가
		list.add("servelt/JSP");//인덱스 2 데이터 추가
		list.add(2,"DataBase");
		//인덱스2에 데이터 추가 -> 인덱스2 DataBase 인덱스3 servelt/JSP
		list.add("iBatis");//인덱스4 데이터 추가
		
		//list.size() -> list의 크기(배열로 치면 =length)
		for(int i=0;i<list.size();i++) {
			//list.get(index)->해당 인덱스의 객체를 꺼내온다.
			String str = list.get(i);
			System.out.println(i+" : "+str);
		}
		System.out.println("===========================");
		
		//list.remove(index) ->해당 인덱스의 객체 삭제
		list.remove(2);//인덱스2의 객체 삭제 : DataBase삭제
		for(int i=0;i<list.size();i++) {
			//list.get(index)->해당 인덱스의 객체를 꺼내온다.
			String str = list.get(i);
			System.out.println(i+" : "+str);
		}
		System.out.println("===========================");
		
		//객체를 집어서 삭제
		list.remove("JDBC");
		
		for(int i=0;i<list.size();i++) {
			//list.get(index)->해당 인덱스의 객체를 꺼내온다.
			String str = list.get(i);
			System.out.println(i+" : "+str);
		}
		
		//리스트 객체 전부 삭제
		list.clear();
		//list.size()->길이가 0이면 객체가 다 삭제됨을 의미.
		System.out.println(list.size());
		
		//contains(); 내용확인
		//isEmpty(); 내용(전체)유무 확인
		
		
		
		//Vector->Arraylist와 동일하지만,
		//쓰레드->thread
		//JVM이 읽는건 맞지만 thread가 코드를 읽어서 실행
		//코드가 존재하면 prog에서 thread가 한줄 읽고 실행->반복
		//≒일꾼
		//현재 쓰는 방식 단일 스레드
		//일꾼 1명
		//멀티스레드-->병렬 또는 병합적으로 일을 실행할때;
		//메인문과 다른 Class에서 작업이 이루어져야할 때
		//ex>
		//로봇 ->움직임->스레드
		//   -> 통신 ->스레드
		//병목; 데드락현상
		//분담..? 뭐였지
		//Vector ≒ StringBuffer(Vecter에 가깝다) ≒StringBuilder(Array에 가깝다)
		//지연시간이 늘어남
		
		
	}

}
