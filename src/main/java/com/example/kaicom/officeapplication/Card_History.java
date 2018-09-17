package com.example.kaicom.officeapplication;

import javax.persistence.*;


@Entity
@Table(name = "card_history" )
public class Card_History {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private  String datetime;
    private String massage;
    private String cardNo;

    public Card_History(String datetime, String massage, String cardNo) {
        this.datetime = datetime;
        this.massage = massage;
        this.cardNo = cardNo;
    }

    public Card_History() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "Card_History{" +
                "id=" + id +
                ", datetime='" + datetime + '\'' +
                ", massage='" + massage + '\'' +
                ", cardNo='" + cardNo + '\'' +
                '}';
    }
}
