
fun signIn(age: Int?,userName:String?,password:String?,accountType: String?,childUserName:String?,childPassword:String?) {
    println("Supply your Username")
    val loginName = readLine()
    println("Supply your password")
    val loginPass = readLine()
    if (loginName == userName && loginPass == password || loginName == childUserName && loginPass == childPassword ) {
        val list: MutableList<String> = ArrayList()

        functions(age,userName,password,accountType,list,childUserName,childPassword,loginName,loginPass)
    } else {
        println("Wrong Username And Password Combination")
        signIn(age,loginName,loginPass,accountType,childUserName,childPassword)
    }


}