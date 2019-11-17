public class Sportsmens {
    String name;
    int age;
    double averageSpeed;

    // Создаем спортсменов
    public Sportsmens(String name, int age, float averageSpeed) {
        this.name = name;
        this.age = age;
        this.averageSpeed = averageSpeed;
    }

    public void info() {
        System.out.println(name +" "+age+" "+ averageSpeed);
    }

    public String getName() {
        return name;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }
}