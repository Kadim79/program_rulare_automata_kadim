package ExercitiiSdaTemaWeek3.lucrufinal;

import java.util.Arrays;

public class MetodeAuxiliare {


    static int[] genereazaSir()

    {
        int myArrayLength = genereazaLungimeSir();
        int[] myArray = new int[myArrayLength];

        for (int i = 0; i < myArrayLength; i++)
        {
            myArray[i] = Optiune.generate.nextInt(30);
        }
        return myArray;
    }


    static int[] genereazaSirAutomat()

    {
        int myArrayLength = genereazaLungimeSirAutomat();
        int[] myArray = new int[myArrayLength];

        for (int i = 0; i < myArrayLength; i++)
        {
            myArray[i] = Optiune.generate.nextInt(30);
        }
        return myArray;
    }


    static int generateIndex(int[] myArray)

    {
        boolean flagIndexControl = true;
        int indexInsert;
        System.out.println();

        do {
            System.out.print("Te rog introdu indexul:");
            indexInsert = Optiune.input.nextInt();
            System.out.println();

            if (indexInsert > myArray.length)
            {

                System.out.println("Eroare: valoare indexInsert mai mare decat lungimea sirului!");
                System.out.println("Te rog sa alegi o valoare corecta!");
                System.out.println();
                flagIndexControl = true;

            }
            else
            {
                flagIndexControl = false;
            }

        } while (flagIndexControl);

        return indexInsert;
    }


    static int genereazaIndexAutomat(int[] myArray)

    {
        boolean flagIndexControl = true;
        int indexInsert;

        do {
            indexInsert = Optiune.generate.nextInt(myArray.length);
            System.out.println("Acesta este indexul inserarii : " + indexInsert);

            if (indexInsert > myArray.length) {

                System.out.println("Eroare: valoare indexInsert mai mare decat lungimea sirului!");
                System.out.println("Te rog sa alegi o valoare corecta!");
                System.out.println();
                flagIndexControl = true;

            } else {
                flagIndexControl = false;
            }

        } while (flagIndexControl);

        return indexInsert;
    }


    static int genereazaLungimeSir()

    {
        System.out.print("Te rog introdu lungimea sirului: ");
        int myArrayLength = Optiune.input.nextInt();
        System.out.println();
        return myArrayLength;
    }


    static int genereazaLungimeSirAutomat()

    {
        int myArrayLength = Optiune.generate.nextInt(10) + 2;
        System.out.println("Aceasta este lungimea sirului : " + myArrayLength);
        System.out.println();
        return myArrayLength;

    }


    static int genereazaElementNou()

    {
        int element;
        System.out.print("Te rog introdu elementul nou : ");
        element = Optiune.input.nextInt();
        System.out.println();
        return element;
    }


    static int genereazaElementNouAutomat()

    {
        int element;
        element = Optiune.generate.nextInt(20);
        System.out.println("Acesta este elementul ce va fi inserat  : " + element);
        return element;
    }


    static void printText(int[] myArray, int i)

    {
        switch (i){

            case 1 :
                System.out.println("Acesta este sirul: " + Arrays.toString(myArray));

            case 2 :
                System.out.println("Noul sir cu elementul inserat: " + Arrays.toString(myArray));

            case 3 :
                System.out.println("Acesta este sirul ordonat si cu element inserat : "
                        + Arrays.toString(myArray));

            case 4 :
                System.out.println("\nAcesta este sirul dupa extragere : "
                        + Arrays.toString(myArray));

            case 5 :
                System.out.println("\nTe rog sa alegi metoda pt Ex1 : 0 - Exit  1 - Jetbrains/Apache" +
                        "  2 - for/Array");

            default :
                System.out.println("Optiune gresita!");
        }

    }
}
