package com.raicho.netty.bio;

/**
 * @author: Raicho
 * @Description:
 * @program: netty
 * @create: 2020-07-23 16:14
 **/
public class Md {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        Integer c = 100;
        Integer d = 200;
        Integer e = new Integer(200);

        System.out.println(a == c);
        System.out.println(b == d);
        System.out.println(d == e);
        System.out.println(b == e);
        System.out.println(d.equals(b));

        int aa = 1234;
        int bb = 1234;
        String cc = "ffffff";
        String dd = "ffffff";

        System.out.println(aa == bb);
        System.out.println(cc == dd);

    }
}
