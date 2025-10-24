package com.directi.training.dip.exercise;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {

    public void encode(IDataReader reader, IDataWriter writer) throws IOException {
        String input = reader.read();
        String encoded = Base64.getEncoder().encodeToString(input.getBytes());
        writer.write(encoded);
    }
}
