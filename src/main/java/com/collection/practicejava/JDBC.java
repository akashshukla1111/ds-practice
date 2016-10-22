package com.collection.practicejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class JDBC{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/","root","root");  
  
//here sonoo is database name, root is username and password  
  
Statement stmt=con.createStatement();  

stmt.executeUpdate("create database test2");
stmt.executeUpdate("CREATE TABLE `test2`.`emp` (`ids` INT NOT NULL, `firstname` VARCHAR(45) NULL, `lastname` VARCHAR(45) NULL,PRIMARY KEY (`ids`));");
stmt.executeUpdate("insert into emp values(5,'abhi' , sharma)"); 
ResultSet rs=stmt.executeQuery("select * from test2.emp"); 
 while(rs.next())  
System.out.println(rs.getInt(1)+ "" + rs.getString("firstname"));  
 con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
} 