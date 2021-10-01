package company;



public class Role {

	private int id;
	private String name;
	//private Vector<Utenti> user ;
	
	
	
	public Role() {};
	
	public Role (int id , String name/*Vector<Utenti>user*/) {
		this.id=id;
		this.name=name;
		//this.user=user;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 public Vector<Utenti> user getUser(){
	 return user;
	 }
	 
	 * */
	
	/*
	 public void Vector<Utenti> user setUser() 
	 {
	 this.user=user;
	 }
	 * */
	
}

