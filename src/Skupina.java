import java.util.ArrayList;

public class Skupina {

    private final String cisloSkupiny;
    private ArrayList<Student> studenti;

    public Skupina(String cisloSkupiny) {
        this.cisloSkupiny = cisloSkupiny;
        this.studenti = new ArrayList<>();
    }

    public void pridajStudenta(Student student) {
        this.studenti.add(student);
    }

    public void vypis() {
        for (Student s : this.studenti) {
            System.out.println(s);
        }
    }
}
