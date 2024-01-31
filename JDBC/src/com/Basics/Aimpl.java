package com.Basics;
public class Aimpl 
{
	public static void main(String[] args) {
		Student student=Add.m1();
	}
}
class Add
{
	static Student s1=new Student();
	public static Student m1()
	{
		s1.add();
		return s1;
	}
}
class Student
{
	public void add()
	{
		System.out.println("Im in student");
	}
}
