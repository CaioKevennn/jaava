package matriz;

public class Main {

	public static void main(String[] args) {
		/*
		 * int[] m1= new int[2]; m1[0]=1; m1[1]=5; for (int n :m1) {
		 * System.out.println(n); }
		 */
		int[][] m2 = new int[3][3];
		m2[0][0] = -01;
		m2[0][1] = 02;
		m2[0][2] = 03;
		m2[1][0] = 03;
		m2[1][1] = 02;
		m2[1][2] = 01;
		m2[2][0] = 02;
		m2[2][1] = 01;
		m2[0][2] = 03;
		int contNeg=0; 
		for (int[] i : m2) {
			for (int b : i) {
				System.out.print(b);
				if(b<0) {
					contNeg+=1;
				}
				
			}
			System.out.println(" ");
		}
		System.out.println("Main diagonal:");
		for (int n1 = 0; n1 < m2.length; n1++) {
			System.out.print(m2[n1][n1]+", ");

		}
		System.out.println(" ");
		System.out.println("Negative numbers:"+contNeg);

	}

}
