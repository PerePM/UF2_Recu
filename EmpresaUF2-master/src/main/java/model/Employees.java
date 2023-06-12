package model;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {
	@Id
	@GeneratedValue
	@Column(name="emp_no")
	private int emp_no;
	@Column(name="last_name")
	private String last_name;
	@Column(name="first_name")
	private String first_name;
	@Column(name="birth_date")
	private Date birth_date;
	@Column(name="gender")
	private char gender;
	@Column(name="hire_date")
	private Date hire_date;
	@Column(name="role")
	private String role;
	@Column(name="salary")
	private double salary;
	
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	   @JoinColumn(name="deptno",foreignKey =
	   @ForeignKey(name="deptno"))
	private int deptno;
	
	
	public Employees() {
		
	}
	
	public Employees(int emp_no, String last_name, String first_name, Date birth_date, char gender, Date hire_date,
			String role, double salary, int deptno) {
		this.emp_no = emp_no;
		this.last_name = last_name;
		this.first_name = first_name;
		this.birth_date = birth_date;
		this.gender = gender;
		this.hire_date = hire_date;
		this.role = role;
		this.salary = salary;
		this.deptno = deptno;
	}
	public int getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Date getHire_date() {
		return hire_date;
	}
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	
	
	
}
