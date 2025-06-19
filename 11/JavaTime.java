//Manipulação de datas com java.time Qual será a data impressa?

LocalDate hoje = LocalDate.of(2025, 6, 9);
LocalDate prazo = hoje.plusDays(10);
System.out.println(prazo);



// hoje é 2025-06-09 (9 de junho de 2025).
// prazo adiciona 10 dias a hoje.
// 9 de junho + 10 dias = 19 de junho de 2025.

//Respuesta Da Terminal: 2025-06-19