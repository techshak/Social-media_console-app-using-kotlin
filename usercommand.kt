import kotlin.system.exitProcess

fun userSignUp(accountType: String?) {
    println("What is your Name")
    var name = readLine()

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
    var tempAge = age?.toInt()
    println("choose a user Name")
    var username = readLine()
    println("choose a user password")
    var password = readLine()
    if(tempAge !=null && tempAge<18){
        println("Hello!!! $name you are too young to open an account. Contact an Adult or an Admin for support")
    }else{
        var childPassword =""
        var childUserName =""
        signIn(tempAge,username,password,accountType,childUserName,childPassword)}
}
