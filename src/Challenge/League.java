package Challenge;

import java.util.ArrayList;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getTeams() {
        return this.teams;
    }

    public boolean addTeam(T team) {
        if(team != null){
            this.teams.add(team);
            return true;
        }
        return false;
    }

    public void listTeams() {
        System.out.println("Team roster in " + this.getName());
        for(int i=0; i<this.getTeams().size(); i++) {
            System.out.println(this.getTeams().get(i).getName());
        }
        System.out.println("");
    }

    public void listTeamsByRanking() {
        System.out.println("Teams by rank:");
        ArrayList<T> teamsByRank = new ArrayList<>();
        teamsByRank.addAll(this.teams);
        boolean flag = true;
        int temp = 0;
        while(flag) {
            flag = false;
            for(int i=0; i<teamsByRank.size()-1; i++){
                Team t = teamsByRank.get(i);
                Team o = teamsByRank.get(i+1);
                if(t.rankings() < o.rankings()) {
                    temp = i;
                    teamsByRank.set(i, teamsByRank.get(i+1));
                    teamsByRank.set(i+1, teamsByRank.get(i));
                    flag = true;
                }
            }
        }
        for (Team team : teamsByRank) {
            System.out.println(team.getName() + " - Ranking: " + team.rankings());
        }
    }

    public void matchResult(T team, T opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            team.setWon(1);
            System.out.println("Won");
        } else if(ourScore == theirScore) {
            team.setTied(1);
            System.out.println("Tied");
        } else {
            team.setLost(1);
            System.out.println("Lost");
        }
        team.setPlayed(1);
    }
}
