package dina.java.animal;

public abstract class Pet {
    private String name = "noname";
    private String owner = "no";
    private String location = "tramp";

    private String color;
    protected String type;

    public abstract void feed();

    public abstract void voice();

    public abstract void run();

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setOwner(String owner) {

        this.owner = owner;
    }

    public String getOwner() {

        return owner;
    }

    public void setLocation(String location) {

        this.location = location;
    }

    public String getLocation() {

        return location;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
