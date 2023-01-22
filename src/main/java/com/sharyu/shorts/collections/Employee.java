package com.sharyu.shorts.collections;

import java.util.Objects;

public class Employee {
	
	String empName;

	String empDept;
	
	public Employee(String empName, String empDept) {
		super();
		this.empName = empName;
		this.empDept = empDept;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(empDept, empName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empDept, other.empDept) && Objects.equals(empName, other.empName);
	}

}
