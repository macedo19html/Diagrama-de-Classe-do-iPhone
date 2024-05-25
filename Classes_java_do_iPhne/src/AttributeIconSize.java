@startuml
title Orientação a Objetos e UML: diagramação de Classes do iPhone

skinparam class AttributeIconSize 0 
interface "Reprodutor Musical" as ReprodutorMusical{
		Musica[] musicas;
		tocar(); void
		pausar(); void
		selecionarMusica(); void
}
