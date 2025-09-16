package com.cassiano.qrcode.generator.ports;

public interface StoragePort {

    String uploadFiles(byte[] fileData, String fileName, String contentType);
}
