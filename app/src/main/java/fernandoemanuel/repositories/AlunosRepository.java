package fernandoemanuel.repositories;

import org.springframework.data.repository.CrudRepository;

import fernandoemanuel.models.Aluno;

public interface AlunosRepository extends CrudRepository<Aluno, Integer> {
    
}