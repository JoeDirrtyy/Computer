public class PC {

    private String Case;
    private MotherBoard motherBoard;
    private Monitor monitor;

    public PC(String aCase, MotherBoard motherBoard, Monitor monitor) {
        Case = aCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }
private void drawLogo(){

}
public void description(){
    System.out.println("Welcome to best buy, below is the description of the pc on sale today");
}

    @Override
    public String toString() {
        return "PC{" +
                "Case='" + Case + '\'' +
                ", motherBoard=" + motherBoard +
                ", monitor=" + monitor +
                '}';
    }
}
