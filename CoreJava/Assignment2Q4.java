package first.java;
// Case 1 : In this if we add a abstract method then we have to call whole class as abstract  class
       public abstract class Assignment2Q4 {
      String name ;
      public abstract void animal();
//      case 4
//    private abstract void animal1();
//      case5
      // final if we use final then we cannot use that i any other class 
      // final string name (final cannot be initialized in abstract class)
     public static void main(String[] args) {
    	Dogs obj = new Dogs();
         obj.animal();
    	//CASE2
//    	 Assignment2Q4 obj = new  Assignment2Q4(); (we are not able to create a new obj in this as it is a abstract)
  //  	 obj.
    }
    //case 3 in this we are extending abstract class so we need to make that class also abstract
   // static abstract class Dogs extends Assignment2Q4{
    	 static  class Dogs extends Assignment2Q4{
    // case 3 we are using abstract class in subclass by overriding
			@Override
			public void animal() {
				// TODO Auto-generated method stub
		    System.out.println("i want to eat")	;
		    }
         }
       }



