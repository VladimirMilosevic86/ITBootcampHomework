package nedelja4.zadatak11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class SportskiKlub{

    private ArrayList<Sportista> listaClanova;
    private String grad;
    private double budzet;

    public SportskiKlub(ArrayList<Sportista> listaClanova, String grad, double budzet) {
        this.listaClanova = new ArrayList<>();
        this.listaClanova.addAll(listaClanova);
        this.grad = grad;
        this.budzet = budzet;
    }

    public SportskiKlub(String grad, double budzet, Sportista ... listaClanova) {
        this.grad = grad;
        this.budzet = budzet;
        this.listaClanova = new ArrayList<>();
        Collections.addAll(this.listaClanova, listaClanova);

    }

    public SportskiKlub() {
    }

    public ArrayList<Sportista> getListaClanova() {
        return listaClanova;
    }

    public void setListaClanova(ArrayList<Sportista> listaClanova) {
        this.listaClanova = listaClanova;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public double getBudzet() {
        return budzet;
    }

    public void setBudzet(double budzet) {
        this.budzet = budzet;
    }

    public double isplati() {
        for (Sportista s : listaClanova) {
            budzet -= s.getPlata();
        }
        return budzet;
    }

    public double prosecnoPlaceni() {
        double zbirPlata = 0;
        for (Sportista s : listaClanova) {
            zbirPlata += s.getPlata();
        }
        return zbirPlata / listaClanova.size();
    }

    public void removePreplaceni() {
        listaClanova.removeIf(s -> s.getPlata() > prosecnoPlaceni());
        /*for (Sportista s : listaClanova) {
            if(s.getPlata() > prosecnoPlaceni())
                listaClanova.remove(s);
        }*/
    }

    private void ispisClanovaFormat(){
        for (Sportista s : listaClanova) {
            System.out.println(s);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (hashCode() != o.hashCode()) return false;
        if (!(o instanceof SportskiKlub that)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(that.budzet, budzet) == 0 && Objects.equals(listaClanova, that.listaClanova) && Objects.equals(grad, that.grad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), listaClanova, grad, budzet);
    }

    @Override
      public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append( "Clanovi kluba su:\n");
        for(Sportista s : listaClanova)
            sb.append(s.toString()).append("\n");
        sb.append("Klub se nalazi u gradu ").append(grad).append(" i ima budzet $").append(budzet).append(".");
        return sb.toString();
    }
}
