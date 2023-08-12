package nedelja4.zadatak11;

import java.util.ArrayList;

public class Mancester extends SportskiKlub{

    public Mancester(ArrayList<Sportista> listaClanova, String grad, double budzet) {
        super(listaClanova, grad, budzet);
    }

    public Mancester() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" Ime kluba je Mancester.");
        return sb.toString();
    }
}
