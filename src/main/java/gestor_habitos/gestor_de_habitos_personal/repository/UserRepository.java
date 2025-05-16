package gestor_habitos.gestor_de_habitos_personal.repository;

import gestor_habitos.gestor_de_habitos_personal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

//no necesitamos usar @Repository ya que al extender JPA Spring lo detecta solo mediante @SpringBootApplication
public interface UserRepository extends JpaRepository<User, Long> {
// Esto le dice a Spring: “yo quiero que tú me generes un repositorio para manejar entidades User con IDs tipo Long”.

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail (String email);

    boolean existsByUsername (String username);

    boolean existsByEmail (String email);


}
