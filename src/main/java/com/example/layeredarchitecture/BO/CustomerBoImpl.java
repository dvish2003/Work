package com.example.layeredarchitecture.BO;

import com.example.layeredarchitecture.DAO.Custom.Implement.CustomerDAOImpl;
import com.example.layeredarchitecture.DAO.Customer.CustomerDAO;
import com.example.layeredarchitecture.DAO.SQLUtil;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBoImpl implements  CustomerBo {
    CustomerDAO customerDAO = new CustomerDAOImpl();

    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException {
      //  CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.getAll();

    }

    public boolean save(CustomerDTO dto) throws SQLException, ClassNotFoundException {
       // CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.save(dto);
    }


    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {
     //   CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.update(dto);
    }


    public boolean delete(String id) throws SQLException, ClassNotFoundException {
      //  CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.delete(id);
    }


    public String generateNewId() throws SQLException, ClassNotFoundException {
      //  CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.generateNewId();
    }

    public boolean exist(String id) throws SQLException, ClassNotFoundException {
      //  CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.exist(id);

    }



    public ArrayList<String> LoadAllIds() throws SQLException, ClassNotFoundException {
     //   CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.LoadAllIds();

    }


    public ArrayList<ItemDTO> find(String newValue) throws SQLException, ClassNotFoundException {
        return null;
    }



    public CustomerDTO findCustomer(String newValue) throws SQLException, ClassNotFoundException {
       // CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.findCustomer(newValue);

    }
}
