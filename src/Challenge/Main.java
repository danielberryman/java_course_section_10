package Challenge;

public class Main {

    public static void main(String[] args) {
//        Create a generic class to implement a league table for a sport
//        This means an instance of the league class should be specific to a type of sport
//        Must be able to add teams to the list
//        Include a method to print out the teams in order by rank. Top team printed first

        League<FootballTeam> NFL = new League<>("national football league");
        League<BasketballTeam> NBA = new League<>("national basketball association");
        League<SoccerTeam> MLS = new League<>("major league soccer");

        FootballTeam seahawks = new FootballTeam("seahawks");
        FootballTeam giants = new FootballTeam("giants");
        FootballTeam cowboys = new FootballTeam("cowboys");

        SoccerTeam galaxy = new SoccerTeam("galaxy");
        SoccerTeam sounders = new SoccerTeam("sounders");

        BasketballTeam sonics = new BasketballTeam("sonics");
        BasketballTeam knicks = new BasketballTeam("knicks");

        NFL.addTeam(seahawks);
        NFL.addTeam(giants);
        NFL.addTeam(cowboys);

        NBA.addTeam(sonics);
        NBA.addTeam(knicks);

        MLS.addTeam(galaxy);
        MLS.addTeam(sounders);

        NFL.listTeams();
        NBA.listTeams();
        MLS.listTeams();

        NFL.matchResult(seahawks, cowboys, 45, 32);
        NFL.matchResult(giants, cowboys, 6, 14);
        NFL.matchResult(seahawks, giants, 56, 7);
        NFL.matchResult(seahawks, cowboys, 42, 38);
        NFL.matchResult(cowboys, giants, 14, 7);

        System.out.println(seahawks.rankings());
        System.out.println(giants.rankings());
        System.out.println(cowboys.rankings());

        NFL.listTeamsByRanking();
    }
}
