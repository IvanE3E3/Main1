public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ivan", 33, "man", 3, "online");

        System.out.println(user1.getName()+" "+user1.getAge()+" "+user1.getGender());
        user1.info();
    }
}
