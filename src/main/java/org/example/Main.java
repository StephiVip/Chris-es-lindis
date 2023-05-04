package org.example;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    String saludoCadena;
    int saludo;
    int op= 3;

        saludoCadena = JOptionPane.showInputDialog("cual es tu numero favorito");
        saludo = Integer.parseInt(saludoCadena);

        System.out.println();
        if (op == saludo ) {
            mensaje();
        }else {
            mensaje2();
        }




        }



        static void mensaje() {

        JOptionPane.showMessageDialog(null,"Si elegiste el 3 sos Boba");
        }
    static void mensaje2() {

        JOptionPane.showMessageDialog(null,"Hola Señora cara de papa");
    }
    }
