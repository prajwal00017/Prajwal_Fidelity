import java.util.Scanner;
class GameInheritance{
    private String name;
    private int maxNumPlayers;

    public GameInheritance(String name, int maxNumPlayers) {
        this.name = name;
        this.maxNumPlayers = maxNumPlayers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNumPlayers() {
        return maxNumPlayers;
    }

    public void setMaxNumPlayers(int maxNumPlayers) {
        this.maxNumPlayers = maxNumPlayers;
    }

    @Override
    public String toString() {
        return "Maximum number of players for " + name + " is " + maxNumPlayers;
    }
}


