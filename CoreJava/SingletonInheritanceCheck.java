package first.java;

public class SingletonInheritanceCheck {

	private String size;
	// Creating this so that no one can access with other name/id etc
    private  static SingletonInheritanceCheck UniqueInstance;
	// in this now we have added volatile and = this iscalled double check locking 
	//private volatile static SingletonInheritanceCheck UniqueInstance = new SingletonInheritanceCheck();
	
	// we are making private as new class is made ad changes should be done
	private SingletonInheritanceCheck() {
		size = "Big";
	}
	public static SingletonInheritanceCheck getUniqueInstance() {
		// we are checking two times as threat ot detected in first it would get detected in 2nd  if function  
//		if (UniqueInstance==null) {
//			synchronized (SingletonInheritanceCheck.class) {
				if (UniqueInstance==null) {
					UniqueInstance = new SingletonInheritanceCheck();
				}
			
			

		return  UniqueInstance;
	}
}
	
	
	
	
	



