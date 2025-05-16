package gestor_habitos.gestor_de_habitos_personal.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="Usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username; //

    private String email; // para identificarlo

    private String password; // para validar la autenticacion si añadimos

    private LocalDate fechaRegistro; // cuando se registró

    @OneToMany (mappedBy = "usuario")
    private List<Habit> listaHabitosUsuario; // el conjunto de habitos de este usuario

    public User() {
    }

    public User(long id, String username, String email, String password, LocalDate fechaRegistro, List<Habit> listaHabitosUsuario) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.fechaRegistro = fechaRegistro;
        this.listaHabitosUsuario = listaHabitosUsuario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public List<Habit> getListaHabitosUsuario() {
        return listaHabitosUsuario;
    }

    public void setListaHabitosUsuario(List<Habit> listaHabitosUsuario) {
        this.listaHabitosUsuario = listaHabitosUsuario;
    }
}
