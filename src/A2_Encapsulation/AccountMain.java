package A2_Encapsulation;

public class AccountMain {

    public static void main(String[] args) {

        Account account = new Account();
        account.accountOpening();
        System.out.println("AccountNumber ->" + account.getAccountNumber());

        account.deposit(5000);
        account.withdraw(2000);

        System.out.println("Account Balance -> " + account.getBalance());

        // account.accountClosure("müşteri talebi");

        System.out.println("Account Closed -> " + (account.isClosed() ? "Hesap Kapalı":"Açık"));

        account.withdraw(3000); // hesapta kalan parayı bankaya gidip çekicez. Hesap kapalı.

        // farklı ekranlardan farklı methodları çalıştırarak bunu kapabiliriz.


        // encapsulation yapmadığımzıdan tek tek kodu yazmak ve doğru yöntemek zorundayız.
        Account acc2 = new Account();
        acc2.balance = 5000;
        acc2.balance -= 20000;

        System.out.println("Balance ->" + acc2.balance);






    }
}
