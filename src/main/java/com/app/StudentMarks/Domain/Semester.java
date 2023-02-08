package com.app.StudentMarks.Domain;




public class Semester {
	
	public String getSemester1() {
		return Semester1;
	}
	public void setSemester1(String semester1) {
		Semester1 = semester1;
	}
	public String getSemester2() {
		return Semester2;
	}
	public void setSemester2(String semester2) {
		Semester2 = semester2;
	}
	private String Semester1;
	private String Semester2;


    public String getAvgAll()
    
{
    	return Semester1+Semester2;
	
}
}  

