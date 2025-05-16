package gestor_habitos.gestor_de_habitos_personal.repository;

import gestor_habitos.gestor_de_habitos_personal.enums.TaskCategory;
import gestor_habitos.gestor_de_habitos_personal.enums.TaskFrecuency;
import gestor_habitos.gestor_de_habitos_personal.model.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface HabitRepository extends JpaRepository<Habit, Long> {
   // Esto le dice a Spring: “yo quiero que tú me generes un repositorio para manejar entidades Habit con IDs tipo Long”.
    // Solo definimos metodos que NO vengan por defecto (guardar, borrar, findById, count, existById ya vienen)

    List<Habit> findByUsuario_Id(long id); // devuelve todos los habitos de un usuario.
                                            // Solo firma (lo que retorna + nombre + parametros)

    List<Habit> findByTaskCategory (TaskCategory taskCategory);

    List<Habit> findByTaskFrecuency (TaskFrecuency taskFrecuency);

    List<Habit> findByUsuario_IdAndDateOfStart(long usuarioId, LocalDate dateOfStart); // Tareas por usuario y frecuencia

}
