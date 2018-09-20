package com.example.kaicom.officeapplication;

import javax.persistence.*;

@Entity
@Table(name = "customer_info")
public class Customer_info {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private  String name;
    private  String accountNo;
    private  String cardNo;
    private  String balence;
    private  String emargencyBalence;
    private  String card_status;
    private  String card_group;
    private  int version_name;
    private double 	credit;
    private  double unit;
    private  int refund;



    public Customer_info() {
    }

    public Customer_info(String name, String accountNo, String cardNo, String balence, String emargencyBalence, String card_status, String card_group, int version_name, double credit, double unit, int refund) {
        this.name = name;
        this.accountNo = accountNo;
        this.cardNo = cardNo;
        this.balence = balence;
        this.emargencyBalence = emargencyBalence;
        this.card_status = card_status;
        this.card_group = card_group;
        this.version_name = version_name;
        this.credit = credit;
        this.unit = unit;
        this.refund = refund;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBalence() {
        return balence;
    }

    public void setBalence(String balence) {
        this.balence = balence;
    }

    public String getEmargencyBalence() {
        return emargencyBalence;
    }

    public void setEmargencyBalence(String emargencyBalence) {
        this.emargencyBalence = emargencyBalence;
    }

    public String getCard_status() {
        return card_status;
    }

    public void setCard_status(String card_status) {
        this.card_status = card_status;
    }

    public String getCard_group() {
        return card_group;
    }

    public void setCard_group(String card_group) {
        this.card_group = card_group;
    }

    public int getVersion_name() {
        return version_name;
    }

    public void setVersion_name(int version_name) {
        this.version_name = version_name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getUnit() {
        return unit;
    }

    public void setUnit(double unit) {
        this.unit = unit;
    }

    public int getRefund() {
        return refund;
    }

    public void setRefund(int refund) {
        this.refund = refund;
    }


    @Override
    public String toString() {
        return "Customer_info{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", balence='" + balence + '\'' +
                ", emargencyBalence='" + emargencyBalence + '\'' +
                ", card_status='" + card_status + '\'' +
                ", card_group='" + card_group + '\'' +
                ", version_name=" + version_name +
                ", credit=" + credit +
                ", unit=" + unit +
                ", refund=" + refund +
                '}';
    }
}
