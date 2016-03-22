package birthdayQuiz.exercises

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.UrlHolder.*

class _10_Poster {
    static String description = '''10. Közeledik a nagy nap. A varázsszám, a 3. házassági évfordulónk.
Ez egy magasztos, különleges, egyszer-az-életben esemény… Ezután lettünk család, ezután teremtettünk otthont magunknak.
Töltsd fel a Birthday Quiz folderbe a lakberendező feladat eredményét jpg formátumban.
Ma van a szüleim 16. házassági évfordulója is. Köszöntsd őket! S juttasd eszembe nekem is :p
'''

    static Closure<Boolean> run = {
        def success = (fileCount(ROOT_FOLDER, 'Ex10', '.jpg') == 1)
        if (success) {
            openUrl wins[0]
            openUrl taskLinks[0]
        } else {
            sleep(15000)
            println 'No files found, have a GIF-t.'
            openUrl loses[0]
        }
        success
    }
}