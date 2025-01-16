package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author: Author
 * @CreateTime: 2025-01-14
 * @Description:
 */
public class FindBookOperation implements IOperation{
    @Override
    public void perform(BookList bookList) {
        System.out.println("查找图书......");
        System.out.println("请输入你要查找的书名：");
        Scanner scanner= new Scanner(System.in);
        String bookName=scanner.nextLine();

        int currentSize =bookList.getUsedSize();
        for (int i=0;i<currentSize;i++){
            Book book =bookList.getBook(i);
            if (book.getName().equals(bookName)){
                System.out.println("找到了这本书：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("没有你要找的书...");
    }
}
