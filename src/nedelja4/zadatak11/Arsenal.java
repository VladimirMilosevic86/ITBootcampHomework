package nedelja4.zadatak11;

import java.util.ArrayList;

public class Arsenal extends SportskiKlub{

    public Arsenal(ArrayList<Sportista> listaClanova, String grad, double budzet) {
        super(listaClanova, grad, budzet);
    }

    public Arsenal() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" Ime kluba je Arsenal.");
        return sb.toString();
    }
}
