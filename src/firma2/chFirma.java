package firma2;
import java.util.Scanner;

class Sotrudnik {
    String fam, im, otch, doljnost;
    int countChildrens;
    Children[]childrens = null;
}

class Children {
    String name;
    int age;
}
public class chFirma{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("введите кол-во сотрудников: ");
        int count = sc.nextInt();
        sc.nextLine();
        Sotrudnik[] sotr = new Sotrudnik[count];
        System.out.println("Введите информацию о каждом сотруднике ");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i] = new Sotrudnik();
            System.out.print("Введите фамилию "+(i+1)+" сотрудника : ");
            sotr[i].fam= sc.nextLine();

            System.out.print("Введите его имя :");
            sotr[i].im=sc.nextLine();

            System.out.print("Введите его отчество : ");
            sotr[i].otch=sc.nextLine();

            System.out.print("Введите его должность : ");
            sotr[i].doljnost=sc.nextLine();

            System.out.print("Введите количество детей : ");
            sotr[i].countChildrens= sc.nextInt();
            sc.nextLine();

            if(sotr[i].countChildrens!=0){
                sotr[i].childrens=new Children [sotr[i].countChildrens];
                System.out.println("Дети: ");
                for (int j = 0; j< sotr[i].countChildrens; j++){
                    sotr[i].childrens[i]=new Children();

                    System.out.print("Введите имя "+(i+1)+" ребенка : ");
                    sotr[i].childrens[i].name=sc.nextLine();
                    System.out.print("введите его возраст: ");
                    sotr[i].childrens[i].age=sc.nextInt();
                    sc.nextLine();
                }
            }
        }
        System.out.println("\n Сотрудники фирмы: \n фам \t имя \t отч +\t должность");
        for (Sotrudnik s : sotr) {
            System.out.print(s.fam + "\t" + s.im + "\t" + s.otch + "\t" + s.doljnost );
            if (s.countChildrens!=0){
                System.out.println("дети: ");
                for (int i=0; i<s.countChildrens; i++){
                    System.out.println(s.childrens[i].name + " "+ s.childrens[i].age);
                }
            }
        }
    }
}