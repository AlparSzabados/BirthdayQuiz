package birthdayQuiz.exercises

import java.time.MonthDay

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.PlayerInput.readLowercase
import static java.time.Month.MAY

class _10_Poster {
    static String description = '''10. Közeledik a nagy nap. A varázsszám, a 3. házassági évfordulónk.
Ez egy magasztos, különleges, egyszer-az-életben esemény… Ezután lettünk család, ezután teremtettünk otthont magunknak.
Töltsd fel a BirthdayQuiz folderbe a lakberendező feladat eredményét `.jpg` formátumban.
Ma van a szüleim 16. házassági évfordulója is. Köszöntsd őket! S juttasd eszembe nekem is :p
'''

    static start = MonthDay.of(MAY, 6)
    static link = 'https://drive.google.com/open?id=0B_z3-GYCanTKTHM1QXZPS3JzN28'

    static Closure<Boolean> run = {
        println "Nyomj egy Enter-t amikor készen állsz."
        readLowercase()

        def success = (fileCount(ROOT_FOLDER, 'Ex10', '.jpg') == 1)
        if (!success) {
            println 'Nem töltötted fel a kért képet.'
        }
        success
    }
}