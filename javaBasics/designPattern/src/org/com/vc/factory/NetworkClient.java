package org.com.vc.factory;
/*
Client which calls factory class for creating dependant instance
 */
public class NetworkClient {
    public static void main(String[] args) {
        try {
            NetworkFactory networkFactory = new NetworkFactory();
            CellularNetwork abcNetwork = networkFactory.getNetwork("abc");
            System.out.println(" abc Network Rate/min : " + abcNetwork.getRate());
            CellularNetwork pqrNetwork = networkFactory.getNetwork("pqr");
            System.out.println(" pqr Network Rate/min : " + pqrNetwork.getRate());
            CellularNetwork unknownNetwork = networkFactory.getNetwork("xyz");
            System.out.println(" unknownNetwork Rate/min : " + unknownNetwork.getRate());
        } catch (IllegalStateException ex) {
            System.out.println("Unknown Network");
        }
    }
}
