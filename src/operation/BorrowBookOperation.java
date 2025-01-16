package operation;

import book.Book;
import book.BookList;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

/**
 * @Author: Author
 * @CreateTime: 2025-01-14
 * @Description:
 */
public class BorrowBookOperation implements IOperation{
    @Override
    public void perform(BookList bookList) {
        System.out.println("借阅图书......");
        Scanner scanner = new Scanner(System.in);
        String bookname = scanner.nextLine();

        int currentSize=bookList.getUsedSize();
        for (int i=0; i<currentSize;i++){
            Book book =bookList.getBook(i);
            if(book.getName().equals(bookname)){
                book.setLend(true);
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("借阅失败！");
    }
}
