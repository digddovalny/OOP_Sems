package Sem7.Notes;

import Sem7.Notes.controllers.AdapterController;
import Sem7.Notes.controllers.IController;
import Sem7.Notes.controllers.NoteController;
import Sem7.Notes.loggers.ILogger;
import Sem7.Notes.loggers.Logger;
import Sem7.Notes.model.*;
import Sem7.Notes.views.*;

public class Main {
    public static void main(String[] args) {
        ILogger logger = new Logger("log.txt");
        IFileOperation fileOperation = new FileOperation("notes.txt");
        IRepository repository = new Repository(new NotesMapperJSON(), fileOperation);
        IController controller = new AdapterController(repository);
        IViewOperations viewOperations = new ViewOperations(controller);
        IViewOperations viewOperationsWithLog = new ViewOperationWithLog(viewOperations, logger);
        IViewNote view = new ViewNote(viewOperationsWithLog);
        view.run();
    }
}
