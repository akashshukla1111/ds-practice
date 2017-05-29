package com.collection.practicejava;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by akasshukla on 5/29/17.
 */
public class BuilderPatterTest {

    @Test
    public void printValue(){
        BuilderPatter.BuilderFactory builderFactory = new BuilderPatter.BuilderFactory();
        BuilderPatter build = builderFactory.withId(23).withAddress("sarjapur road Bangalore").withName("Abhishek").withEmailId("abhishek001@gmail.com").build();
        System.out.println(build);
    }

}