package birthdayQuiz

class FileCounter {
    static fileCount(File folder, String prefix, String extension) {
        folder.listFiles().count { file ->
            def name = file.name
            name.startsWith(prefix) && name.endsWith(extension)
        }
    }
}
