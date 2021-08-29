package com.kiyotakeshi.FactoryMethod3.pc;

import com.kiyotakeshi.FactoryMethod3.factory.Factory;
import com.kiyotakeshi.FactoryMethod3.factory.Product;
import com.sun.glass.ui.Clipboard;

import java.util.ArrayList;
import java.util.List;

// Concrete Creator
// クラス名に Factory をつけることで、 PC を直接 new せず、こちらを使うよう第三者に伝える
public class PcFactory extends Factory {

    private List<String> serialNumberList = new ArrayList<>();

    @Override
    protected Product createProduct(String serialNumber) {
        return new Pc(serialNumber);
    }

    @Override
    protected void registerProduct(Product product) {
        this.serialNumberList.add(((Pc) product).getSerialNumber());
    }

    public List<String> getSerialNumberList() {
        return serialNumberList;
    }
}
