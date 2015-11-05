

package boletin73;

import javax.swing.JOptionPane;

/**
 *
 * @author agomezcastro
 */
public class Signos {
    public int pedirNumEnteiro(){
        int num;
        String res= JOptionPane.showInputDialog("teclea un numero");
        num= Integer.parseInt(res);
        return num;
    }
    public void signos(int num){
        if (num>0)
            System.out.println("O numero e +");
        else if (num<0)
            System.out.println("O numero e -");
        else 
            System.out.println("O numero e 0");
    }
}
