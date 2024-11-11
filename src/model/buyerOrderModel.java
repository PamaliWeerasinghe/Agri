
package model;

import static gui.Login.log1;
import gui.output.Buyer_OrderHasItems;
import gui.output.OrderHasItems;
import gui.output.SelectError;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class buyerOrderModel {
    public static String orderID;
    public void ReloadInvoiceTable(DefaultTableModel dfm ,String invoice_id ){
        dfm.setRowCount(0);
        
        try {
            ResultSet orders=MySQL.execute("SELECT * FROM `buyer_purchase_yield` INNER JOIN `crop`"
                    + "ON `buyer_purchase_yield`.`crop_c_id`=`crop`.`c_id` INNER JOIN `crop_invoice`"
                    + "ON `buyer_purchase_yield`.`invoice_id`=`crop_invoice`.`order_id`"
                    + "WHERE `crop_invoice`.`status_id`='1' AND `order_id`='"+invoice_id+"'");
            while(orders.next()){
                Vector v=new Vector();
                v.add(orders.getInt("order_id"));
                v.add(orders.getString("type"));
                v.add(orders.getString("date"));
                v.add(orders.getString("qty"));
                v.add(orders.getString("unit_price"));
                dfm.addRow(v);
            }
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }
    public void loadInvoiceTable(DefaultTableModel dfm){
        dfm.setRowCount(0);
        
        try {
            ResultSet orders=MySQL.execute("SELECT * FROM `buyer_purchase_yield` INNER JOIN `crop`"
                    + "ON `buyer_purchase_yield`.`crop_c_id`=`crop`.`c_id` INNER JOIN `crop_invoice`"
                    + "ON `buyer_purchase_yield`.`invoice_id`=`crop_invoice`.`order_id`"
                    + "WHERE `crop_invoice`.`status_id`='1' AND `invoice_id`='1'");
            while(orders.next()){
                Vector v=new Vector();
                v.add(orders.getInt("order_id"));
                v.add(orders.getString("type"));
                v.add(orders.getString("date"));
                v.add(orders.getString("qty"));
                v.add(orders.getString("unit_price"));
                dfm.addRow(v);
            }
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }
    public void loadCropTable(DefaultTableModel dfm){
        dfm.setRowCount(0);
        
        try {
            ResultSet orders=MySQL.execute("SELECT * FROM `crop`");
            while(orders.next()){
                Vector v=new Vector();
                v.add(orders.getInt("c_id"));
                v.add(orders.getString("type"));
                v.add(orders.getString("qty"));
                v.add(orders.getString("unit_price"));
                dfm.addRow(v);
            }
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }
    public void loadOrderTable(DefaultTableModel dfm){
        dfm.setRowCount(0);
        
        try {
            ResultSet orders=MySQL.execute("SELECT * FROM `crop_invoice` WHERE `status_id`='1'");
            while(orders.next()){
                Vector v=new Vector();
                v.add(orders.getInt("order_id"));
                v.add(orders.getString("date"));
                dfm.addRow(v);
            }
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
        
        
    }
    public void loadOrderTable_includingBuyer(DefaultTableModel dfm){
        dfm.setRowCount(0);
        
        try {
            ResultSet orders=MySQL.execute("SELECT * FROM `crop_invoice` INNER JOIN `buyer`"
                    + "ON `crop_invoice`.`buyer_buyer_id`=`buyer`.`buyer_id`"
                    + "WHERE `crop_invoice`.`status_id`='1'");
            while(orders.next()){
                Vector v=new Vector();
                v.add(orders.getInt("order_id"));
                v.add(orders.getString("date"));
                v.add(orders.getString("name"));
                dfm.addRow(v);
            }
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
        
        
    }

    public void loadCropDetails(DefaultTableModel dtm, String text) {
        dtm.setRowCount(0);
       
        try {
            ResultSet orders=MySQL.execute("SELECT * FROM `crop` WHERE `type` LIKE '"+text+"%'");
            while(orders.next()){
                Vector v=new Vector();
                v.add(orders.getInt("c_id"));
                v.add(orders.getString("type"));
                v.add(orders.getString("qty"));
                v.add(orders.getString("unit_price"));
                dtm.addRow(v);
            }
            
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
        
        
    }

    public void loadBuyerTable(DefaultTableModel dtm) {
        dtm.setRowCount(0);
       
        try {
            ResultSet orders=MySQL.execute("SELECT * FROM `buyer` WHERE `status_id`='1'");
            while(orders.next()){
                Vector v=new Vector();
                v.add(orders.getInt("buyer_id"));
                v.add(orders.getString("name"));
                v.add(orders.getString("mobile"));
                
                dtm.addRow(v);
            }
            
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }

    public void addItemToBuyerInvoice(String orderID, String cropID, String qty, String unit_price) {
        double price=Double.parseDouble(unit_price);
        int quanity=Integer.parseInt(qty);
        double total=quanity*price;
        if(orderID.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Order ID cannot be empty!");
            categoryExists.setVisible(true);
        }else if(cropID.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Crop ID cannot be empty!");
            categoryExists.setVisible(true);
        }else if(qty.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Quantity is empty!");
            categoryExists.setVisible(true);
        }else if(unit_price.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Insert a unit price !");
            categoryExists.setVisible(true);
        }else{
            try {
                ResultSet rs=MySQL.execute("SELECT * FROM `buyer_purchase_yield` WHERE `invoice_id`='"+orderID+"' AND `crop_c_id`='"+cropID+"' ");
                if(rs.next()){
                    ResultSet check=MySQL.execute("SELECT * FROM `crop` WHERE `c_id`='"+cropID+"' AND `qty`>='"+qty+"'");
                    if(check.next()){
                        MySQL.execute("UPDATE `buyer_purchase_yield` SET `qty`=`qty`+'"+qty+"',`unit_price`='"+unit_price+"' WHERE `invoice_id`='"+orderID+"'");
                        MySQL.execute("UPDATE `crop` SET `qty`=`qty`-'"+qty+"' WHERE `c_id`='"+cropID+"'");
                        MySQL.execute("UPDATE `crop_invoice` SET `total`=`total`+'"+total+"'");
                    }else{
                        SelectError categoryExists=new SelectError();
                        categoryExists.setText("No available Quantity !");
                        categoryExists.setVisible(true);
                    }
                    
                }else{
                    ResultSet check=MySQL.execute("SELECT * FROM `crop` WHERE `c_id`='"+cropID+"' AND `qty`>='"+qty+"'");
                    if(check.next()){
                    MySQL.execute("INSERT INTO `buyer_purchase_yield`(`invoice_id`,`crop_c_id`,`qty`,`unit_price`) VALUES('"+orderID+"','"+cropID+"','"+qty+"','"+unit_price+"')");
                    MySQL.execute("UPDATE `crop` SET `qty`=`qty`-'"+qty+"' WHERE `c_id`='"+cropID+"'");
                    MySQL.execute("UPDATE `crop_invoice` SET `total`=`total`+'"+total+"'");
                    }else{
                        SelectError categoryExists=new SelectError();
                        categoryExists.setText("No available Quantity !");
                        categoryExists.setVisible(true);
                    }
                }
                
            } catch (Exception e) {
//                e.printStackTrace();
                  log1.warning(e.toString());
            }
        }
        
    }

    public void deleteOrder(String ordID, String date) {
        if(ordID.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Invoice not selected !");
            categoryExists.setVisible(true);
        }else{
            orderID=ordID;
            try {
            
            ResultSet rs=MySQL.execute("SELECT * FROM `buyer_purchase_yield` WHERE `invoice_id`='"+ordID+"'");
            if(rs.next()){
                new Buyer_OrderHasItems().setVisible(true);
                
                
            }else{
                ResultSet rs2=MySQL.execute("SELECT * FROM `crop_invoice` WHERE `order_id`='"+ordID+"' AND `status_id`='2'");
                if(rs2.next()){
                    SelectError categoryExists=new SelectError();
                    categoryExists.setText("Invoice already removed !");
                    categoryExists.setVisible(true);
                }else{
                    MySQL.execute("UPDATE `crop_invoice` SET `status_id`='2' WHERE `order_id`='"+ordID+"'");
                }
                
            }
            
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
        }
        
    }
    
}
