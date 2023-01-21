public class SoalUAS4 {
	public static void main(String[] args) {
		int row = 4;
		System.out.println(" ");
		for (int i = 0; i <= row ; i++) { 
        for (int j = row ; j > i; j--) {
				System.out.print("  ");
			}

			for (int k = 0; k <= i; k++)
			{
				System.out.print(k +" ");
               
               
			}
			System.out.println();
		}
	}
}