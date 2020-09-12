/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcedimientoAlmacenado1;

import Connetions.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diosl
 */
public class ProcedimientoAlmacenado1 extends Conexion {

    private Connection connection;
    private CallableStatement callableStatement;
    private ResultSet resultSet;

    public void PSelectTodosLosProductos() {

        connection = getConexion();

        try {
            
            String procedure = "{call SelectTodosLosProductos}";
            
            callableStatement = connection.prepareCall(procedure);
            
            resultSet = callableStatement.executeQuery();
           
            while (resultSet.next()) {
                System.out.println
                        (resultSet.getString(1) + ", " 
                        + resultSet.getString(2) + ", " 
                        + resultSet.getString(3) + ", " 
                        + resultSet.getString(4) + ", " 
                        + resultSet.getString(5));
                        //...
            
            }
        } catch (SQLException e) {
           
            e.printStackTrace();
            
        } finally {
            
            if (connection != null) {
                
                try {
                    
                    connection.close();
                    
                } catch (SQLException ex) {
                    
                    ex.printStackTrace();
                    
                }
            }

        }
    }
}
