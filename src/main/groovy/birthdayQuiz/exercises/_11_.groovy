package birthdayQuiz.exercises

import static birthdayQuiz.FileCounter.fileCount
import static birthdayQuiz.FolderHolder.ROOT_FOLDER
import static birthdayQuiz.OpenUrl.openUrl

class _11_ { // TODO rename
    static String description = ''
    static Closure<Boolean> run = {
        def success = (fileCount(ROOT_FOLDER, 'Ex11', '.jpeg') == 1)
        if (success) {
            openUrl win3Gif
            openUrl task011Link
        } else {
            openUrl lose1Gif
        }
        success
    }
}