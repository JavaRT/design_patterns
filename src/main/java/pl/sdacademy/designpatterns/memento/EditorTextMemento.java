package pl.sdacademy.designpatterns.memento;

public class EditorTextMemento {
    private String value ;


    public EditorTextMemento(final EditorText editorText){
        value = editorText.getValue();

    }
    public String getValue() {
        return value;
    }
}
