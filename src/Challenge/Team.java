package Challenge;

public abstract class Team {
    private String name;
    private int won = 0;
    private int tied = 0;
    private int lost = 0;
    private int played = 0;

    public Team(String name) {
        this.name = name;
    }

    public int rankings() {
        return (won * 2) + tied;
    }

    public String getName() {
        return name;
    }

    public int getWon() {
        return won;
    }

    public int getTied() {
        return tied;
    }

    public int getLost() {
        return lost;
    }

    public int getPlayed() {
        return played;
    }

    public void setWon(int won) {
        this.won += won;
    }

    public void setTied(int tied) {
        this.tied += tied;
    }

    public void setLost(int lost) {
        this.lost += lost;
    }

    public void setPlayed(int played) {
        this.played += played;
    }
}
