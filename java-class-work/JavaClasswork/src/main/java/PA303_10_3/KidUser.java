package PA303_10_3;

public class KidUser implements LibraryUser{
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
        if (this.age <= 11) {
            System.out.println("You have successfully registered\n" + "under a Kids Account");
        } else {
            System.out.println("Sorry, age must be less than 12to register as a kid.");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Kids")) {
            System.out.println("Book issued successfully,\n" + "please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}
