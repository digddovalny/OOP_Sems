package Sem5.personal;

import Sem5.personal.controllers.UserController;
import Sem5.personal.model.*;
import Sem5.personal.utils.Validate;
import Sem5.personal.views.ViewUser;

public class Main {

    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationJSON("users.txt");
        Repository repository = new RepositoryFileJSON(fileOperation, new UserMapperJSON());
        Validate validate = new Validate();
        UserController controller = new UserController(repository,validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}