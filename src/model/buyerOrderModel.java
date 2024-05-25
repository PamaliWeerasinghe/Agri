
package model;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class buyerOrderModel {
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
            e.printStackTrace();
        }
        
        
    }
    
}
