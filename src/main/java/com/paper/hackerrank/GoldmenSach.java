package com.hackerrank.paper;

/**
 * Created by akash on 14/02/16.
 */
public class GoldmenSach {
    public int path(int m,int n){
        int i=0;
        if(m==1 || n ==1)
            return 1;
        else {
            i = path(m - 1, n) + path(m, n - 1);
        }
        return i;
    }
}
