package first.java;

public abstract class Assignment2Q6 {
        
public abstract void  Persistence();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FilePersistence obj =new FilePersistence();
//		obj.Persistence();
//		 DatabasePersistence obj1 = new  DatabasePersistence();
//		 obj1.Persistence();
    }
    static class  FilePersistence extends Assignment2Q6 {

		@Override
		public void Persistence() {
			// TODO Auto-generated method stub
			
		}

		
			// TODO Auto-generated method stub
//			System.out.println("FilePersistence");
		}
    }
	class DatabasePersistence extends Assignment2Q6 {

		@Override
		public void Persistence() {
			// TODO Auto-generated method stub
//			System.out.println("DatabasePersistence");
			
		}
    }


