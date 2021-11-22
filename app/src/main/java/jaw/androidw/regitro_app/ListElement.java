package jaw.androidw.regitro_app;

public class ListElement {
    public String color;
    public String name;
    public String description;

    public ListElement(String color, String name, String description) {
        this.color = color;
        this.name = name;
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
