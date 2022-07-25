import java.util.Scanner;

public class Deneme {

    static void harmonic(double[]dizi,double n) {
        double sum = 0;
        double avarage = 0;
        for (int i = 0; i < n; i++) {



            sum += dizi[i];

            avarage = n / sum;


        }
        System.out.println("avarage : "+ avarage);

    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Kaç sayı girmek istersiniz");
        int n= input.nextInt();

        double [] dizi= new double[n];

        for(int i=0; i<n ; i++){

            System.out.println("lütfen sayılarını giriniz");

            dizi[i]= input.nextDouble();

        }

        harmonic(dizi, n);





    }

}