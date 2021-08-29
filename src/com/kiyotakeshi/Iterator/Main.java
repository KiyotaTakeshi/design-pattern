package com.kiyotakeshi.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("how to programing"));
        bookShelf.appendBook(new Book("how to cooking"));
        bookShelf.appendBook(new Book("how to traveling"));
        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
