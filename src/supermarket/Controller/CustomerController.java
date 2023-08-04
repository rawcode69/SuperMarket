/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.Controller;

import supermarket.Model.CustomerModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import supermarket.DB.DBConnection;

/**
 *
 * @author Ravidu Ayeshmanth
 */
public class CustomerController {

    public String saveCustomer(CustomerModel customer) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();

        String query = "INSERT INTO customer VALUES (?,?,?,?,?,?,?,?,?)";

        PreparedStatement statement = connection.prepareStatement(query);

        statement.setString(1, customer.getCustId());
        statement.setString(2, customer.getCustTitle());
        statement.setString(3, customer.getCustName());
        statement.setString(4, customer.getDob());
        statement.setDouble(5, customer.getSalary());
        statement.setString(6, customer.getCustAddress());
        statement.setString(7, customer.getCity());
        statement.setString(8, customer.getProvince());
        statement.setString(9, customer.getPostalCode());

        if (statement.executeUpdate() > 0) {
            return "Succes";
        } else {
            return "Fail";
        }
    }

    public ArrayList<CustomerModel> getAllCustomers() throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();

        String query = "SELECT * FROM customer";

        PreparedStatement statement = connection.prepareStatement(query);

        ResultSet rst = statement.executeQuery();

        ArrayList<CustomerModel> customerModels = new ArrayList<>();

        while (rst.next()) {
            CustomerModel customer = new CustomerModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));

            customerModels.add(customer);
        }
        return customerModels;
    }

    public CustomerModel getCustomer(String custId) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();

        String query = "SELECT * FROM customer WHERE CustID = ?";

        PreparedStatement statement = connection.prepareStatement(query);

        statement.setString(1, custId);
        ResultSet rst = statement.executeQuery();

        while (rst.next()) {
            CustomerModel customer = new CustomerModel(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));

            return customer;
        }
        return null;

    }

    public String updateCustomer(CustomerModel customer) throws ClassNotFoundException, SQLException {

        Connection connection = DBConnection.getInstance().getConnection();

        String query = "UPDATE customer SET CustTitle =?,CustName =?, DOB =?, salary  =?, CustAddress  =?, City  =?, Province = ?, PostalCode = ? WHERE CustID = ?";

        PreparedStatement statement = connection.prepareStatement(query);

        statement.setString(1, customer.getCustTitle());
        statement.setString(2, customer.getCustName());
        statement.setString(3, customer.getDob());
        statement.setDouble(4, customer.getSalary());
        statement.setString(5, customer.getCustAddress());
        statement.setString(6, customer.getCity());
        statement.setString(7, customer.getProvince());
        statement.setString(8, customer.getPostalCode());
        statement.setString(9, customer.getCustId());
        
        if(statement.executeUpdate() > 0){
            return "Succes";
        }else{
            return "Fail";
        }

    }
    
    public String deleteCustomer(String custID ) throws ClassNotFoundException, SQLException{
        
        Connection connection = DBConnection.getInstance().getConnection();
        
        String query = "DELETE FROM customer WHERE CustID=?";
        
        PreparedStatement statement = connection.prepareStatement(query);
        
        statement.setString(1, custID);
        
        if(statement.executeUpdate() > 0){
            return "Succes";
        }else{
            return "Fail";
        }
    }
}
