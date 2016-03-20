package birthdayQuiz.exercises

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.OpenUrl.openUrl

class _05_ { // TODO rename
    static String description = ''
    static Closure<Boolean> run = {
        def success = (fileCount(ROOT_FOLDER, 'Ex05', '.jpeg') == 1)
        if (success) {
            openUrl win3Gif
            openUrl task05Link
        } else {
            openUrl lose3Gif
        }
        success
    }
}