package javarevision;

public class Test extends Factor{
	
	 public  void pattern1()
     {
        for (char i = 'a'; i <= 'z'; i++) 
        {
            for (char j = 'a'; j <= i; j++) 
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
     }
        public static void main(String[] args) {
        	
                Test t = new Test();
                t.pattern1();
//                Factor f = new Factor();
//                f.factor1();
                t.factor1();
            }

        }
   


	
