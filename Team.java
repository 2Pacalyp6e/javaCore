public class Team {

    String teamName;
    Sportsmens[] team;


    public Team(Sportsmens[] team, String teamName) {
        this.teamName = teamName;
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public Sportsmens[] getTeam() {
        return team;
    }
}