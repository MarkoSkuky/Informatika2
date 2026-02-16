public class Main {
    public static void main(String[] args) {

        var student = new Student("Marko", "Skukalek", "1");
        var skupina = new Skupina("5ZYI11");
        skupina.pridajStudenta(student);
        skupina.vypis();
    }
}
