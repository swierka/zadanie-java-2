public class TV_show {
    public static void main(String[] args) {
     //   Television Tv1 = new Television();
     //   Tv1.producer = "Sony";
     //   Tv1.screenType = "FullHD";
     //   Tv1.screenSize = 50;

        Television Tv1 = new Television("Sony", "FullHD", 50);

        System.out.println(Tv1.producer);
        System.out.println(Tv1.screenType + " "+Tv1.screenSize+" Cali");

    }
}
