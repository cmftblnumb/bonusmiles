
public class Main {
    public static void main(String[] args) {
double BonusMiles;

        CalcService service = new CalcService();

        int price = 10_000; // цена билета
        int miles = service.calculate(price); // расчет миль
        System.out.println(miles); // вывод результата
    }
}