package SecondPackage;

public class Human {

    private Integer handCount = 2;
    private String humanName;
    private Integer age;

    void setHumanName(String humanName){
        this.humanName = humanName;
    }

    void setAge(Integer age){
        this.age = age;
    }

    public Integer getAge(){
        return age;
    }

    void increaseAge(){
        age++;
    }

    public String getHumanName(){
        return humanName;
    }
}
