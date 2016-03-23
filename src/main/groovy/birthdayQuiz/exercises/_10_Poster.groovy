package birthdayQuiz.exercises

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.GenerateRandom.pickRandom
import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.PlayerInput.*
import static birthdayQuiz.UrlHolder.*

class _10_Poster {
    static String description = '''10. Közeledik a nagy nap. A varázsszám, a 3. házassági évfordulónk.
Ez egy magasztos, különleges, egyszer-az-életben esemény… Ezután lettünk család, ezután teremtettünk otthont magunknak.
Töltsd fel a Birthday Quiz folderbe a lakberendező feladat eredményét jpg formátumban.
Ma van a szüleim 16. házassági évfordulója is. Köszöntsd őket! S juttasd eszembe nekem is :p
'''

    static Closure<Boolean> run = {
        println "Nyomj egy Enter-t amikor készen állsz."
        readLowercase()
        def success = (fileCount(ROOT_FOLDER, 'Ex10', '.jpg') == 1)
        if (success) {
            openUrl pickRandom(wins)
            openUrl taskLinks[9]
        } else {
            println 'Nem töltötted fel a kért képet.'
            openUrl pickRandom(loses)
        }
        success
    }
}