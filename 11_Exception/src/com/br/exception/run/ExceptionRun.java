package com.br.exception.run;

import java.io.IOException;

import com.br.exception.controller.CheckedException;
import com.br.exception.controller.UnCheckedExeption;

public class ExceptionRun {

	public static void main(String[] args) throws IOException {

		/*
		 *  * 에러 종류
		 *  - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 => 소스코드로는 해결안됨 => 심각한 에러
		 *  - 컴파일 에러 : 소스코드 문법상의 오류 (빨간줄) =>개발자의 실수
		 *  - 런타임 에러 : 코드상으로는 문제가 없는데 프로그램 실행중에 발생하는 에러
		 *  			 (사용자의 실수일 수도 있거 개발자가 예측가능한 경우를 제대로 처리 안해놨을 경우) 
		 *  - 논리 에러 : 문법적으로도 문제없고 실행했을 때도 굳이 문제는 없지만 프로그램 의도상 맞지 않는 것
		 *  
		 * 시스템 에러를 제외한 컴파일, 런타임, 논리 에러와 같은 덜 심각한 것들을 "예외"라고 함 => Exception
		 * 
		 * 이런 "예외"가 "발생"했을 경우에 대해서 "처리"하는 방법을 "예외처리"라고 함
		 * 
		 * * 예외처리를 하는 목적
		 * - 예외처리를 하지 않고 그대로 예외가 발생되는 경우 프로그램이 비정상적으로 종료됨
		 * 
		 * * 예외처리 방법
		 * 1. try~ catch문을 이용
		 * 2. throws를 이용
		 * 
		 */
		
		UnCheckedExeption uc = new UnCheckedExeption();
		
		//uc.method1();
		
		//uc.method3();
		
		CheckedException c = new CheckedException();
		 c.method1();
		
	}

}
