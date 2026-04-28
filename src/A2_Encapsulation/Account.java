package A2_Encapsulation;


// Banka hesabı üzerinden işlem yapmayı simüle ediyoruz

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Account {

    private UUID accountNumber;
    private double balance = 0;
    private LocalDate accountOpeningAt;
    private LocalDate closingDate;
    private String closingReason;
    private boolean closed;

    // dışardaki müşteri bu nesnede nelerin döndüğünü bilmez
    public  void accountOpening() {
        this.accountNumber = UUID.randomUUID();
        this.balance = 0;
        this.accountOpeningAt = LocalDate.now();
        System.out.println("Yeni bir hesap açıldı. Hesap numarası: " + accountNumber);
    }

    // hesap kapanış süreci
    public void accountClosure(String reason){
        this.closingReason = reason;
        this.closingDate = LocalDate.now();
        this.closed = true;
    }

    public double getBalance(){
        return balance;
    }

    public UUID getAccountNumber(){
        return accountNumber;
    }

    public LocalDate getAccountOpeningAt() {
        return accountOpeningAt;
    }

    public LocalDate getClosingDate() {
        return closingDate;
    }

    public String getClosingReason() {
        return closingReason;
    }

    public boolean isClosed() {
        return closed;
    }

    public void  deposit(double amount){
        if(closed){
            throw  new IllegalArgumentException("Hesap kapalı olduğu için para yatırma işlemi gerçekleştirilemez");
        }

        if(amount < 0){
            throw new IllegalArgumentException("Yatırılacak miktar negatif olamaz");
        }

        balance+=amount;
    }

    public void withdraw(double amount){
        if(closed){
            throw  new IllegalArgumentException("Hesap kapalı olduğu için para çekme işlemi gerçekleştirilemez");
        }

        if(amount < 0){
            throw new IllegalArgumentException("Çekilecek miktar negatif olamaz");
        }

        if(amount > balance){
            throw new IllegalArgumentException("Yetersiz bakiye");
        }

        balance-=amount;
    }





}
