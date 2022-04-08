package first.java;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
public class Annotationsq2 {
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD,ElementType.PARAMETER} ) 
@interface Info{
	// here we are defining  method 
	int AuthorID();
	String Author();
	String Supervisor();
	String Date();
	String Time();
	float Version();
	String description();
}
  // SINCE WE CAN CALL @INFO ONLY ON CLASS OR METHOD ,WE ARE CALLING A CLASS WE CAN LEAVE IT EMPTY JUST USING FOR REFERENCE ONLY NOT REQUIRED
     @Info(Author = "BHARGAVCODER",AuthorID =1234, Date = "1/2/2022", Supervisor = "Okar", Time = "12:00PM", Version =234, description = "NEW TO COMPANY")
   static  class Developer{
    	 int AuthorID;              // public void vishnu(int authorid) this way we can use method
    	    String Author ;
    	    String Supervisor ;
    	    String Date;                          
    	    String Time;
    	    float Version;
    	    String description;
    
    	    public  Developer(int AuthorID, String Date, String Time, float Version) {
    	        this.AuthorID = AuthorID;
    	        this.Date = Date;
    	        this.Time = Time;
    	        this.Version = Version;
			}
	
     
	public static void main(String[] args) {
		// WE ARE DEFINIG ABOVE DEVELOPER CLASS 
	     Developer BHARGAV = new Developer(20,"21-02-2022","2.30",20); 
	     // DOWN PROCESS IS CALLED REFLECTION
	        Class a =BHARGAV.getClass(); // WE ARE CALLING @INFO ANNOTATION I THIS CLASS BY USING GETCLASS
	        java.lang.annotation.Annotation p = a.getAnnotation(Info.class); // NOW WE HAVE STORED IN CLASS A AND IN THIS WE ARE STORING CLASS A IN ANNOTATION P 
	        Info i = (Info)p; // NOW WE ARE DEFINING INFO P IN INFO I 
	        System.out.println(i); // FINALLY PRINTING IT 
	}

}
}