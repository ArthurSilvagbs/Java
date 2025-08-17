# Semana 4 — Métodos e Modularização

Nesta semana, o foco foi o domínio de **métodos em Java**: criação, parâmetros, retorno, sobrecarga e modularização de responsabilidades.  
A prática também incluiu formatação de saídas, métodos booleanos, validação de entradas e, por fim, simulações mais completas que integram todos os conceitos.

Todos os exercícios foram desenvolvidos com **entrada via terminal (Scanner)**, priorizando **modularização** e **boas práticas de programação**.

---

## Organização dos exercícios

| Categoria                     | Descrição                                                                 |
|-------------------------------|---------------------------------------------------------------------------|
| `Introducao-Metodos`          | Primeiros contatos com criação e chamada de métodos (`void` e com retorno) |
| `Parametros-e-Retorno`        | Métodos com parâmetros, cálculos e retorno de valores                     |
| `Sobrecarga-Overload`         | Demonstração de **overloading**: mesmo método, assinaturas diferentes     |
| `Escopo-e-Modularizacao`      | Separação de responsabilidades, métodos utilitários e organização de código |
| `Formatacao-e-Relatorios`     | Geração de saídas padronizadas e relatórios formatados                    |
| `Metodos-Booleanos-e-Validacao` | Métodos booleanos, verificações e validações de entrada                 |
| `Simulacoes-Praticas`         | Projetos completos simulando rotinas reais, integrando múltiplos conceitos |

---

## Exercícios incluídos

### `Introducao-Metodos`
- `SaudacoesPersonalizadas.java` → Método simples com parâmetro (saudação personalizada)  
- `SaudacaoPorHorario.java` → Saudações diferentes conforme horário informado  
- `DiasVividos.java` → Cálculo de dias vividos a partir da idade  

---

### `Parametros-e-Retorno`
- `ValorAbsoluto.java` → Retorno de valor absoluto de um número  
- `MediaAritimetica.java` → Cálculo de média aritmética entre números  
- `PrecoFinal.java` → Cálculo de preço final com desconto e imposto (modelo montante)  

---

### `Sobrecarga-Overload`
- `SomaSubtracao.java` → Demonstra operações básicas com sobrecarga de métodos  
- `SomaComSobrecarga.java` *(renomeado de `teste.java`)* → Exemplos diretos de sobrecarga com assinaturas diferentes  

---

### `Escopo-e-Modularizacao`
- `NotasComMetodos.java` → Cálculo de notas com métodos separados (entrada, processamento e saída)  
- `PuzzleMolduraComEspaco.java` → Exercício de lógica e modularização (validação e impressão)  

---

### `Formatacao-e-Relatorios`
- `TabuadaFormatada.java` → Impressão de tabuada formatada com espaçamento padronizado  

---

### `Metodos-Booleanos-e-Validacao`
- `VerificarDivisibilidadePor3Ou5.java` → Método booleano para checar divisibilidade  
- `ConversorDeTemperatura.java` → Conversão entre Celsius e Fahrenheit com métodos  

---

### `Simulacoes-Praticas`
- `OrcamentoDeEventoComunitario.java` → Orçamento com itens, impostos e relatório final formatado  

---

## Como executar os programas

Todos os arquivos podem ser compilados e executados via terminal com `javac` e `java`:

```bash
javac NomeDoArquivo.java
java NomeDoArquivo

