public class MyClass {
    public static void main(String args[]) {
  
  //Variavel que indica se o aluno possui a vacinação em dia que vira do banco de dados da universidade
  
  boolean primeira_dose = false;
  boolean segunda_dose = true;
  //Verificação para ver se o aluno atende aos requisitos de entrada na universidade 
  
  if (primeira_dose == true && segunda_dose ==true )
  {
     System.out.println("Você esta apto para retomada as aulas presenciais");
  }else{
     System.out.println("Você não esta apto para retomada as aulas presenciais");
  }
  
    }
}