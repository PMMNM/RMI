
package rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import rmi.libs.NguyenTo;


public class TinhToan extends UnicastRemoteObject implements NguyenTo {

    public TinhToan() throws RemoteException {
    }

    @Override
    public boolean KTSNT(int n) throws RemoteException {
        if(n < 2)
            return false;
        else
        {
            if(n == 2 || n== 3)
                return true;
            else
            {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if( n % i ==0 ){
                        return false;
                    }
                }
            }
        return true;
        }
    }
   /* @Override
    public ArrayList<Integer> KetQua(int n) throws RemoteException {
        ArrayList<Integer> arrL = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(KTSNT(i) == true)
                arrL.add(i);
        }
        return arrL;
    }
*/
    
}
