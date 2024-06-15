package com.example.layeredarchitecture.DAO;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.*;
import java.util.List;

public interface OrderDAO {

    public  String generateNextOrderId() throws SQLException, ClassNotFoundException ;


    boolean CheckOrderExist(String orderId) throws SQLException, ClassNotFoundException ;



    boolean OrderSave(OrderDTO orderDTO, List<OrderDetailDTO> orderDetails) throws SQLException, ClassNotFoundException ;
}
