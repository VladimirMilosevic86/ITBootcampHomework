package nedelja3.zadatak10;

public class Fizikalac extends Radnik {

    public Fizikalac(String ime, String prezime, int brojSati, double satnica) {
        super(ime, prezime, brojSati, satnica);
    }

    public Fizikalac() {
    }

    @Override
    public double ukupnaZarada() {
        return super.ukupnaZarada();
    }

    @Override
    public void daLiJeNaOdmoru(){
        if(getBrojSati() > 40)
            System.out.println("Da, " + getIme() + " " + getPrezime() + " je na odmoru!");
        else
            System.out.println("Ne, " + getIme() + " " + getPrezime() + " nije na odmoru!");
    }

    @Override
    public String toString() {
        return "Fizikalac " + super.toString();
    }


}
