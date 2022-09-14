package aop;

import lombok.Getter;

@Getter
public class aop_person {
	private String name;
	private String id;
	private int age;
	private int level;	
	public aop_person(String name,String id,int age,int level) {
		this.name=name;
		this.id= id;
		this.age=age;
		this.level=level;
	}

	
}
