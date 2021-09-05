package com.kiyotakeshi.Visitor2;

import java.util.ArrayList;
import java.util.Iterator;

public class FileFindVisitor implements Visitor {

    private final String fileType;
    private ArrayList<File> found = new ArrayList<>();

    public FileFindVisitor(String fileType) {
        this.fileType = fileType;
    }

    public Iterator<File> getFoundFiles() {
        return found.iterator();
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(fileType)) {
            found.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            // this は FileFindVisitor
            entry.accept(this);
        }
    }
}
