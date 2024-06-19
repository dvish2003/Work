package com.example.layeredarchitecture.DAO.Custom.Implement;

import com.example.layeredarchitecture.DAO.Customer.OrderDAO;
import com.example.layeredarchitecture.DAO.SQLUtil;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;

public class OrderDAOImpl implements OrderDAO {
    private Connection connection = DBConnection.getDbConnection().getConnection();

    public OrderDAOImpl() throws SQLException, ClassNotFoundException {
    }

    public  String generateNextOrderId() throws SQLException, ClassNotFoundException {
      //  Statement stm = connection.createStatement();
        ResultSet rst = SQLUtil.execute("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");

        if(rst.next()){
            return rst.getString(1);
        }
        return null;
    }
    public boolean CheckOrderExist(String orderId) throws SQLException, ClassNotFoundException {
        /*Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement stm = connection.prepareStatement("SELECT oid FROM `Orders` WHERE oid=?");
        stm.setString(1, orderId);
        return stm.executeQuery().next();*/

        ResultSet rst = SQLUtil.execute("SELECT oid FROM `Orders` WHERE oid=?",orderId);
        return rst.next();
    }

    /*public boolean OrderSave(OrderDTO orderDTO) throws SQLException, ClassNotFoundException {
       OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
        connection = DBConnection.getDbConnection().getConnection();
       PreparedStatement stm;
        stm = connection.prepareStatement("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)");
        stm.setString(1, orderDTO.getOrderId());
        stm.setDate(2, Date.valueOf(orderDTO.getOrderDate()));
        stm.setString(3, orderDTO.getCustomerId());

        if (stm.executeUpdate() == 1) {
            if(orderDetailDAO.addOrderDetails(orderDTO.getOrderId(),orderDetails)){

                connection.commit();
                connection.setAutoCommit(true);
                return true;

            }

            connection.rollback();
            connection.setAutoCommit(true);


        }connection.rollback();
        connection.setAutoCommit(true);
        return false;
    }*/

    public boolean OrderSave(OrderDTO orderDTO) throws SQLException, ClassNotFoundException {
        // OrderDetailDAO orderDetailDAO = new OrderDetailDAO();

        return SQLUtil.execute("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)",orderDTO.getOrderId(),orderDTO.getOrderDate(),orderDTO.getCustomerId());
    }
}

