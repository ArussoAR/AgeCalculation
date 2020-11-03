import javax.swing.JOptionPane;




public class AgeCalculation {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 // accepts the birthdate as a string using JOptionPane
		 String bday = JOptionPane.showInputDialog("Enter your birthdate (MM/DD/YYYY)");
		String[] birthday = bday.split("/");
				
		//birthday month
	        int birthM = Integer.parseInt(birthday[0]);
	      //birthday day
	        int birthD = Integer.parseInt(birthday[1]);
	        // birthday year
	        int birthY = Integer.parseInt(birthday[2]);
				
	   
	   System.out.println(birthM);
	   System.out.println(birthD);
	   System.out.println(birthY);
	    
	   // accepts the current date as a string using JOptionPane
		 String today = JOptionPane.showInputDialog("Enter today's date (MM/DD/YYYY)");
		 String[] day2 = today.split("/");
		
		 //todays month
		 int dayM = Integer.parseInt(day2[0]);
		 //todays date
		 int dayD = Integer.parseInt(day2[1]);
		 // todays year
		 int dayY = Integer.parseInt(day2[2]);
		 
			
		   System.out.println(dayM);
		   System.out.println(dayD);
		   System.out.println(dayY);
		   
		  System.out.print("My Age is 20 years 11 months ");
		 
	

 
	}
}

