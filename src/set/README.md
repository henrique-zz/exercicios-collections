# SET
## É uma estrutura que não admite elementos repetidos e estes são adicionados de forma aleatória;
## Usado para representar conjuntos (como o conjunto dos números pares por exemplo);
## Temos o HashSet que é mais utilizado, mas também temos o TreeSet que é usado quando queremos ordenar;
### Exemplo: se temos um Set<String>, e definirmos como um TreeSet ele automaticamente irá ordenar pela ordem alfabética;
### Mas caso nosso parâmetro seja um objeto criado por nós, teremos que usar as interfaces Comparable ou Comparator para definir como queremos que nosso Set seja ordenado;
### Também teremos que implementar os métodos equals() e hashCode() para dizer qual atributo de nosso objeto será usado para definir que uma variável é igual;
#### Por exemplo: Produto (String nome, int codigo), mas queremos que seja permitido ter dois nomes iguais mas não dois códigos iguais, usamos o equals() apontando para o código;
### Porém isso não precisa ser feito se for por exemplo Set<Integer>, automaticamente será removido os iguais.
