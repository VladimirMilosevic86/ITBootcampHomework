package nedelja4.zadatak11;

import java.util.ArrayList;

public class Spartak extends SportskiKlub{

    public Spartak(ArrayList<Sportista> listaClanova, String grad, double budzet) {

        super(listaClanova, grad, budzet);
    }

    public Spartak() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" Ime kluba je Spartak.");
        return sb.toString();
    }
}
