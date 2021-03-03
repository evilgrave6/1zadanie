package firma;

import java.util.Scanner;

class Sotrudnik {
    String fam, im, otch, doljnost;
    int oklad;
}

public class Firma{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите кол-во сотрудников: ");
        int count = sc.nextInt();
        sc.nextLine();
        Sotrudnik[] sotr = new Sotrudnik[count];

        System.out.println("введите информацию о каждом сотруднике ");
        for (int i = 0; i < count; i++) {
            sotr[i] = new Sotrudnik();

            System.out.print("введите фамилию "+(i+1)+" сотрудника: ");
            sotr[i].fam = sc.nextLine();
            System.out.print("введите его имя: ");
            sotr[i].im = sc.nextLine();
            System.out.print("введите его отчество: ");
            sotr[i].otch = sc.nextLine();
            System.out.print("введите его должность: ");
            sotr[i].doljnost = sc.nextLine();
            System.out.print("введите его оклад: ");
            sotr[i].oklad = sc.nextInt();
            sc.nextLine();
        }
        System.out.println( "\n Сотрудники фирмы: \n фам \t имя \t отч \t должность \tОклад");
        for (Sotrudnik s : sotr) {
            System.out.print(s.fam + "\t" + s.im + "\t" + s.otch + "\t" + s.doljnost + "\t\t" + s.oklad + "\n");
        }
    }
}