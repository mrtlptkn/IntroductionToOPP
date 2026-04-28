package A8_Enums;

import java.util.Scanner;


// çok artacağını düşündüğümüz listeler için enum yerine collection kullanılır.

public class EnumMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("İptal için -> 300  \n Onay için 500 kodu giriniz");
        int code = scanner.nextInt();

        if(code == OrderStatus.Canceled.code){
            System.out.println(OrderStatus.Canceled.description);
        }
        else if(code == OrderStatus.Completed.code){
            System.out.println(OrderStatus.Completed.description);
        }

    }
}
