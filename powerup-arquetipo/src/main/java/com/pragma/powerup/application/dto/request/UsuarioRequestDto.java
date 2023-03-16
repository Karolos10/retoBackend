package com.pragma.powerup.application.dto.request;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
public class UsuarioRequestDto {

    private String nombre;

    private String apellido;

    private Long cedula;

    private String celular;

    @Email(message = "El correo es invalido")
    private String correo;

    private String clave;

    private Long roleId;
}
