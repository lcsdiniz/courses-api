package com.diniz.crud_spring.exception;

public class RecordNotFoundException extends RuntimeException {
    public RecordNotFoundException(long id) {
        super("Registro não encontrado com o id: " + id);
    }
}
