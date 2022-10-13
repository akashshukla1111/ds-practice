package com.practice.pepcoding.backtracking;

public class AbbreviationProblem {

    public void abbreviation(String input) {
        abbreviation(input, "", 0, 0);
    }

    private void abbreviation(String input, String psf, int count, int position) {
        if (position == input.length()){
            System.out.println(psf+(count==0?"":count));
            return;
        }

        abbreviation(input, psf + input.charAt(position), count, position + 1);
        abbreviation(input, psf, count+1, position + 1);

    }
}
