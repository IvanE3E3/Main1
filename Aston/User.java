package Aston;

import java.sql.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class User {

    private static final AtomicInteger ID_COUNT = new AtomicInteger(1);
    private  final int ID=ID_COUNT.getAndIncrement();;
    private String name;
    private int age;
    private String gender;

/////////////////////////////////Конструкторы
    public User( String name, int age, String gender) {

        this.name = name;
        if(age<0 || age>124){
            System.out.println("Поле возраст заполнено не верно, объект не создан");
            this.age = -1;
        }else{this.age = age;}


        this.gender = gender;
    }
    public User( String name, int age) {
        this.name = name;
        if(age<0 || age>124){
            System.out.println("Поле возраст заполнено не верно, объект не создан");
            this.age = -1;
        }else{this.age = age;}
    }

    public User() {
        name="";
        gender="Самец";
        age= -1;
        System.out.println("Видимо этот парень работает в ФСБ");
    }



/////////////////////////////////Методы
    public String getName() {
        if(name.isEmpty())
            System.out.println("Вы забыли вписать Имя");
        return name;

    }

    public void setName(String name) {
        boolean hasOther = false;
            for(int i = 0; i < name.length() && !hasOther; i++) {
                if(!Character.isLetter(name.charAt(i))){
                    hasOther=true;
                }
            }
        if(!hasOther){
            this.name = name;
        }else System.out.println("Имя должно состоять только из букв");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>124)
            System.out.println("Возраст не корректен");
        else
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender.contains("man")||gender.contains("woman"))
        this.gender = gender;
        else
            System.out.println("В России пока только два гендера...");
    }

    @Override
    public String toString() {
        return "User " +
                "id " + ID +
                ", name '" + getName() + '\'' +
                ", age " + age +
                ", gender '" + gender + '\'' ;
    }

    public final static class UserUtility{
        private UserUtility() { throw new UnsupportedOperationException(); }
        static ArrayList<String> usersList=new ArrayList<String>();
        static ArrayList<String> usersListOwned=new ArrayList<String>();
        public static void rec(User user){
            if(user.age>18)
            usersList.add(user.toString());
            else {usersListOwned.add(user.toString());}
        }
        public static void showList (){
            System.out.println(usersList);
        }
        public static void showList (int t){
            System.out.println(usersList.get(t-1));
        }
        public static void showOwned (){
            System.out.println(usersListOwned);
        }
        public static void showOwned (int t){
            System.out.println(usersListOwned.get(t-1));
        }

    }
}
