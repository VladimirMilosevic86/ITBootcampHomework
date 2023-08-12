package nedelja4.zadatak12;

import java.util.ArrayList;

public abstract class MotornoVozilo {

    private ArrayList<Tocak> tockovi;
    private double cena;
    private int godinaProizvodnje;

    public MotornoVozilo(ArrayList<Tocak> tockovi, double cena, int godinaProizvodnje) {
        this.tockovi = tockovi;
        this.cena = cena;
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public MotornoVozilo() {
    }

    public ArrayList<Tocak> getTockovi() {
        return tockovi;
    }

    public void setTockovi(ArrayList<Tocak> tockovi) {
        this.tockovi = tockovi;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public abstract boolean daLiJeOstecen(Tocak t);
    public abstract void removeOstecenu();
    public abstract void ubaciRezervnu();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stanje tockova motornog vozila je sledece:\n");
        for (Tocak t : tockovi)
            sb.append(t.toString()).append("\n");
        sb.append("Vozilo je proizvedeno ").append(godinaProizvodnje).append(". godine, i kosta ").append(cena).append(" dinara.");
        return sb.toString();
    }
}
