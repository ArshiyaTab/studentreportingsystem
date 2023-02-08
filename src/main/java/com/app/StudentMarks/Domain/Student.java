package com.app.StudentMarks.Domain;

public class Student {

	private int m1;
	private int m2;
	private int m3;
	private int m4;
	private int m5;
	private int m6;
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public int getM4() {
		return m4;
	}
	public void setM4(int m4) {
		this.m4 = m4;
	}
	public int getM5() {
		return m5;
	}
	public void setM5(int m5) {
		this.m5 = m5;
	}
	public int getM6() {
		return m6;
	}
	public void setM6(int m6) {
		this.m6 = m6;
	}
	public int getTotal()
	{
		return m1+m2+m3+m4+m5+m6;
		
		
	}
	public double getAvgMarks()
	{
		return m1+m2+m3+m4+m5+m6/6;
	}
	
	public double getAvgPercentage()
	{
		return m1+m2+m3+m4+m5+m6/6;
	}
		
    public double getMaxAvg()
    {
    	return m1+m2+m3+m4+m5+m6/6;
    }
    
    public String getGrade()
    {
    	
    
    	String grade;
    	
    	double avg=m1+m2+m3+m4+m5+m6/6;
    	
    	if (avg>50)
    	{
    		grade="Pass";
    	}
    	else 
    	{ 
    		
    	 grade ="Fail";
    	 
    	}
    	return grade;
    }
    }

    		
    		
    	
    
		
		
		
		

		
	


		
		
	

	
	
	
	

	

