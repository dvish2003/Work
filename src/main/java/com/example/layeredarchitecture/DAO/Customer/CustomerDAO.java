package com.example.layeredarchitecture.DAO.Customer;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;

public interface CustomerDAO extends CrudDAO<CustomerDTO> {
     /*ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;

     boolean saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

     boolean updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

     boolean delete (String id) throws SQLException, ClassNotFoundException ;


     String generateNewId () throws SQLException, ClassNotFoundException ;

     boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;
 //   public void SearchCustomer(String newValue) throws SQLException, ClassNotFoundException {

     ArrayList<String> LoadAllCustomerIds() throws SQLException, ClassNotFoundException ;
*/
     CustomerDTO findCustomer(String newValue) throws SQLException, ClassNotFoundException ;
}
