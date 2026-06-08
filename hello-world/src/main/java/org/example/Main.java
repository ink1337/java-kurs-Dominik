package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final Integer x = 12;

    public static void main(String[] args) {
        System.out.println("init");
        System.out.println("przed");
        Person p1 = new Person("ala", "piastów");
        var sum = p1.add(2,3);
        Person p2 = new Person("ala", "piastów");
        System.out.println(p1);
        Point point = new Point(2,3);
        Point.showTime();


        List<String> list = new ArrayList<>();
        int a = 3;
//        int b = ++a;
        int[][] tab = {
                {1, 2, 3},
                {4, 5, 6}
        };

        print2DTable(tab);

        double d = 0.1 + 0.2;
        float f = 123.2F;
        byte b = Byte.MAX_VALUE;
        char c = 'C';
        short s;
        boolean bool;
        long l = 125L;
        Long l1 = 125L;
        Long l2 = 125L;
//        System.out.println(l1==l2);
        l2++;
//        System.out.println(l1==l2);

        Vaule v1 = new Vaule(5);
        Vaule v2 = new Vaule(5);
//        System.out.println(v1.equals(v2));

        BigDecimal bigDecimal = BigDecimal.valueOf(0.1);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(0.2);
        BigDecimal bigDecimal3 = bigDecimal.add(bigDecimal2);
        String hello = null;
//        System.out.println(hello == "hello");
//        System.out.println(hello.equals("hello"));
//        System.out.println("hello".equals(hello));
        int age = 20;
        System.out.println(age >= 18 ? "Dorosły" : "Nieletni");
        String day = "Poniedziałek";
        int num = switch (day) {
            case "Poniedziałek" -> 1;
            case "Wtorek" -> 2;
            case "Środa" -> 3;
            default -> 0;
        };
    }

    private static void print2DTable(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                System.out.println(tab[i][j]);
            }
        }
    }

    static double getDoubleUsingSwitch(Object o) {
        return switch (o) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> Double.parseDouble(s);
            default -> 0d;
        };
    }

    static class Vaule {
        private int v;
        private int y;

        public Vaule(int v) {
            this.v = v;
        }

        public int getV() {
            return v;
        }

        public void setV(int v) {
            this.v = v;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;

            var vaule = (Vaule) o;
            return v == vaule.v && y == vaule.y;
        }

        // v 0 , y 31
        // v 1 , y 0
        @Override
        public int hashCode() {
            int result = v;
            result = 31 * result + y;
            return result;
        }
    }

}

record Point(int x, int y){
    public static void showTime(){
        System.out.println("show!!");
    }
}
