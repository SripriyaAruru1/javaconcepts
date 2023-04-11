package javarevision;

public class Block {
	
	static
	
	{
		int x = 10;
		int t = 20;
		System.out.println("Main method local variable : " +x+":    :"+t);
	}
				
		
		
		public static void Display()
		{
			System.out.println("print static Display method");
		}
		
		public void NonStaticBlock()
		{ //Global Block
			int num = 30;
			System.out.println("In Global block: Global Block Variable"+num);
			
				{//Local Block
					
					int num2=10;
					int c = num+num2;
					System.out.println("In Local block: Global Block Variable"+num);
					System.out.println("In Local block: Local Block Variable"+num2);
					System.out.println("Addition of Global and Local block: Local Block Variable"+c);
					
					
				}
			//System.out.println("In Global block: Local Block Variable"+num2);
				
			}
		//this is block “static”
		static
		{
			System.out.println("Static Block");
			{
				System.out.println("Static Block  - Local Block");
			}
		}

		public static void main(String[] args) {
			
			
			/*
			 * Block obj = new Block(); 
			 * obj.NonStaticBlock();
			 */
			
			new Block().NonStaticBlock();
			
			
		//	System.out.println(a);
			 Display();


}
}
