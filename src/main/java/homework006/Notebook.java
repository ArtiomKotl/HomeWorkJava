package homework006;


public class Notebook {
    private String Brand;
    private String Color;
    private int Ram;
    private int Hdd;
    private String Os;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public int getHdd() {
        return Hdd;
    }

    public void setHdd(int hdd) {
        Hdd = hdd;
    }

    public String getOs() {
        return Os;
    }

    public void setOs(String os) {
        Os = os;
    }

    public Notebook(String brand, String color, int ram, int hdd, String os ) {
        this.Brand = brand;
        this.Color = color;
        this.Ram = ram;
        this.Hdd = hdd;
        this.Os = os;

    }


    public void print(){
        System.out.printf("Brand: %s, Color: %s, Ram: %d, HDD: %d, Operation System: %s \n", Brand, Color, Ram, Hdd, Os );
    }
}