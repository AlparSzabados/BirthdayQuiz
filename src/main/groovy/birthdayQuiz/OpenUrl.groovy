package birthdayQuiz

import static java.awt.Desktop.getDesktop

class OpenUrl {
    static openUrl(String url) {
        desktop.browse(url.toURI())
    }
}
