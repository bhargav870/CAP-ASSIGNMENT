package first.java;
	import java.util.Calendar;
	public class Genericsq4<K,V> {
	    private K key;
	   private V value;
	    public Genericsq4( K key, V value){
	     this.key=key;
	     this.value=value;
	  }
	    public K getKey(){
	      return key;
	    }
	   public V getValue(){
	        return value;
	    }
	   public K setkey(String Key){
	      this.key=key;
	        return null;
	    }
	    public V setvalue(String Value){
	       this.value=value;
	        return null;
	    }
	   public static void main(String[] args) {
		   Genericsq4<String,String> myobj=new Genericsq4<>("hii","bhargav");
	       System.out.println(myobj.getKey());
	        System.out.println(myobj.getValue());

	//error -  pair<String,java.util.Date> myobj1=new pair<String,java.util.Date>("hi",);
	  }

	}
	
