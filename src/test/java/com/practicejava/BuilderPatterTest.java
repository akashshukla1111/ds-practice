package com.practicejava;

import com.practicejava.pattern.BuilderPatter;
import org.junit.Test;

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