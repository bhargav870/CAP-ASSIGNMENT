package first.java;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Annotationsq3 {
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.TYPE, ElementType.METHOD,ElementType.PARAMETER} ) 
	@interface Execute{
		int Sequence()default 1;
	}
	@Execute(Sequence = 2)
	 public static void TestMethod2() {
		System.out.println("Testing Anotations Method2");
	}
	@Execute(Sequence = 1)
	 public static void TestMethod1() {
		System.out.println("Testing Anotations Method1");
	}
	@Execute(Sequence = 3)
	 public static void TestMethod3() {
		System.out.println("Testing Anotations Method3");
	}
	public static void main(String[] args) {
		TestMethod2();

	}

}
