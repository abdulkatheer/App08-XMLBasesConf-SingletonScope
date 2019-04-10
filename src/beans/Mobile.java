package beans;

public class Mobile {
    private String brand;
    private String model;
    private String year;
    private String os;
    private String ram;
    private String internal;

    static {
        System.out.println("Loading Mobile bean class...");
    }

    public Mobile(){
        System.out.println("Creating object for Mobile bean class...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getInternal() {
        return internal;
    }

    public void setInternal(String internal) {
        this.internal = internal;
    }

    public void getMobileDetails(){
        System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-15s\n", this.getBrand(), this.getModel(), this.getYear(), this.getOs(), this.getRam(), this.getInternal()));
    }
}
