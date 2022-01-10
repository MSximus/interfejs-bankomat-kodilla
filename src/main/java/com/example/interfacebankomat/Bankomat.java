package com.example.interfacebankomat;

interface ATM {
    String wplata();
    String wyplata();

    default void connectWithBank() {
        System.out.println("Połączono z bankiem");
    }

    static String disconnectWithBank() {
        return "Rozłączono z bankiem";
    }
}

class ATMImpl implements ATM {
    public String wplata() {
        return "Wloz pieniadze do szuflady.";
    }

    public  String wyplata() {
        return "Odbierz pieniądze z szuflady";
    }
}


public class Bankomat {
    public static void main(String args[]) throws java.lang.Exception {
        ATMImpl atmimpl = new ATMImpl();
        atmimpl.connectWithBank();
        System.out.println(atmimpl.wplata());
        System.out.println(ATM.disconnectWithBank());

        System.out.println("");

        atmimpl.connectWithBank();
        System.out.println(atmimpl.wyplata());
        System.out.println(ATM.disconnectWithBank());
    }
}
