package birthdayQuiz.exercises

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.GenerateRandom.pickRandom
import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.PlayerInput.readLowercase
import static birthdayQuiz.UrlHolder.*

class _04_HiddenObjects {
    static String description = '''4. András imád takaritani és ő mindig rendet tart és nála soha sincs rendetlenség és ő jó és szép!– Yeah right!
Mentsd el az állatok bőlcseleteit tartalmazó docx-et a BirthdayQuiz folderbe s akkor mondom tovább a feladatot!
'''

    static Closure<Boolean> run = {
        println "Nyomj egy Enter-t amikor kész állsz."
        readLowercase()
        def success = (fileCount(ROOT_FOLDER, 'Ex04', '.docx') == 1)
        if (success) {
            openUrl pickRandom(wins)
            openUrl taskLinks[3]
        } else {
            println 'Nem töltötted fel a kért dokumentumot.'
            openUrl pickRandom(loses)
        }
        success
    }
}