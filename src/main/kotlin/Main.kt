import java.util.Scanner

var archives = mutableListOf<String>() //сами архивы
val notes = mutableListOf<String>() // Заметочки
var mainSail: String = "" // выбраный архив

var fullNote: String = "" // Архив с заметками
var icao: String  = "" // выбраная заметка



fun main() {
    val menuItems = listOf(
        "1. Выбор архива",
        "2. Создание архива",
        "3. Выбор заметки",
        "4. Создание заметки",
        "5. Экран заметки"
    )

    val scanner = Scanner(System.`in`)

    while (true) {
        println("")
        println("крутой блокнот: ")
        menuItems.forEach { println(it) }
        println("Введите номер пункта меню: ")
        if (!scanner.hasNextInt()) { // проверялка
            val invalid = scanner.next()
            println("Разрешены только числа")
            continue
        }
        val menuItem = scanner.nextInt()
        when (menuItem) {
            1 -> selectArchive()
            2 -> createArchive()
            3 -> selectNote()
            4 -> createNote()
            5 -> printNote()
        }
    }
}