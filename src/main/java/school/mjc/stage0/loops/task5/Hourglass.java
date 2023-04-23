package school.mjc.stage0.loops.task5;

import javax.print.attribute.Size2DSyntax;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
    	int hourGlassBoundary1 = 1;
		int hourGlassBoundary2 = height;
    	for(int size1 = 1; size1 <= height; size1++) {
    		String hourGlass = "";
    		for (int size2 = 1; size2 <= height; size2++) {
    			if (size2 >= hourGlassBoundary1 && size2 <= hourGlassBoundary2) {
					hourGlass += "8";
				} else {
					hourGlass += " ";
				}
    		}
    		System.out.println(hourGlass);
    		
    		if ((size1 <= height / 2) && (height % 2 != 0)) {
    			hourGlassBoundary1++;
        		hourGlassBoundary2--;
    		} else if ((size1 > height / 2) && (height % 2 != 0)) {
				hourGlassBoundary1--;
				hourGlassBoundary2++;
			}
    		
    		if ((size1 < height / 2) && (height % 2 == 0)) {
    			hourGlassBoundary1++;
        		hourGlassBoundary2--;
			} else if ((size1 == height / 2) && (height % 2 == 0)) {
			} else if ((size1 > height / 2) && (height % 2 == 0)) {
				hourGlassBoundary1--;
				hourGlassBoundary2++;
			}
    	}
    }
    public static void main(String[] args) {
		Hourglass myHourglass = new Hourglass();
		myHourglass.printHourglassOfGivenSize(6);
	}
}
