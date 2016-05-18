package birthdayQuiz.exercises

import birthdayQuiz.PlayerInput

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.GenerateRandom.pickRandom
import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.UrlHolder.*

class _06_Puzzle {
    static String description = '''6. Ha beírod a Panek Kati által megadott kódot, akkor meg kapod az utasítást a következő feladatra.
Tedd, amit látni fogsz. De előbb a kódot docx-ben mentsd le a Birtyday Quiz Folderbe!
'''

    static Closure<Boolean> run = {
        println "Nyomj egy Enter-t amikor készen állsz."
        PlayerInput.readLowercase()
        def success = (fileCount(ROOT_FOLDER, 'Ex06', '.docx') == 1)
        if (success) {
            openUrl pickRandom(wins)
            openUrl taskLinks[5]
        } else {
            println 'Nem töltötted fel a kért dokumentumot.'
            openUrl pickRandom(loses)
        }
        success
    }
}