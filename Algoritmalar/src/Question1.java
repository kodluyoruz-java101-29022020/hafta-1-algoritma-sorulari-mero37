import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Password:");
		String password=input.nextLine();
		if(password.equals("12345"))
			System.out.println("Giris Basarili");
		else
			System.out.println("Giris Basarisis");
	}

}
