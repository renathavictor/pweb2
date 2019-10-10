package br.edu.ifpb.pweb2.carrinho.model;

import java.util.Arrays;
import java.util.List;

/** Define um cat�logo on-line da livraria.
 * Num sistema real essa classe seria substituida por um SGBD.
 * @author Fred
 *
 */

public class Catalogo {

  private static Item[] itens =
    { new Item("hall001",
               "Core Servlets and JavaServer Pages " +
                 " de Marty Hall",
               "A referência definitiva sobre servlets " +
                 "e JSP da Prentice Hall e \n" +
                 "Sun Microsystems Press. A primeira edição " +
                 "está disponível em www.coreservlets.com.",
               210.00),
      new Item("kassem001",
               "Designing Enterprise Applications with JEE " +
                 "de Nicholas Kassem",
               "Aborda as principais tecnologias para  " +
                 "o desenvolvimento de aplicações em JEE. " +
                 "Está disponível integralmente no site da Sun na " +
                 "seção Java Blue Prints.",
               100.00),
      new Item("britt001",
               "Tomcat. The Definitive Guide by Jason Brittain",
               "Guia vital para o administrador e programador " +
                 "que utilizam o Jakarta Tomcat.",
               19.95),
      new Item("alur001",
               "JEE Patterns de Deepak Alur e outros",
               "Os autores definem um conjunto de padrões " +
                 "para a plataforma JEE. " +
                 "Ideal para quem já programa em JEE " +
                 "e deseja melhorar a flexibilidade, " +
                 "a reutilização e a organização estrutural " +
                 "de suas aplicações. Livro imprescindível para " +
                 "programadores mais avançados.", 
               95.00),
      new Item("geary001",
               "JSP Avançado de " +
                 "David Geary",
               "Livro trás dicas excelentes para programadores JSP. " +
                 "As dicas são muito práticas e realmente úteis. " +
                 "A versão traduzida é uma droga! ",
               75.00)
    };

  public static Item getItem(String itemID) {
    Item item;
    if (itemID == null) {
      return(null);
    }
    for(int i=0; i<itens.length; i++) {
      item = itens[i];
      if (itemID.equals(item.getId())) {
        return(item);
      }
    }
    return(null);
  }
  
  public static List<Item> getItens() {
	  return Arrays.asList(itens);	  
  }
}
               
