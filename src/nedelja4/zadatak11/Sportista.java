package nedelja4.zadatak11;

import java.util.Objects;

public class Sportista {

    private String ime;
    private String prezime;
    private static int JMBG = 1;
    private int jmbg;
    private double plata;


    public Sportista(String ime, String prezime, double plata) {
        this.jmbg = JMBG;
        JMBG++;
        this.ime = ime;
        this.prezime = prezime;
        this.plata = plata;
    }

    public Sportista() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getJmbg() {
        return jmbg;
    }

    public void setJmbg(int jmbg) {
        this.jmbg = jmbg;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (hashCode() != o.hashCode()) return false;
        if (!(o instanceof Sportista sportista)) return false;
        return jmbg == sportista.jmbg && Double.compare(sportista.plata, plata) == 0 &&
                Objects.equals(ime, sportista.ime) && Objects.equals(prezime, sportista.prezime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ime, prezime, jmbg, plata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sportista ").append(ime).append(" ").append(prezime).append(" ciji je JMBG - ").append(jmbg).
                append(", zaradjuje $").append(plata);
        return sb.toString();
    }
}
