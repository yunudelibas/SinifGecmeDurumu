package Donguler;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,fiz,tur,kim,muz,dersSayisi=0, toplamNot=0;
        double ort;
        Scanner girdi= new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz:");
        mat= girdi.nextInt();
        if (mat>-1 && mat<101 ){
            toplamNot += mat;
            ++dersSayisi;
        }

        System.out.print("Fizik Notunuzu Giriniz:");
        fiz= girdi.nextInt();
        if (fiz>-1 && fiz<101 ){
            toplamNot += fiz;
            ++dersSayisi;
        }

        System.out.print("Türkçe Notunuzu Giriniz:");
        tur= girdi.nextInt();
        if (tur>-1 && tur<101 ){
            toplamNot += tur;
            ++dersSayisi;
        }

        System.out.print("Kimya Notunuzu Giriniz:");
        kim= girdi.nextInt();
        if (kim>-1 && kim<101 ){
            toplamNot += kim;
            ++dersSayisi;
        }

        System.out.print("Müzik Notunuzu Giriniz:");
        muz= girdi.nextInt();
        if (muz>-1 && muz<101 ){
            toplamNot += muz;
            ++dersSayisi;
        }
        ort=toplamNot/dersSayisi;
        if (ort>55)
            System.out.println("Sınıfı Geçtiniz. Ortalamanız:"+ort);
        else
            System.out.println("Sınıftan kaldınız. Ortalamanız:"+ort);

    }
}
