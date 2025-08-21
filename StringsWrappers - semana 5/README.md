# StringWrappers — Strings, StringBuilder e Wrappers

Nesta etapa do estudo em Java, o foco foi o domínio das **classes utilitárias da linguagem**:  
- **Strings** e **StringBuilder** para manipulação, normalização, construção e inversão de textos.  
- **Wrappers** para trabalhar com valores primitivos em formato de objetos, explorando parsing, conversão, autoboxing/unboxing e boas práticas.

Todos os exercícios foram desenvolvidos com **entrada via terminal (Scanner)**, priorizando a prática de métodos já vistos e o uso correto das APIs da linguagem.

---

## Organização dos exercícios

| Categoria                | Descrição                                                                 |
|---------------------------|---------------------------------------------------------------------------|
| `String-e-StringBuilders` | Manipulação de textos, contagem de caracteres, normalização e uso de `StringBuilder` |
| `Wrappers`                | Conversão entre tipos primitivos e objetos, parsing de `String`, autoboxing/unboxing |

---

## Exercícios incluídos

### `String-e-StringBuilders`
- `ContadorDeCaracteres.java` → Conta e exibe a quantidade de caracteres em uma frase  
- `ExtratorDeSobrenome.java` → Extrai e mostra apenas o último sobrenome de um nome completo  
- `NormalizadorDeTexto.java` → Normaliza textos removendo espaços extras e ajustando caixa (maiúscula/minúscula)  
- `ReversorDePalavra.java` → Inverte uma palavra utilizando `StringBuilder.reverse()`  
- `ConstrutorDeFrase.java` → Constrói frases dinamicamente com `StringBuilder.append()`  

---

### `Wrappers`
- `BooleanChecker.java` → Conversão de `String` para boolean, checagens e exibição de valores com `Boolean`  
- `CalculadoraDePreco.java` → Uso de `Double`/`Integer` wrappers em cálculos de preço e formatações  
- `ConversorNumeroParaString.java` → Conversão de números para `String` com `String.valueOf` e `toString()`  
- `ConversorStringParaNumero.java` → Conversão de `String` para inteiros e decimais com `parseInt` e `parseDouble`  
- `DemonstraBoxing.java` → Demonstração de autoboxing e unboxing com `Integer`, além de comparação `==` vs `.equals`  

---

## Como executar os programas

Todos os arquivos podem ser compilados e executados via terminal com `javac` e `java`:

```bash
javac NomeDoArquivo.java
java NomeDoArquivo
