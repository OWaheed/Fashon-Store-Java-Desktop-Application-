/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlClasses;

import DatabaseManager.DatabaseManager;
import java.util.Random;

public class Bill {
String CustomerName;
String Email;
int PhoneNumber;
String Date;
String StockIds="";

    public void setTotal(float Total) {
        this.Total = Total;
    }
float Total;
String billId;

    public Bill(String CustomerName, String Email, int PhoneNumber, String Date, String StockIds, float Total, String billId) {
        this.CustomerName = CustomerName;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Date = Date;
        this.StockIds = StockIds;
        this.Total = Total;
        this.billId = billId;
    }
DatabaseManager D=new DatabaseManager();
    public Bill(){}
    
    public void BillEdit(String CustomerName, String Email, int PhoneNumber, String Date) {
        this.CustomerName = CustomerName;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.Date = Date;
        
    }

public void AddapparelToBill(float price,int Quantity,int Id) 
{ 
  this.StockIds+=Id+"_";
    System.out.println(StockIds);
   this.Total+=price*Quantity;
    System.out.println(Total);
}


public void RemoveApparelFromBill(float price,int Quantity,int Id)
{ 
  String Temp=StockIds.replace(Id+"_","");
  StockIds=Temp;
  System.out.println(StockIds);
  this.Total-=price*Quantity;
   System.out.println(Total);
}

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmail() {
        return Email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public String getStockIds() {
        return StockIds;
    }

    public String getDate() {
        return Date;
    }

    public float getTotal() {
        return Total;
    }
    public void AddNewBill(String []x)
    {    CreateBillID();
          D.AddBill(CustomerName, Email, PhoneNumber, Date, StockIds, Total, billId);
          D.AddDayIncome(Date,this.getTotal());
          D.CreatePdf(D.PrepareText(CustomerName, billId,Total, x, Date), CustomerName+billId);
    }
    public void CreateBillID(){
        Random r=new Random();
        String [] l={"a","b","c","d","e"};
        this.billId=Date.replace("-","")+r.nextInt(100)+l[r.nextInt(4)]+r.nextInt(100)+l[r.nextInt(4)]+l[r.nextInt(4)];
    
    }

    
}
