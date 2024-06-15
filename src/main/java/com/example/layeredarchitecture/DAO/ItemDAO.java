package com.example.layeredarchitecture.DAO;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
   ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;
    void save(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;
    void update(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
    boolean exist(String code) throws SQLException, ClassNotFoundException;
    void delete (String code) throws SQLException, ClassNotFoundException ;
    String generateNextId() throws SQLException, ClassNotFoundException ;
    ArrayList<String> getAllItemIds() throws SQLException, ClassNotFoundException ;
    ArrayList<ItemDTO> findItem(String code) throws SQLException, ClassNotFoundException ;
    int updateItem(int qtyOnHand,String code,ItemDTO item) throws SQLException, ClassNotFoundException ;
    ItemDTO findItemCom(String newItemCode) throws SQLException, ClassNotFoundException;
}
