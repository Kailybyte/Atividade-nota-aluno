package TESTE2024.TESTE.Service;

import TESTE2024.TESTE.Entity.Aluno;
import TESTE2024.TESTE.Entity.Professor;
import TESTE2024.TESTE.Repository.AlunoRepository;
import TESTE2024.TESTE.Repository.ProfessorRepository;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AlunoService {
    @Autowired // Para ele colocar as dependecias da classe de baixo
    private AlunoRepository alunoRepository;

    public String save (Aluno aluno) {
        this.alunoRepository.save(aluno);
        return "Aluno Cadastrado";
    }

    public String update (Aluno aluno , Long id){
        aluno.setId(id);
        this.alunoRepository.save(aluno);
        return "Aluno Atualizado com sucesso";
    }

    public List<Aluno> findAll() {
        return this.alunoRepository.findAll();

    }

    public String delete (long id){
        this.alunoRepository.deleteById(id);
        return "Deletado com sucesso!!";
    }
}
