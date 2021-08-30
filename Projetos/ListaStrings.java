import java.util.LinkedList;
import javax.swing.JOptionPane;
public class Hugo{
    LinkedList<String> alunos = new LinkedList<String>();
    
    public static void main(String[] args){
        Hugo a = new Hugo();
        a.addAlunos();
        a.procura(JOptionPane.showInputDialog("Qual aluno deseja encontrar?", a.alunos));
    }
    public void addAlunos(){
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos você quer cadastrar?"));
        for(int i = 1;i<=quantidade;i++){
            alunos.add(JOptionPane.showInputDialog("Digite o nome do "+i+"° aluno!"));
        }
        public void listar(){
            String mensagem = "Alinos\n\n";
            for(String s:alunos){
                mensagem += s+"\n";
            }
            JOptionPane.showMessageDialog(null, mensagem);
        }
        public void procura(String aluno, LinkedList<String> alunos){
            String mensagem = aluno+" não foi encontrada!";
            for(String s:alunos){
                if(s.equals(alunos)){
                    mensagem = aluno+" foi encontrado!";
                }
            }
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }

