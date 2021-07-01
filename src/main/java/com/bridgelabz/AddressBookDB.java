package com.bridgelabz;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBookDB {

    private Connection getConnection() throws SQLException {
        String jdbcURL = "jdbc:mysql://localhost:3306/addressbook?allowPublicKeyRetrieval=true&useSSL=false";
        String userName = "root";
        String password = "mysql";
        Connection connection;
        System.out.println("Connecting to database:" +jdbcURL);
        connection = DriverManager.getConnection(jdbcURL, userName, password);
        System.out.println("connection is successful!!!" +connection);
        return connection;
    }

    public List<Contacts> readData(){
        String sql = " SELECT * FROM addressbook; ";
        List<Contacts> contactsList = new ArrayList();
        try (Connection connection = this.getConnection();){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            contactsList = this.getAddressBookData(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contactsList;
    }

    private java.util.List<Contacts> getAddressBookData(ResultSet resultSet) {
        java.util.List<Contacts> employeePayrollDataList = new ArrayList<>();
        try{
            while(resultSet.next()){
                String firstName = resultSet.getString("firstName");
                String lastname = resultSet.getString("lastName");
                String address = resultSet.getString("address");
                String city = resultSet.getString("city");
                String state = resultSet.getString("state");
                String zip = resultSet.getString("zipCode");
                String phoneNumber = resultSet.getString("phone_Number");
                String email = resultSet.getString("email");
                employeePayrollDataList.add(new Contacts(firstName,lastname, address, city, state, zip, phoneNumber,
                        email));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return employeePayrollDataList;
    }
}
