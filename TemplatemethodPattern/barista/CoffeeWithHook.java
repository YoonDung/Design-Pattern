package TemplatemethodPattern.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
 
	public void brew() {
		System.out.println("필터로 커피를 우려내는 중");
	}
 
	public void addCondiments() {
		System.out.println("설탕과 우유를 추가하는 중");
	}
 
	public boolean customerWantsCondiments() {

		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
 
	private String getUserInput() {
		String answer = null;

		System.out.print("커피에 설탕과 우유를 추가할까요? (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("답변을 읽는 동안 IO 오류가 발생했습니다");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
}
