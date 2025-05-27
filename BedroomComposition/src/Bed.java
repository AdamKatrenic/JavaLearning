public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int quilt, int sheets) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.quilt = quilt;
        this.sheets = sheets;
    }

    public void make(){
        System.out.print("Bed -> Making | ");
    }

    public int getPillows() {
        return pillows;
    }

    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
