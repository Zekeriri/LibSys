### book package

**Class Book:**

String name

String author

int price

String type

boolean isLend

**Class BookList:**

Book[] books

int size;

### user package:

**abstract class User:**

String name;

IOperation[] iOpertions;

**class AdminUser extends User:**

**class NormalUser extends User:**

### operation package:

**interface IOperation:**

void perform

**AddBookOperation:**

BorrowBookOperation:

DeleteBookOperation:

ExitBookOperation:

FindBookOperation:

ReturnBookOperation:

ShowBookOperation:
