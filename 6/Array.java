ArrayList<String> horarios = new ArrayList<>();
horarios.add("08:00");   // índice 0
horarios.add("10:00");   // índice 1
horarios.add("12:00");   // índice 2
horarios.remove(1);      // remove o valor do índice 1 → "10:00"
horarios.add("14:00");   // adicionado ao final da lista (índice 2)

System.out.println(horarios.get(1));


//Respuest Da Terminal: 12:00

//["08:00"]
//["08:00", "10:00"]
//["08:00", "10:00", "12:00"]
//Após remove(1) → remove "10:00" → ["08:00", "12:00"]
//Após add("14:00") → ["08:00", "12:00", "14:00"]