package sample;

import sample1.TestDemo;

public class Demo {
    public static String getapp() {
        String appname= TestDemo.run();
        System.out.println("HI "+ appname);
        return appname;
    }

    public static void main(String[] args) {
        Demo.getapp();
    }
}
