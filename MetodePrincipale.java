package ExercitiiSdaTemaWeek3.lucrufinal;

import ExercitiiSdaTemaWeek3.Optiune;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class MetodePrincipale {


    public static int[] ex1InsertElementArrayApacheM1(int[] myArray)

    {
        int insertIndex = MetodeAuxiliare.generateIndex(myArray);
        int element = MetodeAuxiliare.genereazaElementNou();

        myArray = ArrayUtils.insert(insertIndex, myArray, element);

        MetodeAuxiliare.printText(myArray,2);

        return myArray;
    }


    public static int[] ex1InsertElementArrayApacheM1Automat(int[] myArray)

    {
        MetodeAuxiliare.printText(myArray,1);

        int indexInsert = MetodeAuxiliare.genereazaIndexAutomat(myArray);
        int element = MetodeAuxiliare.genereazaElementNouAutomat();

        myArray = ArrayUtils.insert(indexInsert, myArray, element);

        MetodeAuxiliare.printText(myArray,2);

        return myArray;
    }


    public static int[] ex1InsertElementInArrayM2(int[] myArray)

    {
        MetodeAuxiliare.printText(myArray,1);

        int indexInsert = MetodeAuxiliare.generateIndex(myArray);
        int element = MetodeAuxiliare.genereazaElementNou();

        myArray = Arrays.copyOf(myArray,myArray.length+1);


        System.out.println(Arrays.toString(myArray));

        for (int i = myArray.length-1; i >indexInsert; i--)
        {
            myArray[i] = myArray[i-1];
        }

        myArray[indexInsert]=element;

        MetodeAuxiliare.printText(myArray,2);



        return myArray;

    }


    public static int[] ex1InsertElementInArrayM2Automat(int[] myArray)

    {
        MetodeAuxiliare.printText(myArray,1);

        int indexInsert = MetodeAuxiliare.genereazaIndexAutomat(myArray);
        int element = MetodeAuxiliare.genereazaElementNouAutomat();

        for (int i = myArray.length-1; i > indexInsert; i--)
        {
                myArray[i] = myArray[i - 1];
        }

        myArray[indexInsert] = element;

        MetodeAuxiliare.printText(myArray,2);

        return myArray;

    }


    public static int[] ex2InsertElemSiOrd()

    {
        int[] myArray = MetodeAuxiliare.genereazaSir();
        Arrays.sort(myArray);

        myArray = ex1InsertElementInArrayM2(myArray);
        Arrays.sort(myArray);

        MetodeAuxiliare.printText(myArray,2);

        return myArray;

    }


    public static int[] ex2InsertElemSiOrdAutomat()

    {
        int[] myArray = MetodeAuxiliare.genereazaSirAutomat();
        Arrays.sort(myArray);

        myArray = ex1InsertElementInArrayM2Automat(myArray);
        Arrays.sort(myArray);

        MetodeAuxiliare.printText(myArray,3);

        return myArray;
    }


    public static void ex3ExtrageElement(int[] myArray)

    {
        MetodeAuxiliare.printText(myArray,1);

        int indexExtract = MetodeAuxiliare.generateIndex(myArray);

        myArray = ArrayUtils.remove(myArray,indexExtract);

        MetodeAuxiliare.printText(myArray,4);
    }


    public static void ex3ExtrageElementAutomat(int[] myArray)

    {
        MetodeAuxiliare.printText(myArray,1);

        int indexExtract = MetodeAuxiliare.genereazaIndexAutomat(myArray);

        myArray = ArrayUtils.remove(myArray,indexExtract);

        MetodeAuxiliare.printText(myArray,4);
    }


    public static void genereazaObiect()

    {
        int i;

        do {

            System.out.println("Te rog sa alegi modul de rulare al programului : 1 - Rulare   " +
                    "2 - Rulare Automata Test");
            i = ExercitiiSdaTemaWeek3.lucrufinal.Optiune.input.nextInt();

            switch (i) {

                case 1:
                    ExercitiiSdaTemaWeek3.lucrufinal.Main.optiune =
                            new Optiune(true);
                case 2:
                    ExercitiiSdaTemaWeek3.lucrufinal.Main.optiune = new Optiune(false);

                default:
                    System.out.println("Ai introdus o valoare gresita!");
            }

        } while (i == 1 || i == 2);

    }

}
