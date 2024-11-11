package model;

import gui.PurchaseOrder_insertItems;
//validations

public class validationModel {
    //validation

    public static boolean textValidation(String text){
        String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}~0123456789";
        String name=text;
        String str2[]=name.split("");
        boolean condition=true;

        for (int i=0;i<str2.length;i++){    
            //System.out.println(str2[i]);
        if (specialCharacters.contains(str2[i]))
        {
           condition=true;
        }
        else
           condition=false;
        }
        return condition;

    }
    public static boolean mobileValidation(String text){
        
        String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}~ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String mobile=text;
        String str2[]=mobile.split("");
        boolean condition=true;
        
        for (int i=0;i<str2.length;i++){    
            //System.out.println(str2[i]);
        if (specialCharacters.contains(str2[i]))
        {
           condition=true;
        }
        else
           condition=false;
        }
        
        return condition;
    }
    public static boolean emailValidation(String text){
        String specialCharacters=" !#$%&'()*+,-./:;<=>?[]^_`{|}~ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String mobile=text;
        String str2[]=mobile.split("");
        boolean condition=true;
        
        for (int i=0;i<str2.length;i++){    
            //System.out.println(str2[i]);
        if (specialCharacters.contains(str2[i]))
        {
           condition=true;
        }
        else
           condition=false;
        }
        
        return condition;
    }
    public static boolean numericValidation(String text){
       String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}~ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numeric=text;
        String str2[]=numeric.split("");
        boolean condition=true;
        
        for (int i=0;i<str2.length;i++){    
            //System.out.println(str2[i]);
        if (specialCharacters.contains(str2[i]))
        {
           condition=true;
        }
        else
           condition=false;
        }
        
        return condition; 
    }


}
