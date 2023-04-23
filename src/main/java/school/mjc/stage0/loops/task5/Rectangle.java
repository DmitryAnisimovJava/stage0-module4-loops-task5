package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
    	for(int size1 = 1; size1 <= height; size1++) {
    		for(int size2 = 1; size2 <= length; size2++) {
    			if(size1 == 1 || size1 == height 
    				|| size2 == 1 || size2 == length) {
    				System.out.print("8");
    			} else {
					System.out.print(" ");
				}
    		}
    	System.out.println();
    	}
    }
}
