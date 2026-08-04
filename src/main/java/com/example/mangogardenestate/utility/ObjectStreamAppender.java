package com.example.mangogardenestate.utility;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectStreamAppender extends ObjectOutputStream {
    public ObjectStreamAppender(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}
