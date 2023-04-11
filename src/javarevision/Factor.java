package javarevision;

public class Factor {

	

	    public void factor1()
	    {
	        int res = 1;
	        for (int i =1;i<=5;i++)
	        {
	            res = res *i;
	            System.out.println(res);
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        Factor fp = new Factor();
	        fp.factor1();
	        
	    }
	}

