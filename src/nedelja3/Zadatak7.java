package nedelja3;

import java.util.ArrayList;
import java.util.List;

public class Zadatak7 {

    //a) Prva funkcija kreira listu od 20 parnih brojeva.
    public static List<Integer> kreirajListuParnihBrojeva(){
        List<Integer> lista = new ArrayList<>();
        int element;
        for (int i = 0; i < 20; i++) {
            double randomBroj = Math.random() * 100 + 1;
            element = (int) randomBroj;
            if (element % 2 == 0)
                lista.add(element);
            else
                lista.add(element + 1);
        }
        return lista;
    }

    //Druga funkcija uzima listu iz primera a) i eleminise sve brojeve koji su deljivi sa 4
    public static void eliminisiDeljiveSaCetiri(List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
                lista.removeIf(n -> (n % 4 == 0));
        }
        System.out.println(lista);
    }

    public static void main(String[] args) {

        //Test a:
        System.out.println("Lista od 20 parnih brojeva:");
        List<Integer> lista = kreirajListuParnihBrojeva();
        System.out.println(lista);

        //Test b:
        System.out.println("Eliminisani svi deljivi sa 4: ");
        eliminisiDeljiveSaCetiri(lista);
    }
}
