package gestor_habitos.gestor_de_habitos_personal.service;

public interface IHabitService {

    public void crearHabit();
    public List<Habit>listarHabits();
    public Habit obtenerHabitPorId(String idHabit);
    public boolean actualizarHabit(Habit oldHabit, Habit newHabit);
    public boolean eliminarHabit(Strin idHabit);

}
