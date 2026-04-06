package sarzona;
import java.util.*;
import java.io.*;
public class sarzona {
	public static void main(String[] args) {
		Scanner deb = new Scanner(System.in);
//		System.out.print("Enter number of Class: ");
//		int a = deb.nextInt();
//        for(int c = 0; c<a; c++) {
//		System.out.print("Enter Number of Student in Class " + (c+1) + ": ");
//		int b = deb.nextInt();
//        String[][] name = new String[a][b];
//        }
		int[][]numbers = {{120,250,789,7},{58,79,31,87},{8,1,2,3},{99,98,97,96}};
for(int a = 0;a<numbers.length; a++ ) {
	for(int b = 0; b<numbers[a].length;b++) {
		System.out.print(numbers[a][b] + ", ");
	}
	System.out.println(" ");
}
for(int a = 0;a<numbers.length; a++ ) {
	for(int b = 0; b<numbers[a].length;b++) {
		if(numbers[a][b] == 1) {
			numbers[a][b] = 50;
			System.out.println("\nNumber 1 is found at indices " + (a) + " and " + (b) +"\n");
			
		}
	}
}

for(int a = 0;a<numbers.length; a++ ) {
	for(int b = 0; b<numbers[a].length;b++) {
		System.out.print(numbers[a][b] + ", ");
	}
	System.out.println(" ");
}
		
for(int a = 0; a<numbers[1].length; a++){
	numbers[1][a] = 0;
}

System.out.println(); 

for(int a = 0;a<numbers.length; a++ ) {
	for(int b = 0; b<numbers[a].length;b++) {
		System.out.print(numbers[a][b] + ", ");
	}
	System.out.println(" ");
}

		
		
	 }
	}


