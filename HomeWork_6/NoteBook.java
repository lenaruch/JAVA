package HomeWork_6;

public class NoteBook {
    String vendor;
    String model;
    String cpu;
    int ram;
    int memory;
    String os;
    String color;

    @Override
    public String toString() {
        return;
    }

    public NoteBook(String vendor,String model, String cpu, int ram, int memory, String os, String color) {
        this.vendor = vendor;
        this.cpu = cpu;
        this.ram = ram;
        this.memory = memory;
        this.os = os;
        this.color = color;
    }
}
