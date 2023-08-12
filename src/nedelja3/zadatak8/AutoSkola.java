package nedelja3.zadatak8;

public class AutoSkola {

    String naziv;
    int brojLjudi;
    double cenaPolaganja;
    String tipVozila;

    public AutoSkola() {
    }

    public AutoSkola(String naziv, int brojLjudi, double cenaPolaganja, String tipVozila) {
        this.naziv = naziv;
        this.brojLjudi = brojLjudi;
        this.cenaPolaganja = cenaPolaganja;
        this.tipVozila = tipVozila;
    }
    //20 / x = 5
    public double popustZaMotor() {
        if (tipVozila.equalsIgnoreCase("motor"))
            cenaPolaganja *= 0.5;
        return cenaPolaganja;
    }

    public int brojGrupa() {
        int grupe = 0;
        if (brojLjudi < 5)
            return 0;
        else {
            for (int i = 0; i < brojLjudi; i+=10) {
                grupe ++;
            }
        }
        return grupe;
    }

    public String daLiJePolaganjeMoguce() {
        if(tipVozila.equalsIgnoreCase("autobus"))
            return "nije";
        return "jeste";
    }

    @Override
    public String toString() {
        return "Auto skola " + "\"" + naziv + "\"" +  " ima " + brojLjudi + " ljudi, a cena polaganja na " +
                tipVozila + "u iznosi " + cenaPolaganja;

    }

}
