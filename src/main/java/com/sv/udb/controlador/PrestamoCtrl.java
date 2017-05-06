/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;


import com.sv.udb.modelo.Prestamos;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Luis
 */
public class PrestamoCtrl {
    public boolean guar(Prestamos obj)
    {
    boolean resp = false;
    Connection con = new Conexion().getConn();
        try 
        {
            PreparedStatement cmd = con.prepareStatement("Insert into prestamos values(null,?,?,now(),null)");
            cmd.setString(1,String.valueOf(obj.getCodiLibr()));
            cmd.setString(2,String.valueOf(obj.getCodiUsua()));           
            cmd.executeUpdate();
            resp = true;
            
        }
        catch (Exception e) 
        {
            System.out.println("Error: "+e.getMessage());
        }
        finally
        {
        try
        {
        if(con != null)
        {
        if(!con.isClosed())
        {
        con.close();
        }
        }
        }
        catch(SQLException err)
            {
                err.printStackTrace();
            }
        }
    return resp;
    }
    public List<Prestamos> ver()
    {
    List<Prestamos> resp= new ArrayList();
    Connection cn =new Conexion().getConn();
        try 
        {
           PreparedStatement cmd = cn.prepareStatement("select prestamos.codi_pres, prestamos.codi_libr,libros.nomb_libr,prestamos.codi_usua, usuarios.nomb_usua, fech_pres, fech_devo from libros, prestamos, usuarios where libros.codi_libr = prestamos.codi_libr and usuarios.codi_usua = prestamos.codi_usua");
              ResultSet rs = cmd.executeQuery();
              while (rs.next())
              {
              resp.add(new Prestamos (rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getDate(6),rs.getDate(7)));
              }
        }
        catch (Exception e)
        {
        e.printStackTrace();
        }
        finally
        {
        try
        {
        if(cn != null)
        {
        if(!cn.isClosed())
        {
        cn.close();
        }
        }
        }
        catch(SQLException err)
            {
                err.printStackTrace();
            }
        }
    return resp;
    }
    public Prestamos ver2(int Codi)
    {
   Prestamos resp= null;
    Connection cn =new Conexion().getConn();
        try 
        {
           PreparedStatement cmd = cn.prepareStatement("select prestamos.codi_pres, prestamos.codi_libr,libros.nomb_libr,prestamos.codi_usua, usuarios.nomb_usua, fech_pres, fech_devo from libros, prestamos, usuarios where libros.codi_libr = prestamos.codi_libr and usuarios.codi_usua = prestamos.codi_usua and prestamos.codi_pres=?");
           cmd.setInt(1,Codi);
              ResultSet rs = cmd.executeQuery();
              while (rs.next())
              {
                  System.out.println(Codi+"consola");
              resp=(new Prestamos (rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getDate(6),rs.getDate(7)));
              }
        }
        catch (Exception e)
        {
            System.out.println("Error:"+e.getMessage());
        }
        finally
        {
        try
        {
        if(cn != null)
        {
        if(!cn.isClosed())
        {
        cn.close();
        }
        }
        }
        catch(SQLException err)
            {
                err.printStackTrace();
            }
        }
    return resp;
    }
 
 public boolean actu(Prestamos obj)
 {
 boolean resp = false;
 Connection con = new Conexion().getConn();
     try 
     {
     PreparedStatement cmd = con.prepareStatement("update equipos set fech_devo =? where codi_pres=?");
     cmd.setString(1,String.valueOf(obj.getFechaDevo()));
     cmd.setString(2,String.valueOf(obj.getCodi()));
     cmd.executeUpdate();
     resp=true;
     }
     catch (Exception e)
     {
         System.out.println("Error: "+e.getMessage());
     }
     finally 
     {
    try 
    {
    if(con != null)
     {
     if(!con.isClosed())
     {
     con.close();
     }
     }
     } 
    catch (Exception e) 
    {
        System.out.println("Error: "+e.getMessage());
    }
    
     }
 return resp;
 }
}
