package first.java;
 // this is done for method type question
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)   
@interface Test
{
}
public class Annotationsq1{
       @Test()
	 public static void Test1() {
			System.out.println("Testing Anotations Method");
		}
 	public static void main(String[] args)
 	{
 	 	Test1();
	}
}