package com.sharyu.shorts.practice;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class Employee {
	public String name;
	Double salary;
	public String department;

}
