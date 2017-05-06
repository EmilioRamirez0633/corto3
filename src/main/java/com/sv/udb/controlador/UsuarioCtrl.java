/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;


import com.sv.udb.modelo.Usuarios;
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
public class UsuarioCtrl {

    public List<Usuarios> ver()
    {
    List<Usuarios> resp= new ArrayList();
    Connection cn =new Conexion().getConn();
        try 
        {
           PreparedStatement cmd = cn.prepareStatement("Select * from usuarios");
              ResultSet rs = cmd.executeQuery();
              while (rs.next())
              {
              resp.add(new Usuarios (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
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
    public Usuarios ver2(int Codi)
    {
   Usuarios resp= null;
    Connection cn =new Conexion().getConn();
        try 
        {
           PreparedStatement cmd = cn.prepareStatement("Select * from libros where codi_libr=?");
           cmd.setInt(1,Codi);
              ResultSet rs = cmd.executeQuery();
              while (rs.next())
              {
                  System.out.println(Codi+"consola");
              resp=(new Usuarios (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
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
 
}
