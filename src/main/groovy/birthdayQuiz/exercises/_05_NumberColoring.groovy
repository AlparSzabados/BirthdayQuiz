package birthdayQuiz.exercises

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.UrlHolder.*

class _05_NumberColoring {
    static String description = '''5. Gondolkozz el a mai dátumon… Ha lementtetted az első otthonunk karíkázós jpg-jét a Birthday Quiz folderbe,
akkor megtudod hova kell menned tovább. Előre haladunk az időben vagy hátra? Hmm…
''' // TODO mai dátum fog változni ...

    static Closure<Boolean> run = {
        def success = (fileCount(ROOT_FOLDER, 'Ex05', '.jpg') == 1)
        if (success) {
            openUrl wins[0]
            openUrl taskLinks[4]
        } else {
            sleep(10000)
            openUrl loses[0]
        }
        success
    }
}