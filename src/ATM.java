import java.util.Scanner;

public class ATM {
    public void calis(Account account){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza hoşgeldiniz....");

        System.out.println("****************************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("****************************************");

        int girisHakki = 3;
        while (true){
            if(login.login(account)){
                System.out.println("Giriş Başarılı...");
                break;
            }
            else {
                System.out.println("Giriş Başarısız...");
                girisHakki -= 1;
                System.out.println("Kalan giriş Hakkı " + girisHakki);
            }
            if (girisHakki == 0){
                System.out.println("Giriş Hakkınız birri....");
                return;
            }
        }
        System.out.println("****************************************");
        String islemler = "1. Bakiye görüntüle\n " +
                          "2. Para Yatırma\n " +
                          "3. Para Çekme\n " +
                          "çıkış için q'ya bas ";
        System.out.println(islemler);
        System.out.println("****************************************");

        while (true){
            System.out.print("işlemi seçiniz : ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                break;
            }
            else if(islem.equals("1")){

                System.out.println("Bakiyeniz : " + account.getBakiye());

            }
            else if(islem.equals("2")){

                System.out.print("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                account.paraYatir(tutar);

            }
            else if(islem.equals("3")){

                System.out.print("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                account.paraCek(tutar);

            }

            else{
                System.out.println("Geçersiz işlem...");
            }
        }


    }
}
