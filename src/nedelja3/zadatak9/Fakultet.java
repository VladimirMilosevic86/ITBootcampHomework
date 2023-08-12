package nedelja3.zadatak9;

import java.util.ArrayList;

public class Fakultet {

    private String naziv;
    private ArrayList<Departman> listaDepartmana;


    public Fakultet() {
    }

    public Fakultet(String naziv, ArrayList<Departman> listaDepartmana) {
        this.naziv = naziv;
        this.listaDepartmana = new ArrayList<>();
        //this.departmani.add(d);
        this.listaDepartmana.addAll(listaDepartmana);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Departman> getListaDepartmana() {
        return listaDepartmana;
    }

    public void setListaDepartmana(ArrayList<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }

    public int ukupanBrojUcenika(){
        int suma = 0;
        // krece od objekta tipa Departman na indexu 0 do zadnjeg objekta u okviru liste departmani
        for (Departman d: listaDepartmana)
            suma += d.getBrojStudenata();
        return suma;
    }

    public void dodajPredmeteNaDepartman(){
        for (Departman d : listaDepartmana){ //ide od objekta na ideksu d0 (tip objekta Departman) do indexa dn u okviru liste departmani
            //u okviru objekta Departman na indexu x, pristupi/uzmi naziv toh objekta pomocu get i proveri da li je on "matematika" pomocu equals...
            if (d.getNazivDepartmana().equalsIgnoreCase("matematika") || d.getNazivDepartmana().equalsIgnoreCase("biologija"))
                d.setBrojStrucnihPredmeta(d.getBrojStrucnihPredmeta() + 5);
        }
    }

    public void dodajPredmeteDepartman(){
        for (int i = 0; i < listaDepartmana.size(); i++) {
            if(listaDepartmana.get(i).getNazivDepartmana().equalsIgnoreCase("matematika") || listaDepartmana.get(i).getNazivDepartmana().equalsIgnoreCase("biologija"))
                listaDepartmana.get(i).setBrojStrucnihPredmeta(listaDepartmana.get(i).getBrojStrucnihPredmeta() + 5);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fakultet ").append(naziv).append(" ima departmane :\n");
        int x = 1;
        for (Departman d: listaDepartmana) {
            sb.append(x).append(". ").append(d.toString()).append("\n");
            x += 1;
        }
        return sb.toString();
    }
}
