package nedelja3.zadatak10;

public class SefSmene extends Radnik {

    private double nedeljniBonus;

    public SefSmene() {
    }

    public SefSmene(String ime, String prezime, int brojSati, double satnica, double nedeljniBonus) {
        super(ime, prezime, brojSati, satnica);
        this.nedeljniBonus = nedeljniBonus;
    }

    public double getNedeljniBonus() {
        return nedeljniBonus;
    }

    public void setNedeljniBonus(double nedeljniBonus) {
        this.nedeljniBonus = nedeljniBonus;
    }

    @Override
    public double ukupnaZarada(){
        return getBrojSati() * getSatnica() + getNedeljniBonus();
    }

    @Override
    public void daLiJeNaOdmoru(){
        if(getBrojSati() > 50)
            System.out.println("Da, " + getIme() + " " + getPrezime() + " je na odmoru!");
        else
            System.out.println("Ne, " + getIme() + " " + getPrezime() + " nije na odmoru!");
    }

    @Override
    public String toString() {
        return "Sef smene " + super.toString();
    }
}
