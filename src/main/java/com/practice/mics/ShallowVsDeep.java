package com.practice.mics;

/**
 * Created by akasshukla on 7/27/17.
 */
public class ShallowVsDeep {

}

class Emp implements Cloneable{
	int id;
	String name;
	Emp emp;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
		emp=null;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Emp getEmp() {
		return emp;
	}

	@Override
	public String toString() {
		return "Emp{" + "id=" + id + ", name='" + name + '\'' + ", emp=" + emp + '}';
	}
	// shallow clone for emp

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args)  {
		Emp emp = new Emp(1,"akash");
		Emp emp1=new Emp(2,"vi");
		emp1.setEmp(emp);
		Emp cloneObj= null;
		try {
			cloneObj = (Emp) emp1.clone();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		cloneObj.id=10;
		cloneObj.name="clone name";
		Emp n= new Emp(3,"new emp");
//		cloneObj.setEmp(n);
		cloneObj.getEmp().setEmp(n);
		System.out.println(emp1);
		System.out.println("clone method");
		System.out.println(cloneObj);
		System.out.println(emp1);

	}
}
