package com.yedam.set;

public class Member {
	//필드
	public String name;
	public int age;
	//생성자
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member=(Member)obj;
			if(member.name.equals(name)&&member.age==age) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
//		return Integer.parseInt(name);
		return name.hashCode() + age;//필드 값이 두개라 둘다 비교하기 위해서
	}
	
	
}
