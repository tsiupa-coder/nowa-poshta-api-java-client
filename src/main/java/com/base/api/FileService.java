package com.base.api;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FileService {

    public File print(String ref, File file, String api_key) throws IOException {

        String url = "https://my.novaposhta.ua/orders/printMarking85x85/orders[]/" + ref + "/type/pdf8/apiKey/" + api_key;
        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        }
        return file;
    }

    public File print(ArrayList<String> refs, File file, String api_key) throws IOException {

        String ref = refs.stream().collect(Collectors.joining(","));

        return print(ref, file, api_key);
    }
}
