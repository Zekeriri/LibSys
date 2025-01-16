package book;

/**
 * @Author: Author
 * @CreateTime: 2025-01-14
 * @Description:
 */
public class Book {
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean isLend;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLend() {
        return isLend;
    }

    public void setLend(boolean lend) {
        isLend = lend;
    }

    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                (isLend==true ? " ，已借出":" ，未借出")+
                // ", isLend=" + isLend +
                '}';
    }
}
