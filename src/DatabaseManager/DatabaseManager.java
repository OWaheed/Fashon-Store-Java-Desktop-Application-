/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseManager;
import ControlClasses.Apparel;
import ControlClasses.Employee;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.UIManager.getInt;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;

/**
 *
 * @author omar waheed
 */
public class DatabaseManager 
{
               Connection c =null;
               String URL="jdbc:sqlserver://localhost:1433;databaseName=FashonStore;user=sa;password=Flyhigh1";
               PreparedStatement ps=null;
               Statement st=null;
               ResultSet rs=null;
               String UserName;
               String Query;
                int Password;
                
    public DatabaseManager() {
    }
             
    public void AddEmp(String UserName, int Password,String EmpName, String EmpGender, String EmpAddress, String EmpDOB, String Qualifiactions, int EmpPhoneNum, float EmpSalary, String EmpDOJ) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c =DriverManager.getConnection(URL);
            Query="insert into Employees (UserName,Password,Name,Gender,Address,DateOfBirth,Qualification,PhoneNumber,Salary,DateofJoining) values (?,?,?,?,?,?,?,?,?,?)";
            ps= c.prepareStatement(Query);
            ps.setString(1,UserName);
            ps.setInt(2, Password);
            ps.setString(3,EmpName );
            ps.setString(4,EmpGender);
            ps.setString(5,EmpAddress);
            ps.setString(6,EmpDOB);
            ps.setString(7,Qualifiactions);
            ps.setInt(8,EmpPhoneNum);
            ps.setFloat(9,EmpSalary);
            ps.setString(10,EmpDOJ);         
            ps.executeUpdate();
            System.out.println("Data Entered Successfully");
            
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("error while Entering data"+ex);
                                                            }
   
    }
     public void AddApparel(int StockId,String Type,float PricePerItem,int Quantity,String Category,String Style) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c =DriverManager.getConnection(URL);
            Query="insert into Apparel (StockId,Type,PricePerItem,Quantity,Category,Style) values (?,?,?,?,?,?) ";
            ps= c.prepareStatement(Query);      
            ps.setInt(1, StockId);
            ps.setString(2, Type);
            ps.setFloat(3, PricePerItem);
            ps.setInt(4,Quantity);
            ps.setString(5, Category);
            ps.setString(6,Style);
            ps.executeUpdate();
            System.out.println(" Apparel Data Entered Successfully");
            
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("error while Entering Apparel data"+ex);
                                                            }
   
    }
       public void AddCategory(String Category) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c =DriverManager.getConnection(URL);
            Query="insert into Apparel (Category) values ('"+Category+"')"  ;
            ps= c.prepareStatement(Query);      
            ps.executeUpdate();
            System.out.println(" Category  Data Entered Successfully");
            
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("error while Entering Category data"+ex);
                                                            }
   
    }
       public void AddStyle(String Style) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c =DriverManager.getConnection(URL);
            Query="insert into Apparel (Style) values ('"+Style+"')"  ;
            ps= c.prepareStatement(Query);      
            ps.executeUpdate();
            System.out.println(" Style Data Entered Successfully");
            
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("error while Entering Style data"+ex);
                                                            }
   
    }
   
       
       public void AddBill(String CustomerName, String Email, int PhoneNumber, String Date, String StockIds, float Total, String billId) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c =DriverManager.getConnection(URL);
             Query="insert into Bill (Date,CustomerName,Email,PhoneNumber,StockIds,Total,BillId) values (?,?,?,?,?,?,?) ";
            ps= c.prepareStatement(Query);      
            ps.setString(1, Date);
            ps.setString(2,CustomerName);
            ps.setString(3, Email);
            ps.setInt(4,PhoneNumber);
            ps.setString(5,StockIds);
            ps.setFloat(6,Total);
            ps.setString(7, billId);
            ps.executeUpdate();
            System.out.println(" bill Data Entered Successfully");
            
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("error while  Entering bill  data"+ex);
                                                            }
       }
        public void AddDayIncome(String Day,float Total) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c =DriverManager.getConnection(URL);
             Query="insert into DayIncome (Day,TotalCost) values (?,?) ";
            ps= c.prepareStatement(Query);      
            ps.setString(1,Day);
            ps.setFloat(2,Total);
            ps.executeUpdate();
            System.out.println(" Day Income Data Entered Successfully");
            
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("error while Day Income data"+ex);
                                                            }
   
    }
    public void DeleteData(String TableName,String ColumnName,String Data){
      try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c =DriverManager.getConnection(URL);
            Query="Delete from "+TableName+" where "+ColumnName+" = '"+Data+"'";
            ps= c.prepareStatement(Query);          
            ps.executeUpdate();
            System.out.println("Data Deleted Successfully");
          } 
      catch (ClassNotFoundException | SQLException ex) 
          {
            System.out.println("error while deleting "+ex);
          }
      finally 
          {
            if (c!= null) 
            try { c.close(); }
            catch(SQLException e) {System.out.println("Eror"+e);}
          }
    
    
    }
    public boolean SearchLogInData(String User,int Password,String TableName)
    {  int Pass;
        try {
                c =DriverManager.getConnection(URL);
                st=c.createStatement();
                rs=st.executeQuery("select * from "+TableName);
                while(rs.next())
                {               
                    UserName=rs.getString("UserName");
                    Pass =rs.getInt("Password");
                    if( UserName.equals(User)&&Pass==Password)
                        {
                          return true;  
                        }
                }            
            } 
        catch (SQLException ex)
            {
            System.out.println(ex);
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
      return false;
    }
     public boolean SearchCategoryData(String category)
    {  
        try {
                c =DriverManager.getConnection(URL);
                st=c.createStatement();
                rs=st.executeQuery("select Category  from Apparel  ");
                while(rs.next())
                {               
                    UserName=rs.getString("Category");
                    
                    if(UserName!=null&& UserName.equals(category))
                        {
                          return true;  
                        }
                }            
            } 
        catch (SQLException ex)
            {
            System.out.println(ex);
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
      return false;
    }
        public boolean SearchStyleData(String Style)
    {  
        try {
                c =DriverManager.getConnection(URL);
                st=c.createStatement();
                rs=st.executeQuery(" select  Style  from Apparel  ");
                while(rs.next())
                {               
                    UserName=rs.getString("Style");
                    
                    if( UserName!=null&&UserName.equals(Style))
                        {
                          return true;  
                        }
                }            
            } 
        catch (SQLException ex)
            {
            System.out.println(ex);
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
      return false;
    }
        
        public boolean SearchApparelData(int Id)
    {  
        try {
                c =DriverManager.getConnection(URL);
                st=c.createStatement();
                rs=st.executeQuery(" select  StockId  from Apparel  ");
                while(rs.next())
                {               
                    Password=rs.getInt("StockId");
                    
                    if( Password==Id)
                        {
                          return true;  
                        }
                }            
            } 
        catch (SQLException ex)
            {
            System.out.println(ex);
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
      return false;
    }
         public Object[] getApparelData(int Id,int Quantity)
    {  
        try {
                c =DriverManager.getConnection(URL);
                st=c.createStatement();
                rs=st.executeQuery(" select *  from Apparel where StockId="+Id);
                rs.next();
                Object x []={rs.getString("Type")+" "+rs.getString("Category"),rs.getInt("PricePerItem"),Quantity,Id};
                 return x ;
            } 
        catch (SQLException ex)
            {
            System.out.println(ex);
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
                   return null;
        
        
     
    }
          public float getApparelPrice(int Id)
    {  float x;
        try {
                c =DriverManager.getConnection(URL);
                st=c.createStatement();
                rs=st.executeQuery(" select PricePerItem  from Apparel where StockId="+Id);
                rs.next();
                x=rs.getInt("PricePerItem");
                
            } 
        catch (SQLException ex)
            {
            System.out.println("Apparel price Function Eror"+ex);
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
            }
                   return x ;    
    }
         
    public void UpdateStringData(String TableName,String ColumnName,String OldData,String NewData,String Row)
    {
    
    try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c =DriverManager.getConnection(URL);
           Query="update "+TableName+"  set "+ColumnName+" ='"+NewData+"' where "+Row+"='"+OldData+"'";
            ps= c.prepareStatement(Query);          
            ps.executeUpdate();
            System.out.println("Emp: "+OldData+" UpDated Successfully To "+NewData);
          } 
      catch (ClassNotFoundException | SQLException ex) 
          {
            System.out.println("error"+ex);
          }
      finally 
          {
            if (c!= null) 
            try { c.close(); }
            catch(SQLException e) {System.out.println("Eror"+e);}
          }
    
    
    
    }
    public void UpdateintData(String TableName,String ColumnName,String OldData,int NewData ,String flag )
    {
    
    try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c =DriverManager.getConnection(URL);
            Query="update "+TableName+"  set "+ColumnName+" ='"+NewData+"' where "+flag+"='"+OldData+"'";
            ps= c.prepareStatement(Query);          
            ps.executeUpdate();
            System.out.println("Emp: "+OldData+" UpDated Successfully To "+NewData);
          } 
      catch (ClassNotFoundException | SQLException ex) 
          {
            System.out.println("error"+ex);
          }
      finally 
          {
            if (c!= null) 
            try { c.close(); }
            catch(SQLException e) {System.out.println("Eror"+e);}
          }
    
    
    
    }
    public void UpdateFloatData(String TableName,String ColumnName,String OldData,float  NewData,String flag )
    {
    
    try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            c =DriverManager.getConnection(URL);
           Query="update "+TableName+"  set "+ColumnName+" ='"+NewData+"' where "+flag+"='"+OldData+"'";
            ps= c.prepareStatement(Query);          
            ps.executeUpdate();
            System.out.println("Emp: "+OldData+" UpDated Successfully To "+NewData);
          } 
      catch (ClassNotFoundException | SQLException ex) 
          {
            System.out.println("error"+ex);
          }
      finally 
          {
            if (c!= null) 
            try { c.close(); }
            catch(SQLException e) {System.out.println("Eror"+e);}
          }
    
    
    
    }
    public ArrayList<Employee> EmpShowData()
    {      ArrayList<Employee> ListAll=new ArrayList<>();
        try {
                c =DriverManager.getConnection(URL);
                st=c.createStatement();
                rs=st.executeQuery("select * from Employees ");
                while(rs.next())
                { Employee x=new Employee(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getFloat(9),rs.getString(10));
                   ListAll.add(x);
                }            
            } 
        catch (SQLException ex)
            {
            System.out.println(ex);
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
    
        return ListAll;
    }
     public ArrayList<Apparel> ApparelShowData()
    {      ArrayList<Apparel> ListAll=new ArrayList<>();
        try {
                c =DriverManager.getConnection(URL);
                st=c.createStatement();
                rs=st.executeQuery(" select *  from Apparel ");
                while(rs.next())
                { if( rs.getInt(1) != 0){
                    
                    Apparel x=new Apparel(rs.getString(2),rs.getInt(1),rs.getFloat(3),rs.getInt(4),rs.getString(5),rs.getString(6));
                   ListAll.add(x);  }
                                }            
                 } 
        catch (SQLException ex)
            {
            System.out.println(ex);
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
    
        return ListAll;
    }
    public  Employee  UpDateEmpData(String UserName)
    {      Employee x=new Employee();
        try {
                c =DriverManager.getConnection(URL);
                st=c.createStatement();
                rs=st.executeQuery("select *  from Employees where  UserName= '"+UserName+ "'");
                rs.next();
                x =new Employee(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getFloat(9),rs.getString(10));
                         
            } 
        catch (SQLException ex)
            {
            System.out.println("no Data Back"+ex);
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
    
             return x ;
    }
     public  Apparel  UpDateApparelData(int StockId)
    {     Apparel A=new Apparel();
        try {
                c =DriverManager.getConnection(URL);
                st=c.createStatement();
                rs=st.executeQuery("select *  from Apparel where  StockId= "+StockId);
                rs.next();
            A=new Apparel (rs.getString(2),rs.getInt(1),rs.getFloat(3),rs.getInt(4),rs.getString(5),rs.getString(6));
                         
            } 
        catch (SQLException ex)
            {
            System.out.println("no Data Back"+ex);
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
    
             return A ;
    }

    public String PrepareText(String CustomerName,String BillId,float  Total ,String []Apparels,String Date){
        System.out.println(Total);System.out.println(Arrays.toString(Apparels));
     String text="";
              text+="Date : "+Date+"           Customer : "+CustomerName+"           Bill Id : "+BillId+"\n";
              text+="             Apparel Name       Unit Price       Quantity      Stock Id\n";
     for (String Apparel : Apparels) {
             text+="             "+Apparel+"\n";
             System.out.println(text);
         }
        text+="Total = "+Total+" pounds";
     
     return  text;
     }
     
     
    public  void CreatePdf(String Text,String CustomerName)
    {   Document document =new Document();
                   try {
                       PdfWriter p=PdfWriter.getInstance(document,new FileOutputStream("C:\\Users\\omar waheed\\Desktop\\project\\FashonStore\\Bills\\"+CustomerName+".pdf"));
                        document.open();
                        document.add(new Paragraph(Text));
                        document.close();
                        p.close();            
                        System.out.println("Pdf Created Successfully");
                         } catch (FileNotFoundException | DocumentException ex) {
                       Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
                       System.out.println("Eror in Pdf Writer");
                   }
       
    
    }
}
        
    //import javax.swing.text.Document;
            
            
            
            
