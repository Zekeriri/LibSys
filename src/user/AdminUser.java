package user;

import operation.*;

import java.util.Scanner;

/**
 * @Author: Author
 * @CreateTime: 2025-01-14
 * @Description:
 */
public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
        this.iOperations=new IOperation[]{
                new ExitOperation(),
                new FindBookOperation(),
                new AddBookOperation(),
                new DeleteBookOperation(),
                new ShowBookOperation()
        };
    }
    public int menu(){
        System.out.println("******管理员菜单******");
        System.out.println("1. 查找图书");
        System.out.println("2. 新增图书");
        System.out.println("3. 删除图书");
        System.out.println("4. 显示图书");
        System.out.println("0. 退出系统");
        System.out.println("********************");
        System.out.println("请输入你的操作：");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
