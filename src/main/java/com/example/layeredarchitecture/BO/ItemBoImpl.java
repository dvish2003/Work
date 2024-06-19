package com.example.layeredarchitecture.BO;

import com.example.layeredarchitecture.DAO.Custom.Implement.ItemDAOImpl;
import com.example.layeredarchitecture.DAO.Customer.ItemDAO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBoImpl implements ItemBo{

    ItemDAO itemDAO = new ItemDAOImpl();

    @Override
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException {
        //ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.getAll();
    }

    @Override
    public boolean save(ItemDTO dto) throws SQLException, ClassNotFoundException {
      //  ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.save(dto);
    }

    @Override
    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {
       // ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.update(dto);
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
      //  ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.delete(id);
    }

    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {
      //  ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.generateNewId();
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
      //  ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.exist(id);
    }

    @Override
    public ArrayList<String> LoadAllIds() throws SQLException, ClassNotFoundException {
      //  ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.LoadAllIds();
    }

    @Override
    public ArrayList<ItemDTO> find(String newValue) throws SQLException, ClassNotFoundException {
      //  ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.find(newValue);
    }

    @Override
    public ItemDTO findItemCom(String newItemCode) throws SQLException, ClassNotFoundException {
     //   ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.findItemCom(newItemCode);
    }
}
