package com.nivas.beanfactorypostprocesserexample;

public class MyBean {
    private String myProp;

    public String getMyProp() {
        return myProp;
    }

    public void setMyProp(String myProp) {
        this.myProp = myProp;
    }

    public void doSomething () {
        System.out.println("from MyBean:  " + myProp);
    }
}
