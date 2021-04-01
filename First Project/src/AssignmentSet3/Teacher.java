package AssignmentSet3;

public class Teacher {
    private String teacherName;
    private String subject;
    private double salary;
    
    public Teacher (String teacherName, String subject, double salary) {
    	this.teacherName = teacherName;
    	this.subject = subject;
    	this.salary = salary;
    }
    
    public String getTeacherName() {
    	return this.teacherName;
    }
    
    public void setTeacherName(String teacherName) {
    	this.teacherName = teacherName;
    }
    
    public String getSubject() {
    	return this.subject;
    }
    
    public void setSubject(String subject) {
    	this.subject = subject;
    }
    
    public double getSalary() {
    	return this.salary;
    }
    
    public void setSalary(double salary) {
    	this.salary = salary;
    }
    
    void displayDetails() {
    	System.out.println("Name: " + this.teacherName + ", Subject: " + this.subject + ", Salary: " + this.salary);
    }
    
    public static void main(String[] args) {	 
	    Teacher[] teachers = new Teacher[4];
	     
	    teachers[0] = new Teacher("Alex", "Java Fundamental", 1200.0);
	    teachers[1] = new Teacher("John", "RDBMS", 1200.0);
	    teachers[2] = new Teacher("Maria", "Python", 900.0);
	    teachers[3] = new Teacher("Sam", "Networking", 900.0);
	    
	    int len = teachers.length - 1;
	    while (len >= 0) {
	    	teachers[len].displayDetails();
	    	len--;
	    }
	    
	}
}
