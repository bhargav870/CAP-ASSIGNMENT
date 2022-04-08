package first.java;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collectionq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplyoee obj = new Emplyoee(100, "vishnu", "mechanical", 88000);
		Emplyoee obj1 = new Emplyoee(101, "suraj", "computerscience", 80000);
        Emplyoee obj2 = new Emplyoee(102, "piyush", "electrical", 40000);
        Emplyoee obj3 = new Emplyoee(103, "shivam", "civil", 90000);
        Emplyoee obj4 = new Emplyoee(104, "shubham", "bcom", 98000);
        Emplyoee obj5 = new Emplyoee(105, "sanyam", "bsc", 99000);
        Emplyoee obj6 = new Emplyoee(106, "prateek", "IT", 97000);
     ///////////////////////////////////////////////////////////////////   
        class nameCompartor implements Comparator<Emplyoee> {
            @Override
            public int compare(Emplyoee o1, Emplyoee o2) {

                return o1.getName().compareTo(o2.getName());
            }
        }

        TreeSet<Emplyoee> tsv = new TreeSet<>(new nameCompartor());
        tsv.add(obj);
        tsv.add(obj1);
        tsv.add(obj2);
        tsv.add(obj3);
        tsv.add(obj4);
        tsv.add(obj5);
        tsv.add(obj6);
        System.out.println("press 1 to arrange Name in Sorted manner");
        obj.option();
        for (Emplyoee e : tsv) {
            System.out.println(e);
        }
        System.out.println("-------------------------------------------------");
        class salaryComparator implements Comparator<Emplyoee> {

            @Override
            public int compare(Emplyoee o1, Emplyoee o2) {
                return o2.getSalary().compareTo(o1.getSalary()); // descending order 
            }
        }
        TreeSet<Emplyoee> tsv2 = new TreeSet<>(new salaryComparator());
        tsv2.add(obj);
        tsv2.add(obj1);
        tsv2.add(obj2);
        tsv2.add(obj3);
        tsv2.add(obj4);
        tsv2.add(obj5);
        tsv2.add(obj6);
        System.out.println("press 2 to arrange salary in sorted manner");
        obj.option();
        for (Emplyoee e1 : tsv2) {
            System.out.println(e1);
        }
        System.out.println("-------------------------------------------------------");

        class Idcomparator implements Comparator<Emplyoee> {

            @Override
            public int compare(Emplyoee o1, Emplyoee o2) {
				return o1.getId().compareTo(o2.getId());//ascending order
            
            }
        }
        TreeSet<Emplyoee> tsv3 = new TreeSet<>(new Idcomparator());
        tsv3.add(obj);
        tsv3.add(obj1);
        tsv3.add(obj2);
        tsv3.add(obj3);
        tsv3.add(obj4);
        tsv3.add(obj5);
        tsv3.add(obj6);
        System.out.println("press3 to arrange Id in sorted manner");
        obj.option();
        for(Emplyoee e2:tsv3){
            System.out.println(e2);
        }
        System.out.println("-------------------------------------------------------");

        class Departmentcomparator implements Comparator<Emplyoee>{

        @Override
        public int compare(Emplyoee o1, Emplyoee o2) {
            return o1.getDepartment().compareTo(o2.getDepartment());
           }
        }
        TreeSet<Emplyoee>tsv4=new TreeSet<>(new Departmentcomparator());
        tsv4.add(obj);
        tsv4.add(obj1);
        tsv4.add(obj2);
        tsv4.add(obj3);
        tsv4.add(obj4);
        tsv4.add(obj5);
        tsv4.add(obj6);
        System.out.println("press 4 to arrange department in sorted manner");
        obj.option();
        for(Emplyoee e3:tsv4){
        System.out.println(e3);
          }
	    }
       }
