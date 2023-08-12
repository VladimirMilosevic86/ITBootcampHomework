package nedelja3.zadatak10;

public class Radnik {

    private String ime;
    private String prezime;
    private int brojSati;
    private double satnica;

    private void podesiBrojSati(int brojSati) {
        if (brojSati >= 0)
            this.brojSati = brojSati;
        else {
            this.brojSati = 0;
            System.out.println("GRESKA! Broj sati je postavljen na " + this.brojSati + " jer je unet negativan broj sati!");
        }
    }

    private void podesiSatnicu(double satnica) {
        if (satnica >= 0)
            this.satnica = satnica;
        else {
            this.satnica = 0;
            System.out.println("GRESKA! Satnica je postavljena na " + this.satnica + " jer je uneta negativna satnica!");
        }
    }

    public Radnik() {
    }

    public Radnik(String ime, String prezime, int brojSati, double satnica) {
        this.ime = ime;
        this.prezime = prezime;
        podesiBrojSati(brojSati);
        podesiSatnicu(satnica);
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

    public int getBrojSati() {
        return brojSati;
    }

    public void setBrojSati(int brojSati) {
        if (brojSati >= 0)
            this.brojSati = brojSati;
        else
            System.out.println("UPOTORENJE: Broj sati je vracen na " + this.brojSati + " jer je unet negativan broj!");
    }

    public double getSatnica() {
        return satnica;
    }

    public void setSatnica(double satnica) {
        if (satnica >= 0)
            this.satnica = satnica;
        else
            System.out.println("UPOZORENJE: Satnica je vracena na " + this.satnica + " jer je unet negativan broj!");
    }

    public double ukupnaZarada() {
        return getBrojSati() * getSatnica();
    }

    public void daLiJeNaOdmoru() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append(" je radio ").append(brojSati).
                append(" sati, po satnici od ").append(satnica).append(" dinara.");
        return sb.toString();
    }
}
