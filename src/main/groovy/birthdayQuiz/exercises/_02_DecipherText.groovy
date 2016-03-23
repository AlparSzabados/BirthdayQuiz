package birthdayQuiz.exercises

import java.time.MonthDay

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.PlayerInput.readLowercase
import static java.time.Month.MARCH

class _02_DecipherText {
    static String description = '''2. Generály értelmes, Magyar nyelvű beszédet a `Toldd a betűt.pdf` szövegéből,
a megfejtést `.docx-ben` írd meg és végül mentsd le a BirthdayQuiz folderbe.
Ha halványlila gőzöd sincs, hogy mi a megfejtés, kérjél segítséget Bálint Rékától!
'''

    static start = MonthDay.of(MARCH, 29)
    static link = 'https://drive.google.com/open?id=0B_z3-GYCanTKc2tJSl94c2N1REE'

    static Closure<Boolean> run = {
        println "Nyomj egy Enter-t amikor készen állsz."
        readLowercase()

        def success = (fileCount(ROOT_FOLDER, 'Ex02', 'docx') == 1)
        if (!success) {
            println 'Nem töltötted fel a kért dokumentumot.'
        }
        success
    }
}