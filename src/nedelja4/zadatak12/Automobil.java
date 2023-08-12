package nedelja4.zadatak12;

import java.util.ArrayList;
//Automobil - 4 tocka + 2 rezervne gume
public class Automobil extends MotornoVozilo{

    public Automobil(ArrayList<Tocak> tockovi, double cena, int godinaProizvodnje) {
        super(tockovi, cena, godinaProizvodnje);
        //ne bi trebalo da mozemo da napravimo automobil sa manje od 4 tockova (4 regularna)
        if (tockovi.size() < 4)
            //umesto ovoga bi trebalo da baci neku gresku
            System.out.println("Automobil mora imati 4 tocka!");
    }

    public Automobil() {
    }

    @Override
    public boolean daLiJeOstecen(Tocak t) {
        if (t.getTrajanjeGumeUDanima() >= 365){
            t.setOstecenje(true);
            return true;
        }
        else
            t.setOstecenje(false);
        return false;
    }

    @Override
    public void removeOstecenu() {
        for (int i = getTockovi().size() - 1; i >=0 ; i--) {
            if (getTockovi().get(i).isOstecenje()) {
                getTockovi().remove(i);
            }
        }
    }

    //brojac da moze da zameni najvise dve gume
    @Override
    public void ubaciRezervnu() {
        Tocak rezervni = new Tocak(0, 1_500.00);
        while (getTockovi().size() < 4)
            getTockovi().add(rezervni);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vase vozilo je AUTOMOBIL.\n").append(super.toString());
        return sb.toString();
    }
}
