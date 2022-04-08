package first.java;

public class Assignment2q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//since we have given unique instance as a name in singleton  now we can't put new over here as it is private 
		SingletonInheritanceCheck singletonInheritanceCheck1  =  SingletonInheritanceCheck.getUniqueInstance();
		SingletonInheritanceCheck singletonInheritanceCheck2  =  SingletonInheritanceCheck.getUniqueInstance();
		
	//	SingletonInheritanceCheck singletonInheritanceCheck3  =  new SingletonInheritanceCheck();
		
		SingletonInheritanceCheck singletonInheritanceCheck3  =  SingletonInheritanceCheck.getUniqueInstance();
		
		System.out.println(singletonInheritanceCheck1);
		System.out.println(singletonInheritanceCheck2);
		System.out.println(singletonInheritanceCheck3);
	}

}
