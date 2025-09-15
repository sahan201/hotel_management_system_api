package com.project_hotel.hotel_api.utils;

import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.SQLException;

@Service
public class ByteCodeHandler {
    public Blob stringToBlob(String data)throws SQLException {
        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
        //Converts the input string (data) into an array of bytes using UTF-8 encoding.
        return new SerialBlob(bytes);
        //Wraps those bytes into a Blob object (so it can be stored in the DB column type BLOB)
        //Returns a Blob that represents the string.
    }

    public String blobToString(Blob data) throws SQLException {
        int blobLength = (int) data.length();
        //Gets the size of the blob (number of bytes inside it)
        byte[] bytes = data.getBytes(1, blobLength);
        //Reads the bytes from the blob.
        return new String(bytes, StandardCharsets.UTF_8);
        //Converts those bytes back into a String using UTF-8 encoding.
    }
}
