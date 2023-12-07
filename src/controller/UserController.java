package controller;

import data.User;

public interface UserController <T extends User> {
    public void create(String firstname, String secondname, String lastname);
    public void sendOnConsole();
    public void update(String oldFirstname, String oldSecondname, String oldLastname,
                       String newFirstname, String newSecondname, String newLastname);
}
