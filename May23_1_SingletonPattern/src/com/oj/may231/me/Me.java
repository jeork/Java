package com.oj.may231.me;

public class Me {
	String name;
	int age;
	String nickname;

	private static final Me ME = new Me("오제록", 27, "국민 가수");

	public Me() {
		// TODO Auto-generated constructor stub
	}

	public Me(String name, int age, String nickname) {
		super();
		this.name = name;
		this.age = age;
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public static Me getMe() {
		return ME;
	}

	public void print_info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(nickname);
	}

}
