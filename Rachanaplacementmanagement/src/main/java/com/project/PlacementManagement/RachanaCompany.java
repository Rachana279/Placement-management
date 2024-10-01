package com.project.PlacementManagement;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Placementmanagement")
public class RachanaCompany {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private String name;
	private int id;
	private float salary;
	
public RachanaCompany() {
		
	}



	public RachanaCompany(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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



	



	public float getsalary() {
		return salary;
	}



	public void setPrice(float salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "RachanaCompany [name=" + name + ", id=" + id + ", salary=" + salary + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getsalary()=" + getsalary() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	
	}
	

