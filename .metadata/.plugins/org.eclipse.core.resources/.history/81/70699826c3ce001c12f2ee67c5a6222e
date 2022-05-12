package kanha;

//public class Aucktion_data {
//
////	public static void main(String[] args) {
////		// TODO Auto-generated method stub
////
////	}
//
//}

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
/**
* Servlet implementation class Auction_data
*/
 
 
 
import java.io.IOException;
 
import java.io.PrintWriter;
 
import java.sql.Connection;
 
import java.sql.DriverManager;
 
import java.sql.PreparedStatement;
 
import java.sql.ResultSet;
 
import java.sql.Statement;
 
 
 
 
public class Auction_data extends HttpServlet {
 
               private static final long serialVersionUID = 1L;
 
      
 
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
 
   {
   						String driverName = "com.mysql.cj.jdbc.Driver";
 
                               response.setContentType("text/html"); 
 
                               PrintWriter out = response.getWriter(); 
 
                                                        
 
                                               String n=request.getParameter("userName"); 
 
                                               String p=request.getParameter("productName"); 
 
                                               int e=Integer.parseInt(request.getParameter("bidValue")); 
 
                               
 
                                                        
 
                                               try{ 
 
                                               Class.forName(driverName); 
 
                                               Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","sys123"); 
 
                                               Statement stmt=con.createStatement(); 
 
                                               PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?)"); 
 
                                                
 
                                               ps.setString(1,n); 
 
                                               ps.setString(2,p); 
 
                                               ps.setInt(3,e); 
 
                                               
 
                                                                        
 
                                               int i=ps.executeUpdate(); 
 
                                               if(i>0) 
 
                                               out.print("You are successfully registered..."); 
 
                                                    
 
                                               ResultSet rs=stmt.executeQuery("select * from user where name='"+n+"'"); 
 
                                               
 
                                               while(rs.next()) 
 
                                               out.println("<br>Your data is:"+rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));  
 
                                               con.close();
 
                                               }catch (Exception e2)
 
                                               {System.out.println(e2);} 
 
                                                        
 
                                               out.close(); 
 
                                               } 
 
              }


