public class AuthLogic {
    private User[] users = new User[100];
    private int id = -1;

    public boolean registration(String login, String password) {
        if (findUserByLogin(login) != null) return false;
        id++;
        User user = new User(id, login, password);
        users[id] = user;
        return true;
    }

    public boolean login(String login, String password) {
        User user = findUserByLogin(login);
        if (user != null) {
            return (user.getPassword().equals(password));
        }
        return false;
    }

    private User findUserByLogin(String login) {
        for (User user : users) {
            if (user == null) {
                break;
            }
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }
}
