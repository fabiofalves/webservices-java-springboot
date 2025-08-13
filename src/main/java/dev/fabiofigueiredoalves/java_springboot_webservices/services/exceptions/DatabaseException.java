package dev.fabiofigueiredoalves.java_springboot_webservices.services.exceptions;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String message) {
        super(message);
    }
}
