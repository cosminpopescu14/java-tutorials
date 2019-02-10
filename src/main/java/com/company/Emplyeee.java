package com.company;

import java.math.BigDecimal;

public class Emplyeee {
	
	
	private String fullName;
    private int age;
    private String ssn; // smth like cnp :)
    private Double salary;

    private int ceva;

    public Emplyeee()
    {

    }

    public Emplyeee(String fullName, int age, String ssn, Double salary)
    {
        this.fullName = fullName;
        this.age = age;
        this.ssn = ssn;
        this.salary = salary;
    }

    public Emplyeee(int ceva)
    {
        this();
        this.ceva = ceva;
    }
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}
	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		super.toString();
		return "new emp";
	}
    
    
}
