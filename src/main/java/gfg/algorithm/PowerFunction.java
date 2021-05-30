package gfg.algorithm;

import java.io.*;

class PowerFunction {

    /* A recursive function to get a^b
    Works only if a >= 0 and b >= 0 */
    static int pow(int a, int b)
    {

        if (b > 0)
            return multiply(a, pow(a, b - 1));
        else
            return 1;
    }

    /* A recursive function to get x*y */
    static int multiply(int x, int y)
    {

        if (y > 0)
            return (x + multiply(x, y - 1));
        else
            return 0;
    }

    /* driver program to test above functions */
    public static void main(String[] args)
    {
        System.out.println(pow(5, 3));
    }
}
