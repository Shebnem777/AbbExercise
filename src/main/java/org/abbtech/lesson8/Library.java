package org.abbtech.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> booklist;
public Library(){
   // Book book = new ArrayList<>();
}
public void bookAdd(Book book){
    booklist.add(book);
}
public void bookPublish(){
    booklist.removeIf(book -> booklist.stream().equals(book.getTitle()));
}

    }
