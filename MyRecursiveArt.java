package Practice13package;

import java.awt.Color;

public class MyRecursiveArt {
	public static void MyRecursiveArt(int n, double x, double y, double a, double branchRadius, double penSize) {
        double bendAngle   = Math.toRadians(0);
        double branchAngle = Math.toRadians(135);
        double branchRatio = 0.5;
        double cx = x + Math.cos(a) * branchRadius;
        double cy = y + Math.sin(a) * branchRadius;
        StdDraw.setPenRadius(penSize);
        StdDraw.setPenColor(Color.BLUE);
        
        
	
        
        
        StdDraw.line(x, y, cx, cy);
        if (n == 0) return;

        MyRecursiveArt(n-1, cx, cy, a + bendAngle - branchAngle, branchRadius * branchRatio, penSize);
        MyRecursiveArt(n-1, cx, cy, a + bendAngle + branchAngle, branchRadius * branchRatio, penSize); 
        //recursive statement
        MyRecursiveArt( n-1, cx , cy , a + bendAngle , branchRadius * ( 0.5 - branchRatio ), penSize ) ;
        
                
    }


    
    public static void main(String[] args) {
    	int n = 5;
        StdDraw.enableDoubleBuffering();
        MyRecursiveArt(n, 0.5, 0, Math.PI/2, 0.5, 0.002);
        StdDraw.show();
    }
    

}



