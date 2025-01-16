package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @Author: Author
 * @CreateTime: 2025-01-14
 * @Description:
 */
public class AddBookOperation implements IOperation{
    @Override
    public void perform(BookList bookList){
        System.out.println("新增图书...");

        if(bookList.isFull()){
            System.out.println("书架满了，不能新增了");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你要新增的图书的书名：");
        String bookName=scanner.nextLine();

        System.out.println("请输入你要新增的图书的作者：");
        String author=scanner.nextLine();

        System.out.println("请输入你要新增的图书的价格：");
        int price=scanner.nextInt();

        System.out.println("请输入你要新增的图书的类型：");
        String type=scanner.nextLine();

        Book book = new Book(bookName,author,price,type);

        int currentSize=bookList.getUsedSize();
        bookList.setBook(currentSize,book);

        bookList.setUsedSize(currentSize+1);

        System.out.println("新增图书成功！");
    }

}
