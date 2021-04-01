package AssignmentSet3;

class findDetails {
    
    public static double[] findDetail(double[] salary) {
        //Implement your code here and change the return value accordingly
    	int less = 0;
    	int greater = 0;
    	double sum = 0;
    	
        for (double num : salary) {
        	sum += num;
        }
        
        double average = sum / salary.length;
        
        for (double s : salary) {
        	if (s <= average) {
        		less++;
        	} else {
        		greater++;
        	}
        }
        
        double[] results = {less, average, greater};
		return results;

    }
       
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetail(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}
