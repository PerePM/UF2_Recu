package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name="departaments")
public class Departments {

	@Id
	@GeneratedValue
	@Column(name="deptno")
	private int deptno;
	@Column(name="deptname")
	private String deptname;
	
	
	public Departments() {
		
	}

	public Departments(int deptno, String deptname, String location) {
		this.deptno = deptno;
		this.deptname = deptname;
		this.location = location;
	}
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	private String location;

}
