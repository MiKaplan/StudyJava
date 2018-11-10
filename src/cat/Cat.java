package cat;

public class Cat {
    private String name;
    private int age;
    private double weigt;
    private String type;
    private boolean sex;
    private String ration;

    public Cat(String name, int age, double weigt, String type, boolean sex, String ration) {
        this.name = name;
        this.age = age;
        this.weigt = weigt;
        this.type = type;
        this.sex = sex;
        this.ration = ration;
    }
    public Cat(){
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeigt(double weigt) {
        this.weigt = weigt;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeigt() {
        return weigt;
    }

    public String getType() {
        return type;
    }

    public boolean isSex() {
        return sex;
    }

    public String getRation() {
        return ration;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weigt=" + weigt +
                ", type='" + type + '\'' +
                ", sex=" + sex +
                ", ration='" + ration + '\'' +
                '}';
    }
}
