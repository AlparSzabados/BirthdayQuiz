package birthdayQuiz.exercises

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.UrlHolder.*

class _06_Puzzle {
    static String description = '''6. Ha beírod a Panek Kati által megadott kódot, akkor meg kapod az utasítást a következő feladatra.
Tedd, amit látni fogsz. De előbb a kódot docx-ben mentsd le a Birtyday Quiz Folderbe!\n'''

    static Closure<Boolean> run = {
        def success = (fileCount(ROOT_FOLDER, 'Ex06', '.docx') == 1)
        if (success) {
            openUrl wins[0]
            openUrl taskLinks[5]
        } else {
            sleep(10000)
            println 'No files found, have a GIF-t.'
            openUrl loses[0]
        }
        success
    }
}