package pensionato.entities;

public class Room {
	private String name;
	private String email;
	
	public Room(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return name
				+ ", "
				+ email;
	}
	
}
