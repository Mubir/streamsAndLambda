package oops.mubir.defaultfuninterface;

import java.util.function.Supplier;

public class SupplierIOI {
    public Supplier<String> supplier;

    SupplierIOI(Supplier<String> supplier) {
        this.supplier = supplier;
    }

    public static void main(String[] args) {
        SupplierIOI obj = new SupplierIOI(
                () -> "still think ur useless supplier "
                        + System.currentTimeMillis());

        System.out.println(obj.supplier.get());
    }
}
