import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno[] a = new Aluno[2];
        a[0] = new Aluno();
        a[0].SetNome("Gustavo");
        a[0].SetIdade(19);
        a[0].SetCurso("ENG-Software");
        a[0].SetCpf("11223344556");

        a[1] = new Aluno();
        a[1].SetNome("Echelly");
        a[1].SetIdade(17);
        a[1].SetCurso("Ensino-Médio");
        int opcao;
        int idaluno;
        System.out.println("Digite o ID do aluno (" + a.length + ")" );
        idaluno = teclado.nextInt() -1;
        if (idaluno < 0 || idaluno >= a.length) {
            System.out.println("Aluno não encontrado");
            return;
        }
        System.out.println("-------Selecione  a opção que deseja exibir-------");
        System.out.println("1 - Exibir todos os Dados ");
        System.out.println("2 - Exibir apenas o nome ");
        System.out.println("3 - Exibir apenas o idade ");
        System.out.println("4 - Exibir apenas o curso ");
        System.out.println("5 - Exibir apenas o cpf ");
        System.out.println("---------------------------------------------------");
        opcao = teclado.nextInt();
        switch (opcao) {
            case 1:
                a[idaluno].exibirDados();
               break;
            case 2:
                a[idaluno].exibirNome();
                break;
            case 3:
                a[idaluno].exibirIdade();
                break;
            case 4:
                a[idaluno].exibirCurso();
                break;
            case 5:
                a[idaluno].exibirCPF();
               break;
        }
        teclado.close();
    }
}
