package birthdayQuiz

class GenerateRandom {
    static pickRandom(List<String> list) {
        list[new Random().nextInt(list.size())]
    }
}
