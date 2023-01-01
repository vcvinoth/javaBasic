package org.com.vc.factory;

public class abcNetwork implements CellularNetwork {
    @Override
    public double getRate() {
        return 1.5 * 60;
    }
}
