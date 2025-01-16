import book.Book;
import book.BookList;
import user.User;
import user.NormalUser;
import user.AdminUser;

import java.awt.*;
import java.util.Scanner;

/**
 * @Author: Author
 * @CreateTime: 2025-01-14
 * @Description:
 */


public class Main {
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入你的身份，1：管理员 2：普通用户");
        int choice = scanner.nextInt();
        if (choice == 1) {
            AdminUser adminUser = new AdminUser(name);
            return adminUser;
        }else {
            NormalUser normalUser = new NormalUser(name);
            return normalUser;
        }
    }
    public static void main(String[] args) {
        BookList bookList= new BookList();
        User user = login();
        while (true){
            int choice = user.menu();
            user.doIOperations(choice,bookList);
        }

    }
}
