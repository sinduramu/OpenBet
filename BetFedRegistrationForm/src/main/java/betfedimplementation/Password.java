package betfedimplementation;


public class Password {

	public static void passwordValidation(String password) {
		
		int digitCount=0;
		int letterCount=0;
		int invalidSpecCount=0;
		int totalCount=password.length();
		for(int i=0;i<password.length();i++)
		{
			char pass1 = password.charAt(i);	
			if(Character.isDigit(pass1))
			{
				digitCount++;
			}
			if(Character.isLetter(pass1))
			{
				letterCount++;
			}	
		}
		String temp=password;
		String temp1=temp.replaceAll("[a-zA-Z0-9@!]", "");
		invalidSpecCount = temp1.length();
		if(totalCount<8 || totalCount>20 ||  digitCount==0 || letterCount==0 || invalidSpecCount>=1) 	
		{
			System.out.println(password + " - Password should : Min 8, Max 20, at least 1 letter AND 1 number; special characters allowed ‘!’ and ‘@’ ");
			 
		}
		
		 if(totalCount>=8 && totalCount<=20 && digitCount>=1 && letterCount>=1 && invalidSpecCount==0)
		{
			System.out.println(password + "  The entered password is verified and All the conditions are satisfied.  ");
		}
		 
	}		
	

}
