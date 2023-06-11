package Seminar4_OOP;


import Seminar4_OOP.controller.UserController;
import Seminar4_OOP.model.FileOperation;
import Seminar4_OOP.model.FileOperationImpl;
import Seminar4_OOP.model.Repository;
import Seminar4_OOP.model.RepositoryFile;
import Seminar4_OOP.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}