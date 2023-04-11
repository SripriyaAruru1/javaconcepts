package sripriya;

public class GlobalVariables {
	String Resname;
	int doorno ;
	String Street;
	boolean Resident;
	
	public static void main(String[] args) {
	
		GlobalVariables s1= new GlobalVariables();
		s1.Resname = " Sukumar Achary Bonala  ";
		s1.doorno = 6329;
		s1.Street = "wales st.";
           s1.Resident = true;
           System.out.println("Resident Name is trimmed : " +s1.Resname.trim());
           System.out.println("********************");
           System.out.println("Resident Name is replace with a : " +s1.Resname.replace('A', 'a'));
           System.out.println("********************");
           System.out.println("Resident Name lenght : " +s1.Resname.length());
           System.out.println("********************");
           System.out.println("Resident Name in lower case  : " +s1.Resname.toLowerCase());
           System.out.println("********************");
           System.out.println("Resident Name in uppercase : " +s1.Resname.toUpperCase());
           System.out.println("Door No.:  " +s1.doorno);
           System.out.println("Street is  :  " +s1.Street);
           System.out.println("Owner : " +s1.Resident);
           System.out.println("********************");
           System.out.println("Resident Name is cutshort : " +s1.Resname.subSequence(1, 8));
           System.out.println("********************");
           System.out.println("Resident Name is split : " +s1.Resname.split("a"));
           System.out.println("********************");
           System.out.println("********************");
           GlobalVariables s2 = new GlobalVariables();
   		s2.Resname = "Siva";
   		s2.doorno = 6329;
   		s2.Street = "Tudlor st.";
              s2.Resident = false;
              
              System.out.println(s2.Resname+ " Doorno:  "+s2.doorno+"  Street is: "+s2.Street+ " Owner : "+s2.Resident );
             
		
	}

}
