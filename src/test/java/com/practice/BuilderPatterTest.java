package com.practice;

import com.practice.mics.pattern.BuilderPatter;
import org.junit.jupiter.api.Test;


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
}