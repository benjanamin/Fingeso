package com.fingeso.proyecto.models;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import org.springframework.data.annotation.Id;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class CodigoQR {
    @Id
    private int id;
    private String codigoQR;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoQR() {
        return codigoQR;
    }

    public void setCodigoQR(String codigoQR) {
        this.codigoQR = codigoQR;
    }

    public void generarCodigo(String texto){
        try {
            File file = new File("qrcode.png");
            ByteArrayOutputStream out = QRCode.from(texto).to(ImageType.PNG).stream();
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(out.toByteArray());
            fos.close();
            System.out.println("exitoo");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
