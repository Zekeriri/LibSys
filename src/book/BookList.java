package book;

/**
 * @Author: Author
 * @CreateTime: 2025-01-14
 * @Description:
 */
public class BookList {
    private Book[] books = new Book[10];
    private int usedSize;

    public BookList(){
        books[0]=new Book("路人女主的养成方法","丸户史明",100,"轻小说");
        books[1]=new Book("事到如今，已经喜欢上了青梅竹马","丸户史明",100,"轻小说");
        books[2]=new Book("败犬女主太多了！","雨森焚火",100,"轻小说");
        this.usedSize=3;
    }

    public Book getBook(int pos){
        return books[pos];
    }
    public void setBook(int pos,Book book){
        books[pos]=book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
    public boolean isFull(){
        if(this.usedSize==books.length){
            return true;
        }
        return false;
    }
}
