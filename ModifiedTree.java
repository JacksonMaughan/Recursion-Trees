package Practice13package;

import java.awt.Color;

public class ModifiedTree {
	public static void ModifiedTree(int n, double x, double y, double a, double branchRadius, double penSize) {
        double bendAngle   = Math.toRadians(15);
        double branchAngle = Math.toRadians(37);
        double branchRatio = 0.65;

        Color brown = new Color(43, 29, 20); 
        double cx = x + Math.cos(a) * branchRadius;
        double cy = y + Math.sin(a) * branchRadius;
        StdDraw.setPenRadius(penSize);
        StdDraw.setPenColor(brown);
        //making new colors
        Color green = new Color(178, 194, 72); 
        Color darkGreen = new Color(52, 124, 44); 
        if (n<5) {
        	StdDraw.setPenColor(green);
        	
        }
        if(n<7 && n>4){
        StdDraw.setPenColor(darkGreen);
	}
        
        
        StdDraw.line(x, y, cx, cy);
        if (n == 0) return;

        ModifiedTree(n-1, cx, cy, a + bendAngle - branchAngle, branchRadius * branchRatio, penSize);
        //recursion
        ModifiedTree(n-1, cx, cy, a + bendAngle + branchAngle, branchRadius * branchRatio, penSize/1.5);
        //recursion
        ModifiedTree( n-1, cx , cy , a + bendAngle , branchRadius * ( 1 - branchRatio ), penSize/2 ) ;
        
                
    }


    
    public static void main(String[] args) {
    	int n = 8;
        StdDraw.enableDoubleBuffering();
        ModifiedTree(n, 0.5, 0, Math.PI/2, 0.3, 0.015);
        StdDraw.show();
    }
    

}

