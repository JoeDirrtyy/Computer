public class Monitor {

    private String model;
    private Resolution resolution;
    private String manufacturer;

    public Monitor(String model, Resolution resolution, String manufacturer) {
        this.model = model;
        this.resolution = resolution;
        this.manufacturer = manufacturer;
    }

    void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at" + x + "," + y + "" + "in color" + color);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
