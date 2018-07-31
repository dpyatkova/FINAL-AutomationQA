package OOP_HT_v2;

public abstract class Pet {
    private String name = "noname";
    private String owner = "no";
    private String location = "tramp";
    private String sex = "male";

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

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }


}


