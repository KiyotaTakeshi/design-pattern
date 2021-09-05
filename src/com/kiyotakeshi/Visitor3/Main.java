package com.kiyotakeshi.Visitor3;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            bindir.add(new File("peco", 100000));
            bindir.add(new File("ulid", 200000));
            rootdir.accept(new ListVisitor());
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
