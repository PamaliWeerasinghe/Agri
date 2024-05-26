package model;
import org.apache.log4j.Logger;

public class backupRestoreCode {
    
    static Logger log = Logger.getLogger(backupRestoreCode.class.getName());
    public String backupdb(String path) {
           String msg=null;
    
        try {
            Runtime runTIme=Runtime.getRuntime();
            Process p=runTIme.exec("C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysqldump.exe -uroot -p20030909 --port=3307  --add-drop-database -B shopmanager -r "+path);
            
            int processComplete=p.waitFor();
            System.out.println(processComplete);
            msg="Backing up success";
        } catch (Exception e) {
            e.printStackTrace();
           
            msg="backing up error";
        }
    
    return msg;
    }
    
     
    public String restoredb(String path){
    String msg=null;
        try {
            Runtime runTIme=Runtime.getRuntime();
            String[] restoreCmd=new String[]{"C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysql.exe",
                                                                      "--user=root",
                                                                      "--password=20030909",
                                                                      "--port=3307",
                                                                      "-e",
                                                                      "source" +path};
            
            Process p=runTIme.exec(restoreCmd);
            int processComplete=p.waitFor();
            System.out.println(processComplete);
            msg="restore success";
        } catch (Exception e) {
            e.printStackTrace();
            
            msg="restore error";
        }
    
    return msg;
    }
    
}
