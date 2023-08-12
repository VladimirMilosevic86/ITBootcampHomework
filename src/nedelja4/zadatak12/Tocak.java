package nedelja4.zadatak12;

public class Tocak {

    private int trajanjeGumeUDanima;
    private boolean ostecenje;
    private double cena;

    public Tocak(int trajanjeGumeUDanima, double cena) {
        this.trajanjeGumeUDanima = trajanjeGumeUDanima;
        this.cena = cena;
    }

    public Tocak() {
    }

    public int getTrajanjeGumeUDanima() {
        return trajanjeGumeUDanima;
    }

    public void setTrajanjeGumeUDanima(int trajanjeGumeUDanima) {
        this.trajanjeGumeUDanima = trajanjeGumeUDanima;
    }

    public boolean isOstecenje() {
        return ostecenje;
    }

    public void setOstecenje(boolean ostecenje) {
        this.ostecenje = ostecenje;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tocak traje ").append(trajanjeGumeUDanima).append(" dana i smatra se ");
        if(ostecenje)
            sb.append("OSTECENIM.");
        else
            sb.append("NEOSTECENIM.");
        sb.append(" Cena tocka je ").append(cena).append(" dinara.");
        return sb.toString();
    }
}
