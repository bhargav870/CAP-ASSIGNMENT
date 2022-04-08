package first.java;

		import java.util.ArrayList;
		import java.util.Arrays;
import java.util.function.Consumer;

		public class Lambdaq8 {
		    public static void main(String[] args) {
		        ArrayList<Integer>m=new ArrayList<>(Arrays.asList(93,53,87,87,98,55));
		        new Thread(()-> System.out.println(m)).start();
		      //  Consumer<Integer>m()-> System.out.println()
		    }
		}

	