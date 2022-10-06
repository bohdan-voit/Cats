import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String [] [] ArrayInform = {
                {"Мурчик або Кіт лісовий", "Felis silvestris", "Schreber", "1777", "Вразливий вид, занесений до Червоної книги України.Сучасний ареал кота лісового в Україні охоплює Карпатський регіон, західне Полісся(Волинська та Рівненська області), Поділля, а також дельти Дунаю та Дністра."},
                {"Сніжок або Рись євразійська", "Lynx lynx", "Linnaeus", "1758", "Рідкісний вид, занесений до Червоної книги України.В Україні номінативна форма поширена на території Полісся —окремі р -ни Волинської, Житомирської, Київської, Рівненської, Чернігівської областей.Карпатська форма трапляється в Карпатах на території Львівської, Закарпатської, Івано -Франківської, Чернівецької областей.До XIX ст.вид був поширений в Карпатах, Поліссі, Лісостепу і Степу."}
        };

        for(int i=1; i<=ArrayInform.length; i++)
            System.out.println(i+" "+ArrayInform[i-1][0]);

        System.out.println("Введіть порядкове число тварини, яку ви бажаєте подивитись, або змінити її колір");
        Scanner scanner1 = new Scanner(System.in);
        Integer inform = scanner1.nextInt();

        Cats cat1 = new Cats(ArrayInform[inform-1]);
        cat1.print("all");


        System.out.println("Натисніть Enter, абож придумайте і напишіть новий колір для тварини");
        Scanner scanner2 = new Scanner(System.in);
        String newcolor = scanner2.nextLine();
        if (newcolor.length()>0)
        {
            cat1.ChangeColor(newcolor);
            cat1.print();
        }

    }
}