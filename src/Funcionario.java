public class Funcionario {
    int matricula;
    String nome;

    public Funcionario(){

    }

    public Funcionario(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return nome;
    }


}
