package first.java;

public class StringsAssignment {

	public static void main(String[] args) {
		
// String str = "john, jennie, jim, jack, joe";
//  String s1 = str.substring(5);
//  System.out.println("s1 is: " + s1);
//  
//  String s2 = str.substring(5,11);
//  System.out.println("s2 is: " + s2);
//  
//  String[] strArr = str.split(",");
//  for(String s : strArr) {
//	//  System.out.println(s)); if we use this we would get space after john so we have used trim to avoid that space align in row
//	  System.out.println(s.trim());
//	  //strings are immutable
//	  String string = new String("Hello");
//	  string.concat("World");  // we are using concate to add but it will not as strings are immutable
//	  System.out.println("string is: "+string);
//  
//   // strings are mutable
//	  StringBuffer buffer = new StringBuffer("Hello");
//       buffer.append("World"); // in buffer class we can add as it is mutable 
//     
//       System.out.println("buffer is: "+buffer);
//       
//       // builder class is also mutable (only difference is buffer has threads and builder doesnt have threads
//       StringBuilder  builder = new StringBuilder("Hello");
//       builder.append("World"); // in builder class we can add as it is mutable 
//       System.out.println("builder is: "+builder);
// // EXAMPLE1
//       String str1 = "Welcome To Edureka";
//       String[] str1Array = str1.split(" ");
//       
//       for (String temp: str1Array) {
//    	   System.out.println(temp);
//       }
//      for(int i =0;i<3; i++) {
//    	  char[] s3 = str1Array[i].toCharArray();
//    	  for(int j = s3.length-1;j>=0;j--) { // we have taken length - 1 as index is different and original length is different 
//    		  System.out.print(s3[j]);
//    		  System.out.print(" ");
//    	  }
//    		  
//      }
//  }
		// string class q1
		String str = "Hello World";
	     System.out.println(str.length());
	     // string class q2
	     String str1 ="Hello";
	     String str2 ="How are you";
	     System.out.println(str1+" "+str2);
	     //string class q3
	     String str3 ="Java String pool refers to collection of Strings which are stored in heap memory";
	     System.out.println(str3.toLowerCase());
	     System.out.println(str3.toUpperCase());
	     System.out.println(str3.replace("a","$"));
         System.out.println(str3.contains("collection"));
         System.out.println(str3.equals("java string pool refers to collection of strings which are stored in heap memory"));
         System.out.println(str3.compareTo("java string pool refers to collection of strings which are stored in heap memory"));
          // string buffer q1
         StringBuffer str4 = new StringBuffer("StringBuffer");
         str4.append(" is a peer class of String");
         str4.append(" that provides much of");
         str4.append(" the functionality of strings");
         System.out.println("buffer is "+ str4);
         // string buffer q2
         StringBuffer  str5 = new StringBuffer("It is used to _ at the specified index position");
         str5.replace(14, 15," Insert text " );
         System.out.println(str5);
         //string buffer q3
         StringBuffer str6 = new StringBuffer("This method returns the reversed object on which it was called");
         str6.reverse();
	     System.out.println(str6);
	     //string builder q1
	     StringBuilder str7 = new StringBuilder("StringBuilder");
         str7.append(" is a peer class of String");
         str7.append(" that provides much of");
         str7.append(" the functionality of strings");
         System.out.println("builder is "+ str7);
         //String builder q2
         StringBuilder  str8 = new StringBuilder("It is used to _ at the specified index position");
         str8.replace(14, 15," Insert text " );
         System.out.println(str8);
         // string builder q3
         StringBuilder str9 = new StringBuilder("This method returns the reversed object on which it was called");
         str9.reverse();
	     System.out.println(str9);
}
}