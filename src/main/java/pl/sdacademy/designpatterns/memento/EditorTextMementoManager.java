package pl.sdacademy.designpatterns.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorTextMementoManager {
    private Deque<EditorTextMemento> mementos = new ArrayDeque<>();

    public void save (final EditorTextMemento mementoo){

    mementos.push(mementoo);
}
public EditorTextMemento restore() {
    return mementos.pop();
}
}
