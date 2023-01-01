package org.com.vc.factory;

public class pqrNetwork implements CellularNetwork{
    @Override
    public double getRate() {
        return 1.7*60;
    }
}
