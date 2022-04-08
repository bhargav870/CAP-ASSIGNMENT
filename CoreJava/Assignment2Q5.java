package first.java;

public abstract class Assignment2Q5 {
   public abstract void draw();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj = new Rectangle();
		obj.draw();
		Line obj1 = new Line();
		obj1.draw();
		Cube obj2 = new Cube();
		obj2.draw();
      }
    static class Rectangle extends Assignment2Q5 {
    
      	@Override
		public void draw() {
			// TODO Auto-generated method stub
      		System.out.println("[]");
			}
    }
		static class Line extends Assignment2Q5 {

			@Override
			public void draw() {
				// TODO Auto-generated method stub
				System.out.println("-----");
				}
		}
			static class Cube extends Assignment2Q5 {

				@Override
				public void draw() {
					// TODO Auto-generated method stub
					System.out.println("cube printed");
				     }
			}
	  }
    
