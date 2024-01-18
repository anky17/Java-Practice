package selection;

public class nestedifelseTEST {

	public static void main(String[] args) {
		
		String citizen = "nepali";
		int age = 19;
		boolean haveVoteID = false;
	 		
		if(citizen.equals("nepali")) {
			
			if(age>=18) {
				
				if(haveVoteID) {
					
					System.out.println("You can vote!!");
				}
				else{
					System.out.println("You don't have a voter id!!");
				}
			}
			else {
					System.out.println("You are under age!!");
				 }
				
		}
		else {
			System.out.println("Invalid citizen!!");
			}
	}
}
