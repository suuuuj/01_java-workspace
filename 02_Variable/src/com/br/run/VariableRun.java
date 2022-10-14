package com.br.run;

import com.br.variable.A_Variable;
import com.br.variable.B_KeyboardInput; //import 여러개 사용 가능
import com.br.variable.C_Printf;
import com.br.variable.*; // *-> 모든 패키지의 클래스를 사용할 것이다
public class VariableRun {
	
	public static void main(String[] args) {
		// A_Variable 클래스 안에 있는 printValue 메소드 호출
		
		A_Variable a = new A_Variable();
		//a.printValue();		
		//a.declareVariable();
	
		B_KeyboardInput b = new B_KeyboardInput();
		//b.inputScanner1();
		//b.inputScanner2();
		//b.inputScanner3();
		//b.practice();
	
		C_Printf c = new C_Printf();
		//c.printfTest();
		
		D_Cast d = new D_Cast();
		//d.autoCasting();
		d.forceCasting();
		
		
	}

}



