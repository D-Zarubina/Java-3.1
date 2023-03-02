public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
        System.out.println();
        System.out.println("Бонусы за вторую покупку билетов");
        System.out.println(service.calculate(26449));
        System.out.println();
        System.out.println("Бонусы за третью покупку билетов");
        System.out.println(service.calculate(1111));
        System.out.println();
        System.out.println("Бонусы за четвертую покупку билетов");
        System.out.println(service.calculate(3250));
        System.out.println();
        System.out.println("Бонусы за пятую покупку билетов");
        System.out.println(service.calculate(97020));

    }
}