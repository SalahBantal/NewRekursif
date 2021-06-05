import recursive.Fibonaci;
import recursive.Name;
import recursive.Rank;
import recursive.Row;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Pangkat Bilangan
        System.out.println("===== Perpangkatan 3^15 =====");
        Integer rankResult = Rank.makeRank(3, 0, 0, 15);
        System.out.println(rankResult);

        // Deret Fibonaci
        System.out.println("===== Fibonaci =====");
        ArrayList<Integer> fibonaciResults = Fibonaci.makeFibonaci(0,0, 0, 10, new ArrayList<>());
        System.out.println(fibonaciResults);

        // deret/rows
        System.out.println("===== Deret =====");
        ArrayList<Integer> rowResults = Row.makeRows(2, 1, 0, 50, new ArrayList<>());
        System.out.println(rowResults);

        // name loop 100x <binding arrays>
        System.out.println("===== Nama 100x =====");
        ArrayList<String> nameResults = Name.generateName("Muhammad Akbar", 0, 100, new ArrayList<>());
        System.out.println(nameResults);

    }
}