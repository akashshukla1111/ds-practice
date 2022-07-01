package com.geeksforgeeks.practice;

import java.util.HashSet;

public class Testing extends HashSet<Paper> {

    public static void main(String[] args) {
        Testing t=new Testing();
        t.add(new Paper("monu"));
        t.add(new Paper("sonu"));
        t.add(new Paper("gone"));
        t.add(new Paper("monu"));
        t.add(new Paper("gonu"));

        System.out.println("size of no : "+t.size());


    }

    @Override
    public boolean add(Paper o){
        System.out.println(" nameing " + o);
        return super.add(o);
    }


}

class Paper{

    String name;

    Paper(String name){
        this.name=name;
    }
    @Override
    public String toString() {
        return name;
    }
}
