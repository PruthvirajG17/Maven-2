package com.example.Average;


public class App {
	public int twonumbers(int a,int b) {
		return (a+b)/2;
	}
	public int threenumbers(int a,int b,int c) {
		return (a+b+c)/3;
	}
    public static void main(String[] args) {
    	App app=new App();
        app.twonumbers(1,2);
        app.threenumbers(1, 2, 3);
    }
}
