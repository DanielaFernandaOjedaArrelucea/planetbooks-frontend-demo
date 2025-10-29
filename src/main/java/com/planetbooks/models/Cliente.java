package com.planetbooks.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "clientes")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 2, max = 50)
    private String nombre;

    @NotBlank(message = "El apellido paterno es obligatorio")
    @Size(min = 2, max = 50)
    private String apellido_paterno;

    @NotBlank(message = "El apellido materno es obligatorio")
    @Size(min = 2, max = 50)
    private String apellido_materno;

    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "Correo no válido")
    private String correo;

    @NotBlank(message = "El usuario es obligatorio")
    @Size(min = 5, max = 50)
    private String usuario;

    @Min(value = 18, message = "Debe ser mayor de 18 años")
    private int edad;

    @NotBlank(message = "El país es obligatorio")
    private String pais;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

    private int compras;
    private int sesiones;
    private boolean activo = true;


    // ===== Getters y Setters =====

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido_paterno() { return apellido_paterno; }
    public void setApellido_paterno(String apellido_paterno) { this.apellido_paterno = apellido_paterno; }

    public String getApellido_materno() { return apellido_materno; }
    public void setApellido_materno(String apellido_materno) { this.apellido_materno = apellido_materno; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public LocalDate getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDate fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public int getCompras() { return compras; }
    public void setCompras(int compras) { this.compras = compras; }

    public int getSesiones() { return sesiones; }
    public void setSesiones(int sesiones) { this.sesiones = sesiones; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
}
