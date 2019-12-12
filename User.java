
public class User {
	String name;
	String password;
	String email;
	
	public User(String name, String password) {
		this.name=name;
		this.password=password;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return password;
	}

	public void setPass(String pass) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email=email;
		
	}

}
