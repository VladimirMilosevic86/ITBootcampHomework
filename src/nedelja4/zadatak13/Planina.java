package nedelja4.zadatak13;

public class Planina {

    private String nazivPlanine;
    private int visinaPlanine;

    public Planina(String nazivPlanine, int visinaPlanine) {
        this.nazivPlanine = nazivPlanine;
        if (visinaPlanine > 0)
            this.visinaPlanine = visinaPlanine;
        else {
            this.visinaPlanine = 0;
            System.out.println("GRESKA: Planina ne moze imati negativnu visinu, pa je visina podesena na " + this.visinaPlanine);
        }
    }

    public String getNazivPlanine() {
        return nazivPlanine;
    }

    public void setNazivPlanine(String nazivPlanine) {
        this.nazivPlanine = nazivPlanine;
    }

    public int getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(int visinaPlanine) {
        if (visinaPlanine > 0)
            this.visinaPlanine = visinaPlanine;
        else {
            System.out.println("UPOZORENJE: Visina planine se ne moze postaviti na negativnu vrednost, pa je vracena na " + this.visinaPlanine);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planina ").append(nazivPlanine).append(" je visoka ").append(visinaPlanine).append(" m.\n");
        return sb.toString();
    }
}
