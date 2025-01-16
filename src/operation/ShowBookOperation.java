package operation;

import book.Book;
import book.BookList;

/**
 * @Author: Author
 * @CreateTime: 2025-01-14
 * @Description:
 */
public class ShowBookOperation implements IOperation{
    @Override
    public void perform(BookList bookList) {
        System.out.println("显示图书......");

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            //Book book = bookList[i];
            Book book = bookList.getBook(i);
            System.out.println(book);
        }
    }
}
