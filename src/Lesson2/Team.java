package Lesson2;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> roster = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (roster.contains(player)) {
            System.out.println(player.getName() + " is already on the team.");
            return false;
        } else {
            roster.add(player);
            System.out.println(player.getName() + " was picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.roster.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
            System.out.println("Won");
        } else if(ourScore == theirScore) {
            tied++;
            System.out.println("Tied");
        } else {
            lost++;
            System.out.println("Lost");
        }
        played++;
    }

    public int rankings() {
        return (won * 2) + tied;
    }
}
