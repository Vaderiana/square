import ru.netology.square.servises.AmountSquareService;

public class Main {


    public static void main(String[] args) {
        AmountSquareService service = new AmountSquareService();
        int mySquare = service.square(200,300);

        System.out.println(mySquare);

    }
}