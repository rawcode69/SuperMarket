/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.Model;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderModel {
    
    private String orderID;
    private String orderDate;
    private String custId;

    public OrderModel() {
    }

    public OrderModel(String orderID, String orderDate, String custId) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.custId = custId;
    }

    /**
     * @return the orderID
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * @param orderID the orderID to set
     */
    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    /**
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    @Override
    public String toString() {
        return "OrderModel{" + "orderID=" + orderID + ", orderDate=" + orderDate + ", custId=" + custId + '}';
    }
    
    
}
