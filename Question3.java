import java.util.Random;

public class Question3 {
	public static float aggretion(int[] number){
		int total=0;
		for(int i=0;i<number.length;i++) {
			total+=number[i];
		}
		return total/number.length;
	}
	public static void main(String[]args) {
		int[] array=new int[100];
		Random r=new Random();
		for (int i=0;i<100;i++) {
			array[i]=r.nextInt(100)+1;
			System.out.println((i+1)+".number:"+array[i]);
		}
		System.out.println("Aggretion:"+aggretion(array));
	}
}
