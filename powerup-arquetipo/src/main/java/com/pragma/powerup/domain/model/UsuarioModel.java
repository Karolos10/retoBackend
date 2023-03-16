package com.pragma.powerup.domain.model;


import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel {

    private Long id;

    private String nombre;

    private String apellido;

    private Long cedula;

    private String celular;

    private String correo;

    private String clave;

    private RoleModel rol;


//    public UsuarioModel(Long id, String nombre, String apellido, String cedula, Long celular, String correo, String clave, Long idRol) {
//        this.id = id;
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.cedula = cedula;
//        this.celular = celular;
//        this.correo = correo;
//        this.clave = clave;
//        this.idRol = idRol;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getApellido() {
//        return apellido;
//    }
//
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }
//
//    public String getCedula() {
//        return cedula;
//    }
//
//    public void setCedula(String cedula) {
//        this.cedula = cedula;
//    }
//
//    public Long getCelular() {
//        return celular;
//    }
//
//    public void setCelular(Long celular) {
//        this.celular = celular;
//    }
//
//    public String getCorreo() {
//        return correo;
//    }
//
//    public void setCorreo(String correo) {
//        this.correo = correo;
//    }
//
//    public String getClave() {
//        return clave;
//    }
//
//    public void setClave(String clave) {
//        this.clave = clave;
//    }
//
//    public Long getIdRol() {
//        return idRol;
//    }
//
//    public void setIdRol(Long idRol) {
//        this.idRol = idRol;
//    }
}
