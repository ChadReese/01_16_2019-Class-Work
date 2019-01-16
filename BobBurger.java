import java.util.Scanner;
public class BobBurger {
public static void main(String[] args) {
	System.out.println(new BobBurger().calcHours(2));
}
public String calcHours (int numOfEmps) {
	String [] names = new String[numOfEmps];
	int [][] hours = new int [numOfEmps][7];
	
	for (int i=0; i< numOfEmps; i++) {
		System.out.println("Enter the name of the employee");
		Scanner input = new Scanner (System.in);
		names[i] = input.next();
		System.out.println("How many hours did " + names[i]+ " work on Monday?");
		hours[i][0] = input.nextInt();
		System.out.println("How many hours did " + names[i]+ " work on Tuesday?");
		hours[i][1] = input.nextInt();
	}
	String out ="";
	for (int i=0; i< numOfEmps; i++) {
		int total = hours[i][0] + hours[i][1];
		out+=names[i]+ " worked "+total+" hours for the week. ";
	}
	return out;
}
}
