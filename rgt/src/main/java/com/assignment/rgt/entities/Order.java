package com.assignment.rgt.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name="order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name="order_id", unique = true)
    @NotBlank
    private String orderId;

    @Column(name="product_name")
    @NotBlank
    private String productName;

    @Column(name="options")
    private String options;

    @Column(name="table_no")
    private int tableNo;

    @Column(name="quantity")
    private int quantity;

    @Column(name="order_date")
    @Temporal(TemporalType.DATE)
    private LocalDate orderDate;

    @Column(name="order_time")
    @Temporal(TemporalType.TIME)
    private LocalTime orderTime;

    @Column(name="date_time")
    private String dateTime;

    @Column(name="robot_status")
    private String robotStatus;

    @Column(name="dong")
    @NotBlank
    private String dong;

    @Column(name="ho")
    @NotBlank
    private String ho;

    @Column(name="seq")
    @NotBlank
    private String seq;

    @Column(name="orderer_name")
    @NotBlank
    private String ordererName;

    public Order() {}
    public Order(String orderId, String productName, String options, int tableNo, int quantity, LocalDate orderDate, LocalTime orderTime, String dateTime, String robotStatus, String dong, String ho, String seq, String ordererName) {
        this.orderId = orderId;
        this.productName = productName;
        this.options = options;
        this.tableNo = tableNo;
        this.quantity = quantity;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.dateTime = dateTime;
        this.robotStatus = robotStatus;
        this.dong = dong;
        this.ho = ho;
        this.seq = seq;
        this.ordererName = ordererName;
    }

    @PrePersist
    public void beforeProductNamePersist() {
        if (productName.equals("카페테리아")) {
            productName = "카페라떼";
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalTime orderTime) {
        this.orderTime = orderTime;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getRobotStatus() {
        return robotStatus;
    }

    public void setRobotStatus(String robotStatus) {
        this.robotStatus = robotStatus;
    }

    public String getDong() {
        return dong;
    }

    public void setDong(String dong) {
        this.dong = dong;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getOrdererName() {
        return ordererName;
    }

    public void setOrdererName(String ordererName) {
        this.ordererName = ordererName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", productName='" + productName + '\'' +
                ", options='" + options + '\'' +
                ", tableNo=" + tableNo +
                ", quantity=" + quantity +
                ", orderDate=" + orderDate +
                ", orderTime=" + orderTime +
                ", dateTime=" + dateTime +
                ", robotStatus='" + robotStatus + '\'' +
                ", dong='" + dong + '\'' +
                ", ho='" + ho + '\'' +
                ", seq='" + seq + '\'' +
                ", ordererName='" + ordererName + '\'' +
                '}';
    }
}
