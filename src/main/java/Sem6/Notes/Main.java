package Sem6.Notes;

import Sem6.Notes.controllers.NoteController;
import Sem6.Notes.model.*;
import Sem6.Notes.views.ViewNote;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationJSON("notes.txt");
        Repository repository = new RepositoryJSON(new NotesMapperJSON(), fileOperation);
        NoteController controller = new NoteController(repository);
        ViewNote view = new ViewNote(controller);
        view.run();
    }
}
