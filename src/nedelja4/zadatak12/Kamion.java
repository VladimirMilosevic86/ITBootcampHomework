package nedelja4.zadatak12;

import java.util.ArrayList;

//Kamion - 12 tockova + 6 rezervnih guma
public class Kamion extends MotornoVozilo{

    public Kamion(ArrayList<Tocak> tockovi, double cena, int godinaProizvodnje) {
        super(tockovi, cena, godinaProizvodnje);
        //ne bi trebalo da mozemo da napravimo kamion sa manje od 12 tockova
        if (tockovi.size() < 12)
            //umesto ovoga bi trebalo da baci neku gresku
            System.out.println("Kamion mora imati 12 tockova!");
    }

    public Kamion() {
    }

    @Override
    public boolean daLiJeOstecen(Tocak t) {
        if (t.getTrajanjeGumeUDanima() > 120){
            t.setOstecenje(true);
            return true;
        }
        else
            t.setOstecenje(false);
        return false;
    }

    //izbrisace sve ostecene gume. Ako izbrise vise od 6 trebalo bi namestiti neku poruku da kamion mora na popravku jer ima samo 6 rezervnih guma
    //ILi bi moglo da se stavi da zameni 6 najostecenijih, a sa ostalima furaj majstore dok ne nadjes vulkanizera
    @Override
    public void removeOstecenu() {
        int brojac = 0;
        for (int i = getTockovi().size() - 1; i >=0 ; i--) {
            if (getTockovi().get(i).isOstecenje()) {
                getTockovi().remove(i);
                brojac++;
            }
        }
        if (brojac > 6)
            System.out.println("Skinuto je vise od 6 guma! Nema dovoljno rezervnih guma!"); //ovde bi trebalo da baci neku gresku
    }

    //Ovde isto treba uvesti brojac da moze da zameni do 6 guma
    @Override
    public void ubaciRezervnu() {
        Tocak rezervni = new Tocak(0, 5_000.00); // ovako izgleda rezervna guma
        while (getTockovi().size() < 12)
            getTockovi().add(rezervni);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vase vozilo je KAMION.\n").append(super.toString());
        return sb.toString();
    }
}
