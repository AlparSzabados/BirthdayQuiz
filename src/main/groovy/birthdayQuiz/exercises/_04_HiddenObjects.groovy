package birthdayQuiz.exercises

import java.time.MonthDay

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.PlayerInput.readLowercase
import static java.time.Month.APRIL

class _04_HiddenObjects {
    static String description = '''4. András imád takarítani, és ő mindig rendet tart, és nála soha sincs rendetlenség, és ő jó és szép!– Yeah right!
Mentsd el az állatok bőlcseleteit tartalmazó `.docx`-et a BirthdayQuiz folderbe, s akkor mondom tovább a feladatot!
'''

    static start = MonthDay.of(APRIL, 6)
    static link = 'https://drive.google.com/open?id=0B_z3-GYCanTKSHBEUEZQOUlrMHc'

    static Closure<Boolean> run = {
        println "Nyomj egy Enter-t amikor készen állsz."
        readLowercase()

        def success = (fileCount(ROOT_FOLDER, 'Ex04', '.docx') == 1)
        if (!success) {
            println 'Nem töltötted fel a kért dokumentumot.'
        }
        success
    }
}