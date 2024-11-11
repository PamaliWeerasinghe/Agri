
package model;

import gui.Admin_addSupplier;
import gui.Login;
import static gui.Login.log1;
import gui.output.SelectError;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class SupplierModel {
    public static int cid;
    
    public void deleteSupplier(int selectedRowId,int sup_id){
        try {
            System.out.println(selectedRowId);
            System.out.println(sup_id);
            MySQL.execute("UPDATE `supplies_has_supplier` SET `status_id`='2' WHERE `supplies_supplies_id`='"+sup_id+"' AND `supplier_sup_id`='"+selectedRowId+"'");
            System.out.println("executed");
        } catch (Exception e) {
            log1.warning(e.toString());
        }
    }
    
    public void updateSupplier(String name, String mobile, String address, String category, String title, int selectedRowId,int sup_id){
        if(name.isEmpty()){
                SelectError categoryExists=new SelectError();
                categoryExists.setText("Supplier name is empty");
                categoryExists.setVisible(true);
        }else if(mobile.isEmpty()){
                SelectError categoryExists=new SelectError();
                categoryExists.setText("Supplier mobile is empty");
                categoryExists.setVisible(true);
        }else if(address.isEmpty()){
                SelectError categoryExists=new SelectError();
                categoryExists.setText("Supplier address is empty");
                categoryExists.setVisible(true);
        }else if(category=="SELECT"){
                SelectError categoryExists=new SelectError();
                categoryExists.setText("Supplier category is not selected");
                categoryExists.setVisible(true);
        }else if(title.isEmpty()){
                SelectError categoryExists=new SelectError();
                categoryExists.setText("Product title is empty");
                categoryExists.setVisible(true);
        }else{
            try {
                //int cid;
                ResultSet rs=MySQL.execute("SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
                    + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
                    + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
                    + "ON `category`.`cat_id`=`supplies`.`category_cat_id` WHERE"
                    + "`name`='"+name+"' AND `mobile`='"+mobile+"' AND `address`='"+address+"' AND `title`='"+title+"' AND `cate_name`='"+category+"'");
                
                if(rs.next()){
                    SelectError categoryExists=new SelectError();
                    categoryExists.setText("Supplier already Exisiting!");
                    categoryExists.setVisible(true);
                }else{
                    ResultSet rs1=MySQL.execute("SELECT * FROM `category` WHERE `cate_name`='"+category+"'");
                    if(rs1.next()){
                        cid=rs1.getInt("cat_id");
                    }
                    
                    MySQL.execute("UPDATE `supplier` SET `name`='"+name+"',`mobile`='"+mobile+"',`address`='"+address+"' WHERE `sup_id`='"+selectedRowId+"'");
                    MySQL.execute("UPDATE `supplies` SET `category_cat_id`='"+cid+"',`title`='"+title+"' WHERE `supplies_id`='"+sup_id+"'");
                    
                }
            } catch (Exception e) {
                //e.printStackTrace();
                log1.warning(e.toString());
            }   
        }
        
    }
    
    public void addCategory(String category){
            if(category.isEmpty()){
                SelectError categoryExists=new SelectError();
                categoryExists.setText("New category name is empty");
                categoryExists.setVisible(true);
            }else{
                try {
            
                ResultSet cid=MySQL.execute("SELECT * FROM `category` WHERE `cate_name`='"+category+"'");
                if(cid.next()){
                    SelectError categoryExists=new SelectError();
                    categoryExists.setText("Category already Exists!");
                    categoryExists.setVisible(true);
                }else{

                    MySQL.execute("INSERT INTO `category`(`cate_name`) VALUES('"+category+"')");
                }
                } catch (Exception ex) {
                    //ex.printStackTrace();
                    log1.warning(ex.toString());
                }
            }
        
    }
    
    
    
    public void loadTable(DefaultTableModel dtm,String query){
        dtm.setRowCount(0);
        
        try {
            ResultSet rs=MySQL.execute(query);
            while(rs.next()){
                Vector v=new Vector();
                v.add(rs.getInt("sup_id"));
                v.add(rs.getString("name"));
                v.add(rs.getString("mobile"));
                v.add(rs.getString("cate_name"));
                v.add(rs.getString("title"));
                dtm.addRow(v);
                
            }
        } catch (Exception ex) {
            //Logger.getLogger(SupplierModel.class.getName()).log(Level.SEVERE, null, ex);
            //ex.printStackTrace();
            log1.warning(ex.toString());
        }
    }
    
    public void loadCategories(JComboBox<String> supplierAdd_combo){
        Admin_addSupplier cat_model=new Admin_addSupplier();
        try {
           ResultSet rs=MySQL.execute("SELECT * FROM `category`"); 
           Vector v=new Vector();
           v.add("SELECT");
           while(rs.next()){
               
           }
           DefaultComboBoxModel dropdown=new DefaultComboBoxModel (v);
           supplierAdd_combo.setModel(dropdown);
        } catch (Exception e) {
            //e.printStackTrace();
            log1.warning(e.toString());
        }
        
    }
    
    public void insertSupplier(String name, String mobile, String address, String category, String title){
        int category_id;
        int supplier_id;
        try {
                
                //if(cid.next()){
                //category_id=cid.getInt("cat_id");
                ResultSet rs=MySQL.execute("SELECT * FROM `supplies_has_supplier` INNER JOIN `supplier` "
                    + "ON `supplier`.`sup_id`=`supplies_has_supplier`.`supplier_sup_id` INNER JOIN `supplies`"
                    + "ON `supplies`.`supplies_id`=`supplies_has_supplier`.`supplies_supplies_id` INNER JOIN `category`"
                    + "ON `category`.`cat_id`=`supplies`.`category_cat_id` WHERE"
                    + "`name`='"+name+"' AND `mobile`='"+mobile+"' AND `address`='"+address+"' AND `title`='"+title+"' ");
                if(rs.next()){
                    //there is a supplier
                    System.out.println("There is a supplier");
                    
                }else{
                    //no existing supplier
                    ResultSet search1=MySQL.execute("SELECT * FROM `supplier` WHERE"
                            + "`name`='"+name+"' AND `mobile`='"+mobile+"' AND `address`='"+address+"'");
                    if(!search1.next()){
                        MySQL.execute("INSERT INTO `supplier`(`name`,`mobile`,`address`) VALUES('"+name+"','"+mobile+"','"+address+"')");
                    }
                    
                    ResultSet sup_id=MySQL.execute("SELECT * FROM `supplier` WHERE"
                            + "`name`='"+name+"' AND `mobile`='"+mobile+"' AND `address`='"+address+"'");
                    if(sup_id.next()){
                        
                        //inserted properly
                        supplier_id=sup_id.getInt("sup_id");
                        
                        ResultSet cid=MySQL.execute("SELECT * FROM `category` WHERE `cate_name`='"+category+"'");
                        if(cid.next()){
                            ResultSet search2=MySQL.execute("SELECT * FROM `supplies` WHERE `category_cat_id`='"+cid.getInt("cat_id")+"' AND `title`='"+title+"'");
                            if(!search2.next()){
                                MySQL.execute("INSERT INTO `supplies`(`category_cat_id`,`title`) VALUES('"+cid.getInt("cat_id")+"','"+title+"')");
                            }
                            
                            ResultSet supplies=MySQL.execute("SELECT * FROM `supplies` WHERE `category_cat_id`='"+cid.getInt("cat_id")+"' AND `title`='"+title+"'");
                            if(supplies.next()){
                                
                                MySQL.execute("INSERT INTO `supplies_has_supplier`(`supplies_supplies_id`,`supplier_sup_id`,`status_id`) VALUES('"+supplies.getInt("supplies_id")+"','"+sup_id.getInt("sup_id")+"','1')");
                                
                            }else{
                                System.out.println("supplies not inserted properly");
                                //supplies not inserted properly
                            }
                        }else{
                            
                        }
                        
                        
                    }else{
                        //not inserted properly
                    }
                    
                }
                
                
                //}else{
                    //category not exist
                //}
        } catch (Exception e) {
            log1.warning(e.toString());
        }
    }

   
  
    
    
}
