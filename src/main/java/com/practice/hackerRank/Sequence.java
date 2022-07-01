package com.practice.hackerRank;
	
    /*
        Created By : akasshukla
              Date : 1/17/18   2:55 AM
    */

import java.util.Vector;

public class Sequence {

	public static void main(String[] args) {
		System.out.println(printLeast("MM".toCharArray()));
	}

	public static int  printLeast(char[] arr)
	{
		// min_avail represents the minimum number which is
		// still available for inserting in the output vector.
		// pos_of_I keeps track of the most recent index
		// where 'I' was encountered w.r.t the output vector
		int min_avail = 1, pos_of_I = 0;

		//vector to store the output
		Vector<Integer> v=new Vector<>();

		// cover the base cases
		if (arr[0]=='N')
		{
			v.add(1);
			v.add(2);
			min_avail = 3;
			pos_of_I = 1;
		}
		else
		{
			v.add(2);
			v.add(1);
			min_avail = 3;
			pos_of_I = 0;
		}

		// Traverse rest of the input
		for (int i=1; i<arr.length; i++)
		{
			if (arr[i]=='N')
			{
				v.add(min_avail);
				min_avail++;
				pos_of_I = i+1;
			}
			else
			{
				v.add(v.get(i));
				for (int j=pos_of_I; j<=i; j++)
					//v.add(v.get(j)+1);

				min_avail++;
			}
		}

		// print the number
		String rs="";
		for (int i=0; i<v.size(); i++)
			rs=rs+v.get(i);

	return Integer.parseInt(rs);
	}

}
    
    