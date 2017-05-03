package com.training.algorithm;

/**
 * Created by j-yangbo on 2017/4/28.
 */
public class Testmain {
    public static void main(String[] args) {

        System.out.println("lll"+args.length);
        ColorPoint[] cpa = new ColorPoint[10];
        Point[] pa = cpa;
        System.out.println(pa[1]==null);
        System.out.println(""+pa[0]);
        LinkageError linkageError;
        VirtualMachineError virtualMachineError;
        Class  c;
        assert true;
        System.out.println("===");
        System.out.println(pa.getClass());

        System.out.println(pa.getClass().getSimpleName());

        try {

         pa[0] = new ColorPoint();
     }catch (ArrayStoreException e){
         e.printStackTrace();
     }
    }
}
class Point{
    int x,y;
}
class ColorPoint extends Point{
    int color;
}
