package birthdayQuiz

class FileCounter {
    static fileCount(File folder, String extension) {
        folder.listFiles().count { file ->
            file.name.endsWith(extension)
        }
    }
}
