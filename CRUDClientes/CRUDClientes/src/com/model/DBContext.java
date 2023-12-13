/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author fhuertas
 */
public class DBContext extends Validator{
    private static Connection con;
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String user="root";
    private static final String pass="root";
    private static final String url="jdbc:mysql://localhost:3306/ClientMarket";
    
    public void conector() throws SQLException, ClassNotFoundException {
        con = null;
        Class.forName(driver);
        con= DriverManager.getConnection(url,user,pass);
    }
    
    public ArrayList<ClientDTO> getClients(int documentFilter, String roleFilter) throws SQLException, ClassNotFoundException{
        ArrayList<ClientDTO> clients;
        clients = new ArrayList<>();
        
        conector();
        // Crear una declaración SQL
        String sql = "SELECT id,document,name,lastname,purchasevalue,role FROM clientmarket.clients WHERE (document = ? OR ? = 0) AND (role = ? OR ? = '')";
        //Para evitar inyección sql se utiliza para preparar el script
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        
        if(roleFilter == null){
            roleFilter = "";
        }
        
        preparedStatement.setString(1, Integer.toString(documentFilter));
        preparedStatement.setString(2, Integer.toString(documentFilter));
        preparedStatement.setString(3, roleFilter);
        preparedStatement.setString(4, roleFilter);
        // Ejecutar la consulta
        ResultSet resultSet = preparedStatement.executeQuery();
        
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int document = resultSet.getInt("document");
            String name = resultSet.getString("name");
            String lastname = resultSet.getString("lastname");
            float purchasevalue = resultSet.getFloat("purchasevalue");
            String role = resultSet.getString("role");
            clients.add(new ClientDTO(id, name, document, lastname, purchasevalue, role));
        }
        // Cerrar recursos
        resultSet.close();
        preparedStatement.close();
        con.close();
        return clients;
    }
    
    public ClientDTO getClients(int id) throws SQLException, ClassNotFoundException{
        ClientDTO client = new ClientDTO();
        
        conector();
        // Crear una declaración SQL
        String sql = "SELECT id,document,name,lastname,purchasevalue,role FROM clientmarket.clients WHERE id = ?";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        
        preparedStatement.setString(1, Integer.toString(id));
        // Ejecutar la consulta
        ResultSet resultSet = preparedStatement.executeQuery();
        
        while (resultSet.next()) {
            int idEntity = resultSet.getInt("id");
            int document = resultSet.getInt("document");
            String name = resultSet.getString("name");
            String lastname = resultSet.getString("lastname");
            float purchasevalue = resultSet.getFloat("purchasevalue");
            String role = resultSet.getString("role");
            client = new ClientDTO(idEntity, name, document, lastname, purchasevalue, role);
        }
        // Cerrar recursos
        resultSet.close();
        preparedStatement.close();
        con.close();
        return client;
    }
    
    public String createClient(ClientDTO client) throws SQLException, ClassNotFoundException{
        conector();
        String sql = "INSERT INTO Clients (document,name,lastname,purchasevalue,role) VALUES (?,?,?,?,?)";
        
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1, client.getDocument());
        preparedStatement.setString(2, client.getName());
        preparedStatement.setString(3, client.getLastname());
        preparedStatement.setFloat(4, client.getPurchasevalue());
        preparedStatement.setString(5, client.getRole());
        preparedStatement.executeUpdate();

        return "Cliente creado exitosamente";
    } 
    
    public String updateClient(ClientDTO client) throws SQLException, ClassNotFoundException{
        conector();
        String sql = "UPDATE Clients SET document = ?, name = ?, lastname = ?, purchasevalue = ?, role = ? WHERE id = ?";
        
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1, client.getDocument());
        preparedStatement.setString(2, client.getName());
        preparedStatement.setString(3, client.getLastname());
        preparedStatement.setFloat(4, client.getPurchasevalue());
        preparedStatement.setString(5, client.getRole());
        preparedStatement.setInt(6, client.getId());
        preparedStatement.executeUpdate();

        return "Cliente actualizado exitosamente";
    }
    
    public String deleteClient(int id) throws SQLException, ClassNotFoundException{
        conector();
        String sql = "DELETE FROM Clients WHERE id = ?";
        
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();

        return "Cliente elminado exitosamente";
    }
}
