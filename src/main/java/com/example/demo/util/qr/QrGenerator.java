package com.example.demo.util.qr;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import javafx.scene.control.Alert;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QrGenerator {

    private String path;
    public String getPath() {
        return path;
    }

    public void getGenerator(String data) throws IOException, WriterException {

        path = "/Users/sameeramadushan/Desktop/" + data + ".png";
        BitMatrix encode = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 200, 200);
        Path path1 = Paths.get(path);
        MatrixToImageWriter.writeToPath(encode, path.substring(path.lastIndexOf('.') + 1), path1);
        new Alert(Alert.AlertType.INFORMATION,data+": QR Successfully Generated").show();

    }
}