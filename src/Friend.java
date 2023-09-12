import javax.xml.namespace.QName;

public class Friend {
    String name;
    static int numberOfFriends;

    Friend(String name){
        this.name = name;
        numberOfFriends++;
    }

    static void displeyFriends() {

        System.out.println("You have "+numberOfFriends+" friends. ");

    }
}
