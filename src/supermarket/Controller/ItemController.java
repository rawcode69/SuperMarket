/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.Controller;

import supermarket.Model.ItemModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import supermarket.DB.DBConnection;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class ItemController {

    public String saveItem(ItemModel item) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String query = "INSERT INTO item VALUES (?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);

        statement.setString(1, item.getItemCode());
        statement.setString(2, item.getDescription());
        statement.setString(3, item.getPackSize());
        statement.setDouble(4, item.getUnitPrice());
        statement.setInt(5, item.getQuantityOnHand());

        if (statement.executeUpdate() > 0) {
            return "Item Saved Succesfully";
        } else {
            return "Item Saved Failed";
        }

    }

    public ArrayList<ItemModel> getAllItems() throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String query = "SELECT * FROM item";
        PreparedStatement statement = connection.prepareStatement(query);

        ResultSet rst = statement.executeQuery();

        ArrayList<ItemModel> items = new ArrayList<>();

        while (rst.next()) {

            ItemModel item = new ItemModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getInt(5));

            items.add(item);
        }

        return items;

    }

    public ItemModel getItem(String itemCode) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String query = "SELECT  * FROM item WHERE ItemCode = ?";

        PreparedStatement statement = connection.prepareStatement(query);

        statement.setString(1, itemCode);

        ResultSet rst = statement.executeQuery();

        while (rst.next()) {
            ItemModel item = new ItemModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getDouble(4),
                    rst.getInt(5));

            return item;
        }
        return null;

    }

    public String updateItem(ItemModel item) throws ClassNotFoundException, SQLException {
        
        Connection connection = DBConnection.getInstance().getConnection();
        String query = "UPDATE item SET Description = ?, PackSize = ?, UnitPrice = ?,QtyOnHand = ? WHERE ItemCode = ?";
        
        PreparedStatement statement = connection.prepareStatement(query);
        
        statement.setString(1, item.getDescription());
        statement.setString(2, item.getPackSize());
        statement.setDouble(3, item.getUnitPrice());
        statement.setInt(4, item.getQuantityOnHand());
        statement.setString(5, item.getItemCode());
        
        if(statement.executeUpdate() > 0){
            return "Item Succefully Updated";
        }else{
            return "Item Update Failed";
        }
        
    }

    public String deleteItem(String itemCode) throws ClassNotFoundException, SQLException {
       Connection connection = DBConnection.getInstance().getConnection();
       String query = "DELETE FROM item WHERE ItemCode = ?";
       
       PreparedStatement statement = connection.prepareStatement(query);
       statement.setString(1, itemCode);
       
       if(statement.executeUpdate() > 0){
           return "Item Succuesfully Deleted";
       }else{
           return "Item Delete Failed";
       }
    }

}
