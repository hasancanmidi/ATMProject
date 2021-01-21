import java.sql.SQLOutput;
import java.util.Scanner;

public class Login {
    public boolean login(Account account){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        String kulllaniciAdi = scanner.nextLine();

        System.out.print("Parolanızı giriniz : ");
        String parola = scanner.nextLine();

        if (account.getKullaniciAdi().equals(kulllaniciAdi) && account.getParola().equals(parola)){
            return  true;
        }
        else {
            return false;
        }
    }
}
