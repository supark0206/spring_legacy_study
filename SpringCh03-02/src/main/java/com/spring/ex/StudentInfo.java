package com.spring.ex;

public class StudentInfo {
	private Student stu;
	
	public StudentInfo(Student stu) {
		this.stu = stu;
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	public void stuInfoPrint() {
		if(null != stu) {
			System.out.println("----------------------------");
			System.out.println("이름 : " + stu.getName());
			System.out.println("나이 : " + stu.getAge());
			System.out.println("전공 : " + stu.getMajor());
			System.out.println("학년 : " + stu.getGradeNum());
			System.out.println("반 : " + stu.getClassNum());
			System.out.println("----------------------------");
		}
	}
	

}
