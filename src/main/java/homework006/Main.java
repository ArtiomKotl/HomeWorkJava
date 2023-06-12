package homework006;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        printFilteredNotebooks();
    }
    static void printFilteredNotebooks(){
        Set<Notebook> notebooks = setNotebooks();
        Notebook compareNotebook = filter();
        for (Notebook notebook : notebooks){
            if(!(!(notebook.getRam () >= compareNotebook.getRam ())
                    || !(notebook.getHdd () >= compareNotebook.getHdd ())
                    || !notebook.getOs ().contains ( compareNotebook.getOs () )
                    || !notebook.getColor ().contains ( compareNotebook.getColor () )
                    || !notebook.getBrand ().contains ( compareNotebook.getBrand () )))
            {
                notebook.print();
            }
        }
    }
    static Set<Notebook> setNotebooks(){
        Notebook notebook1 = new Notebook("ASUS", "Black", 32, 2000, "Windows" );
        Notebook notebook2 = new Notebook("HP", "Silver", 16, 1000, "Linux" );
        Notebook notebook3 = new Notebook("Lenovo", "Black", 16, 1000, "Windows" );
        Notebook notebook4 = new Notebook("Dell", "Silver", 32, 2000, "Linux" );
        Notebook notebook5 = new Notebook("Apple", "Black", 16, 1000, "Mac OS" );
        Notebook notebook6 = new Notebook("Xiaomi", "Silver", 8, 500, "Windows" );
        Notebook notebook7 = new Notebook("HP", "Black", 16, 500, "Windows" );
        Notebook notebook8 = new Notebook("Dell", "Silver", 8, 1000, "Linux" );
        Notebook notebook9 = new Notebook("Apple", "Black", 8, 500, "Mac OS" );
        Notebook notebook10 = new Notebook("Apple", "Silver", 32, 1000, "Mac OS" );

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);
        notebooks.add(notebook9);
        notebooks.add(notebook10);

        return notebooks;
    }
    static void menu(){
        System.out.println("Filtering Options:");
        System.out.println("1 - Brand");
        System.out.println("2 - Color");
        System.out.println("3 - RAM");
        System.out.println("4 - HDD");
        System.out.println("5 - OS");
        System.out.println("0 - Apply filter options / show all ");
        System.out.print("Enter parameter number: ");
    }

    static Notebook filter() {
        Notebook compareNotebook = new Notebook( "", "", 0, 0, "");
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            menu();
            switch (in.nextInt()){
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.print("Enter Brand: ");
                    String brand = in.next();
                    compareNotebook.setBrand (brand);
                    break;
                case 2:
                    System.out.print("Enter Color: ");
                    String color = in.next ();
                    compareNotebook.setColor (color);
                    break;
                case 3:
                    System.out.print("Enter value RAM: ");
                    int ram = in.nextInt ();
                    compareNotebook.setRam ( ram );
                    break;
                case 4:
                    System.out.print("Enter value HDD: ");
                    int hdd = in.nextInt ();
                    compareNotebook.setHdd ( hdd );
                    break;
                case 5:
                    System.out.print("Enter OS: ");
                    String os = in.next ();
                    compareNotebook.setOs (os);
                    break;
                default:
                    System.out.println("Something went wrong... Try again");
            }
        }
        in.close();
        return compareNotebook;
    }
}