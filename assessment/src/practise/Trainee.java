package practise;



public class Trainee {
	private int id;
	private String name;
	public Trainee(int id,String name) {
		this.id=id;
		this.name=name;
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
	public int hashCode()
	{
		return id;
	}
	public boolean equals(Object arg) {
		if(this==arg) {
			return true;
		}

	   if(arg==null || !(arg instanceof Trainee) ) {
			return false;
	   }

	    Trainee that=(Trainee)arg;	
		boolean isequal=this.id==that.id;
		return isequal;
	}

}
