package birthdayQuiz.exercises

import java.time.MonthDay

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.PlayerInput.readLowercase
import static java.time.Month.APRIL

class _05_NumberColoring {
    static String description = '''5. Gondolkozz el a mai dátumon (Április 11)… Ha lementtetted az első otthonunk karíkázós `.jpg`-jét a BirthdayQuiz folderbe,
akkor megtudod, hova kell menned tovább. Előre haladunk az időben vagy hátra? Hmm…
'''

    static start = MonthDay.of(APRIL, 11)
    static link = 'https://drive.google.com/open?id=0B_z3-GYCanTKdkxkOE1vck10SE0'

    static Closure<Boolean> run = {
        println "Nyomj egy Enter-t amikor készen állsz."
        readLowercase()

        def success = (fileCount(ROOT_FOLDER, 'Ex05', '.jpg') == 1)
        if (!success) {
            println 'Nem töltötted fel a kért képet.'
        }
        success
    }
}