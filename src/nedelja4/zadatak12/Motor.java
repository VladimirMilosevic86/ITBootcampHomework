package nedelja4.zadatak12;

import java.util.ArrayList;

//Motor - 2 tocka i 1 rezervna guma
public class Motor extends MotornoVozilo{

    public Motor(ArrayList<Tocak> tockovi, double cena, int godinaProizvodnje) {
        super(tockovi, cena, godinaProizvodnje);
        //ne bi trebalo da mozemo da napravimo motor sa manje od 2 tocka
        if (tockovi.size() < 2)
            //umesto ovoga bi trebalo da baci neku gresku
            System.out.println("Motor mora imati 2 tocka!");
    }

    public Motor() {
    }

    @Override
    public boolean daLiJeOstecen(Tocak t) {
        if (t.getTrajanjeGumeUDanima() > 200){
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

    //brojac da moze da zameni jednu gumu
    @Override
    public void ubaciRezervnu() {
        Tocak rezervni = new Tocak(0, 500.00);
        while (getTockovi().size() < 2)
            getTockovi().add(rezervni);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vase vozilo je MOTOR.\n").append(super.toString());
        return sb.toString();
    }

}
