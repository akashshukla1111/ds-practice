package com.collection.practicejava;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by akasshukla on 5/29/17.
 */
public class BuilderPatterTest {

    @Test
    public void printValue(){
        BuilderPatter.BuilderFactory builderFactory = new BuilderPatter.BuilderFactory(23,"mnnit2k13.akash@gmail.com");
        BuilderPatter build = builderFactory.withAddress("sarjapur road Bangalore").withName("Abhishek").withEmailId("abhishek001@gmail.com").build();
        System.out.println(build);
    }

    @Test
    public void testing() throws Exception {
        int mx=1;
        for (int i=1 ;i<20;i++){
            int[] abc = new int[mx];
            mx=mx*mx*i;
        }
    }
}