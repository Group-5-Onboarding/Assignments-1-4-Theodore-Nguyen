package AssignmentSet3;

public class MoveSpecialCharacter {
	public static String moveSpecialCharacters(String str){
		String start = "";
		String end = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isLetter(str.charAt(i))) {
				end += str.charAt(i);
			} else {
				start += str.charAt(i);
			}
		}
        return start + end;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
}
