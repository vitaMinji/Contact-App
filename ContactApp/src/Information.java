
public class Information {
	String name;
	String email;
	String phone;
	
	
	
	
	public Information(String name, String email, String phone){
		this.name=name;
		this.email=email;
		this.phone=phone;
	}
	
	
	public Information() {
		// TODO Auto-generated constructor stub
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	
}
