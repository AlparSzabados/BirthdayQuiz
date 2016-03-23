package birthdayQuiz.exercises

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.GenerateRandom.pickRandom
import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.PlayerInput.*
import static birthdayQuiz.UrlHolder.*

class _11_Map {
    static String description = '''11. Gratulálok, szerelmem! Túlélted ezt a virtuális+valós kincskereső zarándokutat. 49 élménydús napra nézhetsz vissza.
Ez az app most örökre őrizni fogja a kincskeresés közben szerzett emlékeidet, remélem szeretettel fogsz visszagondolni ezekre a napokra.
Kérem a plakátot jpg formátumban és akkor megtudod végre, hogy hol és mikor találod meg a KINCSET!
'''

    static Closure<Boolean> run = {
        println "Nyomj egy Enter-t amikor készen állsz"
        readLowercase()
        def success = (fileCount(ROOT_FOLDER, 'Ex11', '.jpg') == 1)
        if (success) {
            openUrl pickRandom(wins)
            openUrl taskLinks[10]
        } else {
            println 'Nem töltötted fel a kért képet.'
            openUrl pickRandom(loses)
        }
        success
    }
}