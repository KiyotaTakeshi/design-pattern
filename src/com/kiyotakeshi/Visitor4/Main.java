package com.kiyotakeshi.Visitor4;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries");
            Directory rootdir = new Directory("root");
            rootdir.add(new File("peco", 100000));
            rootdir.add(new File("ulid", 200000));

            Directory rootdir2 = new Directory("root2");
            rootdir2.add(new File("ls", 1000));
            rootdir2.add(new File("cat", 2000));

            ElementArrayList list = new ElementArrayList();
            list.add(rootdir);
            list.add(rootdir2);
            list.add(new File("rm", 3000));
            list.accept(new ListVisitor());

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
