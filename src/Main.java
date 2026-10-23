
public class Main {
    public static void main(String[] args) {
        Student studenti = new Student();

        System.out.println("Regjistrimi perfundoi");


        studenti.emri = "Ana";
        studenti.nota = 8;
        studenti.email = "ana@example.com";

        studenti.afishoTeDhenat();

        if (studenti.kaKaluar()) {
            System.out.println("Studenti ka kaluar provimin.");
        } else {
            System.out.println("Studenti nuk e ka kaluar provimin.");
        }
    }
}

