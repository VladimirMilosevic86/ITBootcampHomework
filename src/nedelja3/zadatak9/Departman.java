package nedelja3.zadatak9;
public class Departman {

    private String nazivDepartmana;
    private int brojStudenata;
    private int brojStrucnihPredmeta;

    private void postaviBrojStudenata(int brojStudenata){
        if(brojStudenata > 0)
            this.brojStudenata = brojStudenata;
        else {
            this.brojStudenata = 0;
            System.out.println("GRESKA: broj studenata je postavljen na " + this.brojStudenata +
                    " zato sto je unet nepozitivan broj!");
        }
    }

    private void postaviBrojStrucnihPredmeta(int brojStrucnihPredmeta){
        if(brojStrucnihPredmeta > 0)
            this.brojStrucnihPredmeta = brojStrucnihPredmeta;
        else {
            this.brojStrucnihPredmeta = 0;
            System.out.println("GRESKA: broj strucnih predmeta je postavljen na " + this.brojStrucnihPredmeta +
                    " zato sto je unet nepozitivan broj!");
        }
    }

    public Departman(String nazivDepartmana, int brojStudenata, int brojStrucnihPredmeta) {
        this.nazivDepartmana = nazivDepartmana;
        postaviBrojStudenata(brojStudenata);
        postaviBrojStrucnihPredmeta(brojStrucnihPredmeta);
    }

    public String getNazivDepartmana() {
        return nazivDepartmana;
    }

    public void setNazivDepartmana(String nazivDepartmana) {
        this.nazivDepartmana = nazivDepartmana;
    }

    public int getBrojStudenata() {
        return brojStudenata;
    }

    public void setBrojStudenata(int brojStudenata) {
        if(brojStudenata > 0)
            this.brojStudenata = brojStudenata;
        else
            System.out.println("UPOZORENJE: Broj studenata ne moze biti nepozitivan broj! Ostaje da je broj studenata: " +
                    this.brojStudenata);
    }

    public int getBrojStrucnihPredmeta() {
        return brojStrucnihPredmeta;
    }

    public void setBrojStrucnihPredmeta(int brojStrucnihPredmeta) {
        if(brojStrucnihPredmeta > 0)
            this.brojStrucnihPredmeta = brojStrucnihPredmeta;
        else
            System.out.println("UPOZORENJE: Broj strucnih predmeta ne moze biti nepozitivan broj! Ostaje da je broj " +
                    "strucnih predmeta: " + this.brojStrucnihPredmeta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nazivDepartmana).append(" ima ").append(brojStudenata).append(" studenta koji slusaju ").
                append(brojStrucnihPredmeta).append(" strucnih predmeta.");
        return sb.toString();
    }
}
