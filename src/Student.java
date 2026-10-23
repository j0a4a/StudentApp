public class Student {
    String emri;
    int nota;

    public String rezultati() {
        if (nota >= 5) {
            return "Kalues";
        }
        return "Jo kalues";
    }
}



public class Student {
    String emri;
    int nota;
    String email;
}



public class Student {
    String emri;
    int nota;
    String email;

    public void afishoTeDhenat() {
        System.out.println("Emri: " + emri);
        System.out.println("Nota: " + nota);
        System.out.println("Email: " + email);
    }
}

