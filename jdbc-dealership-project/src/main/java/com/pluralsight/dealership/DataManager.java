package com.pluralsight.dealership;

import javax.sql.DataSource;
import java.sql.*;



public class DataManager {
    public static void DataManager(DataSource dataSource) {
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO "
            );
        }
    }

}