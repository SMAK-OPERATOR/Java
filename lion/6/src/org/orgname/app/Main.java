package org.orgname.app;


import org.orgname.app.database.entity.UserEntity;
import org.orgname.app.database.manager.UserEntityManager;
import org.orgname.app.util.MysqlDatabase;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        MysqlDatabase database = new MysqlDatabase("127.0.0.1", "db1", "root", "1111");
        UserEntityManager userEntityManager = new UserEntityManager(database);
        try{
            {
                UserEntity user = new UserEntity("Pa4ok", "2281337",12,"Job");
                userEntityManager.add(user);
                //System.out.println(userEntityManager.getAll());

            /*UserEntity user16 = userEntityManager.getById(16);
            user16.setLogin("new Pa4ok");
            user16.setPassword("1234567890");
            userEntityManager.save(user16);*/
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
