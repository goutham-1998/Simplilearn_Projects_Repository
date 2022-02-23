package emailvaalidation;
import java.util.regex.*;
import java.util.*; 

public class EmailValidation {

	public static void main(String[] args) {
		
        //Added Valid Emails
		ArrayList<String> emails = new ArrayList<String>();  
        emails.add("abc123@email.co.in");  
        emails.add("abcA100@email.com");  
        emails.add("abc.ABC@email.com");  
        emails.add("abc.ABC#@email.co.in");  
        emails.add("Abc.abc@email.com");  
        emails.add("abc.123.ABC@ssdtercom");  
        
        
        //Added invalid Emails 
        emails.add("@abc.com");  
        emails.add("abc12-#co.com");  
        
        
        //Regular Expression for accepting the correct email ID   
        String regex = "^(.+)@(.+)$";  
        
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        
        //Fetching the emails in the list using iterator function
        for(String email : emails){  
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches());  
        }  
    }  
}  
