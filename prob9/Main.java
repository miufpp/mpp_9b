package lab9B.prob9;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
	      printSquares(10);
	   }
	
	public static void printSquares(int num) {
		IntStream.iterate(1, n->n+1).limit(num).forEach(n->System.out.println((n*n) + " "));
		
	}
}
