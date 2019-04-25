/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlClasses;

import DatabaseManager.DatabaseManager;
import java.util.Random;

/**
 *
 * @author omar waheed
 */
public class Employee{
    String UserName;
    int Password;
    String EmpName;
    String EmpGender;
    String EmpAddress;
    String EmpDOB;
    String Qualifiactions;
    int EmpPhoneNum;
    float EmpSalary;
    String EmpDOJ;

    
    DatabaseManager x=new DatabaseManager();
    

  

    /**
     *
     * @param UserName
     * @param Password
     * @param EmpName
     * @param EmpGender
     * @param EmpAddress
     * @param EmpDOB
     * @param Qualifiactions
     * @param EmpPhoneNum
     * @param EmpSalary
     * @param EmpDOJ
     */
    public Employee(String EmpName, String EmpGender, String EmpAddress, String EmpDOB, String Qualifiactions, int EmpPhoneNum, float EmpSalary, String EmpDOJ) {
        
       
        this.EmpName = EmpName;
        this.EmpGender = EmpGender;
        this.EmpAddress = EmpAddress;
        this.EmpDOB = EmpDOB;
        this.Qualifiactions = Qualifiactions;
        this.EmpPhoneNum = EmpPhoneNum;
        this.EmpSalary = EmpSalary;
        this.EmpDOJ = EmpDOJ;
        
    }

    /**
     *
     * @param UserName
     * @param Password
     * @param EmpName
     * @param EmpGender
     * @param EmpAddress
     * @param EmpDOB
     * @param Qualifiactions
     * @param EmpPhoneNum
     * @param EmpSalary
     * @param EmpDOJ
     */
    public Employee(String UserName, int Password, String EmpName, String EmpGender, String EmpAddress, String EmpDOB, String Qualifiactions, int EmpPhoneNum, float EmpSalary, String EmpDOJ) {
        this.UserName = UserName;
        this.Password = Password;
        this.EmpName = EmpName;
        this.EmpGender = EmpGender;
        this.EmpAddress = EmpAddress;
        this.EmpDOB = EmpDOB;
        this.Qualifiactions = Qualifiactions;
        this.EmpPhoneNum = EmpPhoneNum;
        this.EmpSalary = EmpSalary;
        this.EmpDOJ = EmpDOJ;
    }
    public Employee(){
    
    }
    
    public String getUserName() {
        return UserName;
    }

    public int getPassword() {
        return Password;
    }

    public String getEmpName() {
        return EmpName;
    }

    public String getEmpGender() {
        return EmpGender;
    }

    public String getEmpAddress() {
        return EmpAddress;
    }

    public String getEmpDOB() {
        return EmpDOB;
    }

    public String getQualifiactions() {
        return Qualifiactions;
    }

    public int getEmpPhoneNum() {
        return EmpPhoneNum;
    }

    public float getEmpSalary() {
        return EmpSalary;
    }

    public String getEmpDOJ() {
        return EmpDOJ;
    }
   
    public void AddEmp()
    {  UserName=CreateUserName(EmpName);
       Password=CreatePassWord(EmpName);
       x.AddEmp(UserName, Password, EmpName, EmpGender, EmpAddress, EmpDOB, Qualifiactions, EmpPhoneNum, EmpSalary, EmpDOJ);
        
    }
    
    
    
    
   public int CreatePassWord(String Name){
   int b = 0;
       Random y=new Random();
         b+=y.nextInt(100);
       for (int i = 0; i < 3; i++) {
           b*=Name.charAt(i);
       }
   return b;}
   
   public String CreateUserName(String Name){
   String UserName;
   Random j=new Random();
   
   UserName=Name+j.nextInt(10)+"@Company.com";
   
   return UserName;}
   
    
    
}
