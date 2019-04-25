/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlClasses;

import DatabaseManager.DatabaseManager;
import Gui.AdminPanels.Style;
import java.util.Random;

/**
 *
 * @author omar waheed
 */
public class Apparel {
    String Type;
    int StockId;
    float pricePerItem;
    int Quantity;
    Category c =new Category();
    style s =new style();
    DatabaseManager D=new DatabaseManager();
    
    public  String GetCategory(){
    return c.CategoryName;}
    
    public  String GetStyle(){
    return s.StyleName;}
    
    public String getType() {
        return Type;
    }

    public int getStockId() {
        return StockId;
    }

    public float getPricePerItem() {
        return pricePerItem;
    }

    public int getQuantity() {
        return Quantity;
    }
    

    public Apparel() {
    }

    public Apparel(String Type, int StockId, float pricePerItem, int Quantity, String CategoryName,String StyleName) {
        this.Type = Type;
        this.StockId = StockId;
        this.pricePerItem = pricePerItem;
        this.Quantity = Quantity;
        this.c.CategoryName= CategoryName;
        this.s.StyleName=StyleName;
    }
   

    public Apparel(String Type, float pricePerItem, int Quantity, String CategoryName,String StyleName) {
        this.Type = Type;
        this.pricePerItem = pricePerItem;
        this.Quantity = Quantity;
        this.c.CategoryName= CategoryName;
        this.s.StyleName=StyleName;
                
    }
    
     public int CreateStockId(String ApparelType){
   int b = 0;
       Random y=new Random();
         b+=y.nextInt(100);
       for (int i = 0; i < 3; i++) {
           b*=ApparelType.charAt(i);
       }
   return b;}
     public void AddApparel(){
     StockId=CreateStockId(Type);
     D.AddApparel(StockId, Type, pricePerItem, Quantity, c.CategoryName, s.StyleName);
     }
     
}
