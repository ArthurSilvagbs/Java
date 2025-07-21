# Semana 2 — Fundamentos em Java

Esta pasta reúne os exercícios desenvolvidos durante a segunda semana estudando **Java**, com foco em:

- Estruturas condicionais (if / else / switch)
- Laços de repetição (while / do-while / for)
- Projetos simples com menus, validações e fluxos interativos

> Todos os programas utilizam a biblioteca `java.util.Scanner` para entrada de dados via terminal, com lógica aplicada em contextos reais.

---

## Organização dos exercícios

| Categoria       | Descrição                                                   |
|----------------|-------------------------------------------------------------|
| `Condicionais`  | Programas com validações e fluxos baseados em decisões     |
| `Repeticao`     | Exercícios com loops controlados por condição ou contador  |
| `Projetos`      | Simulações e pequenos sistemas aplicando lógica composta   |

---

## Exercícios incluídos

### 1 - `Condicionais`
- `ValidacaoDeSenha.java` → Verifica se a senha informada é válida  
- `SenhaComTentativasLimitadas.java` → Permite número limitado de tentativas de senha  
- `ConfirmaçãoDeSaida.java` → Confirma se o usuário deseja continuar ou sair  
- `CalculoDeNotas.java` → Calcula média de notas e exibe situação do aluno  
- `MenuDataMensagem.java` → Exibe mensagem personalizada com base no dia informado  

---

### 2 - `Repeticao`
- `ContadorDeNumero.java` → Contagem simples até número fixo  
- `ContadorDe1aN.java` → Conta de 1 até o número que o usuário informar  
- `SomandoAteDigitar0.java` → Soma números até o usuário digitar 0  
- `CadastroDePessoaFaixaEteria.java` → Cadastra pessoas e exibe faixas etárias  

---

### 3 - `Projetos`
- `CalculadoraInterativa.java` → Calculadora com loop e opção de continuar operando  
- `CaixaDeCompras.java` → Simula caixa simples com soma de produtos  
- `CaixaDeSuperMercado.java` → Caixa com entrada de produtos e menu de controle  
- `AvaliacaoAlunosBonusControleDeTurma.java` → Calcula média com bônus, aprovações e controle de turma

---

## Como executar

Todos os arquivos podem ser compilados e executados via terminal:

```bash
# Exemplo:
javac CaixaDeCompras.java
java CaixaDeCompras
