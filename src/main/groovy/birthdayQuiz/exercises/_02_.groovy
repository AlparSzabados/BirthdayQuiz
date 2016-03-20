package birthdayQuiz.exercises

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.OpenUrl.openUrl

class _02_ { // TODO rename
    static String description = ''
    static Closure<Boolean> run = {
        def success = (fileCount(ROOT_FOLDER, 'Ex02', 'docx') == 1)
        if (success) {
            openUrl win2Gif
            openUrl task02Link
        } else {
            openUrl lose1Gif
        }
        success
    }
}