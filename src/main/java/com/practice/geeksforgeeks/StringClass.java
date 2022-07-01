package com.practice.geeksforgeeks;

public class StringClass {


    public void equalSumStringSum(String input) {

        int l = input.length();
        int[][] sumTable = new int[l][l];

        for (int i = 0; i < l; i++) {
            sumTable[i][i] = input.charAt(i) - '0';
        }
        int maxlen = 0;

        for (int ll = 2; ll <= l; ll++) {

            for (int i = 0; i < l - ll + 1; i++) {

                int j = ll - 1 + i;
                int k = ll / 2;
                sumTable[i][j] = sumTable[i][j - k] + sumTable[j - k + 1][j];

                if (ll % 2 == 0 && sumTable[i][j - k] == sumTable[j - k + 1][j] && maxlen < ll) {
                    maxlen = ll;
                }

            }
        }

        System.out.println(maxlen);

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(sumTable[i][j] + "");
            }
            System.out.println();
        }
    }


    public char firstNonRepeatingStringElement(String input) {
        int l = input.length();
        CountIndex[] countInx = new CountIndex[256];

        for (int i = 0; i < l; i++) {
            if (countInx[input.charAt(i)] == null)
                countInx[input.charAt(i)] = new CountIndex(i);
            else
                countInx[input.charAt(i)] = countInx[input.charAt(i)].increaseCount();

        }
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (countInx[i] != null && countInx[i].count == 1 && minIndex > countInx[i].index) {
                minIndex = countInx[i].index;
            }
        }
        return input.charAt(minIndex);
    }

    class CountIndex {
        int count = 1;
        int index;

        public CountIndex(int index) {
            this.index = index;
        }

        public CountIndex increaseCount() {
            count = count + 1;
            return this;
        }

        @Override
        public String toString() {
            return "count=" + count +", index=" + index;

        }
    }

    public static void main(String[] args) {
        StringClass stringClass = new StringClass();
        System.out.println(stringClass.firstNonRepeatingStringElement("geeksforgeeks"));
    }

}
