package com.exam;
// Generated Jun 11, 2019 12:18:53 PM by Hibernate Tools 4.3.1



/**
 * Book generated by hbm2java
 */
public class Book  implements java.io.Serializable {


     private Integer cid;
     private String cname;
     private String email;
     private String carname;
     private String carcolour;
     private String startdate;
     private String returndate;
     private String location;
     private String bookingamount;
     private String due;
     private String paymentdetail;

    public Book() {
    }

    public Book(Integer cid, String cname, String email, String carname, String carcolour, String startdate, String returndate, String location, String bookingamount, String due, String paymentdetail) {
        this.cid = cid;
        this.cname = cname;
        this.email = email;
        this.carname = carname;
        this.carcolour = carcolour;
        this.startdate = startdate;
        this.returndate = returndate;
        this.location = location;
        this.bookingamount = bookingamount;
        this.due = due;
        this.paymentdetail = paymentdetail;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getCarcolour() {
        return carcolour;
    }

    public void setCarcolour(String carcolour) {
        this.carcolour = carcolour;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBookingamount() {
        return bookingamount;
    }

    public void setBookingamount(String bookingamount) {
        this.bookingamount = bookingamount;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public String getPaymentdetail() {
        return paymentdetail;
    }

    public void setPaymentdetail(String paymentdetail) {
        this.paymentdetail = paymentdetail;
    }


   
    



}


