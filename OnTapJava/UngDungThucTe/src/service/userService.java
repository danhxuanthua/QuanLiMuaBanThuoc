/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import Model.user;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author danhx
 */
public class userService extends MySQLService{
    public ArrayList<user> layToanBoUser(){
        ArrayList<user> dsUser = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM `user`";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {                
                user us = new user();
                us.setName(resultSet.getString(1));
                us.setPass(resultSet.getString(2));
                dsUser.add(us);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return dsUser; 
    }
    
    public int themUser(user us){
        
        ArrayList<user> dsUser = new ArrayList<>();
        try {
            String sql = "INSERT INTO `user`(`name`, `password`) VALUES (?,?)";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, us.getName());
            preparedStatement.setString(2, us.getPass());
            
            return preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
    }
    
    public int updateUser(user us){
    
        try {
            String sql = "UPDATE `user` SET `password`=? WHERE `name`=?";
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
            preparedStatement.setString(1, us.getPass());
            preparedStatement.setString(2, us.getName());
            
            return preparedStatement.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return -1;
        
    }

    public userService() {
    }

}
