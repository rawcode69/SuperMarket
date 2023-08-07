/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.Controller;

import java.util.ArrayList;
import supermarket.Model.OrderDetailModel;
import supermarket.Model.OrderModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import supermarket.DB.DBConnection;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class OrderController {

    public String placeOrder(OrderModel orderModel, ArrayList<OrderDetailModel> orderDetailModels) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);
            String orderQuery = "INSERT INTO orders VALUES (?,?,?)";

            PreparedStatement statementForOrder = connection.prepareStatement(orderQuery);
            statementForOrder.setString(1, orderModel.getOrderID());
            statementForOrder.setString(2, orderModel.getOrderDate());
            statementForOrder.setString(3, orderModel.getCustId());

            if (statementForOrder.executeUpdate() > 0) {

                boolean isOrderDetailSaved = true;
                String orderDetailQuery = "INSERT INTO orderdetail VALUES (?,?,?,?)";

                for (OrderDetailModel orderDetailModel : orderDetailModels) {
                    PreparedStatement statementForOrderDetails = connection.prepareStatement(orderDetailQuery);
                    statementForOrderDetails.setString(1, orderDetailModel.getOrderId());
                    statementForOrderDetails.setString(2, orderDetailModel.getItemCode());
                    statementForOrderDetails.setInt(3, orderDetailModel.getQuantity());
                    statementForOrderDetails.setDouble(4, orderDetailModel.getDiscount());

                    if (!(statementForOrderDetails.executeUpdate() > 0)) {
                        isOrderDetailSaved = false;
                    }
                }

                if (isOrderDetailSaved) {
                    boolean isItemUpdated = true;

                    String itemUpdateQuery = "UPDATE item SET QtyOnHand = QtyOnHand - ? WHERE ItemCode = ?";

                    for (OrderDetailModel orderDetailModel : orderDetailModels) {
                        PreparedStatement statementForItem = connection.prepareStatement(itemUpdateQuery);
                        statementForItem.setInt(1, orderDetailModel.getQuantity());
                        statementForItem.setString(2, orderDetailModel.getItemCode());

                        if (!(statementForItem.executeUpdate() > 0)) {
                            isItemUpdated = false;
                        }
                    }

                    if (isItemUpdated) {
                        connection.commit();
                        return "Succes";
                    } else {
                        connection.rollback();
                        return "Item Update Error";
                    }

                } else {
                    connection.rollback();
                    return "Order Details Save Error";
                }

            } else {
                connection.rollback();
                return "Order Save Error";
            }
        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            return e.getMessage();
        } finally {
            connection.setAutoCommit(true);
        }

    }

}
