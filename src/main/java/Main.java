import java.lang.ref.Cleaner;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите, чьи услуги вам необходимы: ");
        System.out.println("1 - Клинёр");
        System.out.println("2 - Охранник");
        System.out.println("3 - Водитель");
        String choise = scanner.nextLine();

        Posrednik posrednik = new Posrednik();

//      в 18 строке через вызов метода дополнительного класса определяется,
//      реализацию метода какого класса будет использовать переменная с типом
//      интерфейса
        Worker worker = posrednik.methodPereopredelenie(choise);
        worker.methodWork();



//      Второй способ **************************
        Worker worker1 = posrednik.setWorker(new CleanerImpl());
        worker1.methodWork();
    }
//      Второй способ **************************
}
