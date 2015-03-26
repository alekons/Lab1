package by.vsu.epamTur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Console {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    public String readString() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            return null;
        }
    }

    public int readInteger() throws NumberFormatException {
        return Integer.parseInt(readString());
    }    
}