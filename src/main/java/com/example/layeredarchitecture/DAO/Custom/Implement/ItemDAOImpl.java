package com.example.layeredarchitecture.DAO.Custom.Implement;

import com.example.layeredarchitecture.DAO.Customer.ItemDAO;
import com.example.layeredarchitecture.DAO.SQLUtil;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public class ItemDAOImpl implements ItemDAO {
    @Override
    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM Item");

        ArrayList<ItemDTO> allItem = new ArrayList();
        while (rst.next()){
            ItemDTO itemDTO = new ItemDTO
                    (rst.getString("code"),
                            rst.getString("description"),
                            rst.getBigDecimal("unitPrice"),
                            rst.getInt("qtyOnHand")
                    );
            allItem.add(itemDTO);


        }

        return allItem;
    }

    @Override
    public boolean save(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("INSERT INTO Item (code, description, unitPrice, qtyOnHand) VALUES (?,?,?,?)",dto.getCode(),dto.getDescription(), dto.getUnitPrice(),dto.getQtyOnHand());

    }

    @Override
    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {
        return  SQLUtil.execute("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?",dto.getDescription(),dto.getUnitPrice(),dto.getQtyOnHand(),dto.getCode());

    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("DELETE FROM Item WHERE code=?",id);
    }

    @Override
    public String generateNewId() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT code FROM Item ORDER BY code DESC LIMIT 1;");
        if(rst.next()){
            return rst.getString(1);

        }
        return null;
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = SQLUtil.execute("SELECT code FROM Item WHERE code=?",id);
        return resultSet.next();
    }

    @Override
    public ArrayList<String> LoadAllIds() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM Item");
        ArrayList<String> allIds = new ArrayList<>();

        while (rst.next()) {
            allIds.add(rst.getString("code"));
        }
        return allIds;
    }

    @Override
    public ArrayList<ItemDTO> find(String newValue) throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM Item WHERE code=?",newValue);
        ArrayList<ItemDTO>  arrayList = new ArrayList<>();
        while(rst.next()){
            ItemDTO itemDTO = new ItemDTO
                    (rst.getString("code"),
                            rst.getString("description"),
                            rst.getBigDecimal("unitPrice"),
                            rst.getInt("qtyOnHand")
                    );
            arrayList.add(itemDTO);

        }

        return  arrayList;
    }
    public ItemDTO findItemCom(String newItemCode) throws SQLException, ClassNotFoundException {

        ResultSet rst = SQLUtil.execute("SELECT * FROM Item WHERE code=?",newItemCode);
        rst.next();

        return new ItemDTO(newItemCode + "", rst.getString("description"), rst.getBigDecimal("unitPrice"), rst.getInt("qtyOnHand"));
    }


  /*  public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM Item");

        ArrayList<ItemDTO> allItem = new ArrayList();
        while (rst.next()){
            ItemDTO itemDTO = new ItemDTO
                    (rst.getString("code"),
                    rst.getString("description"),
                    rst.getBigDecimal("unitPrice"),
                    rst.getInt("qtyOnHand")
                    );
            allItem.add(itemDTO);


        }

        return allItem;
    }

    public  boolean save(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
      *//*  Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("SELECT id FROM Customer WHERE id=?");
        pstm.setString(1,itemDTO.getCode());
        pstm.setString(2, itemDTO.getDescription());
        pstm.setBigDecimal(3,itemDTO.getUnitPrice());
        pstm.setInt(4,itemDTO.getQtyOnHand());
        pstm.executeUpdate();*//*
       return SQLUtil.execute("INSERT INTO Item (code, description, unitPrice, qtyOnHand) VALUES (?,?,?,?)",itemDTO.getCode(),itemDTO.getDescription(), itemDTO.getUnitPrice(),itemDTO.getQtyOnHand());
    }
    public  boolean update(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
        *//*Connection connection = DBConnection.getDbConnection().getConnection();
        PreparedStatement pstm = connection.prepareStatement("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?");
        pstm.setString(1,itemDTO.getDescription());
        pstm.setBigDecimal(2,itemDTO.getUnitPrice());
        pstm.setInt(3,itemDTO.getQtyOnHand());
        pstm.setString(4,itemDTO.getCode());
        return pstm.executeUpdate() > 0;*//*
        return  SQLUtil.execute("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?",itemDTO.getDescription(),itemDTO.getUnitPrice(),itemDTO.getQtyOnHand(),itemDTO.getCode());
    }
    public boolean exist(String code) throws SQLException, ClassNotFoundException {

        ResultSet resultSet = SQLUtil.execute("SELECT code FROM Item WHERE code=?",code);
        return resultSet.next();


    }
     public  boolean delete (String code) throws SQLException, ClassNotFoundException {

         return SQLUtil.execute("DELETE FROM Item WHERE code=?",code);

     }

     public  String generateNextId() throws SQLException, ClassNotFoundException {
         ResultSet rst = SQLUtil.execute("SELECT code FROM Item ORDER BY code DESC LIMIT 1;");
   if(rst.next()){
       return rst.getString(1);

   }
   return null;
     }

     public ArrayList<String> getAllItemIds() throws SQLException, ClassNotFoundException {

         ResultSet rst = SQLUtil.execute("SELECT * FROM Item");
         ArrayList<String> allIds = new ArrayList<>();

         while (rst.next()) {
             allIds.add(rst.getString("code"));
         }
         return allIds;
     }
     public  ArrayList<ItemDTO> findItem(String code) throws SQLException, ClassNotFoundException {Connection connection = DBConnection.getDbConnection().getConnection();
         ResultSet rst = SQLUtil.execute("SELECT * FROM Item WHERE code=?",code);
         ArrayList<ItemDTO>  arrayList = new ArrayList<>();
         while(rst.next()){
           ItemDTO itemDTO = new ItemDTO
                   (rst.getString("code"),
                           rst.getString("description"),
                           rst.getBigDecimal("unitPrice"),
                           rst.getInt("qtyOnHand")
                   );
           arrayList.add(itemDTO);

       }

         return  arrayList;

     }
    *//* public int updateItem(int qtyOnHand,String code,ItemDTO item) throws SQLException, ClassNotFoundException {

         Connection connection = DBConnection.getDbConnection().getConnection();
             connection.setAutoCommit(false);
             PreparedStatement pstm = connection.prepareStatement("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?");
             pstm.setString(1, item.getDescription());
             pstm.setBigDecimal(2, item.getUnitPrice());
             pstm.setInt(3, qtyOnHand);
             pstm.setString(4, code);
             return  pstm.executeUpdate();



}*//*
public ItemDTO findItemCom(String newItemCode) throws SQLException, ClassNotFoundException {

    ResultSet rst = SQLUtil.execute("SELECT * FROM Item WHERE code=?",newItemCode);
    rst.next();

    return new ItemDTO(newItemCode + "", rst.getString("description"), rst.getBigDecimal("unitPrice"), rst.getInt("qtyOnHand"));
}*/
}
