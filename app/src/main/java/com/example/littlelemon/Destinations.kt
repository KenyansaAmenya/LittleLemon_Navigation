package com.example.littlelemon


/*step 1 Destination file and the interface*/

interface Destinations {
    val route: String
}
/*Step 2 Create the object by implementing the interface*/
object Home : Destinations {
    override val  route = "Home"
}
object Menu : Destinations {
    override val route = "Menu"
}