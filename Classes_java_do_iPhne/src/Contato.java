public class Contato {
	String nome;
	String numero;
	
	interface "Aparelho Telefônico" as AparelhoTelefonico{ 
		  Contato[] contatos;
		  Boolean redeMovelDisponivel();
		  ligar(); void 
		  atender(); void
		  iniciarCorreioVoz(); void
	}	  
	interface "Navegador de Internet" as NavegadorInternet {
			  Boolean ConexaoComInternet();
			  exibirPagina(); void
			  adicionarNovaAba(); void
			  atualizarPagina(); void
	};		  
			  entity "IPhone" as IPhone {}

				entity "FireFox" as FireFox {}
				entity "Chrome" as Chrome {}

				entity "Nokia 3310" as Nokia3310 {}
				entity "Motorola Razr V3" as MotorolaRazrV3 {}

				entity "Walkman" as Walkman {}
				entity "Discman" as Discman {}

				IPhone --> AparelhoTelefonico
				IPhone --> NavegadorInternet
				IPhone --> ReprodutorMusical
				ReprodutorMusical --o Musica
				AparelhoTelefonico <-- Nokia3310
				AparelhoTelefonico <-- MotorolaRazrV3
				AparelhoTelefonico --o Contato

				ReprodutorMusical <-- Walkman
				ReprodutorMusical <-- Discman

				NavegadorInternet <-- FireFox
				NavegadorInternet <-- Chrome

				@enduml
		  
}
