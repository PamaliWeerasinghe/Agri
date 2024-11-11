
package model;

import static gui.Login.log1;
import gui.output.OrderHasItems;
import gui.output.SelectError;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class addItemsModel {
    public static String orderID;
    public void reloadOrderTable(DefaultTableModel dfm,String id){
        try {
            ResultSet invoices_opened=MySQL.execute("SELECT * FROM `invoice` WHERE `status_id`='1' AND `ordSup_id` LIKE '"+id+"'");
            dfm.setRowCount(0);
            while(invoices_opened.next()){
                Vector v=new Vector();
                v.add(invoices_opened.getInt("ordSup_id"));
                v.add(invoices_opened.getString("orderDate"));
                dfm.addRow(v);
            }
            
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }
    public void loadItemsInInvoiceTable(DefaultTableModel dtm){
       int qty;
       double unit_price,cost;
        dtm.setRowCount(0);
        try {
            ResultSet rs=MySQL.execute("SELECT * FROM `invoice_has_items` INNER JOIN `supplies_has_supplier`\n" +
                                        "ON `supplies_has_supplier`.`shs_id`=`invoice_has_items`.`productSupplier_id` INNER JOIN `supplier`\n" +
                                        "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`\n" +
                                        "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`\n" +
                                        "ON `category`.`cat_id`=`supplies`.`category_cat_id`\n" +
                                        "WHERE `order_ordSup_id`='1'");

             while(rs.next()){
                Vector v=new Vector();
                qty=rs.getInt("qty");
                unit_price=rs.getDouble("unit_price");
                cost=qty*unit_price;
                v.add(rs.getInt("order_ordSup_id"));
                v.add(rs.getString("cate_name"));
                v.add(rs.getString("title"));
                v.add(rs.getInt("qty"));
                v.add(rs.getDouble("unit_price"));
                v.add(cost);
                dtm.addRow(v);
            }
           
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }
    public void reloadInvoiceTable(String orderID,DefaultTableModel dtm){
         dtm.setRowCount(0);
         int qty;
         double unit_price,cost;
        try {
            ResultSet rs=MySQL.execute("SELECT * FROM `invoice_has_items` INNER JOIN `supplies_has_supplier`\n" +
                                        "ON `supplies_has_supplier`.`shs_id`=`invoice_has_items`.`productSupplier_id` INNER JOIN `supplier`\n" +
                                        "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`\n" +
                                        "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`\n" +
                                        "ON `category`.`cat_id`=`supplies`.`category_cat_id`\n" +
                                        "WHERE `order_ordSup_id`='"+orderID+"'");

             while(rs.next()){
                Vector v=new Vector();
                qty=rs.getInt("qty");
                unit_price=rs.getDouble("unit_price");
                cost=qty*unit_price;
                v.add(rs.getInt("order_ordSup_id"));
                v.add(rs.getString("cate_name"));
                v.add(rs.getString("title"));
                v.add(rs.getInt("qty"));
                v.add(rs.getDouble("unit_price"));
                v.add(cost);
                dtm.addRow(v);
            }
           
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }
    
    public void loadOrderTable(DefaultTableModel dfm){
        try {
            ResultSet invoices_opened=MySQL.execute("SELECT * FROM `invoice` WHERE `status_id`='1'");
            dfm.setRowCount(0);
            while(invoices_opened.next()){
                Vector v=new Vector();
                v.add(invoices_opened.getInt("ordSup_id"));
                v.add(invoices_opened.getString("orderDate"));
                dfm.addRow(v);
            }
            
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }
    public void loadProductTable(DefaultTableModel dtm){
        dtm.setRowCount(0);
        try {
            ResultSet products=MySQL.execute("SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
                    + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
                    + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
                    + "ON `category`.`cat_id`=`supplies`.`category_cat_id` INNER JOIN `status` "
                + "ON `supplies_has_supplier`.`status_id`=`status`.`id` WHERE `status`='Active'");
            
            while(products.next()){
                Vector v=new Vector();
                v.add(products.getInt("shs_id"));
                v.add(products.getString("name"));
                v.add(products.getString("cate_name"));
                v.add(products.getString("title"));
                dtm.addRow(v);
            }
            
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
    }

    
    public void addItemToInvoice(String orderID, String productID, String qty, String unit_price) {
        
        if(orderID.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Order ID cannot be empty!");
            categoryExists.setVisible(true);
        }else if(productID.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Product ID cannot be empty!");
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
                ResultSet rs=MySQL.execute("SELECT * FROM `invoice_has_items` WHERE `order_ordSup_id`='"+orderID+"' AND `productSupplier_id`='"+productID+"' AND `unit_price`='"+unit_price+"'");
                if(rs.next()){
                    MySQL.execute("UPDATE `invoice_has_items` SET `qty`=`qty`+'"+qty+"' WHERE `invoice_id`='"+rs.getInt("invoice_id")+"'");
                }else{
                    MySQL.execute("INSERT INTO `invoice_has_items`(`order_ordSup_id`,`productSupplier_id`,`qty`,`unit_price`) VALUES('"+orderID+"','"+productID+"','"+qty+"','"+unit_price+"')");
                
                }
                
            } catch (Exception e) {
//                e.printStackTrace();
                  log1.warning(e.toString());
            }
        }
        
        
    }

    public void loadProductDetails(DefaultTableModel dtm,String text) {
       dtm.setRowCount(0);
       
        try {
            ResultSet products=MySQL.execute("SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
                    + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
                    + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
                    + "ON `category`.`cat_id`=`supplies`.`category_cat_id` INNER JOIN `status` "
                + "ON `supplies_has_supplier`.`status_id`=`status`.`id` WHERE `status`='Active' AND `title` LIKE '"+text+"%'");
            
            while(products.next()){
                
                Vector v=new Vector();
                
                v.add(products.getInt("shs_id"));
                v.add(products.getString("name"));
                v.add(products.getString("cate_name"));
                v.add(products.getString("title"));
                
                dtm.addRow(v);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
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
            
            ResultSet rs=MySQL.execute("SELECT * FROM `invoice_has_items` WHERE `order_ordSup_id`='"+ordID+"'");
            if(rs.next()){
                new OrderHasItems().setVisible(true);
                
                
            }else{
                ResultSet rs2=MySQL.execute("SELECT * FROM `invoice` WHERE `ordSup_id`='"+ordID+"' AND `status_id`='2'");
                if(rs2.next()){
                    SelectError categoryExists=new SelectError();
                    categoryExists.setText("Invoice already removed !");
                    categoryExists.setVisible(true);
                }else{
                    MySQL.execute("UPDATE `invoice` SET `status_id`='2' WHERE `ordSup_id`='"+ordID+"'");
                }
                
            }
            
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
        }
        
        
    }

    

    
   
    
    
    
}
