package itvilla;

public class emp {

	String name;
	int	empid;
	String address;
	String remarks;
	dept empdept;

	
	public emp(String name, int empid, String address,dept empdept) {
		super();
		this.name = name;
		this.empid = empid;
		this.address = address;
		this.empdept = empdept;
	}
	
	void display(){  
		System.out.println("**************************");
	    System.out.println("Employee name is -" + name +" id is - "+ empid +" address is- "+ address + "remarks if any are - " + remarks );
	    System.out.println("Employee department is :  " + empdept);
	}  
	
	
	
	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}



	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public emp(dept empdept) {
		super();
		this.empdept = empdept;
	}
	
	
	
	
	
}
