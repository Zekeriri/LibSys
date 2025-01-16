package user;

import book.BookList;
import operation.IOperation;

import java.security.PublicKey;

/**
 * @Author: Author
 * @CreateTime: 2025-01-14
 * @Description:
 */
public abstract class User {
    protected String name;
    protected IOperation[] iOperations;
    public User(String name) {
        this.name = name;
    }
    public abstract int menu();
    public void doIOperations(int choice, BookList bookList){
        this.iOperations[choice].perform(bookList);
    }

}
