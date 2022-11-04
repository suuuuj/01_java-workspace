package com.br.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		/*
		 *  *Date (java.util)
		 *  - 날짜 및 시간에 대한 값을 담을 수 있는 객체
		 */
		
		//기본생성자를 이용해서 생성=> 현재 날짜 및 시간 (시스템 날짜 및 시간) (요일, 달, 일, 시간, kst 년도)
		Date date1 = new Date();
		System.out.println(date1);
		
		// 내가 원하는 날짜로 세팅 (2023년 03월 27일)로 세팅
		//1) 매개변수 생성자를 이용해서 생성
		Date date2 = new Date(2023 - 1900 , 3-1 , 27); //년은 -1900을 하고 월은 0-11 이라서 +-1
		System.out.println(date2);
		
		//2) 기본생성자로 생성한 후 setter메소드로 값 변경
		date1.setYear(2023-1900);
		date1.setMonth(3-1);
		date1.setDate(27);
		System.out.println(date1);  //시분초는 변경해주지 않았기 때문에 기본생성자로 설정했던것이 그대로 남아있음 -> 이것도 다 수정가능 set(Hour, Miniute, seconds)
		
		// 2023년 03월 27일 16시 11분 05초 의 형식으로 출력하고 싶다면
		// 2023/03/27
		
		// 내 입맛대로 포맷을 적용해서 출력 가능
		// java.text.SimpleDateFormat 클래스
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd E HH : mm : ss");
		String formatDate = sdf.format(date1);
		System.out.println(formatDate);
		
		
		// String에서 제공하는 메소들
		// Parsing 파싱하는 것
		// SimpleDateFormat 포맷지정
		
	}

}
