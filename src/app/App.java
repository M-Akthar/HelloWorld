package app;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello world to the standard out");
		
		JMap jmap = new JMap();
		
		String userInput1 = "Object 1";
		String userInput2 = "Object 2";
		String userInput3 = "Object 3";
		
		jmap.addString(1, userInput1);
		jmap.addString(2, userInput2);
		jmap.addString(3, userInput3);
		
		System.out.println("------ Line Break ------");
		
		System.out.println(jmap.getStringFromMap(2));
		System.out.println(jmap.getStringFromMap(1));
		System.out.println(jmap.getStringFromMap(3));
	}

}
