package com.company;

public class Konto {


    private Person person;

    private int saldo;



    public Konto(Person person, int saldo) {
        this.person = person;
        this.saldo = saldo;
    }


    /*todo. Overload konstruktøren så man kan lave en konto uden at angive et beløb. saldo sættes  da til nul.*/


    public Konto(Person person) {
        this.person = person;
        this.saldo = 0;
    }

    public Person getPerson() {
        return person;
    }

    public int getSaldo() {
        return saldo;
    }



    // todo funktionen er ikke hensigtsmæssigt lavet, da man kan hæve et negativt beløb. Kan du fixe det ?
    public int hæv(int beløb) {

        saldo = saldo - beløb;

        return saldo;

    }

    // todo funktionen er ikke hensigtsmæssigt lavet, da man kan indsætte et negativt beløb. Kan du fixe det ?
    public int indsæt(int beløb) {

        saldo = saldo + beløb;

        return saldo;

    }


    // her skal du lave en funktion der kan printe alle felterne i kontoen. Prøv at se om du ikke kan
    // udnytte

    /*todo lav en funktion der kan udskrive en konto. Se om du ikke kan benytte dig af den funktion der udskriver personen*/
}
