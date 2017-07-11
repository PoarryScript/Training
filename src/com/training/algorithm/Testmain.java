package com.training.algorithm;

import com.sun.javafx.collections.ArrayListenerHelper;

import javax.xml.parsers.DocumentBuilderFactory;
import java.security.Security;
import java.util.*;

/**
 * Created by j-yangbo on 2017/4/28.
 */
public class Testmain {
    private static Map<String, Integer> map;

    static {
        map = new HashMap<>();
        map.put("", 2);
        Collections.unmodifiableMap(map);
    }
    DocumentBuilderFactory documentBuilderFactory;
    private static Map<String, Integer> map2 = new HashMap<String, Integer>() {
        {
            put("", 4);
            put("", 43);
        }
    };

    public static void main(String[] args) {

        System.out.println("lll" + args.length);
        ColorPoint[] cpa = new ColorPoint[10];
        Point[] pa = cpa;
        System.out.println(pa[1] == null);
        System.out.println("" + pa[0]);
        LinkageError linkageError;
        VirtualMachineError virtualMachineError;
        Class c;
        assert true;
        System.out.println("===");
        System.out.println(pa.getClass());

        System.out.println(pa.getClass().getSimpleName());

        try {

            pa[0] = new ColorPoint();
        } catch (ArrayStoreException e) {
            e.printStackTrace();
        }


        assert true;
        System.out.println("-----");


        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        int length = trace.length;
        System.out.println("" + length);
//    assert false: "assert is loading from this part ";
        System.out.println("======");

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1, 2, 3);
        Utils.printIntegerList(arrayList);
        System.out.println("||||" + arrayList.size());
        Utils.printIntegerList(arrayList);
        arrayList.add(43);
        System.out.println("-----++++" + arrayList.size());
        Utils.printIntegerList(arrayList);

        String password = "my password";

        if (password instanceof String){

        }
    }

    private boolean atLast2True(boolean a, boolean b, boolean c) {
        return a ? (b || c) : (b & c);
    }
}


class Point {
    int x, y;
}

class ColorPoint extends Point {
    int color;
}
