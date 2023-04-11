package sripriya;

public class StaticVariables {

	String Resname;
	int doorno ;
	String Street;
	boolean Resident;
  static String Community = "Sutton Fields ";
	
	public static void main(String[] args) {
		GlobalVariables s1= new GlobalVariables();
		s1.Resname = " Sukumar Achary Bonala  ";
		s1.doorno = 6329;
		s1.Street = "wales st.";
           s1.Resident = true;
           System.out.println("Resident Name is : " +s1.Resname);
           System.out.println("Resident door no : " +s1.doorno);
           System.out.println("Resident Street is  : " +s1.Street);
           System.out.println("Resident is owner  : " +s1.Resident);
           System.out.println("COUMMUNITY IS :   " +StaticVariables.Community.toUpperCase());
           System.out.println("***********************");
           GlobalVariables s2= new GlobalVariables();
      		s2.Resname = "Siva";
      		s2.doorno = 6329;
      		s2.Street = "Tudlor st.";
                 s2.Resident = false;
                 
                 System.out.println(s2.Resname+ " Doorno:  "+s2.doorno+"  Street is: "+s2.Street+ " Owner : "+s2.Resident+" and COUMMUNITY IS :   " +StaticVariables.Community.toUpperCase());
                
                 
                
		
	}

}
