package com.example.kaicom.officeapplication;

import javax.persistence.*;

@Entity
@Table(name = "error_history")
public class Error_History {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String errordate;
    private String massage;
    private String cardNo;

    public Error_History() {
    }

    public Error_History(String errordate, String massage, String cardNo) {
        this.errordate = errordate;
        this.massage = massage;
        this.cardNo = cardNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getErrordate() {
        return errordate;
    }

    public void setErrordate(String errordate) {
        this.errordate = errordate;
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
        return "Error_History{" +
                "id=" + id +
                ", errordate='" + errordate + '\'' +
                ", massage='" + massage + '\'' +
                ", cardNo='" + cardNo + '\'' +
                '}';
    }
}
