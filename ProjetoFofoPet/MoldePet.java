package ProjetoFofoPet;

public class MoldePet {

	String fofoPet;
    int idade;
    String ma;
    String endere�o;
    String porte;
    boolean aceitaOutroPet;
    
      
    public void restri��o () {
    	if (aceitaOutroPet == false) {
    		System.out.println("Esse(a) FofoPet exige ser filho(a) �nico(a)!!!");
    	}else{
    			System.out.println("Amo tudo e todos(as)!!!");
    	}
    }
    public void status() {
    	System.out.println("Tudo que voc� precisa saber sobre os FofoPets!\n");
    	System.out.println("Nome: " + this.fofoPet);
    	System.out.println("Idade: " + this.idade + this.ma);
    	System.out.println("Endere�o: " + this.endere�o);
    	System.out.println("Porte: " + this.porte);
    	System.out.println("Aceita outros pets? " + this.aceitaOutroPet);
    }
}




