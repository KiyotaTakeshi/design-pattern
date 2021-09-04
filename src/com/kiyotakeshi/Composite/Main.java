package com.kiyotakeshi.Composite;

// Client
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");

            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);

            bindir.add(new File("test1", 10000));
            bindir.add(new File("test2", 20000));
            rootdir.printList();

            System.out.println("");
            System.out.println("Making user entries...");
            Directory mike = new Directory("mike");
            Directory popcorn = new Directory("popcorn");
            usrdir.add(mike);
            usrdir.add(popcorn);
            mike.add(new File("mike.html", 1000));
            mike.add(new File("mike.java", 15000));
            File popcornFile1 = new File("popcorn.html", 1000);
            File popcornFile2 = new File("popcorn.java", 30000);
            popcorn.add(popcornFile1);
            popcorn.add(popcornFile2);
            rootdir.printList();

            System.out.println("popcorn.html = " + popcornFile1.getFullName());
            System.out.println("popcorn.java = " + popcornFile2.getFullName());

            // file に追加するとエラーになる(Entry の add が呼ばれる)
            // File file = new File("error.txt",500);
            // file.add(mike);
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
