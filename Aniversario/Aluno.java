public class Aluno extends Pessoa{
    private int Matricula;
    private String Curso;

    public Aluno(int Matricula, String Curso) {
        super("João Victor", 19, 1.72);
        this.Matricula = Matricula;
        this.Curso = Curso;
    }

    public int geMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setIdade(String Curso) {
        this.Curso = Curso;
    }

    public void exibirInformacoes() {
        System.out.println("nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Altura: " + super.getAltura());
        System.out.println("Matricula: " + Matricula);
        System.out.println("Curso: " + Curso);
    }

}