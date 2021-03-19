import java.util.Locale;
import java.util.Scanner;


public class CadastroAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        scan.useLocale(Locale.US);
        Aluno aluno = new Aluno();
        double somaNotas = 0;
        
        System.out.println("## CADASTRO DE NOTAS DOS ALUNOS ##");
		System.out.println();

        System.out.print("Digite o nome do Aluno: ");
        aluno.nome = scan.nextLine();

        System.out.print("Digite a matrícula de " + "[ "+aluno.nome+" ]" + ": ");
        aluno.matricula = scan.next();

        for(int i = 0; i < aluno.notas.length; i++){
            System.out.println("Digite a " + (i+1)+"ª" + " nota: ");
            aluno.notas[i] = scan.nextDouble();

            somaNotas += aluno.notas[i];
        }

        double media = somaNotas / 2;
        System.out.println("============================");
        
        System.out.println("Matrícula: " + aluno.matricula);
        System.out.println("Nome do Aluno: " + aluno.nome);

        System.out.println();
        for (int i = 0; i < aluno.notas.length; i++) {
            System.out.println((i+1)+"ª nota: " + aluno.notas[i]);
        }

        System.out.println();
        System.out.println("Média: " + media);

        System.out.println();

        if (media > 9 & media <= 10){
            System.out.println("Conceito: [ A ]");
        }else if(media > 8 & media <= 9){
            System.out.println("Conceito: [ B ]");
        }else if(media >= 7 & media <= 8){
            System.out.println("Conceito: [ C ]");
        }else{
            System.out.println("Conceito: [ D ]");
        }

        scan.close();
       
    }
}