package sripriya;

public class StaticGlobalVariablesPractice {

	int RHNo;
	String RName;
	String STName;
	static String Community = "Sutton Field";
	
	public static void   OurOwn(int RHNo,String Rname,String STName)
	{
		System.out.println("HouseNo : " + RHNo +"-Owner- :" + Rname + "  -Street- :   "+STName+ "  -Community- :  "+Community);
		
	}
		
	public static void main(String[] args) {
		
 StaticGlobalVariablesPractice ob = new StaticGlobalVariablesPractice();
 StaticGlobalVariablesPractice.OurOwn(6329, "SRIPRIYASUKUMAR","Wales St.");

 System.out.println("************************************************");
              ob.RHNo = 2000;
              ob.RName = "Swathi Raghu";
              ob.STName = "Wales St. ";
              System.out.println("HouseNo :" +ob.RHNo);
              System.out.println("Owner   :" + ob.RName);
              System.out.println("Street  :"+ ob.STName);
              System.out.println("Community:"+ Community);
              System.out.println("*****************************************");   
              
              StaticGlobalVariablesPractice.OurOwn(6349, "Pritish","Wales St.");
              System.out.println("*****************************************"); 
              
             StaticGlobalVariablesPractice ob2 = new StaticGlobalVariablesPractice();
             StaticGlobalVariablesPractice.OurOwn(1000, "PriyankaSiva","Wales St.");
             System.out.println("*****************************************");  
             
             ob2.RHNo = 6500;
             ob2.RName = "RojaAvinash";
             ob2.STName = "Wales St. ";
             System.out.println("HouseNo : " +ob2.RHNo);
             System.out.println("Owner   : " + ob2.RName);
             System.out.println("Street  : "+ ob2.STName);
             System.out.println("Community:"+ Community);
             
     
            
               
	}

}
