package Objetos;

public class TesteInterface 
{

	public static void main(String[] args) 
	{

	ParticipanteForum participante= new ParticipanteForum();
	Leitor leitor = participante;
	System.out.println("O participante está lendo: "+leitor.lendo());
	Programador dev = participante;
	String java = "JAVA";
	dev.pensando(java.toCharArray());
	System.out.println("E programando : "+dev.digitando());
	
	
	}

}
