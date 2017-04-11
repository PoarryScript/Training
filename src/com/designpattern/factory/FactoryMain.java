package com.designpattern.factory;

/**
 * Created by j-yangbo on 2017/4/11.
 */
public class FactoryMain {
    public static final String KEY_BOY = "boy";
    public static final String KEY_GIRL = "girl";

    public static void main(String[] args) {
        HumanFactory.createHuman(KEY_BOY).Talk();
        HumanFactory.createHuman(KEY_GIRL).Walk();

    }
}
