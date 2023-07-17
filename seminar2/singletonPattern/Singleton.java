package seminar2.singletonPattern;

import java.util.Scanner;

public class Singleton {
    private static Singleton instance;
    private String userName;
    private String password;

    private Singleton() { userName = ""; password = ""; }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName() {
        try {
            if (this.userName.equals("")) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input user name: ");
                this.userName = sc.nextLine();
                System.out.println("Input password: ");
                setPassword(sc.nextLine());
                sc.close();
            } else {
                System.out.println("User already exists.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }
}
