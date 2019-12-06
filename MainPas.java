import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainPas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваш пароль");
        String s = sc.nextLine();
        System.out.println(check(s));
    }

    private static boolean check(String s){
        Pattern p =Pattern.compile("^(?=.{8,20}) (?=.*\\d) (?=.*[a-z]) (?=.*[A-Z]).*$");
        Matcher m = p.matcher(s);
        return m.matches();
    }

}
