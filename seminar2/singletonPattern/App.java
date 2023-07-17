package seminar2.singletonPattern;

public class App {
    public static void main(String[] args) {
        Singleton user_1 = Singleton.getInstance();
        user_1.setUserName();
        System.out.println(" ");

        System.out.println("Trying to get new user: user_2 ");
        Singleton user_2 = Singleton.getInstance();
        user_2.setUserName();
        System.out.println("user_2 name:  " + user_2.getUserName());
        System.out.println("user_1 pwd: " + user_1.getPassword() + "    user_2 pwd: " + user_2.getPassword());
        System.out.println(" ");

        user_1 = null;
        user_2 = null;

        System.out.println("Trying to get new user: user_3 ");
        Singleton user_3 = Singleton.getInstance();
        user_3.setUserName();
        System.out.println("user_3 name: " + user_3.getUserName() + "    pwd: " + user_3.getPassword());
    }
}
