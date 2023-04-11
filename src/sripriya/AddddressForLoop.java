package sripriya;

public class AddddressForLoop {

	public static void main(String[] args) {
	
		String Address[ ] = new String[8000];
		Address[6325] = "Priya-Austens.st";
		Address[6326] = "Sukumar-Bothwell";
		Address[6327] = "Ram-windsorst";
		Address[6328] = "Siva-tudorst";
		Address[6329] = "Sripriya-wales.st";
		
		int size = Address.length;
		for (int i=0;i<size;i++)
		{
			System.out.println(Address[i]);
		}
		
		

	}

}
