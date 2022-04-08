package first.java;

public class Contacts {
          private String Name;
           private String Email;
           private String Gender;
	public  Contacts(String Name,String Email,String Gender) {
		this.Name=Name;
		this.Email=Email;
		this.Gender=Gender;
}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "Contact[Name="+ Name +",Email="+ Email +",Gender="+ Gender +"]";
	}
	   
	
}