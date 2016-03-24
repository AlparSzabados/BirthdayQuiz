package birthdayQuiz

class GenerateRandom {
    static pickRandom(List<String> list) {
        def random = new Random()
        list[random.nextInt(list.size())]
    }
}
