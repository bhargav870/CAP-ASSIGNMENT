package first.java;

public class Assignment1Q6 {

	 public String loginUser(String user, String pass) {
		 System.out.println("Enter Username");
		 System.out.println("Enter Password");
		 
		 if(user.equals("Ajay") && pass.equals("password")) {
			 System.out.println("Welcome Ajay");
		 }
			 else {
		//		 for(int i=0;i<3;i++)
				 System.out.println("Not AUTHORISED");
			 
		 }
		 	return pass;
	 }
        public static void main(String[] args) {
        	Assignment1Q6 obj = new Assignment1Q6();
        	obj.loginUser("Ajay1","password");

	}

}
