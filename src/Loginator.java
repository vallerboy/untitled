import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loginator {
    private Scanner scanner;

    public Loginator() {
        scanner = new Scanner(System.in);
    }

    public void getLoginData() {
       do {
           System.out.print("Podaj login: ");

           if(!checkLogin(scanner.nextLine())){
               System.out.println("Popelniles blad");
               continue;
           }
           System.out.print("Podaj haslo: ");
           if(!checkPassword(scanner.nextLine())){
               System.out.println("Popelniles blad");
               continue;
           }
       }while (true);
    }

    private boolean checkLogin(String s) {
        return Pattern.matches(".{5,20}", s);
    }

    private boolean checkPassword(String s) {
        return Pattern.matches(".{5,20}", s);
    }


}
