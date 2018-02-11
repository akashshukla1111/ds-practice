package com.hackerrank.practice;

class GFG {
     
    /* A utility function to calculate area of triangle 
       formed by (x1, y1) (x2, y2) and (x3, y3) */
    static int area(int x1, int y1, int x2, int y2,
                                        int x3, int y3)
    {
       return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2);
    }
      
    /* A function to check whether point P(x, y) lies
       inside the triangle formed by A(x1, y1),
       B(x2, y2) and C(x3, y3) */

    static int pointsBelongToTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int xP, int yP, int xQ, int yQ) {
        int A = area (x1, y1, x2, y2, x3, y3);

        if (A==0)
            return 0;

        int P=isInside (x1, y1, x2, y2, x3, y3,xP,yP);
       int Q=isInside (x1, y1, x2, y2, x3, y3,xQ,yQ);

       if (A==P && A==Q){
           return 3;
       }else if (A==P){
            return 1;
       }else if (A==Q){
            return 2;
       }else {
           return 4;
       }
    }




    static int isInside(int x1, int y1, int x2,
                int y2, int x3, int y3, int x, int y)
    {
       /* Calculate area of triangle PBC */ 
        int A1 = area (x, y, x2, y2, x3, y3);
      
       /* Calculate area of triangle PAC */ 
        int A2 = area (x1, y1, x, y, x3, y3);
      
       /* Calculate area of triangle PAB */  
        int A3 = area (x1, y1, x2, y2, x, y);
        
       /* Check if sum of A1, A2 and A3 is same as A */
        return  A1 + A2 + A3;
    }
     
    /* Driver program to test above function */
    public static void main(String[] args) 
    {
        /* Let us check whether the point P(10, 15)
           lies inside the triangle formed by 
           A(0, 0), B(20, 0) and C(10, 30) */
        System.out.println(pointsBelongToTriangle(3,1,7,1,5,5,1,1,2,2));
             
    }
}