package oops.mubir.defaultfuninterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerIOI {
    static Consumer<List<Integer>> modify = myList ->{
        for(int i = 0;i<myList.size();i++){
            myList.set(i,myList.get(i)*2);
        }
    };

   static Consumer<List<Integer> > show = list->{
        list.stream().forEach(x->System.out.println(x+" ,"));
    };

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(5);
        myList.add(7);

        modify.accept(myList);
        show.accept(myList);

        System.out.println("###############");
        modify.andThen(show).accept(myList);
    }
}
