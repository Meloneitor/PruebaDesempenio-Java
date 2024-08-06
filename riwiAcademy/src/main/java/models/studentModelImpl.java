package models;

import entities.student;
import persistence.configDB.MysqlConfig;
import persistence.imodel.IstudentModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class studentModelImpl implements IstudentModel {

    @Override
    public student create(student request){
        Connection connection = MysqlConfig.openConnection();

        String sqlQuery = "INSERT INTO user(id,name,email,password,status) values(?,?,?,?,?);";

        student user = new student();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setString(1, request.getid_student());
            preparedStatement.setString(2, request.getName());
            preparedStatement.setString(3, request.getEmail());
            preparedStatement.setString(4, request.getPassword());
            preparedStatement.setString(5, request.getPassword());

            int rowAffected = preparedStatement.executeUpdate();

            if (rowAffected == 1) {
                return request;
            }
        } catch (SQLException error){
            throw new RuntimeException(error.getMessage());
        }finally {
            MysqlConfig.closeConnection();
        }

        return user;
    }

    @Override
    public List<student> readAll() {
        return null;
    }

    @Override
    public student readByEmail(String email) {
        return null;
    }
}
