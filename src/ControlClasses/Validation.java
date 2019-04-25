/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlClasses;

public class Validation {
    
public boolean  IsNumber(String num){
    if (num.matches("[0-9]+")&&Integer.parseInt(num)>0) {
        return  true;
    }else{   
    return  false;
    }

}
public  boolean IsUserName(String UserName){
    if (UserName.contains("@Company.com")) {
        return  true;
    } else {
        return  false;
    }


}
public boolean IsEmpty(String string){
    if (string.equals("")||string.equals(" ")) {
       return  true;
    } else {
        return false;
    }
}
  public boolean IsString(String x){
        if(x.matches("[a-zA-Z]+")){
            return true;
        }
        else
            return false;
    }
    
}
