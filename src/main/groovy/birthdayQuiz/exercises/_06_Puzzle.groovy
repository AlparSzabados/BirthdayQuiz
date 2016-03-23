package birthdayQuiz.exercises

import java.time.MonthDay

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.PlayerInput.readLowercase
import static java.time.Month.APRIL

class _06_Puzzle {
    static String description = '''6. Ha beírod a Panek Kati által megadott kódot, akkor meg kapod az utasítást a következő feladatra.
Tedd, amit látni fogsz. De előbb a kódot `.docx`-ben mentsd le a Birtyday Quiz Folderbe!
'''

    static start = MonthDay.of(APRIL, 15)
    static link = 'https://drive.google.com/open?id=0B_z3-GYCanTKaDJHMzZvckh3S0U'

    static Closure<Boolean> run = {
        println "Nyomj egy Enter-t amikor készen állsz."
        readLowercase()

        def success = (fileCount(ROOT_FOLDER, 'Ex06', '.docx') == 1)
        if (!success) {
            println 'Nem töltötted fel a kért dokumentumot.'
        }
        success
    }
}