public class Game {
    private String name = "none";
    Rule[] rules = new Rule[100];
    private int numRules = 0;
    private int teams = 0;
    private int teamSize = 0;

    public Game(String n) {
        this.name = n;
    }

    public Game(String n, Rule[] rs) {
        this.name = n;

        int rsLength = rs.length;
        int rulesRemainingSpaces = 0;

        for (int i = 0; i < rules.length; i++) {
            if (rules[i] == null) {
                rulesRemainingSpaces++;
            }
        }

        if (rsLength == rulesRemainingSpaces) {
            int emptyIndex = (rules.length - rulesRemainingSpaces) - 1; // subtracting 1 because arrays are [length - 1]

            for (int i = emptyIndex; i < rulesRemainingSpaces; i++) {

            }
        }
    }


    public String getName() {
        return this.name;
    }

    public void setName(String set) {
        this.name = set;
    }

    public int getTeams() {
        return this.teams;
    }

    public void setTeams(int set) {
        this.teams = set;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int set) {
        this.teams = set;
    }


}
