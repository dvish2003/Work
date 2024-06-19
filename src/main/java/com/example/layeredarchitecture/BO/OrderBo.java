package com.example.layeredarchitecture.BO;

import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public interface OrderBo {
    public  String generateNextOrderId() throws SQLException, ClassNotFoundException ;


    boolean CheckOrderExist(String orderId) throws SQLException, ClassNotFoundException ;



    boolean OrderSave(OrderDTO orderDTO) throws SQLException, ClassNotFoundException ;
}
