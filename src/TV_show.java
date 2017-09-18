public class TV_show {
    public static void main(String[] args) {
     //   Television tv1 = new Television();
     //   tv1.producer = "Sony";
     //   tv1.screenType = "FullHD";
     //   tv1.screenSize = 50;

        Television tv1 = new Television("Sony", "FullHD", 50);

        System.out.println(tv1.producer);
        System.out.println(tv1.screenType + " "+tv1.screenSize+" Cali");

    }
}
