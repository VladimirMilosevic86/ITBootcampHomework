package nedelja3.zadatak10;

public class Masinovodja extends Radnik {

    public Masinovodja(String ime, String prezime, int brojSati, double satnica) {
        super(ime, prezime, brojSati, satnica);
    }

    public Masinovodja() {
    }

    @Override
    public double ukupnaZarada() {
        return super.ukupnaZarada();
    }

    @Override
    public void daLiJeNaOdmoru(){
        if(getBrojSati() > 30)
            System.out.println("Da, " + getIme() + " " + getPrezime() + " je na odmoru!");
        else
            System.out.println("Ne, " + getIme() + " " + getPrezime() + " nije na odmoru!");
    }

    @Override
    public String toString() {
        return "Masinovodja " + super.toString();
    }

}
