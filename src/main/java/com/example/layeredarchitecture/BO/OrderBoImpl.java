package com.example.layeredarchitecture.BO;

import com.example.layeredarchitecture.DAO.Custom.Implement.OrderDAOImpl;
import com.example.layeredarchitecture.DAO.Customer.OrderDAO;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;

public class OrderBoImpl implements OrderBo {

    OrderDAO orderDAO = new OrderDAOImpl();

    public OrderBoImpl() throws SQLException, ClassNotFoundException {
    }

    @Override
    public String generateNextOrderId() throws SQLException, ClassNotFoundException {
      //  OrderDAO orderDAO = new OrderDAOImpl();
        return orderDAO.generateNextOrderId();
    }

    @Override
    public boolean CheckOrderExist(String orderId) throws SQLException, ClassNotFoundException {
       // OrderDAO orderDAO = new OrderDAOImpl();
        return orderDAO.CheckOrderExist(orderId);    }

    @Override
    public boolean OrderSave(OrderDTO orderDTO) throws SQLException, ClassNotFoundException {
       // OrderDAO orderDAO = new OrderDAOImpl();
        return orderDAO.OrderSave(orderDTO);    }
}
