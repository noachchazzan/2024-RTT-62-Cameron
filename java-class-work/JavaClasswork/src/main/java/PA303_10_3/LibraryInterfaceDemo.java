package PA303_10_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser mia = new KidUser();
        mia.setAge(10);
        mia.registerAccount();
        mia.setBookType("Kids");
        mia.requestBook();

        KidUser mia1 = new KidUser();
        mia1.setAge(18);
        mia1.registerAccount();
        mia1.setBookType("Fiction");
        mia1.requestBook();

        AdultUser mia2 = new AdultUser();
        mia2.setAge(5);
        mia2.registerAccount();
        mia2.setBookType("Kids");
        mia2.requestBook();

        AdultUser mia3 = new AdultUser();
        mia3.setAge(23);
        mia3.registerAccount();
        mia3.setBookType("Fiction");
        mia3.requestBook();
    }
}
