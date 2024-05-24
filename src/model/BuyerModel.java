
package model;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class BuyerModel {
    public void loadBuyers(DefaultTableModel dfm){
        dfm.setRowCount(0);
        try {
            ResultSet buyers=MySQL.execute("SELECT * FROM `buyer` WHERE `status_id`='1'");
            while(buyers.next()){
                Vector v=new Vector();
                v.add(buyers.getInt("buyer_id"));
                v.add(buyers.getString("name"));
                v.add(buyers.getString("mobile"));
                v.add(buyers.getString("email"));
                dfm.addRow(v);
            }
        } catch (Exception e) {
        }
    }
    
}
