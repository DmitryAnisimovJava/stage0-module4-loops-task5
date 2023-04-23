package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
    	for(double size = 1; size <= sideLength; size++) {
    		String crossString = "";
    		for(double size2 = 1; size2 <= sideLength; size2++) {
    			crossString = (size == (sideLength + 1) / 2 || size2 == (sideLength + 1) / 2) ? 
    			crossString + "8" : crossString + " ";
    		}
    		System.out.println(crossString);
    	}	
    }
}
