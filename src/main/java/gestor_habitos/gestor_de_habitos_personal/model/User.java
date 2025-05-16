package gestor_habitos.gestor_de_habitos_personal.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="Usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameUser; //

    private String email; // para identificarlo

    private String password; // para validar la autenticacion si añadimos

    private LocalDate fechaRegistro; // cuando se registró

    @OneToMany (mappedBy = "usuario")
    private List<Habit> listaHabitosUsuario; // el conjunto de habitos de este usuario

}
