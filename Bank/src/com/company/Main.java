package com.company;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    /*Her definerer vi vores datastruktor, så vi kan nå den over det hele. Bed lige din lærer om at forklare lidt om
     * arrayLists*/
    private static ArrayList<Konto> kontoArrayList = new ArrayList<>();


    public static void main(String[] args) {


        // start med at lave et par kontoobjekter og leg lidt med dem dvs. hæv og indsæt penge, udskriv navn osv.
        // du kan evt. overloade konstruktøren i klassen Konto, så du ikke behøver at angive noget beløb så den blot sætte til 0.
        // Lav en funktion "udskrivPerson" som udskriver alle felterne i klassen Person.
        // lav derfter en funktion "print" i klassen Konto der udskriver alle kontoens felter også person. Se om du
        // ikke kan udnytte din udskrivPerson du allerede har lavet i klassen Person.

        // prøv nu at indsætte et par kontoer i vores kontoArrayList.

        // brug det du har lært til at forsøge at lave ovenstående om til en funktion. Du er nu allerede gået igang med
        // funktionerne i whileløkken !


//  Du kan evt udkommentere hele whileløkken så den ikke forstyrre dig i starten.




        String velkomst = "vælg mellem følgende operationer  \n" +
                "print, kontoinfo hæv, indsæt, opret, fjern...) ";

        String svar = "";
        int beløb;
        //   beløb = getTal(); // hvis vi skal hente et tal ind.

        while (true) {  // her køre vores bankterminal.

            System.out.println(velkomst);

            svar = getTekst("hvad vil du ? ");


            switch (svar) {

                case "opret":
                    System.out.println("Den  funktion skal optette en konto og indsætter den i vores arraylist, men den er ikke lavet endnu \n\n");
                    break;

                // her trænes gennemløb.
                case "print":
                    System.out.println("den her funktion udskriver alle kontoerne, men den er ikke lavet endnu \n\n");
                    break;
                case "sjasen":
                    System.out.println("denne funktion udbetaler dividend til alle konto");
                    break;
                case "Gebyr":
                    System.out.println("Denne funktion trækker et angivet beløb fra alle kontoer f.eks. måndeligt gebyr");
                    break;


                // herfra skal vi benytte os af hjælpefunktionen findKonto og getText.
                case "kontoinfo":
                    System.out.println("udskriver en angivet kontos informationer, men den er ikke lavet endnu \n\n");
                    break;
                case "fjern":
                    System.out.println("Den her funktion skal slette en angivet konto fra vores arraylist, men den er ikke lavet endnu \n\n");
                    break;
                // herfra skal vi benytte os af både findKonto og getText og getBeløb.

                case "hæv":
                    System.out.println("Den her funktion skal hæve et angivet beløb fra en angivet konto, men den er ikke lavet endnu \n\n ");
                    break;
                case "indsæt":
                    System.out.println("Den her funktion skal indsætte et angivet beløb på en angivet konto, men den er ikke lavet endnu \n\n");
                    break;

                default:
                    System.out.println("Denne her er lavet, men den gør ikke noget ! \n\n");
                    break;

            }
            if (svar.equalsIgnoreCase("q")) {
                break;
            }

        }

        System.out.println("bankterminalen en stoppet ");



    }

    public void opretKonto( String name, String cpr){





    }







    public static String getTekst(String s) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(s);
        return scanner.nextLine();
    }


    public static int getTal() {

        return Integer.parseInt(getTekst("angiv beløb"));

    }

    public static Konto findKonto(String cpr) {

        for (Konto k : kontoArrayList
        ) {
            if (k.getPerson().getCpr().equalsIgnoreCase(cpr)) {
                return k;
            }

        }
        return null;  // fandt ikke kontoen, men vi skal jo returnere noget.
    }


}
