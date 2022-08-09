package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl table = new UserServiceImpl();
        User user1 = new User("Иван", "Иванов", (byte) 21);
        User user2 = new User("Петр", "Сидоров", (byte) 20);
        User user3 = new User("Алина", "Сергеева", (byte) 25);
        User user4 = new User("Ирина", "Антонова", (byte) 23);
        table.dropUsersTable();
        table.createUsersTable();
        table.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        table.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        table.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        table.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        for (int i = 0; i < table.getAllUsers().size(); i++) {
            System.out.println(table.getAllUsers().get(i).toString());
        }
        table.cleanUsersTable();
        table.dropUsersTable();
    }
}
