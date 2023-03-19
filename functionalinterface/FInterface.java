package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface PrintInfo<T> {
    void run(T t);
}

public class FInterface {
    public static void main(String[] args) {
        PrintInfo<String> printName = System.out::println;

        PrintInfo<Integer> printAge = System.out::println;

        printName.run("Furkan");


        Consumer<Integer> print = System.out::println;

        List<Integer> array = Arrays.asList(1, 2, 3);

        array.forEach(print);

    }
}
