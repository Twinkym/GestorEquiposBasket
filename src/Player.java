public class Player {
    private String playerName;
    private int numberOfBaskets;
    private int numberOfAssists;
    private int numberOfBounces;

    public Player(String playerName, int numberOfBaskets, int numberOfAssists,int numberOfBounces){
        this.playerName = playerName;
        this.numberOfBaskets = numberOfBaskets;
        this.numberOfAssists = numberOfAssists;
        this.numberOfBounces = numberOfBounces;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getNumberOfBaskets() {
        return numberOfBaskets;
    }

    public void setNumberOfBaskets(int numberOfBaskets) {
        this.numberOfBaskets = numberOfBaskets;
    }

    public int getNumberOfAssists() {
        return numberOfAssists;
    }

    public void setNumberOfAssists(int numberOfAssists) {
        this.numberOfAssists = numberOfAssists;
    }

    public int getNumberOfBounces() {
        return numberOfBounces;
    }

    public void setNumberOfBounces(int numberOfBounces) {
        this.numberOfBounces = numberOfBounces;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", numberOfBaskets=" + numberOfBaskets +
                ", numberOfAssists=" + numberOfAssists +
                ", numberOfBounces=" + numberOfBounces +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (numberOfBaskets != player.numberOfBaskets) return false;
        if (numberOfAssists != player.numberOfAssists) return false;
        if (numberOfBounces != player.numberOfBounces) return false;
        return playerName != null ? playerName.equals(player.playerName) : player.playerName == null;
    }

//    @Override
//    public int hashCode() {
//        int result = playerName != null ? playerName.hashCode() : 0;
//        result = 31 * result + numberOfBaskets;
//        result = 31 * result + numberOfAssists;
//        result = 31 * result + numberOfBounces;
//        return result;
//    }
}
