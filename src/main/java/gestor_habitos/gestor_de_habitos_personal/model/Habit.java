package gestor_habitos.gestor_de_habitos_personal.model;

import gestor_habitos.gestor_de_habitos_personal.enums.TaskCategory;
import gestor_habitos.gestor_de_habitos_personal.enums.TaskFrecuency;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity //Asi Spring sabe que es una tabla de base de datos
@Table(name="Habitos")
public class Habit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameHabit; // nombre de la tarea

    private String description; // especificamente en qué consiste, medible para saber cuando hecha y cuando no

    @Enumerated(EnumType.STRING)
    private TaskCategory category; // Enum que define la categoria del habito

    @Enumerated(EnumType.STRING)
    private TaskFrecuency taskFrecuency; // enum para ver cada cuanto se repite

    private boolean isActive; // ¿Estamos traqueando ese habito?

    private LocalDate dateOfStart; // Primera vez registrado, habito comenzado a trackear

    private boolean taskFinished; // ¿Se ha completado hoy?

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User usuario; //el usuario al que está asociado este habito

    public Habit() {
    }

    public Habit(int id, String nameHabit, String description, TaskCategory category, TaskFrecuency taskFrecuency, boolean isActive, LocalDate dateOfStart, boolean taskFinished, User usuario) {
        this.id = id;
        this.nameHabit = nameHabit;
        this.description = description;
        this.category = category;
        this.taskFrecuency = taskFrecuency;
        this.isActive = isActive;
        this.dateOfStart = dateOfStart;
        this.taskFinished = taskFinished;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameHabit() {
        return nameHabit;
    }

    public void setNameHabit(String nameHabit) {
        this.nameHabit = nameHabit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskCategory getCategory() {
        return category;
    }

    public void setCategory(TaskCategory category) {
        this.category = category;
    }

    public TaskFrecuency getTaskFrecuency() {
        return taskFrecuency;
    }

    public void setTaskFrecuency(TaskFrecuency taskFrecuency) {
        this.taskFrecuency = taskFrecuency;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public boolean isTaskFinished() {
        return taskFinished;
    }

    public void setTaskFinished(boolean taskFinished) {
        this.taskFinished = taskFinished;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
}
