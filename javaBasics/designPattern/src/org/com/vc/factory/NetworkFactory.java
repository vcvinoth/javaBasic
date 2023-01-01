package org.com.vc.factory;

/*
Factory class which creates instance of different type based on input received from client class
 */
public class NetworkFactory {

    public CellularNetwork getNetwork(String network) {
        return switch (network) {
            case "abc" -> new abcNetwork();
            case "pqr" -> new pqrNetwork();
            default -> throw new IllegalStateException("Unknown network: " + network);
        };
    }
}
