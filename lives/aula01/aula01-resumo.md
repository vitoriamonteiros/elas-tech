# 💚 Elas+Tech | Java: Mentoria Aula 01 -  Anotações

- Herança precisa fazer **sentido**, mas generica.
- Usa a palavra **extends** para fazer herança.
- Para **implementar interface**, usa-se **implements**.
- Pode implementar **mais de uma interface**, separando por vírgula `,`.
- Pode **estender apenas uma classe**, mas **implementar várias interfaces**.

💡 *Dica:* Interfaces servem para definir **comportamentos** que as classes devem cumprir (ex: `Comparable`, `Serializable`, etc).

---
## ⚙️ Atalhos úteis (IntelliJ IDEA)

| Ação | Atalho |
|------|---------|
| Imprimir no console | `sout` → `System.out.println();` |
| Imprimir variável | `soutv` → `System.out.println("var = " + var);` |
| Criar método main | `psvm` → `public static void main(String[] args) {}` |
| Criar loop for | `fori` → `for (int i = 0; i < ; i++) {}` |
| Iterar lista | `iter` → `for (String item : list) {}` |
| Verificar nulo | `ifn` → `if (obj == null) {}` |
| Verificar não nulo | `inn` → `if (obj != null) {}` |

- **Ctrl + N** → Buscar classes
- **Ctrl + Shift + N** → Buscar arquivos
- **Ctrl + Alt + L** → Reformatar código
- **Ctrl + /** → Comentar/descomentar linha
- **Ctrl + Shift + /** → Comentar/descomentar bloco
- **Ctrl + Alt + V** → Extrair variável
- **Ctrl + Alt + F** → Extrair campo
- **Ctrl + Alt + M** → Extrair método

---
## ➡️ Expressão Lambda
> Usada para representar funções de forma mais curta e direta.  
> Exemplo básico:

```java
list.forEach(item -> System.out.println(item));
```
> 💡 Em palavras simples:
Em vez de criar um for inteiro, você usa -> para dizer o que quer fazer com cada item.
---

## Switch-case

### switch-case Java (versões antigas)

```java
switch (opcao){
    case 1:
        System.out.println("Tarefa cadastrada com sucesso");
        break;
    case 2:
        System.out.println("Tarefa buscada com sucesso");
        break;
    case 3:
        System.out.println("Tarefa remover com sucesso");
        break;

    default:
        System.out.println("Opção inválida");
}
```


### switch expression | switch-case Java (versões mais recentes)

```java
switch (opcao) {
    case 1 -> System.out.println("Tarefa cadastrada com sucesso");
    case 2 -> System.out.println("Tarefa buscada com sucesso");
    case 3 -> System.out.println("Tarefa remover com sucesso");
    case 4 -> System.out.println("Tarefa remover com sucesso");
    case 5 -> System.out.println("Tarefa remover com sucesso");
    default -> System.out.println("Opção inválida");
}
```
> 💡 Dica: **->** deixa o código mais limpo e não precisa de break.
---

## 📚 Indicações de Livros

- **Java: Guia do Programador** — Peter Jandl Jr.
- **Programação Orientada a Objetos: Conceitos e Técnicas** — Ricardo de Oliveira Anido
- **Clean Code** — Robert C. Martin 

---

## 📬 Quer falar comigo?

Estou sempre aberta a **novas conexões**, **trocas de conhecimento** e **oportunidades** na área de tecnologia.  
Vamos nos conectar pelo LinkedIn! 💬


<p align="center">

  <a href="https://www.linkedin.com/in/vitoriamonteiros" target="_blank">
    <img src="https://img.shields.io/badge/LinkedIn-Vitória%20Monteiro-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"/>
  </a><br><br>
  Feito com 💜 por <strong>Vitória Monteiro</strong> 
</p>