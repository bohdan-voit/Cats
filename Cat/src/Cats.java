public class Cats {
    private String name;
    private String nameonlatin;
    private String yearofopening;
    private String color;
    private String description;

    Cats(String[] ArrayInform) {
        this.name = ArrayInform[0];
        this.nameonlatin = ArrayInform[1];
        this.color = ArrayInform[2];
        this.yearofopening = ArrayInform[3];
        this.description = ArrayInform[4];
        //count++;
    }

    public String getColor() {
        return color;
    }

    public void print() {
        System.out.print("колір тваринки " + name + " тепер є: " + getColor());
    }

    public void print (String all) {
        System.out.println("Кличка та назва: " + name);
        System.out.println("Латиною: " + nameonlatin);
        System.out.println("Рік відкриття: " + yearofopening);
        System.out.println("Колір: " + color);
        System.out.println("Опис: " + description);

    }

    public void ChangeColor(String newColor) {
        if (newColor.length() > 0) {
            this.color = newColor;
        }

    }
}