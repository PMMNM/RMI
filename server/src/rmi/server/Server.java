
package rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Server().run();
    }
    private void run()
    {
        
        int port = 6394;
        try {
            TinhToan tt = new TinhToan();
            Registry registry = LocateRegistry.createRegistry(port);
            Naming.rebind("rmi://localhost:"+port+"/TinhToan", tt);
            System.out.println("Server đang hoạt động...");
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
