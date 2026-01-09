import java.io.FileWriter;
import java.io.IOException;

public class Player {
    private String nome;
    private int valore;

    public Player(String nome, int valore) {
        this.nome = nome;
        this.valore = valore;
    }

    public void salvaSuFile() {
        try {
            FileWriter writer = new FileWriter(nome + ".txt");
            writer.write(String.valueOf(valore));
            writer.close();
        } catch (IOException e) {
            System.out.println("Errore nella scrittura del file");
        }
    }

    public void salvaTeam() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'salvaTeam'");
    }

    public void save() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
}