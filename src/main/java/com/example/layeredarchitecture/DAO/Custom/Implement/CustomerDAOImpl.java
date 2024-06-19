package com.example.layeredarchitecture.DAO.Custom.Implement;

import com.example.layeredarchitecture.DAO.Customer.CustomerDAO;
import com.example.layeredarchitecture.DAO.SQLUtil;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer");

        ArrayList<CustomerDTO> allCustomer = new ArrayList<>();
        while ( rst.next()){
            CustomerDTO customerDTO = new CustomerDTO(rst.getString("id"),
                    rst.getString("name"),
                    rst.getString("address"));
            allCustomer.add(customerDTO);
        }

        return allCustomer;
    }

    @Override
    public boolean save(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("INSERT INTO Customer (id,name, address) VALUES (?,?,?)",dto.getId(),dto.getName(),dto.getAddress());
    }

    @Override
    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("UPDATE Customer SET name=?, address=? WHERE id=?",dto.getName(),dto.getAddress(),dto.getId());

    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("DELETE FROM Customer WHERE id=?",id);

    }

    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");
        if (rst.next()){
            return  rst.getString(1);
        }
        return null;
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = SQLUtil.execute("SELECT id FROM Customer WHERE id=?",id);
        return resultSet.next();

    }


    @Override
    public ArrayList<String> LoadAllIds() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer");
        ArrayList<String> Ids = new ArrayList<>();

        while (rst.next()){
            //  cmbCustomerId.getItems().add(rst.getString("id"));
            Ids.add(rst.getString("id"));
        }
        return Ids;

    }

    @Override
    public ArrayList<ItemDTO> find(String newValue) throws SQLException, ClassNotFoundException {
        return null;
    }


    @Override
    public CustomerDTO findCustomer(String newValue) throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer WHERE id=?",newValue);
        rst.next();
        return  new CustomerDTO(newValue + "", rst.getString("name"), rst.getString("address"));


    }
/*@Override
    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer");

        ArrayList<CustomerDTO> allCustomer = new ArrayList<>();
        while ( rst.next()){
            CustomerDTO customerDTO = new CustomerDTO(rst.getString("id"),
                    rst.getString("name"),
            rst.getString("address"));
            allCustomer.add(customerDTO);
        }

        return allCustomer;
    }
    @Override
    public boolean save(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
      *//*  Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO Customer (id,name, address) VALUES (?,?,?)");
        pstm.setString(1,customerDTO.getId());
        pstm.setString(2, customerDTO.getName());
        pstm.setString(3, customerDTO.getAddress());
        pstm.executeUpdate();*//*
       return SQLUtil.execute("INSERT INTO Customer (id,name, address) VALUES (?,?,?)",customerDTO.getId(),customerDTO.getName(),customerDTO.getAddress());

      //  tblCustomers.getItems().add(new CustomerTM(id, name, address));
    }
    @Override
     public  boolean update(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
      *//*   Connection connection = DBConnection.getDbConnection().getConnection();
         PreparedStatement pstm = connection.prepareStatement("UPDATE Customer SET name=?, address=? WHERE id=?");
         pstm.setString(1, customerDTO.getName());
         pstm.setString(2, customerDTO.getAddress());
         pstm.setString(3, customerDTO.getId());
         pstm.executeUpdate();*//*
         return SQLUtil.execute("UPDATE Customer SET name=?, address=? WHERE id=?",customerDTO.getName(),customerDTO.getAddress(),customerDTO.getId());

     }
    @Override
     public boolean delete (String id) throws SQLException, ClassNotFoundException {
         *//*Connection connection = DBConnection.getDbConnection().getConnection();
         PreparedStatement pstm = connection.prepareStatement("DELETE FROM Customer WHERE id=?");
         pstm.setString(1, id);
         pstm.executeUpdate();*//*
         return SQLUtil.execute("DELETE FROM Customer WHERE id=?",id);

     }


     
     *//*public  String generateNewId () throws SQLException, ClassNotFoundException {
         Connection connection = DBConnection.getDbConnection().getConnection();
         ResultSet rst = connection.createStatement().executeQuery("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");
        if (rst.next()){
            return rst.getString(1);
        }
        return null;

     }*//*
     @Override
         public  String generateNewId () throws SQLException, ClassNotFoundException {

         ResultSet rst = SQLUtil.execute("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");
       if (rst.next()){
           return  rst.getString(1);
       }
       return null;

     }



    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {

       ResultSet resultSet = SQLUtil.execute("SELECT id FROM Customer WHERE id=?",id);
       return resultSet.next();

    }

    public ArrayList<String> LoadAllIds() throws SQLException, ClassNotFoundException {

        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer");
          ArrayList<String> Ids = new ArrayList<>();

    while (rst.next()){
      //  cmbCustomerId.getItems().add(rst.getString("id"));
    Ids.add(rst.getString("id"));
    }
    return Ids;

    }
    public CustomerDTO find(String newValue) throws SQLException, ClassNotFoundException {

        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer WHERE id=?",newValue);
        rst.next();
        return  new CustomerDTO(newValue + "", rst.getString("name"), rst.getString("address"));


    }*/
}
//Customer