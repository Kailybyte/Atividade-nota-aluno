package TESTE2024.TESTE.Service;

import TESTE2024.TESTE.Entity.Professor;
import TESTE2024.TESTE.Repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired // Para ele colocar as dependecias da classe de baixo
    private ProfessorRepository professorRepository;

    public String save (Professor professor){
        this.professorRepository.save(professor);
        return "Professor Cadastrado";
    }

    public String update (Professor professor , Long id){
        professor.setId(id);
        this.professorRepository.save(professor);
        return "Professor Atualizado com sucesso";
    }

    public List<Professor> findAll() {
        return this.professorRepository.findAll();

    }

    public String delete (long id){
        this.professorRepository.deleteById(id);
        return "Deletado com sucesso!!";
    }
}

