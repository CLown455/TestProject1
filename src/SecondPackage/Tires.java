package SecondPackage;

public class Tires {

    private Integer width = 12;

    private String name = "Mercedes";

    void changeWidth(Integer newWidth){
        this.width = newWidth;
    }

    void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }

    public Integer getWidth() {
        return width;
    }
}
