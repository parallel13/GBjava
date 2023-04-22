public class Laptop {

    private int diagonal;
    private int ram;

    private int hdd;
    private String color;
    private String os;
    private String processor;

    public Laptop(int diagonal, int ram, int hdd, String color, String os, String processor) {
        this.diagonal = diagonal;
        this.ram = ram;
        this.hdd = hdd;
        this.color = color;
        this.os = os;
        this.processor = processor;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getColor() {
        return color;
    }

    public String getOs() {
        return os;
    }

    public String getProcessor() {
        return processor;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "diagonal=" + diagonal +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", color='" + color + '\'' +
                ", os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) {
            return false;
        }

        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return diagonal == laptop.diagonal && ram == laptop.ram && hdd == laptop.hdd
                && color.equals(laptop.color) && os.equals(laptop.os) && processor.equals(laptop.processor);
    }

    @Override
    public int hashCode() {
        return diagonal + 20 * ram + 30 * hdd + 40 * color.hashCode() + 50 * os.hashCode() +
                60 * processor.hashCode();
    }

}
