package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
    	for(int cathetus1 = 1; cathetus1 <= cathetusLength; cathetus1++) {
    		int cathetus2 = 1;
    		while (cathetus1 >= cathetus2) {
				System.out.print("8");
				cathetus2++;
			}
    		System.out.println();
    	}
    }
}
