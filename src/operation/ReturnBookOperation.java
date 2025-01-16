package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author: Author
 * @CreateTime: 2025-01-14
 * @Description:
 */
public class ReturnBookOperation implements IOperation{
    @Override
    public void perform(BookList bookList) {
        System.out.println("归还图书....");

        System.out.println("请输入你要归还的图书的书名：");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();


        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(bookName)) {
                book.setLend(false);
                System.out.println("归还成功！");
                return;
            }
        }
        System.out.println("归还失败！");
    }
}
