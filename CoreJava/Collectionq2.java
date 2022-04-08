package first.java;
import java.util.*;
public class Collectionq2 {
	

		public static void main(String[] args) {
			HashSet stud = new HashSet();
			stud.add("Balaji");
			stud.add("Kaveesh");
			stud.add("Shane");
			stud.add("Raj");
			stud.add("Murali");
			stud.add("Sathya");
			stud.add("Ponz");
			stud.add("Skp");
			stud.add("Sbk");
			stud.add("Kishore");
		
			System.out.println(stud);
		//	stud.add("Shane");
	             	//WE CAN CHECK EITHER WAY THAT DUPLICATE ELEMENT IS BEING REJECTED WHEN ADDED AGAIN SILENTLY THIS SHOWS HASH SET OR TREE SET USAGE  
			System.out.println(stud.add("Shane"));
			
			System.out.println(stud);
		
	}

}
