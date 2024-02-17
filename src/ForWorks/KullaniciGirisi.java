package ForWorks;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[]args){

        String userName, password;
        int degisim;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Şifre Giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        }   else {
            System.out.print("Şifreniz Hatalı Değiştirmek için 1'e basınız.");
            degisim = input.nextInt();
            if (degisim == 1) {
                System.out.print("Lütfen Yeni Şifreyi Giriniz :");
                input.nextLine();
                password = input.nextLine();
                if (password.equals("java123")) {
                    System.out.print("Şifre Oluşturulamadı. Lütfen başka bir şifre giriniz ! ");
                } else {
                    System.out.print("Şifre Oluşturuldu.");
                }
            } else {
                System.out.print("Şifreniz başarıyla değiştirilmiştir.");
            }
        }
    }
}