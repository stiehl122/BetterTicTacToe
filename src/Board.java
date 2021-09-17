

public class Board {
    private String topLeft;
    private String topMiddle;
    private String topRight;
    private String midLeft;
    private String midMiddle;
    private String midRight;
    private String botLeft;
    private String botMiddle;
    private String botRight;

    public Board() {
        topLeft = " ";
        topMiddle = " ";
        topRight = " ";
        midLeft = " ";
        midMiddle = " ";
        midRight = " ";
        botLeft = " ";
        botMiddle = " ";
        botRight = " ";
    }

    @Override
    public String toString() {
        String line1 = "     |     |     ";
        String line2 = "  " + topLeft + "  |  " + topMiddle + "  |  " + topRight;
        String line3 = "     |     |     ";
        String line4 = "-----------------";
        String line5 = "     |     |     ";
        String line6 = "  " + midLeft + "  |  " + midMiddle + "  |  " + midRight;
        String line7 = "     |     |     ";
        String line8 = "-----------------";
        String line9 = "     |     |     ";
        String line10 = "  " + botLeft + "  |  " + botMiddle + "  |  " + botRight;
        String line11 = "     |     |     ";
        return line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n" + 
        line6 + "\n" + line7 + "\n" + line8 + "\n" + line9 + "\n" + line10 + "\n" + line11;
    }

    // mutator methods
    public void setTopLeft(String letter) {
        topLeft = letter;
    }

    public void setTopMiddle(String letter) {
        topMiddle = letter;
    }

    public void setTopRight(String letter) {
        topRight = letter;
    }

    public void setMidLeft(String letter) {
        midLeft = letter;
    }

    public void setMidMiddle(String letter) {
        midMiddle = letter;
    }

    public void setMidRight(String letter) {
        midRight = letter;
    }

    public void setBotLeft(String letter) {
        botLeft = letter;
    }

    public void setBotMiddle(String letter) {
        botMiddle = letter;
    }
    
    public void setBotRight(String letter) {
        botRight = letter;
    }
}