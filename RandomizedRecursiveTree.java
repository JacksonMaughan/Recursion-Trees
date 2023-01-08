package Practice13package;
/* 
 * CS211 Assignment 02 
 * Jackson Maughan - jackson.maughan@bellevuecollege.edu
 * Student ID: 202 423 478
 * 05.13.22 
 */ 
import java.awt.Color;
import java.util.Random;

public class RandomizedRecursiveTree {
	public static void RandomizedRecursiveTree(int n, double x, double y, double a, double branchRadius, double penSize, Color randomColor) {
		Random rand = new Random();
		double bendAngle   = Math.toRadians(15);
        double randomAngle =rand.nextDouble(90);
       //making branch angle random
        double branchAngle = Math.toRadians(randomAngle);
        double branchRatio = 0.65;

         
        double cx = x + Math.cos(a) * branchRadius;
        double cy = y + Math.sin(a) * branchRadius;
        StdDraw.setPenRadius(penSize);
       
        
        
        StdDraw.setPenColor(randomColor);
        
        StdDraw.line(x, y, cx, cy);
        if (n == 0) return;

        RandomizedRecursiveTree(n-1, cx, cy, a + bendAngle - branchAngle, branchRadius * branchRatio, penSize, randomColor);
        //recursion
        RandomizedRecursiveTree(n-1, cx, cy, a + bendAngle + branchAngle, branchRadius * branchRatio, penSize/1.5, randomColor);
        //recursion
        RandomizedRecursiveTree( n-1, cx , cy , a + bendAngle , branchRadius * ( 1 - branchRatio ), penSize/2, randomColor ) ;
        
                
    }


    
    public static void main(String[] args) {
    	int n = 8;
    	Random rand = new Random();
        //making the random color
    	int red =rand.nextInt(255);
        int green =rand.nextInt(255);
        int blue =rand.nextInt(255);
        Color randomColor = new Color(red, green, blue);
        StdDraw.enableDoubleBuffering();
        RandomizedRecursiveTree(n, 0.5, 0, Math.PI/2, 0.3, 0.015, randomColor);
        StdDraw.show();
    }
    

}

