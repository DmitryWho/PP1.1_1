package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Заур", "Трегулов", (byte) 33);
        userService.saveUser("Наиль", "Алишев", (byte) 35);
        userService.saveUser("Дмитрий", "Поддубиков", (byte) 23);
        userService.saveUser("Денис", "Матвеенко", (byte) 28);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
