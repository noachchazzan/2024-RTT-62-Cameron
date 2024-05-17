package PA303_10_3;

public class AdultUser implements LibraryUser{
    int age;
    String bookType;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (getAge() >= 12) {
            System.out.println("“You have successfully\n" +
                    "registered under an Adult Account.");
        } else {
            System.out.println("“Sorry, age must be greater than 12 to\n" +
                    "register as an adult.");
        }
    }

    @Override
    public void requestBook() {
        if(this.bookType=="Fiction"){
            System.out.println("“Book Issued\n" +
                    "successfully, please return the book within 7 days.");
        } else {
            System.out.println("“Oops, you are allowed to take only adult Fiction\n" +
                    "books.");
        }
    }
}
