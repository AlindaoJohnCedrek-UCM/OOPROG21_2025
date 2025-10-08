package PracJava;

public class TableAndChairs {
	public static void main(String[] args) {
		int column = 22;
		int row = 6;
		System.out.println();
		System.out.println();
		System.out.println();

		for (int i = 0; i < row; i++) {
			System.out.print("X");
			for (int j = 1; j < column; j++) {
				if (i == 2) {
					if (j == column - 1 || (j >= 6 && j <= 15)) {
						System.out.print("X");
						continue;
					} 
					else {
						System.out.print(" ");
						continue;
					}
				}
				else if(i >= 3) {
					if(i == 3) {
						if((j == 5 || j == 16)||(j >= 7 && j <= 14)) {
							System.out.print(" ");
						}
						else {
							System.out.print("X");
						}
					
					}
					else if(i >= 4) {
						if(j == 4 || j == 6 || j == 15 || j == 17 || j == column - 1) {
							System.out.print("X");
						}
						else {
							System.out.print(" ");
						}
						
					}
					continue;
				}

				if (j == column - 1) {
					System.out.print("X");

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}