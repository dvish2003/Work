package com.example.layeredarchitecture.DAO.Customer;

import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.*;

public interface OrderDAO {

    public  String generateNextOrderId() throws SQLException, ClassNotFoundException ;


    boolean CheckOrderExist(String orderId) throws SQLException, ClassNotFoundException ;



    boolean OrderSave(OrderDTO orderDTO) throws SQLException, ClassNotFoundException ;
}
