public class Student {
    private String meno;
    private String priezvisko;
    private String osobneCislo;

    public Student(String meno, String priezvisko, String osobneCislo) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.osobneCislo = osobneCislo;
    }

    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public String getOsobneCislo() {
        return osobneCislo;
    }

    @Override
    public String toString() {
        return "Student{" +
            "meno='" + meno + '\'' +
            ", priezvisko='" + priezvisko + '\'' +
            ", osobneCislo='" + osobneCislo + '\'' +
            '}';
    }
}