package AssignmentSet3;

public class FindLeapYears {
	public static int[] findLeapYear(int year){
	       
	    int[] years = new int[15];
	    for (int i = 0; i < 15; i++) {
	    	years[i] = year + (4 * i); 
	    }
	    return years;
	       
	}
	    
	   public static void main(String[] args) {
	       int year = 2000;
		   int[] leapYears;
		   leapYears=findLeapYear(year);
		   for ( int index = 0; index<leapYears.length; index++ ) {
		       System.out.println(leapYears[index]);
		   }
	    }
}
