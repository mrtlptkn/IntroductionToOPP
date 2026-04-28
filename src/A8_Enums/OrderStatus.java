package A8_Enums;


// Sabit Listeler

public enum OrderStatus {

    Submitted(200,"Sipariş Gönderildi"),
    Canceled(300,"Sipariş İptal Edildi"),
    InProgress(400,"Sipariş Hazırlanıyor"),
    Completed(500,"Sipariş Tamamlandı");


    public int code;
    public String description;

    OrderStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

}
