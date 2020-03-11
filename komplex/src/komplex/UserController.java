package komplex;

import java.util.Scanner;

public class UserController {
	
	public static void main(String[] args){
		
		int count=1;
		
		for(int i=0;i < count;i++){
			System.out.println(i+1 + ".user neve(legalább 6 karakter,space-t nem tartalmazhat");
			Scanner sc = new Scanner(System.in);
			String userName = sc.nextLine();
			if (userName.length() >= 6 && !userName.contains(" ")) {
				User user = new User(userName);
				System.out.println(user + "elmentve");
			}
			else{
				System.out.println("Hiba");
			}	
		}
	}

}
