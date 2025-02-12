package org.example;

import org.example.Persistence.Migration.MigrationStrategy;
import org.example.Ui.MainMenu;

import java.sql.SQLException;

import static org.example.Persistence.Config.ConnectionConfig.getConnection;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}
