public class Main {
    public static void main(String[] args) {
        // Object oriented(nesne yönelimli) ATM Programı

        // Login Class'ı Kullanıcı Girişini Kontrol Edecek.

        // Hesap Class'ı Hesapl işlemlerini Yapacak.

        //ATM ise atmmizi çalıştıracak.

        ATM atm = new ATM();
        Account account = new Account("Hasan Can","1234",4000);

        atm.calis(account);
        System.out.println("Programdan çıkılıyor...");

    }
}
