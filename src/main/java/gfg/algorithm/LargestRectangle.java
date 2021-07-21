package gfg.algorithm;

import java.util.Stack;

class LargestRectangle {

    //https://gist.github.com/SuryaPratapK/c038462261b995f7e0b08df64f47c6ee
    public static int largestRectangleArea(int[] heights) {

        int maximumRectangle = 0;
        Stack<Integer> stack = new Stack<> ();

        for (int i = 0; i <= heights.length; i++) {
            while (!stack.isEmpty () && (i == heights.length || heights[stack.peek ()] > heights[i])) {
                int length = heights[stack.pop ()];
                int width = stack.isEmpty () ? i : i - stack.peek () - 1;
                maximumRectangle = Math.max (maximumRectangle, length * width);
            }

            stack.push (i);
        }

        return maximumRectangle;
    }

    public static void main(String[] args) {
       int[] heights = {2,1,5,6,2,3};
System.out.println(largestRectangleArea(heights));
    }
}

