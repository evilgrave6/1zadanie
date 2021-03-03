package country;
import java.util.Scanner;
class Strana{
    String name;
    double square;
}
public class countr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите кол-во стран: ");
        int n=sc.nextInt();
        Strana country[]=new Strana[n];

        System.out.println("введите инф-ую о странах: ");
        for (int i = 0; i < country.length; i++) {
            sc.nextLine();
            country[i]=new Strana();

            System.out.print("название "+(i+1)+"-й страны : ");
            country[i].name=sc.nextLine();
            System.out.print("площадь "+(i+1)+"-й страны : ");
            country[i].square=sc.nextDouble();
        }
        System.out.println("\nхарактеристики стран:");
        for (Strana str : country)
            System.out.println(" "+str.name+ "\t" +str.square +" млн кв. км");
        int nommax=0;
        double max=country[nommax].square;
        for (int i = 0; i < country.length; i++)
            if (country[i].square>max) {
                max= country[i].square;
                nommax=i;
            }
        System.out.println("\nстрана с максимальной площадью :");
        System.out.println(""+country[nommax].name+"\t"+country[nommax].square
                +"млн кв. км");


        for (int i = 0; i < country.length-1; i++)
            for (int j = 0; j < country.length-1-i; j++)
                if (country[j].square>country[j+1].square){
                    Strana rab=country[j];
                    country[j]=country[j+1];
                    country[j+1]=rab;
                }
        System.out.println("\nотсортированный список по площади:");//
        for (int i = 0; i < country.length; i++) {
            System.out.println(""+country[i].name+"\t"+country[i].square+"млн кв. км");
        }

        for (int i = 0; i < country.length-1; i++)
            for (int j = 0; j < country.length-i-1; j++)
                if(country [j].name.compareTo(country[i+1].name)>0){
                    Strana rab=country[j];
                    country[j]=country[j+1];
                    country[j+1]=rab;
                }
        System.out.println("\nотсортированный список по названиям:");
        for (int i = 0; i < country.length; i++) {
            System.out.println(""+country[i].name +"\t"+country[i].square
                    +" млн кв. км");
        }

        double s = 0;
        for (int i = 0; i < country.length; i++)
            s+=country[i].square;
        double sr=s/country.length; ;
        System.out.println("ср. площадь = "+sr);
        System.out.println("\nстраны, с площадью больше средней");
        for (int i = 0; i < country.length; i++) {
            if (country[i].square>sr)
                System.out.println(country[i].name +"\t"+country[i].square +" млн кв. км");
        }


        sc.nextLine();
        System.out.println("введите название искомой страны:  ");
        String name=sc.nextLine();
        int nom=-1;

        for (int i = 0; i < country.length; i++)
            if (name.equalsIgnoreCase(country[i].name))

                nom=i;
        if (nom!= -1) {
            System.out.println("такая страна есть в списке. Это " +country[nom].name+" "+country[nom].square+" млн кв. км");
        }else System.out.println("такой страны нет в списке");

    }
}
