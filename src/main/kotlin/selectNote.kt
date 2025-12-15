class selectNote() {
    init {

        println("Список заметок в архвие '$mainSail' : ")

        val notesInArchive = notes.filter { it.startsWith("[$mainSail]") }

        println("0. Создать заметку")

        if (notesInArchive.isEmpty()) {
            println("В архиве '$mainSail' пока нет заметок.")
        } else {
            notesInArchive.forEachIndexed { index, note ->
                println("${index + 1}. ${note.removePrefix("[$mainSail] ")}")
            }
        }

        val end = notesInArchive.size + 1
        println("$end. Выход.")

        if (!scanner.hasNextInt()) {
            val invalid = scanner.next()
            println("Ошибка: '$invalid'. Разрешены только числа.")
        }

        val selectNote = scanner.nextInt()
        when (selectNote) {
            0 -> {
                createNote()
            }

            in 1..notesInArchive.size -> {
                icao = notesInArchive[selectNote - 1]
                println("Вы выбрали заметку: ${icao.removePrefix("[$mainSail] ")}")
            }
            end -> {
                main()
            }

            else -> println("Неправильный номер. Допустимо от 0 до $end.")
        }
    }
}
