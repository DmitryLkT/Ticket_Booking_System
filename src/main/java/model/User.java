package model;

public class User {
    private long id;
    private String name;
    private boolean isAdmin;

    public User(long id, String name, boolean isAdmin) {
        this.id = id;
        this.name = name;
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Пользователь{" +
                "id =" + id +
                ", Имя ='" + name + '\'' +
                ", Права администратора =" + isAdmin +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
