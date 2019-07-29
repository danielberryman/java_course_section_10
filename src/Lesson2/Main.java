package Lesson2;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> LA = new Team<>("LA");
        LA.addPlayer(joe);
        System.out.println(LA.numPlayers());

        Team<BaseballPlayer> SEA = new Team<>("Seattle");

        SEA.addPlayer(pat);
        System.out.println(SEA.numPlayers());

//        The below doesn't work. Without validation a class can accept any object as a type parameter
//        Team<String> broke = new Team<>("broke");
//        broke.addPlayer("no-one");

        Team<SoccerPlayer> broke = new Team<>("broke");
        broke.addPlayer(beckham);

        Team<FootballPlayer> NY = new Team<>("NY");
        NY.matchResult(LA, 300, 200);
    }
}
