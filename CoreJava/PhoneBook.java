package first.java;

public class PhoneBook implements Comparable<PhoneBook> {
       private Long PhoneNumber;
       // we use constructor to directly call without giving (phonebook obj = new phonebook)
	public PhoneBook(Long PhoneNumber) {
         super();
         this.PhoneNumber = PhoneNumber;
	}
         
	public Long getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "PhoneBook[PhoneNumber=" + PhoneNumber + "]";
	}

	@Override
	public int compareTo(PhoneBook o) {
		return o.getPhoneNumber().compareTo(this.getPhoneNumber());
	}
	
	}

