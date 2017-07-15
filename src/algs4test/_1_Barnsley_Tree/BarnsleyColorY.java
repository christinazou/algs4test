package algs4test._1_Barnsley_Tree;
/******************************************************************************
 *  Compilation:  javac Barnsley.java
 *  Execution:    java Barnsley n
 *  Dependencies: StdDraw.java
 *
 *  Play chaos game to produce Barnsley's fern.
 *
 *  % java Barnsley 10000
 *
 *  Reference: http://physics.wm.edu/~shiwei/courses/Phys690F03/HW/hw1/prob2.pdf
 *
 ******************************************************************************/

import java.awt.Color;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class BarnsleyColorY {

    public static void main(String[] args) {
    	 int n = 10000; //Integer.parseInt(args[0]);       // number of points to draw
             // See Section 3.1
       

        // apply the update rules
        double x = 0.5;
        double y = 0.0;
        for (int i = 0; i < n; i++) {
            double tempx, tempy;
            double r = StdRandom.uniform(0.0, 1.0);
            
            if (x>0.5)  {  StdDraw.setPenColor(Color.red);}
            else {
            	 StdDraw.setPenColor(Color.blue);
            }

            if (r <= 0.02)  {
                tempx = 0.5;
                tempy = 0.27 * y;
            }
            else if (r <= 0.17) {
                tempx = -0.139 * x + 0.263 * y + 0.5700;
                tempy =  0.246 * x + 0.224 * y - 0.0360;
            }
            else if (r <= 0.30) {
                tempx =  0.170 * x - 0.215 * y + 0.4080;
                tempy =  0.222 * x + 0.176 * y + 0.0893;
            }
            else {
                tempx =  0.781 * x + 0.034 * y + 0.1075;
                tempy = -0.032 * x + 0.739 * y + 0.2700;
            }

            x = tempx;
            y = tempy;
            StdDraw.point(x, y);
        }
    }
   
}
