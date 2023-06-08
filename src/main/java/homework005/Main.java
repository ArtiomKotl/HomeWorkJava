package homework005;


public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        fillingPhoneBook (phoneBook);
        System.out.println(phoneBook.getList());
        phoneBook.sortedPrint ();

    }


        public static void fillingPhoneBook(PhoneBook phoneBook){

            phoneBook.addContact("Pavel", "456433");
            phoneBook.addContact("Ivan", "456123");
            phoneBook.addContact("Ivan", "41237537");
            phoneBook.addContact("Igor", "6783738");
            phoneBook.addContact("Pavel", "45345345");
            phoneBook.addContact("Ivan", "4345345");
            phoneBook.addContact("Ilias", "222444");
            phoneBook.addContact("Igor", "654321");
            phoneBook.addContact("Maximilian", "123456");
            phoneBook.addContact("Tom", "874653");
            phoneBook.addContact("Maximilian", "654321");



        }

}