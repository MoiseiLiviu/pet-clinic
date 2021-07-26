package com.edu.sfgpetclinic.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Pet {

    private PetType type;
    private Owner owner;
    private LocalDate birthDate;
}
