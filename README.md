# Design Patterns

Este Projeto mostra uma ideia básica sobre Design Patterns iniciando com sua origem, sua avaliação ao longo do tempo e
suas classificações. Os padrões de design representam as melhores práticas usadas por experientes orientados a objetos
desenvolvedores de software. Os padrões de design são soluções para problemas gerais que os desenvolvedores de software
enfrentados durante o desenvolvimento de software. Essas soluções foram obtidas por tentativa e erro por vários
desenvolvedores de software ao longo de um período de tempo considerável.

## Gangue dos Quatro (GOF)

Em 1994, quatro autores Erich Gamma, Richard Helm; Ralph Johnson e John Vlissides publicado um livro intitulado Design
Patterns - Elements of Reusable Object-Oriented Software que iniciou o conceito de Design Pattern no desenvolvimento de
software. Esses autores são conhecidos coletivamente como Gang of Four (GOF). De acordo com o design desses autores os
padrões baseiam-se principalmente nos seguintes princípios de design orientado a objetos.

### Uso do Design Pattern

Os Design Patterns têm dois usos principais no desenvolvimento de software.

- Programar para uma interface, não uma implementação
- Favorecer a composição do objeto ao invés da herança

Os padrões de design fornecem uma terminologia padrão e são específicos para um cenário particular. Para exemplo, um
padrão de design singleton significa o uso de um único objeto para que todos os desenvolvedores familiarizados com o
padrão de design único fará uso de um único objeto e eles podem dizer um ao outro que o programa é seguindo um padrão
singleton.

### Melhores Práticas

Os padrões de design evoluíram ao longo de um longo período de tempo e fornecem as melhores soluções para certos
problemas enfrentados durante o desenvolvimento de software. Aprender esses padrões ajuda desenvolvedores sem
experiência a aprender design de software de maneira fácil e rápida.

### Tipos de Design Pattern

De acordo com o livro de referência de padrões de projeto Padrões de Projeto - Elementos de Software Orientado a Objetos
Reutilizáveis, existem 23 padrões de projeto. Esses padrões podem ser classificados em três categorias: padrões
criacionais, estruturais e comportamentais.

- #### Padrões de Criação

  Esses padrões de design fornecem uma maneira de criar objetos enquanto esconde a lógica de criação, em vez de
  instanciar objetos diretamente usando o novo operador. Isso dá ao programa mais flexibilidade para decidir quais
  objetos precisam ser criados para um determinado caso de uso.


- #### Padrões Estruturais

  Esses padrões de projeto dizem respeito à composição de classes e objetos. O conceito de herança é usado para compor
  interfaces e definir formas de compor objetos para obter novos funcionalidades.


- #### Padrões Comportamentais

  Esses padrões de design estão especificamente preocupados com a comunicação entre objetos.

- #### Links Exemplos

- [Factory Pattern](src/org/framework/rodolfo/freire/git/design/patterns/factory/doc/README.md)
- [Abstract Factory Pattern](src/org/framework/rodolfo/freire/git/design/patterns/abstractfactory/doc/README.md)