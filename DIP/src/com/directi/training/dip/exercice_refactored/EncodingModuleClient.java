package com.directi.training.dip.exercise;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule = new EncodingModule();

        // File-based encoding
        IDataReader fileReader = new FileDataReader(
                "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        IDataWriter fileWriter = new FileDataWriter(
                "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        encodingModule.encode(fileReader, fileWriter);

        // Network to database encoding
        try {
            IDataReader networkReader = new NetworkDataReader(
                    new URL("http", "myfirstappwith.appspot.com", "/index.html"));
            IDataWriter dbWriter = new DatabaseDataWriter(new MyDatabase());
            encodingModule.encode(networkReader, dbWriter);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
