package pl.sdacademy.designpatterns.memento;

public class MementoDemo {
    public static void main(String[] args) {
        final EditorText editorText = new EditorText();
        final EditorTextMementoManager mementoManager = new EditorTextMementoManager();
        mementoManager.save(new EditorTextMemento(editorText));

        editorText.addText("first line");
        mementoManager.save(new EditorTextMemento(editorText));

        editorText.addText("\n second line");
        mementoManager.save(new EditorTextMemento(editorText));

        editorText.addText("\n third line");
        mementoManager.save(new EditorTextMemento(editorText));

        System.out.println(editorText.getValue());
        System.out.println();

        mementoManager.restore();
        mementoManager.restore();
        editorText.restoreFromMemento(mementoManager.restore());
        System.out.println(editorText.getValue());

    }
}
