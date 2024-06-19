package com.example.layeredarchitecture.BO;

import com.example.layeredarchitecture.DAO.Custom.Implement.OrderDetailDAO;
import com.example.layeredarchitecture.DAO.Customer.OrderDetailsDAO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public class OrderDetailBoImpl implements OrderDetailBo{
    @Override
    public Boolean saveOrderDetails(OrderDetailDTO orderDetailDTO) throws SQLException, ClassNotFoundException {
    OrderDetailsDAO orderDetailDAO = new OrderDetailDAO();
    return orderDetailDAO.saveOrderDetails(orderDetailDTO);}
}
