package operation;

import book.BookList;

/**
 * @Author: Author
 * @CreateTime: 2025-01-14
 * @Description:
 */
public class ExitOperation implements IOperation{
    @Override
    public void perform(BookList bookList) {
        System.out.println("退出系统......");
        int currentSize=bookList.getUsedSize();
        for (int i=0;i<currentSize;i++){
            bookList.setBook(i,null);
        }

        System.exit(0);
    }
}
