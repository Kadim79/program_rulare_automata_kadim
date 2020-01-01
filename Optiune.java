package ExercitiiSdaTemaWeek3.lucrufinal;

import ExercitiiSdaTemaWeek3.Methods;

import java.util.Random;
import java.util.Scanner;

public class Optiune {

    boolean optiuneIntroduManual;
    static Scanner input = new Scanner(System.in);
    static Random generate = new Random();


    public Optiune(boolean optiuneIntroduManual) {

        this.optiuneIntroduManual = optiuneIntroduManual;

        if (optiuneIntroduManual == true) {
            alegeOptiune();
            input.close();
        }

        else {
            alegeOptiuneAutomat();
            input.close();
        }
    }


    public static void alegeOptiune() {

        boolean flag = true;
        int i;
        int j;

        do {
            System.out.println("Alege te rog o optiune : 0 - Exit  1 - Ex1  2 - Ex2  3 - Ex3 : ");

            i = input.nextInt();

            switch(i){

                case 0 : break;

                case 1 :

                    System.out.println("Te rog sa alegi metoda din Ex1 : 0 - Exit  1 - Jetbrains/Apache" +
                            "  2 - for/Array");
                    j = input.nextInt();

                    switch (j){

                        case 0 : break;

                        case 1 :
                            MetodePrincipale.ex1InsertElementArrayApacheM1(MetodeAuxiliare.genereazaSir());
                            System.out.println("----------------------------------------------------");

                        case 2 :
                            MetodePrincipale.ex1InsertElementInArrayM2(MetodeAuxiliare.genereazaSir());
                            System.out.println("----------------------------------------------------");

                        default:
                            System.out.println("\nNu ai ales o optiune valida repeta alegerea!");
                    }

                case 2 :
                    MetodePrincipale.ex2InsertElemSiOrd();
                    System.out.println("----------------------------------------------------");
                    break;

                case 3 :
                    MetodePrincipale.ex3ExtrageElement(MetodeAuxiliare.genereazaSir());
                    System.out.println("----------------------------------------------------");
                    break;

                default:
                    System.out.println("\nNu ai ales o optiune valida repeta alegerea !");
            }


//            if (i == 0) {
//                break;
//            } else if (i == 1) {
//
//                do {
//
//                    System.out.println("\nTe rog sa alegi metoda pt Ex1 : 0 - Exit  1 - Jetbrains/Apache" +
//                            "  2 - for/Array");
//                    j = input.nextInt();
//                    System.out.println();
//
//                    if (j == 0)
//                        break;
//
//                    if (j == 1) {
//                        Methods.ex1InsertElementArrayApacheM1(Methods.generateArray());
//                    } else if (j == 2) {
//                        Methods.ex1InsertElementInArrayM2(Methods.generateArray());
//                    } else {
//                        System.out.println("\nNu ai ales o optiune valida repeta alegerea!");
//                        System.out.println();
//                    }
//
//                    System.out.println("----------------------------------------------------");
//
//                } while (j == 1 || j == 2);
//
//            } else if (i == 2) {
//                Methods.ex2InsertElemSiOrdM1();
//            } else if (i == 3) {
//                Methods.ex3ExtrageElement(Methods.generateArray());
//            } else {
//                System.out.println("\nNu ai ales o optiune valida repeta alegerea !");
//                System.out.println();
//            }

        } while (flag);

    }


    public static void alegeOptiuneAutomat() {

        boolean flag = true;
        int i;
        int j;
        int k = 0;

        do {
            System.out.println("Alege te rog o optinue : 0 - Exit  1 - Ex1  2 - Ex2  3 - Ex3 :");
            i = generate.nextInt(3) + 1;
            System.out.println("Aceasta este optiunea aleasa : " + i);

            if (i == 0)
            {
                break;
            }
            else if (i == 1) {

                do {

                    System.out.println("\nTe rog sa alegi metoda pt Ex1 : 0 - Exit  1 - Jetbrains/Apache" +
                            "  2 - for/Array");
                    j = generate.nextInt(3);
                    System.out.println("Aceasta este varianta aleasa : " + j);

                    if (j == 0)
                        break;

                    if (j == 1) {
                        Methods.ex1InsertElementArrayApacheM1Automat(Methods.generateArrayAutomat());
                        System.out.println("-------------------------------------------------");
                    } else if (j == 2) {
                        Methods.ex1InsertElementInArrayM2Automat(Methods.generateArrayAutomat());
                        System.out.println("-------------------------------------------------");

                    } else {
                        System.out.println("\nNu ai ales o optiune valida repeta alegerea!");
                        System.out.println();
                    }


                } while (j == 1 || j == 2);

            } else if (i == 2) {
                Methods.ex2InsertElemSiOrdM1Automat();
            } else if (i == 3) {
                Methods.ex3ExtrageElementAutomat(Methods.generateArrayAutomat());
            } else {
                System.out.println("\nNu ai ales o optiune valida repeta alegerea !");
            }

            System.out.println();

            k++;

            System.out.println("Aceasta este rularea cu numarul : "+k);

            System.out.println("-----------------------------------------------------------------");
            System.out.println();

        } while (k < 100);

    }

}
