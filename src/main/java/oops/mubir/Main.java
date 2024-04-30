package oops.mubir;

import oops.mubir.defaultfuninterface.JustTest;
import oops.mubir.defaultfuninterface.StringConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {


        // System.out.println("Hello world!");


        List<Integer> outside = new ArrayList<>();
        JustTest obj = new JustTest(x -> {
            String mod = x.substring(2, 4);
            System.out.println(mod);
            outside.add(x.length());
        });

//        StringConsumer<String> consumer = x -> {
//            String mod = x.substring(2, 4);
//            System.out.println(mod);
//            outside.add(x.length());
//        };
//
//        JustTest obj2 = new JustTest(consumer);
        obj.process("uptolow");
        System.out.println(outside.get(0));
    }
}