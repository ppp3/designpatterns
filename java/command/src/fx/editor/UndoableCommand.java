package fx.editor;

interface UndoableCommand extends Command{
    void unexecute();
}
