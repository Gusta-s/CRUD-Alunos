
public class Aluno {
  private String Cadastropssoafisica;
  private String Nome;
  private int Idade;
  private String Curso;

void SetCpf(String atribuirCpf){
   this.Cadastropssoafisica = atribuirCpf;
}
void SetNome(String atribuirNome){
   this.Nome = atribuirNome;
}
void SetIdade(int atribuirIdade){
   Idade = atribuirIdade;
   if (Idade < 5 || Idade > 19) {
      System.err.println("Idade fora dos parametros estabelecidos");
   }
}
void SetCurso(String atribuirCurso){
   this.Curso = atribuirCurso;
}
void exibirDados(){
      System.out.println("-----------Dados do aluno---------- ");
      System.out.println("Nome: " +Nome  + "\nIdade: " + Idade + "\nCurso: " +Curso + "\nCPF: " + Cadastropssoafisica + "\n-----------------------------------");
   }
   void exibirNome(){
      System.out.println("Nome do Aluno: " + Nome);
   }
   void exibirIdade(){
      System.out.println("Idade do Aluno: " + Idade);
   }
   void exibirCurso(){
      System.out.println("Curso do Aluno: " + Curso);
   }
   void exibirCPF(){
      System.out.println("CPF do Aluno: " + Cadastropssoafisica);
   }
}