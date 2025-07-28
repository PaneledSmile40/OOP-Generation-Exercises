package com.generation.exercises.ex02;

public class Employee extends Person {
	
	protected int salary;
	protected String job;
	
	public Employee(String name, String surname, String dateofbirth, String gender, String job,int salary) {
		
		super(name,surname,dateofbirth,gender);
		
		this.job=job;
		this.salary = salary;	
	}
	
	
	public String toString() {
		return super.toString() + getJob() + " " + getSalary();
	}

	public int salary(int numMesi) {
		return getSalary()*numMesi;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}
