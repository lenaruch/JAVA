package HomeWork_6;

import java.util.Map;
import java.util.Set;

public class NoteBook {
    String manufacturer;
    String cpuVendor;
    String cpu_model;
    int ram;
    int memory;
    String os;
    String color;

    public NoteBook(String manufacturer, String cpuVendor, String cpu_model, int ram, int memory, String os, String color) {
        this.manufacturer = manufacturer;
        this.cpuVendor = cpuVendor;
        this.cpu_model = cpu_model;
        this.ram = ram;
        this.memory = memory;
        this.os = os;
        this.color = color;
    }


    public String getInfo() {
        String res = String.format("Прозводитель: %s\nCPU: %s %s\nRAM: %d\nSSD: %d",
                manufacturer, cpuVendor, cpu_model, ram, memory);
        return res;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCpuVendor() {
        return cpuVendor;
    }

    public String getCpu_model() {
        return cpu_model;
    }

    public int getRam() {
        return ram;
    }

    public int getMemory() {
        return memory;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

}
