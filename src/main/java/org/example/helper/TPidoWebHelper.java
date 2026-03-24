package org.example.helper;

public class TPidoWebHelper {
    public static void pausar() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
