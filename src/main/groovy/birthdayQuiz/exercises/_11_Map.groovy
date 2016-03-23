package birthdayQuiz.exercises

import java.time.MonthDay

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.PlayerInput.readLowercase
import static java.time.Month.MAY

class _11_Map {
    static String description = '''11. Gratulálok, szerelmem! Túlélted ezt a virtuális+valós kincskereső zarándokutat. 49 élménydús napra nézhetsz vissza.
Ez az app most örökre őrizni fogja a kincskeresés közben szerzett emlékeidet, remélem szeretettel fogsz visszagondolni ezekre a napokra.
Kérem a plakátot `.jpg` formátumban, és akkor megtudod végre, hogy hol és mikor találod meg a KINCSET!
'''

    static start = MonthDay.of(MAY, 11)
    static link = 'https://drive.google.com/open?id=0B_z3-GYCanTKN2lnMldKblVQNDQ'

    static Closure<Boolean> run = {
        println "Nyomj egy Enter-t amikor készen állsz"
        readLowercase()

        def success = (fileCount(ROOT_FOLDER, 'Ex11', '.jpg') == 1)
        if (!success) {
            println 'Nem töltötted fel a kért képet.'
        }
        success
    }
}