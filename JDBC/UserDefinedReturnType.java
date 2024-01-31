package com.Basics;

public class UserDefinedReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello hello=new Hello();
		//User u=hello.m1();
		A i=hello.m1();
	}
}
class Hello
{
	//USER DEFINED CLASS AS RETURN TYPE
	/*User user=new User();
	public User m1()
	{
		return user;
	}*/
	A a=new AImpl();
	public A m1()
	{
		return a;
	}
}
class User
{
	
}
interface A
{
	
}
class AImpl implements A
{
	
}
