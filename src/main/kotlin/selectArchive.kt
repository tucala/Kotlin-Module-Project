import java.util.Scanner
val scanner = Scanner(System.`in`)

class selectArchive {
    init {
        println("Список архивов: ")
        println("0. Создать архив")

        archives.forEachIndexed { index, archive ->
            println("${index + 1}. $archive")
        }
        val end = archives.size + 1
        println("$end. Выход.")

        if (!scanner.hasNextInt()) {
            val invalid = scanner.next()
            println("Ошибка: '$invalid'. Разрешены только числа.")
        }

            val selectArchive = scanner.nextInt()
                when (selectArchive) {
                    0 -> {
                        createArchive()
                    }
                    in 1..archives.size -> {
                        mainSail = archives[selectArchive - 1]
                        println("Вы выбрали архив: $mainSail")
                    } // выбраный архив
                    end -> {
                        main()
                    }
                    else -> println("Неправильный номер. Допустимо от 0 до $end.")
                }
            }
            }