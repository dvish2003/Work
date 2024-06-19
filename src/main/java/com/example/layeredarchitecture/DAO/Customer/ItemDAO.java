package com.example.layeredarchitecture.DAO.Customer;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;

public interface ItemDAO extends  CrudDAO<ItemDTO> {
  /* ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;
    boolean save(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;
    boolean update(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
    boolean exist(String code) throws SQLException, ClassNotFoundException;
    boolean delete (String code) throws SQLException, ClassNotFoundException ;
    String generateNextId() throws SQLException, ClassNotFoundException ;
    ArrayList<String> getAllItemIds() throws SQLException, ClassNotFoundException ;
    ArrayList<ItemDTO> findItem(String code) throws SQLException, ClassNotFoundException ;
   // int updateItem(int qtyOnHand,String code,ItemDTO item) throws SQLException, ClassNotFoundException ;*/
    ItemDTO findItemCom(String newItemCode) throws SQLException, ClassNotFoundException;
}
