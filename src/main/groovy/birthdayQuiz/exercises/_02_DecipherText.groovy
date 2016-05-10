package birthdayQuiz.exercises

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.OpenUrl.openUrl
import static birthdayQuiz.UrlHolder.*

class _02_DecipherText {
    static String description = '''2. Generály értelmes, Magyar nyelvű beszédet a Toldd a betűt.pdf szövegéből,
a megfejtést .docx-ben írd meg és végül mentsd le a BirthdayQuiz folderbe.
Ha halványlila gőzöd sincs, hogy mi a megfejtés, kérjél segítséget Bálint Rékától!\n'''

    static Closure<Boolean> run = {
        def success = (fileCount(ROOT_FOLDER, 'Ex02', 'docx') == 1)
        if (success) {
            openUrl taskLinks[1]
            openUrl wins[0]
        } else {
            sleep(10000)
            println 'No files found, have a GIF-t.'
            openUrl loses[0]
        }
        success
    }
}