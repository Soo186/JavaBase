package Class1.ex;

public class SoccerTeamMain1 {
    public static void main(String[] args) {
        SoccerTeam no1 = new SoccerTeam();
        no1.name = "manu";
        no1.color = "red";

        SoccerTeam no2 = new SoccerTeam();
        no2.name = "chelsea";
        no2.color = "blue";

        System.out.println("참가 팀 :" + no1.name + ", 유니폼 색깔" + no1.color);
        System.out.println("참가 팀 :" + no2.name + ", 유니폼 색깔" + no2.color);

        SoccerTeam[] teams = {no1, no2};
        for (SoccerTeam team : teams) {
            System.out.println("참가 팀" + team.name + ", 유니폼 색깔"  + team.color);
        }



    }
}
