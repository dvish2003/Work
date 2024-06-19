package com.example.layeredarchitecture.DAO.Custom.Implement;

import com.example.layeredarchitecture.DAO.Customer.ItemDAO;
import com.example.layeredarchitecture.DAO.Customer.OrderDetailsDAO;
import com.example.layeredarchitecture.DAO.SQLUtil;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.SQLException;

public class OrderDetailDAO implements OrderDetailsDAO {
  private Connection connection = DBConnection.getDbConnection().getConnection();
    ItemDAO itemDAO = new ItemDAOImpl();

    public OrderDetailDAO() throws SQLException, ClassNotFoundException {
    }


    @Override
    public Boolean saveOrderDetails(OrderDetailDTO orderDetailDTO) throws SQLException, ClassNotFoundException {
      /*  PreparedStatement stm = connection.prepareStatement("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)");
        stm.setString(1, orderDetailDTO.getoId());
        stm.setString(2, orderDetailDTO.getItemCode());
        stm.setBigDecimal(3, orderDetailDTO.getUnitPrice());
        stm.setInt(4, orderDetailDTO.getQty());
        return stm.executeUpdate()>0;*/

        return SQLUtil.execute("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)",orderDetailDTO.getoId(),orderDetailDTO.getItemCode(),orderDetailDTO.getUnitPrice(),orderDetailDTO.getQty());
    }


/*
@Override
    public Boolean saveOrderDetails(String orderId, OrderDetailDTO orderDetailDTO) throws SQLException {
        PreparedStatement stm = connection.prepareStatement("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)");
        stm.setString(1, orderId);
        stm.setString(2, orderDetailDTO.getItemCode());
        stm.setBigDecimal(3, orderDetailDTO.getUnitPrice());
        stm.setInt(4, orderDetailDTO.getQty());
        return stm.executeUpdate()>0;
    }
*/

        /*public boolean addOrderDetails(String orderId, List<OrderDetailDTO> orderDetails) throws SQLException, ClassNotFoundException {
            for (OrderDetailDTO detail : orderDetails) {
                String itemCode = detail.getItemCode();
                BigDecimal UnitPrice = detail.getUnitPrice();
                int qty = detail.getQty();
                 Boolean added = saveOrderDetails(orderId,new OrderDetailDTO(itemCode, qty, UnitPrice));



                ItemDTO item = PlaceOrderFormController.findItem(detail.getItemCode());

                item.setQtyOnHand(item.getQtyOnHand() - detail.getQty());
                ItemDAOImpl itemDAO = new ItemDAOImpl();
                int Done = itemDAO.updateItem(item.getQtyOnHand(), item.getCode(), item);

                if (added && !(Done > 0)){

                    return false;
            }
            }


            return true;
        }*/
}



