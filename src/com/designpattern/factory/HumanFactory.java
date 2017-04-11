package com.designpattern.factory;

/**
 * Created by j-yangbo on 2017/4/11.
 */
public class HumanFactory {
    public static Human createHuman(String m) {
        Human human = null;
        if (m == null || m.length() < 1) {
            return null;
        }
        if (m.equals("boy")) {
            human = new Boy();
        }
        if (m.equals("girl")) {
            human = new Girl();
        }
        return human;
    }
}
