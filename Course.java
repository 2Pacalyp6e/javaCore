public class Course {

    private int[] course = {100, 100, 100, 100};

    public void doit(Team team) {
        double result = 0;
        double totalResult = 0;
        for (int i = 0; i< course.length; i++) {
            for (int j = 0; j < team.getTeam().length; j++) {
                result = course[i]/team.getTeam()[i].getAverageSpeed();
            }
            System.out.println("Результат " + team.getTeam()[i].getName() + " из команды "+ team.getTeamName() + " составил " + result);
            totalResult += result;
        }
        System.out.println("Общий результат комнады " + team.getTeamName() + " составил " +totalResult);
    }
}