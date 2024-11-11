
package model;

import static gui.Login.log1;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class orderModel {
    public void loadOrderTable(DefaultTableModel dfm){
        dfm.setRowCount(0);
        try {
            ResultSet orders=MySQL.execute("SELECT * FROM `invoice` WHERE `status_id`='1'");
            while(orders.next()){
                Vector v=new Vector();
                v.add(orders.getInt("ordSup_id"));
                v.add(orders.getString("orderDate"));
                dfm.addRow(v);
            }
        } catch (Exception e) {
//            e.printStackTrace();
              log1.warning(e.toString());
        }
        
        
    }
   
}
