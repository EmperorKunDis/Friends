public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("\n\n");

        //12.09.2023 Example no.1//
        Car car = new Car();

        System.out.println(car.Company + car.Model + car.Color + car.Equipment + car.Year);

        System.out.println("\n\n");

        System.out.println(car.toString());

        System.out.println("\n________________________________\n");

        //12.09.2023 Example no.2//

        Food[] Lednicka = new Food[44];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Spagetti");
        Food food3 = new Food("Hamburget");
        Food food4 = new Food("Toasts");

        Food food5 = new Food("Calipo");
        Food food6 = new Food("Fries");
        Food food7 = new Food("Jack Daniels");
        Food food8 = new Food("Ice Cubes");

        Food[] Freezer = {food5, food6, food7, food8};

        System.out.println(Freezer[0].name);
        System.out.println(Freezer[1].name);
        System.out.println(Freezer[2].name);
        System.out.println(Freezer[3].name);

        System.out.println("\n\n");

        Lednicka[0] = food1;
        Lednicka[1] = food2;
        Lednicka[2] = food3;
        Lednicka[3] = food4;

        System.out.println(Lednicka[0].name);
        System.out.println(Lednicka[1].name);
        System.out.println(Lednicka[2].name);
        System.out.println(Lednicka[3].name);

        System.out.println("\n________________________________\n");

        //12.09.2023 Example no.3//

        PainBringers painBringers = new PainBringers();

        Game game1 = new Game("Sekiro");
        Game game2 = new Game("Elden Ring");
        Game game3 = new Game("Bloodborne");

        painBringers.Playin(game1);
        painBringers.Playin(game2);
        painBringers.Playin(game3);

        System.out.println("Pain Meter :  " + painBringers.PainMeter);

        System.out.println("\n________________________________\n");

        //12.09.2023 Example no.4//

        Friend friend1 = new Friend("Sasuke");
        Friend friend2 = new Friend("Sakura");
        Friend friend3 = new Friend("Ero Senin");

        System.out.println("I have : "+Friend.numberOfFriends+" friends.  ");

        Friend.displeyFriends();

        System.out.println("\n________________________________\n");

        //12.09.2023 Example no.5//

    }
}