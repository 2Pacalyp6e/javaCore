public class MainClass {

    public static void main(String[] args) {
        Sportsmens[] groupOne = new Sportsmens[4];
        groupOne[0] = new Sportsmens("Alexey",27, 14.3f);
        groupOne[1] = new Sportsmens("Misha",23, 11.3f);
        groupOne[2] = new Sportsmens("Pavel",23, 12.1f);
        groupOne[3] = new Sportsmens("Denis",25, 9.5f);

        Sportsmens[] groupTwo = new Sportsmens[4];
        groupTwo[0] = new Sportsmens("Arlan",19, 10.5f);
        groupTwo[1] = new Sportsmens("Maksim",26, 9.3f);
        groupTwo[2] = new Sportsmens("Evgeniy",21, 16.5f);
        groupTwo[3] = new Sportsmens("Vitaliy",23, 12.4f);


        Team teamOne = new Team(groupOne, "CSKA");
        Team teamTwo = new Team(groupTwo, "NSK");


        Course race = new Course();
        race.doit(teamOne);
        race.doit(teamTwo);
    }
}