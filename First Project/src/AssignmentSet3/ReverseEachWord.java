package AssignmentSet3;

public class ReverseEachWord {
	public static String reverseEachWord(String str){
	    String[] words = str.split(" ");
	    StringBuilder reversed = new StringBuilder();
	    
	    for (int i = 0; i < words.length; i++) {
	    	String rWord = new StringBuilder(words[i]).reverse().toString();
	    	reversed.append(rWord).append(" ");
	    }
	    return reversed.toString();
	}
	
	public static void main(String args[]){
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
	}
}
