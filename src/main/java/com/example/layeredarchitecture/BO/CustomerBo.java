package com.example.layeredarchitecture.BO;

import com.example.layeredarchitecture.DAO.Custom.Implement.CustomerDAOImpl;
import com.example.layeredarchitecture.DAO.Customer.CustomerDAO;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerBo {
    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException ;

    public ArrayList<String> LoadAllIds() throws SQLException, ClassNotFoundException;

    public boolean save(CustomerDTO dto) throws SQLException, ClassNotFoundException ;



    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException ;



    public boolean delete(String id) throws SQLException, ClassNotFoundException;

    public String generateNewId() throws SQLException, ClassNotFoundException;
    public boolean exist(String id) throws SQLException, ClassNotFoundException ;

    public ArrayList<ItemDTO> find(String newValue) throws SQLException, ClassNotFoundException;

    public CustomerDTO findCustomer(String newValue) throws SQLException, ClassNotFoundException;

}
