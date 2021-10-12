package week1.classes;

public class Rectangle {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
        this.color = "Blue";
    }

    public Rectangle(int width, int height, String color) {
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
        }
    }

    public void setColor(String color) {
        char firstLetter = color.charAt(0);
        int length = color.length();
        if (Character.isUpperCase(firstLetter) && length > 2 && length < 20) {
            this.color = color;
        } else {
            this.color = "Blue";
        }
    }

    public void draw() {
        String firstLetter = color.substring(0, 1);
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                System.out.print(firstLetter);
            }
            System.out.println();
        }
    }
}
