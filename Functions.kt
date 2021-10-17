
fun functions(age: Int?, userName: String?,password:String?,accountType: String?,list:MutableList<String>?,childUserName: String?,childPassword: String?,loginName: String?,loginPass:String?){
    println("Welcome to my Facebook Console App")
    if (loginName.equals(childUserName)){
        println("To Edit post press 1")
        println("To delete post press 2")
        println("To Logout post press 3")
        println("To Exit console press 4")
        var action = Integer.valueOf(readLine())
        when (action) {
            1 -> editPost(age,userName,password,accountType,list,childUserName,childPassword,loginName,loginPass)
            2-> delete(age,userName,password,accountType,list, childUserName, childPassword,loginName,loginPass)
            3 -> logout(age,userName,password,accountType,childUserName,childPassword)
            4 -> exit()
            else -> {
                println("Please enter a valid Input")
            }
        }

    }else{

        println("To Create a post press 1")
        println("To Read posts press 2")
        println("To Edit posts press 3")
        println("To Create a Child Account press 4")
        println("To Delete post press 5")
        println("To Logout post press 6")
        println("To exit console press 7")
        var action = Integer.valueOf(readLine())
        when (action) {
            1 -> createPost(age,userName,password,accountType,list,childUserName,childPassword,loginName,loginPass)
            2 -> readPost(age,userName,password,accountType,list,childUserName,childPassword,loginName,loginPass)
            3 -> editPost(age,userName,password,accountType,list,childUserName,childPassword,loginName,loginPass)
            4 -> createAcc(age,userName,password,accountType,list,loginName,loginPass)
            5-> delete(age,userName,password,accountType,list, childUserName, childPassword,loginName,loginPass)
            6 -> logout(age,userName,password,accountType,childUserName,childPassword)
            7 -> exit()
            else -> {
                println("Please enter a valid Input")
            }
        }
    }
}