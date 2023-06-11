package Seminar5_OOP;


import Seminar5_OOP.controller.UserController;
import Seminar5_OOP.model.FileOperation;
import Seminar5_OOP.model.FileOperationImpl;
import Seminar5_OOP.model.Repository;
import Seminar5_OOP.model.RepositoryFile;
import Seminar5_OOP.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}