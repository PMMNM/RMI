/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.libs;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;


public interface NguyenTo extends Remote {
    public boolean KTSNT(int n) throws RemoteException;
  //public ArrayList<Integer> KetQua(int n) throws RemoteException;
    
}
