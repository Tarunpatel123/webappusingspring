package com.ssi.models;

//import lombok.Data;


public class TaxModel {
	private int income;
	private int age;
	private int tax;
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public TaxModel(int income, int age, int tax) {
		super();
		this.income = income;
		this.age = age;
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "TaxModel [income=" + income + ", age=" + age + ", tax=" + tax + "]";
	}
	
	
}