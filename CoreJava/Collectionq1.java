package first.java;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Collectionq1 {
      
	public static void main(String[] args) { // since we have given constructor in class we are calling directly 
		PhoneBook obj = new PhoneBook(9810767351L);
		PhoneBook obj1 = new PhoneBook(9810767352L);
		PhoneBook obj2 = new PhoneBook(9810767353L);
        
		Contacts N1 = new Contacts("ram","ram@infoctech.com","Male");
		Contacts N2 = new Contacts("shyam","shyam@infoctech.com","Male");
		Contacts N3 = new Contacts("veeraj","veeraj@infoctech.com","Male");
		
		Map<PhoneBook,Contacts> phonecontMap = new TreeMap<>();   // created tree map and insertig values into it
		phonecontMap.put(obj, N1);
		phonecontMap.put(obj1, N2);
		phonecontMap.put(obj2, N3);
		
		//in this we are giving the way our key and value would be inserted in bucket
		Set<Entry<PhoneBook,Contacts>> entrySet = phonecontMap.entrySet();
		for(Map.Entry<PhoneBook,Contacts> entry:entrySet) {
		 System.out.println(entry.getKey());
		 System.out.println(entry.getValue());
     	 System.out.println("Key"+ entry.getKey() + "Value"+ entry.getValue());
			
		}
		
	}

}
