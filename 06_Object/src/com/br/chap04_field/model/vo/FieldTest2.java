package com.br.chap04_field.model.vo;

public class FieldTest2 {

	/*
	 *  * 필드에서 사용가능한 접근제한자 4가지
	 *  
	 *  public 		=> 어디서든(같은/다른 패키지 모두) 접근 가능
	 *  protected   => 같은 패키지 접근 가능, 다른 패키지일 경우 상속구조에서는 접근 가능
	 *  default 	=> 같은 패키지에서만 접근 가능(다른패키지일 경우 절대 불가능)
	 *  private		=> 오로지 현재 이 클래스에서만 접근 가능
	 *  
	 *  
	 *  위에서부터 아래로 내려갈 수록 접근할 수 있는 범위가 좁아짐
	 *  
	 */
	
	public String pub = "public";    //멤버변수들(객체 생성후 이 필드에 접근가능
	protected String pro = "protected";
	String def = "default";
	private String pri = "private";
	
	public static String sta = "static_FieldTest2";
			
}
