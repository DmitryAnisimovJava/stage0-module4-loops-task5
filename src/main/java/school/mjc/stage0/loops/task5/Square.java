package school.mjc.stage0.loops.task5;


public class Square {
    public void printSquareFrom8s(int sideLength){
    	for(int size1 = 1; size1 <= sideLength; size1++ ) {
    		for (int size2 = 1; size2 <= sideLength; size2++) {
				if (size1 == 1 || size1 == sideLength) {
					System.out.print("8");
				} else {
					if (size2 == 1 || size2 == sideLength) {
						System.out.print("8");
					} else {
						System.out.print(" ");
					}
				}
			}
    		System.out.println();
    	}
    }
}
