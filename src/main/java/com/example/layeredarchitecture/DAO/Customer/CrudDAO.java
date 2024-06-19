package com.example.layeredarchitecture.DAO.Customer;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T> {
    ArrayList<T> getAll() throws SQLException, ClassNotFoundException;

    boolean save(T dto) throws SQLException, ClassNotFoundException ;

    boolean update(T dto) throws SQLException, ClassNotFoundException ;

    boolean delete (String id) throws SQLException, ClassNotFoundException ;


    String generateNewId () throws SQLException, ClassNotFoundException ;

    boolean exist(String id) throws SQLException, ClassNotFoundException ;


    ArrayList<String> LoadAllIds() throws SQLException, ClassNotFoundException ;

    ArrayList<ItemDTO> find(String newValue) throws SQLException, ClassNotFoundException ;
}
