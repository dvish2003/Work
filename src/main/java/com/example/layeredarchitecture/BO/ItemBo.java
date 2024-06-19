package com.example.layeredarchitecture.BO;

import com.example.layeredarchitecture.DAO.SQLUtil;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBo {
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;
    public boolean save(ItemDTO dto) throws SQLException, ClassNotFoundException;

    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException;

    public boolean delete(String id) throws SQLException, ClassNotFoundException;

    public String generateNewId() throws SQLException, ClassNotFoundException;

    public boolean exist(String id) throws SQLException, ClassNotFoundException;

    public ArrayList<String> LoadAllIds() throws SQLException, ClassNotFoundException;

    public ArrayList<ItemDTO> find(String newValue) throws SQLException, ClassNotFoundException;
    public ItemDTO findItemCom(String newItemCode) throws SQLException, ClassNotFoundException;
}
