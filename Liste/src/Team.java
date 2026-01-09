import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Team {
    private String nome;
    private ArrayList<Player> players;

    public Team(String nome){
        this.nome=nome;
        players=new ArrayList<>();
    }
    public void add(Player p){
        players.add(p);
    }

    public void salvaTeam(){
        try {   
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nome + ".ser"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

    @Override
    public String toString() {
        return "Team [nome=" + nome + ", players=" + players + "]";

    }
}
