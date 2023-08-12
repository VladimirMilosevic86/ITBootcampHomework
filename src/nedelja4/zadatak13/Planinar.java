package nedelja4.zadatak13;

import java.util.ArrayList;

public class Planinar implements Planinarenje{

    private ArrayList<Planina> planine;
    private int maxUspon;
    private double tezinaOpreme;

    public Planinar(ArrayList<Planina> planine, int maxUspon, double tezinaOpreme) {
        this.planine = new ArrayList<>();
        //da li ovo mozda pravi problem sa metodom setujPenjanje u test klasi. da li je trebalo umesto svega ovoga this.planine = planine;
        for (Planina p : planine){
            if (p.getVisinaPlanine() < maxUspon)
                this.planine.addAll(planine); // sta je razlika u radu ovoga i koda ispod. da li ovo pravi problem?
                //this.planine.add(p);
        }
        this.maxUspon = maxUspon;
        this.tezinaOpreme = tezinaOpreme;
    }

    public ArrayList<Planina> getPlanine() {
        return planine;
    }

    public void setPlanine(ArrayList<Planina> planine) {
        this.planine = planine;
    }

    public int getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(int maxUspon) {
        this.maxUspon = maxUspon;
    }

    public double getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(double tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    @Override
    public void popniSe(Planina p) {
        if (p.getVisinaPlanine() < maxUspon)
            planine.add(p);
    }

    @Override
    public double clanarina() {
        return 1000 - (1000 * 0.02 * planine.size());
    }

    @Override
    public int sviUsponi() {
        int sumaUspona = 0;
        for (Planina p : planine) {
            sumaUspona += p.getVisinaPlanine();
        }
        return sumaUspona;
    }

    @Override
    public Planina najvisaPlanina() {
        Planina najvisaPlanina = planine.get(0); //new Planina("MAX", Integre.MIN_VALUE); ako ovako definisem planinu ispisuje se greska iz konstruktora za Planinu iako program sve odradi dobro
        for (Planina p : planine){
            if (p.getVisinaPlanine() > najvisaPlanina.getVisinaPlanine())
                najvisaPlanina = p;
        }
        return najvisaPlanina;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Planinar se popeo na sledece planine:\n");
        for (Planina p : planine)
            sb.append(p).append("\n");
        sb.append("Najvisa visina na koju moze da se popne sa tezinom operme od ").append(tezinaOpreme).append(" kg je ").append(maxUspon).append(" m.");
        return sb.toString();
    }
}
