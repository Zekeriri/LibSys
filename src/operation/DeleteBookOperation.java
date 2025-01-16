package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author: Author
 * @CreateTime: 2025-01-14
 * @Description:
 */
public class DeleteBookOperation implements IOperation{
    @Override
    public void perform(BookList bookList) {
        System.out.println("删除图书.....");

        System.out.println("请输入你要删除的图书的书名：");
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
        int pos = -1;
        int i = 0;
        for (; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(bookName)) {
                //找到这本书了 记录下标
                pos = i;
                break;
            }
        }
        //
        if(i >= currentSize) {
            System.out.println("没有你要找的书！");
            return;
        }
        //开始删除了
        for (int j = pos; j < currentSize-1; j++) {
            //bookList[j] = bookList[j+1];
            Book book = bookList.getBook(j+1);
            bookList.setBook(j,book);
        }
        //修改usedSize
        bookList.setUsedSize(currentSize-1);

        bookList.setBook(currentSize-1,null);

        System.out.println("删除成功！");
    }
}
