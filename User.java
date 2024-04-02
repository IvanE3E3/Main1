public class User {
    private String name;
    private int age;
    private String gender;
    private int id;
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public User(String name, int age, String gender, int id, String state) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.state = state;
    }
    public void info(){
        System.out.println(getId());
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getGender());
        System.out.println(getState());
    }
}
