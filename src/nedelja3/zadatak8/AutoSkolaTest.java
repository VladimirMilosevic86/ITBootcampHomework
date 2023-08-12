package nedelja3.zadatak8;

public class AutoSkolaTest {

    public static void main(String[] args) {
        AutoSkola as = new AutoSkola("AS Zeleno svetlo", 33, 5000, "autobus");

        System.out.println(as + "\n" +
                "Skola ima " + as.brojGrupa() + " grupe" +
                ". Na " + as.tipVozila + "u " + as.daLiJePolaganjeMoguce() + " moguce polagati voznju.");

        System.out.println("\n=================================================================\n");

        AutoSkola as1 = new AutoSkola("Dva Tocka", 25, 4000, "motor");
        System.out.println(as1);
        System.out.println("Cena polaganja na motoru posle popusta iznosi: " + as1.popustZaMotor());
    }
}
