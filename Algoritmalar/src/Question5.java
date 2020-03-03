import java.util.Random;

public class Question5 {
	public static void main(String[]args) {
		int[] array=new int[100];
		Random r=new Random();
		for (int i=0;i<100;i++) {
			array[i]=r.nextInt(100)+1;
			if(array[i]%2==0)
				System.out.println((i+1)+".sayý: "+array[i]+" - Çift");
			else
				System.out.println((i+1)+".sayý: "+array[i]+" - Tek");
		}
	}
}
