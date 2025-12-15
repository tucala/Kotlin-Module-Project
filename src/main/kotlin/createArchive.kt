class createArchive {
    init {
        while (true) {
            println("Введите название архива: ( или 'выход' для выхода )")
            val input = readLine()!!
            if (input.lowercase() == "выход") {
                break
                main()
            }
            if (input.isEmpty()) {
                println("Название не может быть пустым")
                continue
            }
            archives.add(input)
            println("Архив создан")
        }
    }
}