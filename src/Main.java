public class Main {
    public static void main(String[] args) {
        Fighter selin = new Fighter("Selin", 15, 100, 90, 12);
        Fighter ayse = new Fighter("Ayşe", 10, 100, 100, 100);

        Ring r = new Ring(selin, ayse, 90, 100);
        r.run();
    }
}
