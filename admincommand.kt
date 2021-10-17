fun adminSignUp(accountType: String?) {
    println("What is your Name")
    val name = readLine()
    println("How old Are you")
    var age = readLine()
    while(age is String){
    try{
     Integer.valueOf(age)
        break
    }catch (e:NumberFormatException){
        println("Age must be an Integer, enter age again")
      }
        age = readLine()
    }
    val tempAge = age?.toInt()
    println("choose a user Name")
    val username = readLine()
    println("choose a user password")
    val password = readLine()
    if(tempAge!=null && tempAge<18){
        println("Hello!!! $name you are too young to open an account. Contact an Adult or an Admin for support")
        facebook()
    }else{
        var childPassword =""
        var childUserName =""
        signIn(tempAge,username,password,accountType,childUserName,childPassword)}

}
