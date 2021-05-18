package co.com.web.app.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Usuario {

    private String nombre;
    private String apellido;
    private String email;

}
