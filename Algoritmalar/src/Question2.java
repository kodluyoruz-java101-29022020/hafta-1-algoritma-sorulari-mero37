import java.util.Scanner;

public class Question2 {
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a first number:");
		int x=input.nextInt();
		System.out.print("Enter a second number:");
		int y=input.nextInt();
		System.out.println("1 Addition");
		System.out.println("2 Substraction");
		System.out.println("3 Multiplication");
		System.out.println("4 Division");
		System.out.print("Choice:");
		byte choice=input.nextByte();
		switch(choice){
			case 1:
					System.out.println(x +" + "+ y +" = "+(x+y));
					break;
			case 2:
					System.out.println(x +" - "+ y +" = "+(x-y));
					break;
			case 3:
					System.out.println(x +" x "+ y +" = "+(x*y));
					break;
			case 4:
					System.out.println(x +" / "+ y +" = "+(x/y));;
					break;
			default:
					System.out.println("Invalid choice.");
					break;
		}
	}
}