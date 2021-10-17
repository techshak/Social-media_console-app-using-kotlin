


 fun facebook (){
     println("To sign up as an admin type 1 or user type 2.")
     var typeOfUser = Integer.valueOf(readLine())
     if(typeOfUser == 2 ){
         var accountType = "User Account"
         userSignUp(accountType)
     }else if (typeOfUser == 1 ){
         var accountType = "Admin Account"
         adminSignUp(accountType)
     }else{ println("Wrong Input")}
 }

    fun main() {
        var name ="null"
        facebook()
    }