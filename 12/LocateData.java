//Cálculo de dias úteis com LocalDate Qual será a data impressa?

LocalDate data = LocalDate.of(2025, 6, 18);
int diasUteis = 0;

while (diasUteis < 7) {
    data = data.plusDays(1);  // incrementa o dia

    boolean fimDeSemana = data.getDayOfWeek() == DayOfWeek.SATURDAY 
                      || data.getDayOfWeek() == DayOfWeek.SUNDAY;
    boolean feriado = data.equals(LocalDate.of(2025, 6, 15));

    if (!fimDeSemana && !feriado) {
        diasUteis++;
    }
}
System.out.println(data);


//Respuesta Da Terminal: 2025-06-19