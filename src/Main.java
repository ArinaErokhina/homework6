public class Main {
    public static void main(String[] args) {

        //Задание1

        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        double[] b = {1.57, 7.654, 9.986};
        System.out.println(b[0]);

        int[] day = {1, 2, 3, 4, 5, 6, 7};

        //Задание 2

        for (int i = 0; i < 3; i++)
        {if(i != a.length -1)
        {System.out.print(a[i] + ", ");}
        else
        {System.out.print(a[i]);}}
        System.out.println();
        for (int t = 0; t < 3; t++)
        {if ( t != b.length - 1)
        {System.out.print(b[t] + ", ");}
        else
        {System.out.print(b[t]);}}
        System.out.println();
        for (int y = 0; y < 7; y++)
        {if (y != day.length - 1)
        {System.out.print(day[y] + ", ");}
        else
        {System.out.print(day[y]);}}
        System.out.println();

        // Задание 3

        for (int i = 2; i >= 0; i = i - 1)
        {if(i > 0)
        {System.out.print(a[i] + ", ");}
        else
        {System.out.print(a[i]);}}
        System.out.println();
        for (int t = 2; t >= 0; t = t - 1)
        {if ( t > 0)
        {System.out.print(b[t] + ", ");}
        else
        {System.out.print(b[t]);}}
        System.out.println();
        for (int y = 6; y >= 0; y--)
        {if (y > 0)
        {System.out.print(day[y] + ", ");}
        else
        {System.out.print(day[y]);}}
        System.out.println();

        // Задание 4

        for (int i = 0; i < 3; i++)
        {if (a[i] % 2 != 0)
        {System.out.println(a[i]+1);}
        else
        {System.out.println(a[i]);}}




    }
}