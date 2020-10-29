import javax.swing.JOptionPane;




public class AgeCalculation {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 String bday = JOptionPane.showInputDialog("Enter your birthdate (MM/DD/YYYY)");
		 double day = Double.parseDouble(bday);
	        //throw new NumberFormatException("For input string: \"" + in + "\"");
	        return;
	        
		 String today = JOptionPane.showInputDialog("Enter today's date (MM/DD/YYYY)");
		 double day2 = Double.parseDouble(today);
	}
		 
		 AgeCalculation myBirthday() {
			  var str = "Enter your birthdate (MM/DD/YYYY)";
			  String[] res;
			res = str.split("MM");
			  String[] res2;
			res2 = str.split("DD");
			  String[] res3;
			res3 = str.split("YYYY");
			return null;
		 }
		 
		 
		AgeCalculation myDate() {
			var str = "Enter today's date (MM/DD/YYYY)";
			  String[] res;
			res = str.split("MM");
			  String[] res2;
			res2 = str.split("DD");
			  String[] res3;
			res3 = str.split("YYYY");
			return null;
		
	
 
		 //JOptionPane.showMessageDialog(null, myBirthday + "Any text you need");


		 //System.exit(0)
		
	}

}
