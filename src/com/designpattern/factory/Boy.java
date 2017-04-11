package com.designpattern.factory;

/**
 * Created by j-yangbo on 2017/4/11.
 */
public class Boy implements Human {
    @Override
    public void Talk() {
        System.out.println("Boy is talking...");
    }

    @Override
    public void Walk() {
        System.out.println("Boy is walking...");
    }
}
