package service;

import data.User;

public interface UserService <T extends User> {
    public void create(String firstname, String secondname, String lastname);
    public void update(String oldFirstname, String oldSecondname, String oldLastname,
                       String newFirstname, String newSecondname, String newLastname);
}
