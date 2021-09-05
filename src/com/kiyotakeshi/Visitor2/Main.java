package com.kiyotakeshi.Visitor2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            bindir.add(new File("peco.sh", 100000));
            bindir.add(new File("ulid.exe", 200000));
            bindir.add(new File("ls.c", 5000));
            bindir.add(new File("test.sh", 1000));

            rootdir.accept(new ListVisitor());

            FileFindVisitor ffv = new FileFindVisitor(".sh");
            rootdir.accept(ffv);
            System.out.println("\n.sh files are:");
            Iterator<File> it = ffv.getFoundFiles();
            while (it.hasNext()) {
                File file = it.next();
                System.out.println(file.toString());
            }

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
