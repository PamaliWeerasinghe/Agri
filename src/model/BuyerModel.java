
package model;

import static gui.Login.log1;
import gui.output.SelectError;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class BuyerModel {
    public void loadBuyers(DefaultTableModel dfm,String query){
        dfm.setRowCount(0);
        try {
            ResultSet buyers=MySQL.execute(query);
            while(buyers.next()){
                Vector v=new Vector();
                v.add(buyers.getInt("buyer_id"));
                v.add(buyers.getString("name"));
                v.add(buyers.getString("mobile"));
                v.add(buyers.getString("email"));
                dfm.addRow(v);
            }
        } catch (Exception e) {
            log1.warning(e.toString());
        }
    }

    public void insertBuyer(String name, String mobile, String email, String address) {
        if(name.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Buyer name is empty!");
            categoryExists.setVisible(true);
        }else if(mobile.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Mobile cannot be empty!");
            categoryExists.setVisible(true);
        }else if(address.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Address is empty!");
            categoryExists.setVisible(true);
        }else if(email.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Insert the buyer email !");
            categoryExists.setVisible(true);
        }else{
            try {
                ResultSet rs=MySQL.execute("SELECT * FROM `buyer` WHERE "
                        + "`name`='"+name+"' AND `mobile`='"+mobile+"' AND `email`='"+email+"'");
                if(rs.next()){
                    SelectError categoryExists=new SelectError();
                    categoryExists.setText("Buyer already registered !");
                    categoryExists.setVisible(true);
                }else{
                    MySQL.execute("INSERT INTO `buyer`(`name`,`mobile`,`email`,`address`,`status_id`) VALUES('"+name+"','"+mobile+"','"+email+"','"+address+"','1')");
                    
                }
            } catch (Exception ex) {
//                ex.printStackTrace();
                  log1.warning(ex.toString());
            }
            
        }
        
        }

    public void updateBuyer(String id, String name, String mobile, String email, String address) {
        if(name.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Buyer name is empty!");
            categoryExists.setVisible(true);
        }else if(mobile.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Mobile cannot be empty!");
            categoryExists.setVisible(true);
        }else if(address.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Address is empty!");
            categoryExists.setVisible(true);
        }else if(email.isEmpty()){
            SelectError categoryExists=new SelectError();
            categoryExists.setText("Insert the buyer email !");
            categoryExists.setVisible(true);
        }else{
            try {
                ResultSet rs= MySQL.execute("SELECT * FROM `buyer` WHERE "
                        + "`name`='"+name+"' AND `mobile`='"+mobile+"' AND `email`='"+email+"' AND `address`='"+address+"'");
                if(rs.next()){
                    SelectError categoryExists=new SelectError();
                    categoryExists.setText("Buyer already exists!");
                    categoryExists.setVisible(true);
                }else{
                    MySQL.execute("UPDATE `buyer` SET `name`='"+name+"',`mobile`='"+mobile+"',`email`='"+email+"',`address`='"+address+"'"
                            + "WHERE `buyer_id`='"+id+"'");
                    
                }
            } catch (Exception ex) {
//                ex.printStackTrace();
                  log1.warning(ex.toString());
            }
        
        
        }
        
        
    }

    public void deleteBuyer(String id) {
        try {
            ResultSet rs=MySQL.execute("SELECT * FROM `buyer` WHERE `buyer_id`='2' AND `status_id`='2'");
            if(rs.next()){
                    SelectError categoryExists=new SelectError();
                    categoryExists.setText("Buyer already removed!");
                    categoryExists.setVisible(true);
            }else{
                    MySQL.execute("UPDATE `buyer` SET `status_id`='2' WHERE `buyer_id`='"+id+"'");
            }
        } catch (Exception e) {
            log1.warning(e.toString());
        }
                   
    }
        
        
    
    
}
