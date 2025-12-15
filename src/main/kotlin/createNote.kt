class createNote() {
    init {
        while (true) {
            println("Введите название заметки (или 'выход' для возврата): ")
            val noteName = readLine()?.trim()

            if (noteName == null || noteName.lowercase() == "выход") {
                break
            }
            if (noteName.isEmpty()) {
                println("Название заметки не может быть пустым.")
                continue
            }

            var fullNote = "[$mainSail] $noteName"
            notes.add(fullNote)
            println("Заметка '$noteName' создана.")
        }
    }
}
