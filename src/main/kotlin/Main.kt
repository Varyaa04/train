import kotlin.random.Random
fun main() {
    var continueWork = true

    while (continueWork) {
        println("Выберите действие:")
        println("1. Создать направление")
        println("2. Продать билеты")
        println("3. Сформировать поезд")
        println("4. Отправить поезд")
        println("5. Закончить работу")

        val choice = readLine()?.toIntOrNull()

        when (choice) {
            1 -> createDirection()
            2 -> sellTickets()
            3 -> formTrain()
            4 -> sendTrain()
            5 -> continueWork = false
            else -> println("Некорректный выбор. Попробуйте еще раз.")
        }
    }
}

private fun createDirection() {
    val cities = listOf("Бийск","Москва","Санкт-Петербург", "Барнаул", "Новосибирск", "Омск", "Томск", "Кемерово", "Новокузнецк", "Красноярск", "Иркутск", "Оренбург", "Челябинск", "Екатеринбург", "Пермь", "Уфа", "Казань")
    val randomCities = cities.shuffled().take(2)
    val startCity = randomCities[0]
    val endCity = randomCities[1]

    println("Направление создано: $startCity - $endCity")
}

private fun sellTickets() {
    val passengers = Random.nextInt(5, 201)

    println("Продано билетов: $passengers")
}

private fun formTrain() {
    val passengers = Random.nextInt(5, 201)
    val train = mutableListOf<Int>()
    var capacitySum = 0

    while (capacitySum < passengers) {
        val capacity = Random.nextInt(5, 26)
        train.add(capacity)
        capacitySum += capacity
    }

    println("Поезд сформирован: $train")
}

private fun sendTrain() {
    println("Поезд отправлен")
}