//Uso de for com filtro: Qual será a saída? 

ArrayList<String> tarefas new ArrayList<>();
tarefas.add("Estudar Java");
tarefas.add("Fazer exercícios");
tarefas.add("Revisar código");

for (String tarefa tarefas) {
    if (tarefa.contains("Java")) {
        System.out.println("Tarefa de programação: "+ tarefa);
    }
}

//Terminal: "Estudar Java"