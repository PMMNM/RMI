
package rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.libs.NguyenTo;


public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        new Client().run();
    }
    private void run() throws RemoteException
    {
        int port = 6394;
        try {
            NguyenTo nguyento = (NguyenTo) Naming.lookup("rmi://localhost:"+port+"/TinhToan");
            
            //N
          /*  System.out.println("Nhập n từ bàn phím:");
            int n =0;
            do
            {
            System.out.println("");
            Scanner sc = new Scanner(System.in);
             n = sc.nextInt();
            }while(n <2);
            System.out.println("Những số là số nguyên tố :");
            for (int i = 0; i < nguyento.KetQua(n).size(); i++) {
        System.out.print(nguyento.KetQua(n).get(i)+ "  ");
            }
          */
          Scanner sc = new Scanner(System.in);
          int m =0;
            do
            {
            System.out.print("Nhập số phần tử : ");          
             m = sc.nextInt();
            }while(m <1);
          int[] arr = new int[m];
            for (int i = 0; i < m; i++) {
                arr[i] = sc.nextInt();
            }
            ArrayList<Integer> arrL = new ArrayList<>();         
            for (int i = 0; i < m; i++) {
                if(nguyento.KTSNT(arr[i])== true)
                { arrL.add(arr[i]);}
            }       
            System.out.println("Những số là số nguyên tố: ");
            for (int i = 0; i < arrL.size(); i++) {
                System.out.print(arrL.get(i)+" ");
            }
            System.out.println("");
        } catch (NotBoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
