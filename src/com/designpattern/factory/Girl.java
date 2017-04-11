package com.designpattern.factory;

/**
 * Created by j-yangbo on 2017/4/11.
 */
public class Girl implements Human {
    @Override
    public void Talk() {
        System.out.println("Girl is Talking...");
    }

    @Override
    public void Walk() {
        System.out.println("Girl is Walking...");

    }
}
