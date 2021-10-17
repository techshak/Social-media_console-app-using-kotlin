import kotlin.random.Random

fun createPost(age:Int?, userName: String?, password: String?, accountType: String?, list:MutableList<String>?,childUserName:String?,childPassword:String?,loginName: String?,loginPass:String?){
    println("Enter post title")
    val title = readLine()
    println("Enter Post details")
    val post = readLine()
    val id = Random.nextInt(0,100)
    println("Recent Posts")
    println("$userName                       $accountType")
    println("Post Id                         $id")
    println("$title")
    println("$post")
    val postList: MutableList<String> = ArrayList()
    val list: MutableList<String> = ArrayList()
    postList.add("$userName account type: $accountType...Title...$title...Details...$post....post id.................$id")
    list.add("$postList")
    functions(age,userName,password,accountType,list,childUserName,childPassword,loginName,loginPass)

}

fun readPost(age:Int?, userName: String?, password: String?, accountType: String?, list:MutableList<String>?,childUserName:String?,childPassword:String?,loginName: String?,loginPass:String?){
    if(list.isNullOrEmpty() ){
    println("There are no posts now")
        functions(age,userName,password,accountType,list,childUserName, childPassword,loginName,loginPass)
    }else{
     println("${list.toString()}")
        functions(age,userName,password,accountType,list,childUserName,childPassword,loginName,loginPass)
    }
}

fun editPost(age:Int?, userName: String?, password: String?, accountType: String?, list:MutableList<String>?,childUserName:String?,childPassword:String?,loginName: String?,loginPass:String?){
    if(list.isNullOrEmpty() ){
        println("There are no posts to delete now")
    }else{
        println("Enter a post ID ")
        readLine()
        println("Enter post title")
        val title = readLine()
        println("Enter Post details")
        val post = readLine()
        val id = Random.nextInt(0,100)
        println("Recent Posts")
        println("$userName                       $accountType")
        println("Post Id                         $id")
        println("$title")
        println("$post")
        val postList: MutableList<String> = ArrayList()
        val list: MutableList<String> = ArrayList()
        postList.add("$userName account type: $accountType...Title...$title...Details...$post....post id.................$id")
        list.add("$postList")
        readPost(age,userName,password,accountType,list,childUserName,childPassword,loginName,loginPass)

    }
}

fun createAcc (age:Int?, userName: String?, password: String?, accountType: String?, list:MutableList<String>?,loginName: String?,loginPass:String?){
    println("What is the child's Name")
    var childName = readLine()

    println("How old Are They")
    var childAge = readLine()
    while(childAge is String){
        try{
            Integer.valueOf(childAge)
            break
        }catch (e:NumberFormatException){
            println("Age must be an Integer, enter age again")
        }
        childAge = readLine()
    }
    var tempAge = childAge?.toInt()
    println("choose a user Name")
    var childUsername = readLine()
    println("choose a user password")
    var childPassword = readLine()
    println("Child account for $childName age:$tempAge created with details username:$childUsername and password:$childPassword" )
    functions(age,userName,password,accountType,list,childUsername,childPassword,loginName,loginPass)
}
fun delete(age:Int?, userName: String?, password: String?, accountType: String?, list:MutableList<String>?,childUserName:String?,childPassword:String?,loginName: String?,loginPass:String?){
    if(list.isNullOrEmpty() ){
        println("There are no posts to delete now")
        functions(age,userName,password,accountType,list,childUserName,childPassword,loginName,loginPass)
    }else{
        println("Give post ID")
        var list = null
        functions(age,userName,password,accountType,list,childUserName,childPassword,loginName,loginPass)
    }

}
fun logout(age:Int?,userName: String?,password:String?,accountType: String?,childUserName:String?,childPassword:String?){
    signIn(age,userName,password,accountType,childUserName,childPassword)
}
fun exit(){
    return
}