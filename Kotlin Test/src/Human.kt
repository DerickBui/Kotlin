class Human(humanName: String = "", humanAge: Int = 0, humanGender: String? = null) {
    private var name = humanName
    private var age = humanAge
    private var gender = humanGender

    companion object { // Shared variables in class
        private var instances = 0

        private fun increment() {
            instances++
        }

        fun showInstances(): Int {
            return instances
        }
    }

    init {
        increment()
    }

    fun getName(): String {
        return name
    }

    fun setName(humanName: String) {
        name = humanName
    }

    fun getAge(): Int {
        return age
    }

    fun setAge(humanAge: Int) {
        age = humanAge
    }

    fun getGender(): String? {
        return gender
    }

    fun setGender(humanGender: String?) {
        gender = humanGender
    }

    override fun toString(): String {
        return "This person's name is $name, age $age, is $gender"
    }
}
