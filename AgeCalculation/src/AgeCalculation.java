import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class AgeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 // accepts your birthday as a string using JOptionPane
		 String bday = JOptionPane.showInputDialog("Enter your birthdate (MM/DD/YYYY)");
		 
		 //accepts today's date as a string using the JOption Pane
		 String today = JOptionPane.showInputDialog("Enter today's date (MM/DD/YYYY)");
		 
		 //make the string a local date
		 LocalDate bdayLD = LocalDate.parse(bday, DateTimeFormatter.ofPattern("MM/DD/YYYY"));
		LocalDate todayLD = LocalDate.parse(today, DateTimeFormatter.ofPattern("MM/DD/YYYY"));
		 
		// find the days between today and your birthday		
		Period m = Period.between(bdayLD, todayLD);
		
		// find the age
		JOptionPane.showMessageDialog(null, "You are " +m.getYears() + " years and " + m.getMonths() + " months old.");
	}
			
}

