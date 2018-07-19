package itvilla;

public class dept {

	String deptid;
	String deptname;
	
	@Override
	public String toString() {
		return "dept [deptid=" + deptid + ", deptname=" + deptname + "]";
	}
	public dept(String deptid, String deptname) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
	}
	public String getDeptid() {
		return deptid;
	}
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	
}
