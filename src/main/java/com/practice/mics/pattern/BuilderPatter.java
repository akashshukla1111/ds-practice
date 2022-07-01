package com.practice.mics.pattern;

/**
 * Created by akasshukla on 5/29/17.
 */
public class BuilderPatter {

    private int id;
    private String name;
    private String address;
    private String emailId;

    private BuilderPatter(BuilderFactory builderFactory){
        this.id=builderFactory.id;
        this.name=builderFactory.name;
        this.address=builderFactory.address;
        this.emailId=builderFactory.emailId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "BuilderPatter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public static class BuilderFactory{
        private int id;
        private String name;
        private String address;
        private String emailId;

        public BuilderFactory(int id,String email){
            this.id=id;
            this.emailId=email;
        }

        public BuilderFactory withName(String name){
            this.name=name;
            return this;
        }
        public BuilderFactory withAddress(String address){
            this.address=address;
            return this;
        }
        public BuilderFactory withEmailId(String emailId){
            this.emailId=emailId;
            return this;
        }
        public BuilderPatter build(){
            BuilderPatter bp = new BuilderPatter(this);
            return bp;
        }
    }
}
