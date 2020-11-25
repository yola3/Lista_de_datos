/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdedatos;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Listasdedatos {
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> meses;
        meses = new ArrayList<>();// creando un objeto de instancia de tipo arraylist
        String M, A;
        do {
            M = JOptionPane.showInputDialog(null, "ingrese los meses");
            // agregando los meses a la lista
            meses.add(M);
            A = JOptionPane.showInputDialog(null, "¿Deseas ingresar mas meses (SI/NO)?");
            A = A.toUpperCase(); // nos sirve para convertir los tipos de String a mayuscula, para que al pueda evualuar los tipos de letras que vayamos a meter
        } while (!A.equals("NO"));// este lo utilizo mientras que los datos ingresados desde el teclado sean diferentes va seguir solicitando mas datos y si no se iguala entonces se cierra mi ciclo
        // mostrando el contenido de cadenas
        System.out.println("Meses originales ");
        for (int i = 0; i < meses.size(); i++) {

            //este ciclo for nos ayudara a recorrer cada datos que vayamos metiendo hasta que i sea menor 
            // que meses y el metoodzice nos devolvera el tamaño de mi arraylist que se llama meses
            System.out.println(meses.get(i));//dentro de este mensaje pongo donde tengo almacenado mis datos

        }
        // utilizando el metodo set
        meses.set(1, "la que modifiqué");
        // mostrando el contenido de cadenas
        System.out.println("meses modificadas ");
        for (int i = 0; i < meses.size(); i++) {
            System.out.println(meses.get(i));

        }
// utilizando el metodo para remover
        meses.remove(1);
        System.out.println("meses que nos quedan");
        for (int i = 0; i < meses.size(); i++) {

            System.out.println(meses.get(i));

        }

    }

}
