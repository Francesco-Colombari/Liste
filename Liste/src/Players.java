public class Players {
    public static void main(String[] args) {
        Player p1 = new Player("Marco", 100);
        Player p2 = new Player("Alice", 8);

        p1.salvaSuFile();
        p2.salvaSuFile();

        System.out.println("File salvati correttamente!");
    }
}


